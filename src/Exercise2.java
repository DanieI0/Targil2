import java.util.Scanner;

public class Exercise2 {
        public static final int ARRAY_SIZE = 10;


    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        greaterThanAverage();
    }


    public static void greaterThanAverage() {
        Scanner scanner = new Scanner(System.in);
        int[] arrNum = new int[ARRAY_SIZE];
        double average;
        int sum = 0;
        for (int i = 0; i<arrNum.length; i++) {
            arrNum[i] = scanner.nextInt();
            sum += arrNum[i];
        }
        average = sum/arrNum.length;
        for (int i : arrNum) {
            if (i > average) {
                System.out.print(i + ",");
            }
        }
    }
}