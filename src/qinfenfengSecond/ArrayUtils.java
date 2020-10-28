package qinfenfengSecond;
import java.util.Arrays;

public class ArrayUtils {
    public static  char[] addAll(char[] first, char[] second) {
        char[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
