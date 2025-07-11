import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private int result;
    private List<Integer> arr = new ArrayList<>();

    public int calculate(int num1, int num2, char cal) throws RuntimeException {

        if (cal == '+') {
            this.result = num1 + num2;
            arr.add(num1 + num2);
            System.out.println("결과: " + result);

        } else if (cal == ('-')) {
            this.result = num1 - num2;
            arr.add(num1 - num2);
            System.out.println("결과: " + result);

        } else if (cal == ('*')) {
            this.result = num1 * num2;
            arr.add(num1 * num2);
            System.out.println("결과: " + result);
        } else if (cal == ('/')) {
            try {
                this.result = num1 / num2;
                arr.add(num1 / num2);
                System.out.println("결과: " + result);

            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
            }
        }else {
            throw new RuntimeException();
        }
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
