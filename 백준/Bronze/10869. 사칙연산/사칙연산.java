import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedWriter를 사용하여 출력을 효율적으로 처리
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Scanner를 사용하여 표준 입력에서 데이터를 읽음
        Scanner sc = new Scanner(System.in);

        // 두 정수를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Scanner를 닫음 (더 이상 입력이 필요하지 않으므로)
        sc.close();

        // Calculator 클래스를 사용하여 연산을 수행
        Calculator calculator = new Calculator(a, b);

        // 각 연산의 결과를 BufferedWriter를 통해 출력
        bw.write(calculator.add() + "\n");
        bw.write(calculator.subtract() + "\n");
        bw.write(calculator.multiply() + "\n");
        bw.write(calculator.divide() + "\n");
        bw.write(calculator.remain() + "\n");

        // BufferedWriter의 버퍼를 비워서 출력
        bw.flush();

        // BufferedWriter를 닫아서 자원을 해제
        bw.close();
    }
}

// 간단한 산술 연산을 수행하는 Calculator 클래스
class Calculator {
    private int a;
    private int b;

    // 생성자: 두 정수를 받아서 필드에 할당
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 각각의 연산을 수행하는 메서드들
    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        // 주의: 나눗셈 연산에서 나누는 수가 0일 경우 예외 발생 가능성 있음
        return a / b;
    }

    public int remain() {
        // 주의: 나머지 연산에서 나누는 수가 0일 경우 예외 발생 가능성 있음
        return a % b;
    }
}