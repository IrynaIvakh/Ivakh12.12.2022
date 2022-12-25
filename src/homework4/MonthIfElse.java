package homework4;

public class MonthIfElse {
    public static void main(String[] args) {
        int month;
        System.out.println (printMonthInWord(month=5));
    }
    public static String printMonthInWord(int month) {
        if (month > 12) {
            return "Not a valid month";
        }
        if (month == 1) {
            return "JAN";
        } else if (month == 2) {
            return "FEB";
        } else if (month == 3) {
            return "MAR";
        } else if(month == 4) {
            return "APR";
        } else if(month == 5) {
            return "MAY";
        } else if(month == 6) {
            return "JUNE";
        } else if(month == 7) {
            return "JULY";
        } else if(month == 8) {
            return "AUG";
        } else if(month == 9) {
            return "SEP";
        } else if(month == 10) {
            return "OCT";
        } else if(month == 11) {
            return "NOV";
        } else if(month == 12) {
            return "DEC";
        }
        return "Not a valid month";
    }
}
