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
        b = sc.nextInt();

        /*시간 문제 -> 고려해야 할점

        1) 00시 00분 에서 빼면 23시로 간다는 점
        2)  a시  b분 일때 b보다 큰수를 빼면 a가 숫자를 내려야 한다는 점
            -> a-1 , b+60-45=b+15

        */

        if ((a>=0 && a<=23) && (b>=0 && b<=59)){
            if(b>=45) {
                bw.write(a + " ");
                bw.write(String.valueOf(b-45) );
            }else{
                if(a == 0){
                    bw.write( a+23 +" ");
                    bw.write(String.valueOf(b+15));
                }
                else {
                    bw.write(a-1+" ");
                    bw.write(String.valueOf(b+15));
                }

            }
        }else{
            bw.write("잘못된 표현 입니다");
        }

        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }

}