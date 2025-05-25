package miscal;
public class binarytodecimal {
    public static int convert(int a) {
        int n = 0;
        int dec=0;
        while (a > 0) {
            int temp=a%10;
            dec=dec + temp*(int)Math.pow(2, n);
            a=a/10;
            n++;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(convert(110101));
    }
}
