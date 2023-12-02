import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);




        bw.write("|\\_/|"+"\n");
        bw.write("|q p|   /}"+"\n");
        bw.write("( 0 )\"\"\"\\"+"\n");
        bw.write("|\"^\"`    |"+"\n");
        bw.write("||_/=\\\\__|"+"\n");



        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }

}

/*
Escape Sequence ?
문자에 대한 해석을 위해 백슬래시가 앞에 오는 문자를 말한다.
백슬래시 출력 = \ *2
"출력       =  \"
\n 줄바꿈이다.
*/