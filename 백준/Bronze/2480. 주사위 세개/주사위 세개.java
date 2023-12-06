import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int a, b, c ;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && b == c) {
            bw.write(10000 + a * 1000 + "");
        } else if (a != b && b != c && a != c) {
            if (a > b && a > c) {
                bw.write(a * 100 + "");
            } else if (b > a && b > c) {
                bw.write(b * 100 + "");
            } else {
                bw.write(c * 100 + "");
            }

        }else {
            if(a==b){
                bw.write(1000 + a * 100 + "");
            }
            else if(a==c){
                bw.write(1000 + a * 100 + "");
            }
            else bw.write(1000 + b * 100 + "");

        }


        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();

    }

}