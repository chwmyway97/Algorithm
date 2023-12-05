import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
//        b = sc.nextInt();

        //윤년 -> 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

        if ((a%4 == 0 && a%100 != 0)||a%400 == 0) bw.write("1");
        else bw.write("0");

        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }
    /*
    || : OR 또는 이라는 뜻을 가진다.
    && : AND 그리고 라는 뜻을 가진다.
    %  : 나눈후 나머지라는 뜻을 가진다.
     */
}