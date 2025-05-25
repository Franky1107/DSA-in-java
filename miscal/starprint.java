import java.util.Scanner;

public class starprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int inp=sc.nextInt();
        for(int i=1;i<=inp;i++){
            for(int j=1;j<=inp-i;j++){
                System.out.print("_");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
