import java.lang.reflect.Array;

public class Activat {
    static final int BYTES = 1024;
    public static void main(String[] args) {
        int value1= 150;
        int value2 = 2000;
        int value3 = 40000;
        int value4 = 36000;
        int res1;
        int res2;
        int res3;
        int res4;
        final  int mbyte1 = value3;
        final  int mbyte2 = value4;
        res1 = value1 + value2;
        res2 = value1 - value2;
        res3 = value1 * value2;
        res4 = value1 / value2;
        int res5 = mbyte1 * BYTES;
        int res6  = mbyte2 * BYTES;

        System.out.println(value1 + "+" + value2 + "=" + value2+value1);


    }
}
