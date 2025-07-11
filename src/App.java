import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static List<Integer> arr;
    public static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new ArrayList<>();

        int cnt = 0;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char cal = sc.nextLine().charAt(0);

            Calculator calculator = new Calculator();

            try {
                result = calculator.calculate(num1, num2, cal);
            } catch (RuntimeException e){
                System.out.print("올바른 사칙연산 기호를 입력하세요");
//                e.printStackTrace();
            }


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String check0 = sc.nextLine();
            if (check0.equals("remove")){
                if (!arr.isEmpty()){
                    arr.remove(0);
                }
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String check00 = sc.nextLine();
            if (check00.equals("inquiry")){
                for (Integer ele : arr) {
                    System.out.println(ele);
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
