import java.util.Scanner;
public class avgof3 {
    public static float avg(int a, int b,int c){
        int sum=a+b+c;
        return sum/3.0f;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        System.out.println(avg(a, b, c));
    }
}
