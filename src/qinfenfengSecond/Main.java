package qinfenfengSecond;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        FileAchieve file = new FileAchieve();
        Thread t1 = new Thread(file, "线程三");
        Thread t2 = new Thread(file, "线程一");
        Thread t3 = new Thread(file, "线程四");
        // t3.setPriority(Thread.MAX_PRIORITY);
        //t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        //以下为做的一些测试
       /* Reader in = new FileReader("F:\\qinfenfengfirst\\src\\qinfenfengSecond\\a.txt");
        Writer out = new FileWriter("F:\\qinfenfengfirst\\src\\qinfenfengSecond\\mission.txt");
        InputStream fis = new FileInputStream("F:\\qinfenfengfirst\\src\\qinfenfengSecond\\a.txt");
        OutputStream fos = new FileOutputStream("F:\\qinfenfengfirst\\src\\qinfenfengSecond\\mission.txt");
        char[] data = new char[6];
        byte[] bytes = new byte[10];
        int foot = 0;
        int temp = 0;
        while ((temp = in.read()) != -1) {
            data[foot++] = (char) temp;
            System.out.println(temp);// A:65 D:68 T:84 E:69 你：20320 好：22909
            System.out.println("-------------");
            //   out.write(data);
        }
        int a = 0;
        int b = 0;
        while ((a = fis.read()) != -1) {
            bytes[b++] = (byte) a;
            System.out.println(a);//A:65 D:68 T:84 E:69 你：228，189，160 好:229,165,189
            System.out.println("-------------");
            // fos.write(bytes, 0, 10);
        }
        String str = "你";
        byte[] c = str.getBytes();
        System.out.println(Arrays.toString(c));//-28,-67,-96
        //   fos.write(c);
        in.close();
        out.close();
        fis.close();
        fos.close();
        String str = "你";
        char[] c = str.toCharArray();
        System.out.println(Arrays.toString(c));*/
    }
}
