package homework4;

public class isoscelesTriangle {
    public static void main(String[] args) {
        int sideA;
        int sideB;
        int sideC;
        System.out.println (isoscelesTriangle (sideA=10, sideB=24, sideC=24));

    }
    public static String isoscelesTriangle (int sideA, int sideB, int sideC) {
        if (sideA == sideB & sideA == sideC & sideB == sideC){
            return "Не рівнобедрений";
        }
        if (sideA == sideB) {
            return "Рівнобедрений";
        } else if (sideA == sideC) {
            return "Рівнобедрений";
         } else if (sideB == sideC) {
        return "Рівнобедрений";
    }
        return "Не рівнобедрений";
        }
    }

