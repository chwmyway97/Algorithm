import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int a, b, c, time , minute;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        time = (a*60+b+c)/60;
        minute = (a*60+b+c)%60;

        if ((a>=0 && a<=23) && (b>=0 && b<=59) && (c>=0 && c<=1000)){
            if(time >= 24){
                bw.write(time-24 + " "+minute);
            }else{
                bw.write(time + " "+minute);
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