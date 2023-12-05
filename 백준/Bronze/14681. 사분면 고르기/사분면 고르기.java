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

        //사분면
        if (a>0 && b>0) bw.write("1");
        else if (a<0 && b>0) bw.write("2");
        else if (a<0 && b<0) bw.write("3");
        else if (a>0 && b<0) bw.write("4");
        else bw.write("사분선 위에 점");
        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }
    /*
    갑자기 궁금해서 찾아본 if 나열을 왜 안 할까?
    if num > 10:
	print('num은 10 초과')

    if num < 10:
	print('num은 10 미만')

    if num == 10:
	print('num은 10')

	if num2 > 10:
	print('num2는 10 초과')

    elif: num2 < 10:
	print('num2는 10 미만')

    else:
	print('num2는 10')

    num 과 num2에 20이라는 값을 할당했을때 num은 세줄이 전부 실행된다 하지만 num2는 조건에 맞는 역할만을 한다.
     */
}