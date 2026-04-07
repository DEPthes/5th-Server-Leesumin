class Calculator {
    // 1. 정수 두 개를 더하는 메서드
    int add(int a, int b) {
        return a + b;
    }

    // 2. 매개변수의 개수가 다른 메서드 (오버로딩)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. 매개변수의 타입이 다른 메서드 (오버로딩)
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading_Exam {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));        
        System.out.println(calc.add(5, 10, 15));     
        System.out.println(calc.add(3.14, 2.0));   
    }
}