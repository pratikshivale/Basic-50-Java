public class Q18_PascalTriangle {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j =1; j<=5-i; j++){
                 System.out.print(" ");
            }
            int value =1;
            for(int j=0; j<i; j++){
                System.out.print(value+" ");
                value =value*(i-j-1) / (j+1);
            }System.out.println();
        }
    }
}
