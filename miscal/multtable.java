import java.util.Scanner;

public class multtable {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        x = sc.nextInt();
        // int x = n;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x+" X "+ i +"="+(x*i));
        }
    }
}