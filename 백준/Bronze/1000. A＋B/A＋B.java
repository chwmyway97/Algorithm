import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        String SumAB;

        A = sc.nextInt();
        B = sc.nextInt();
        SumAB = String.valueOf(A + B);
        if (A > 0 && B < 10) {
            System.out.println(SumAB);
        } else {
            System.out.println("범위가 맞지 않습니다.");
        }
    }
}