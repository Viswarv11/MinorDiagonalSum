import java.util.Scanner;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row size of the 2D Array:");
        int rowsize=scanner.nextInt();
        System.out.println("Enter the column size of the 2D Array:");
        int colsize=scanner.nextInt();
        int array[][]=new int[rowsize][colsize];
        System.out.println("Enter the Array Elements row wise:");
        for (int i = 0; i < rowsize; i++) {
            for(int j=0;j<colsize;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        minorDiagonal(array,rowsize,colsize);

    }

    private static void minorDiagonal(int[][] array, int rowsize,int colsize) {
        int count=0;
        int i=0,j=colsize-1;
        while(i<colsize && j>=0){
            count+=array[i][j];
            i++;
            j--;
        }
        System.out.println("Minor Diagonal Sum: "+count);
    }
}
