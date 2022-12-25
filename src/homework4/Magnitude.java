package homework4;

public class Magnitude {
    public static void main(String[] args) {
        int number1;
        int number2;
        System.out.println (magnitude (number1=-9, number2=3));

    }
    public static Integer magnitude (int number1, int number2){
        if (Math.abs(number1) > Math.abs(number2)) {
            return number1;
        } else if (Math.abs(number1) < Math.abs(number2)) {
            return number2;
        }
        return 0;
    }
}
