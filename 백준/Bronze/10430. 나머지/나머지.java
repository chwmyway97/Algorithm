import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        bw.write(String.valueOf((a+b)%c) +"\n");
        bw.write(String.valueOf(((a%c) + (b%c))%c)+"\n");
        bw.write(String.valueOf((a*b)%c)+"\n");
        bw.write(String.valueOf(((a%c) * (b%c))%c));

        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }

}
