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



            if (cal == ('+')) {
                result = num1 + num2;
//                if (cnt >= 10){
//                    for (int i = 1; i <= 9; i++) {
//                        arr.[i-1] = arr[i];
//                    }
//                    arr[9]=result;
//                }else {
//                    arr[cnt] = result;
//                    cnt+=1;
//                }
                arr.add(result);
                System.out.println("결과: " + result);

            } else if (cal == ('-')) {
                result = num1 - num2;
//                if (cnt >= 10){
//                    for (int i = 1; i <= 9; i++) {
//                        arr[i-1] = arr[i];
//                    }
//                    arr[9]=result;
//                }else {
//                    arr[cnt] = result;
//                    cnt+=1;
//                }
                arr.add(result);
                System.out.println("결과: " + result);

            } else if (cal == ('*')) {
                result = num1 * num2;
//                if (cnt >= 10){
//                    for (int i = 1; i <= 9; i++) {
//                        arr[i-1] = arr[i];
//                    }
//                    arr[9]=result;
//                }else {
//                    arr[cnt] = result;
//                    cnt += 1;
//                }
                arr.add(result);
                System.out.println("결과: " + result);
            } else if (cal == ('/')) {
                try {
                    result = num1 / num2;
//                    if (cnt >= 10){
//                        for (int i = 1; i <= 9; i++) {
//                            arr[i-1] = arr[i];
//                        }
//                        arr[9]=result;
//                    }else {
//                        arr[cnt] = result;
//                        cnt += 1;
//                    }
                    arr.add(result);
                    System.out.println("결과: " + result);

                } catch (ArithmeticException e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                }
            }


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String check0 = sc.nextLine();
            if (check0.equals("remove")){
                arr.remove(0);
            }

            System.out.println(arr.toString());

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String check = sc.nextLine();
            if (check.equals("exit")){
                break;
            }

        }



    }
}
