class MyTask implements Runnable {
    String taskName;

    MyTask(String name) { this.taskName = name; }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " 작업 중... (" + i + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(taskName + " 완료!");
    }
}

public class Thread_Exam {
    public static void main(String[] args) {
        // 스레드 객체 생성
        Thread t1 = new Thread(new MyTask("A작업"));
        Thread t2 = new Thread(new MyTask("B작업"));

        // 스레드 시작
        t1.start();
        t2.start();

        System.out.println("메인 스레드 종료 (작업들은 배경에서 계속됨)");
    }
}