class Animal {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override // 
    void sound() {
        System.out.println("멍멍! 개가 짖습니다.");
    }
}

public class Overriding_Exam{
    public static void main(String[] args) {
        Animal myDog = new Dog(); // 다형성 활용
        myDog.sound(); // 
    }
}