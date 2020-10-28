package qinfenfengSecond;
import java.io.*;
/*
当success方法不加锁时，三个线程抢夺run方法的频率几乎一致，但加上锁后，运行后，发现会有某一个线程一直在抢夺，而其他线程抢夺不到
博客解释是非公平锁原因，但还是感觉很奇怪
Main中进行了一个测试，a.tet中放入“ADTE你好” 用字符流去读，从中读出字符编码为 65/68/84/69/20320/22909
用字节流去读，从中读出的字符编码为65/68/84/69/228，189，160/229，165，189
String str=“你” 用String中的getBytes方法转换为字节数组，再用Arrays.toString 方法输出 得到 -28,-67,-96
 */

public class FileAchieve implements Runnable {
    private Reader in = new FileReader("F:\\qinfenfengSecond\\src\\qinfenfengSecond\\a.txt");
    private Writer out = new FileWriter("F:\\qinfenfengSecond\\src\\qinfenfengSecond\\mission.txt", false);
    private boolean isLoop = true;

    public FileAchieve() throws IOException {
    }

    @Override
    public void run() {
        String str = Thread.currentThread().getName() + ":";
        char[] b = str.toCharArray();
        char chars[] = new char[5];
        while (isLoop) {
            success(b, chars);
        }
    }

    synchronized private void success(char[] b, char[] chars) {
        if (isLoop) {
            System.out.println(Thread.currentThread().getName());

            try {
                if ((in.read(chars)) == -1) {
                    isLoop = false;
                    try {
                        in.close();
                        out.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                char[] both = ArrayUtils.addAll(b, chars);
                try {
                    out.write(both, 0, b.length + chars.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
