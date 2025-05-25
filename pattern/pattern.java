public class pattern {
    public static void main(String [] args){
        char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=4;j>i;j--){
                System.out.print('_');
                
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
