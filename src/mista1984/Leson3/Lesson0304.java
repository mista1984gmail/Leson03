package mista1984.Leson3;

/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0304 {
    public static void main(String[] args) {
        int [][]matrix=new int[5][5];
        for(int i =0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"; ");
            }
            System.out.println();
        }
    }
}
