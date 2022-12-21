package homework2;

public class Temperature {
    public static void main(String[] args) {
        int celsiusT = 25;
        int fahrenheitT = 9*celsiusT/5+32;
        double kelvinT = celsiusT+273.16;

        System.out.println(celsiusT  + "C" + ";" + fahrenheitT + "F" + ";" + kelvinT + "K");
    }
}
