public class NumberHalfPyramid {
    static int n = 8;
    public static void main(String[] args){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
