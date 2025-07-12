import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    private int result;
    private double resultCircle;
    private List<Integer> arr;
    private List<Double> arrCircle;

    final static double PI = 3.14159;
    /*
    * PI 값은 변하지 않는 값이다.
    * 자바에서 프로그램 실행중에 절대 변경되서는 안되는 값을
    * static final 키워드로 선언한다
    * static - 여러 곳에서 값을 공유해 쓰일 목적일때 사용함
    * final - 내부 상태를 변경할 수 없는 불변객체의 속성 사용됨
    * */

    Calculator(){
        arr = new ArrayList<>();
        arrCircle = new ArrayList<>();
        resultCircle = 0;
    }

    public int calculate(int num1, int num2, char cal) throws RuntimeException {
        if (cal == '+') {
            AddOperator addOperator = new AddOperator();
            int tmp = addOperator.operate(num1, num2);
            setResult(tmp);
            System.out.println("결과: " + tmp);

        } else if (cal == ('-')) {
            SubtractOperator subtractOperator = new SubtractOperator();
            int tmp = subtractOperator.operate(num1, num2);
            setResult(tmp);
            System.out.println("결과: " + tmp);

        } else if (cal == ('*')) {
            MultiplyOperator multiplyOperator = new MultiplyOperator();
            int tmp = multiplyOperator.operate(num1, num2);
            setResult(tmp);
            System.out.println("결과: " + tmp);
        } else if (cal == ('/')) {
            try {
                DivideOperator divideOperator = new DivideOperator();
                int tmp = divideOperator.operate(num1, num2);
                setResult(tmp);
                System.out.println("결과: " + tmp);

            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
            }
        } else if (cal == ('%')){
            try {
                ModOperator modOperator = new ModOperator();
                int tmp = modOperator.operate(num1, num2);
                setResult(tmp);
                System.out.println("결과: " + tmp);

            } catch (ArithmeticException e) {
                System.out.println("모듈러 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
            }
        } else {
            throw new RuntimeException();
        }
        return result;
    }

    public void removeResult(){
        if (!arr.isEmpty()){
            arr.remove(0);
        }
    }

    public void inquiryResults(){
        for (Integer ele : arr) {
            System.out.println(ele);
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        arr.add(result);
        this.result = result;
    }

    public double calculateCircleArea(int r){
        this.resultCircle = PI*r*r;
        arrCircle.add(this.resultCircle);
        return this.resultCircle;
    }

    public double getResultCircle() {
        return resultCircle;
    }

    public void setResultCircle(double resultCircle) {
        this.resultCircle = resultCircle;
    }

    public void inquiryCircleResults(){

        for (Double ele : arrCircle) {
            System.out.println(ele);
        }
    }


}

