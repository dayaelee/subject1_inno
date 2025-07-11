import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char cal = sc.nextLine().charAt(0);

            int result;

            if (cal == ('+')) {
                result = num1 + num2;
                System.out.println("결과: " + result);
            } else if (cal == ('-')) {
                result = num1 - num2;
                System.out.println("결과: " + result);
            } else if (cal == ('*')) {
                result = num1 * num2;
                System.out.println("결과: " + result);
            } else if (cal == ('/')) {
                try {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                }
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String check = sc.nextLine();
            if (check.equals("exit")){
                break;
            }
        }



    }
}
