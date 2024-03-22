package array;/*this code for this special array {{10,20,30,40},
                                    {15,25,35,45},
                                    {27,29,37,48},
                                    {32,33,39,50}};
ama sorting pramane num aapela che aetle 32 thi start karel che tya teni bajuma
tenathi nani ane moti banne value che 40 thi to start karvi to pn chale(SEE searchkey.java)*/
import java.util.Scanner;
public class search2 {
    public static boolean Searchkey(int matrix[][],int key){
        int row=0,col= matrix[0].length-1;
        while(col>=0&& row<matrix.length){
            if( matrix[row][col]==key){
                System.out.println("found cell ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40,42},
                {15,25,35,45,48},
                {27,29,37,48,50},
                {32,33,39,50,52}};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        Searchkey(matrix, key);
    }

}
