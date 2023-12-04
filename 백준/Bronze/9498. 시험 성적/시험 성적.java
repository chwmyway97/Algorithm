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

        if(a >= 90) bw.write("A");
        else if (80<= a ) bw.write("B");
        else if (70<= a ) bw.write("C");
        else if (60<= a ) bw.write("D");
        else bw.write("F");

        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }
    /* 이 방법도 있고 다른방법
    if(90 <= a && a <= 100) 으로 하는 방법이 있다
    코틀린 에서는 if(90<= a <=100) 되던걸로 기억하는데 음... 나중에 확인해봐야겠다.
     */


}