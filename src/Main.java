import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int[][] arr = {{4, 9, 5, 2},
                        {3, 10, 1, 6},
                        {13, 1, 2, 4}};// assigned indexes to arrays

        System.out.println(Magic(arr)); //Method to check the if all rows and cols are equal.
    }

    public static boolean Magic(int[][] arr) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int mag = 0;
        for (int r = 0; r < arr.length - 2; r++) {//-2 to stop out bounds error.
            for (int c = 0; c < arr[r].length; c++) {
                sum = sum + arr[r][c];//
                sum1 = sum1 + arr[1][c];
                sum2 = sum2 + arr[2][c];
            }
            if (sum == sum1 && sum1 == sum2) {
                System.out.println("");
            } else {
                System.out.println("False");
            }
        }
        ;
        Boolean b1 = true;
        Boolean b2 = false;

        if (sum == sum1 && sum1 == sum2) {
            b2 = true;
            //System.out.println("equals() method returns true");//
        } else {
            b1 = false;
            System.out.println(b2);
        }
        ;
        if (b1.equals(b2)) {
            System.out.println(sum1);
            System.out.print("");
        } else {
            System.out.println("equals() method returns false");
        }
        return (b1.equals(b2));
    }
}