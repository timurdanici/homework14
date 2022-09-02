import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int pos = 0;
        int neg = 0;
        ArrayList<Integer> posarr = new ArrayList<>();
        ArrayList<Integer> negarr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= (new Random().nextInt(200)-100);
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] >= 0){
                    pos++;

                }else {
                    neg++;

                }
            }
        }
        System.out.println(pos);
        System.out.println(neg);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] >= 0){
                    posarr.add(matrix[i][j]);
                }else{
                    negarr.add(matrix[i][j]);
                }
            }
        }
        System.out.println("Positive numbers:");
        for (int i = 0; i < posarr.size(); i++) {
            System.out.println(posarr.get(i));
        }
        System.out.println("Negative numbers:");
        for (int i = 0; i < negarr.size(); i++) {
            System.out.println(negarr.get(i));
        }


    }
}
