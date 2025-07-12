import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static List<Integer> arr;
    public static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new ArrayList<>();
//        Calculator calculator = new Calculator();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();


        while (true) {
            System.out.print("1. 계산기 2. 원의 넓이 구하기; 선택하세요: ");
            int choice = sc.nextInt();

            if (choice == 1){
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                sc.nextLine();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char cal = sc.nextLine().charAt(0);

                try {
                    result = arithmeticCalculator.calculate(num1, num2, cal);
                } catch (RuntimeException e){
                    System.out.print("올바른 사칙연산 기호를 입력하세요");
    //                e.printStackTrace();
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String check0 = sc.nextLine();
                if (check0.equals("remove")){
                    circleCalculator.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String check00 = sc.nextLine();
                if (check00.equals("inquiry")){
                    arithmeticCalculator.inquiryResults();
                }
            } else if(choice == 2){
                System.out.println("원의 반지름을 입력하세요: ");
                int r = sc.nextInt();

                sc.nextLine();
                double tmp = circleCalculator.calculateCircleArea(r);
                circleCalculator.setResultCircle(tmp);
                System.out.println("원의 넓이: "+circleCalculator.getResultCircle());

                System.out.println("저장된 원의 넓이의 값들: ");
                circleCalculator.inquiryCircleResults();

            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String check = sc.nextLine();
            if (check.equals("exit")){
                break;
            }

        }



    }
}
