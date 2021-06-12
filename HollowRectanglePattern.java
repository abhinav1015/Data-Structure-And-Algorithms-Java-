public class HollowRectanglePattern {
    static int row = 5;
    static int column = 4;
    public static void main(String[] args){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
    }
}
}