public class Exception_Exam {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // 예외가 발생할 수 있는 코드 
            System.out.println("값: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 예외 발생 시 처리할 내용
            System.out.println("에러 발생: 배열의 범위를 벗어났습니다.");
            System.out.println("메시지: " + e.getMessage());
        } finally {
            // 예외 발생 여부와 상관없이 무조건 실행되는 코드
            System.out.println("프로그램을 안전하게 종료합니다.");
        }
    }
}