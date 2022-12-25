package homework4;

public class OddEvenNumber {
    public static void main(String[] args) {
        int number;
        System.out.println (checkOddEven(number=1458624));
                System.out.println("BYE");
    }
    public static String checkOddEven(int number){
if (number % 2 == 0) {
    return "Even Number";
}
return "Odd Number";
    }
}
