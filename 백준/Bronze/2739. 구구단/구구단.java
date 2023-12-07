import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();

        for(int i=1; i<=9; i++){
            bw.write(a + " * " + i + " = " + a * i+"\n");
        }



        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();

    }
    /*반복문
    초기화식 : 반복의 시작 지점 지정

    조건식 : 언제까지 반복하는가

    증감식 : 얼만큼 증가하는가

    for문
    for (초기화식;  조건식; 증감식) {실행문;} 반복 횟수를 알고 있을때 사용

    int sum = 0;
    for (int i=1; i<=100; i++) {1~100의 합
	sum = sum + i;
    }

    while문
    while(조건식) { 실행문; } 조건에 따라 반복할 때 사용 true일 경우 반복, false일 경우 종료 조건식에는 주로 비교 연산식, 논리 연산식 사용

    */
}