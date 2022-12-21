package homework2;

public class Parallelepiped {
    public static void main(String[] args) {
        int a = 15;
        int b = 9;
        int h = 21;
        int volume = a*b*h;

        System.out.println("Об'єм паралелепіпеда = " + volume);
        int length = 4*a+4*b+4*h;

        System.out.println("Сумарна довжина всіх сторін = " + length);
    }
}
