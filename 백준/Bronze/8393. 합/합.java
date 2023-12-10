import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int arr[] = new int[c];

        for (int i = 0; i < c; i++) {

            arr[i] = i+1;

        }

        in.close();
        int K = 0 ;
        for (int k : arr) {
            K += k;

        }
        System.out.println(K);
    }

}