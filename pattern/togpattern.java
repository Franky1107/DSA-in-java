public class togpattern {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((j+i)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.print("\n");
        }
    }
}
