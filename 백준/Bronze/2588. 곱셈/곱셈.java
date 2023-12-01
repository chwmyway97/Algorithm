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
//        String s = sc.next();

        /* case1(int b 소거) -> charAt문 사용하여 */
//        bw.write(String.valueOf(a * (s.charAt(2) - '0')) + "\n");
//        bw.write(String.valueOf(a * (s.charAt(1) - '0')) + "\n");
//        bw.write(String.valueOf(a * (s.charAt(0) - '0')) + "\n");
//        bw.write(String.valueOf(a * Integer.parseInt(s)) + "\n");
        
        /* case2(String s) 소거 -> 수학적으로 푼다면 */
        bw.write(a*(b%10)+ "\n");
        bw.write(a*(((b%100)-(b%10))/10)+ "\n");
        bw.write(a*(((b%1000)-(b%100))/100)+ "\n");
        bw.write(a*b+"\n");

        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }

}
