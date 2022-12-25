package homework4;

public class MonthSwitch {
    public static void main(String[] args) {
        int month;
        System.out.println (printMonthInWord(month=12));
    }
    public static String printMonthInWord(int month) {
        String str;
        switch(month) {
            case 1:
                str = "JAN";
                break;
            case 2:
                str = "FEB";
                break;
            case 3:
                str = "MAR";
                break;
            case 4:
                str = "APR";
                break;
            case 5:
                str = "MAY";
                break;
            case 6:
                str = "JUNE";
                break;
            case 7:
                str = "JULY";
                break;
            case 8:
                str = "AUG";
                break;
            case 9:
                str = "SEP";
                break;
            case 10:
                str = "OCT";
                break;
            case 11:
                str = "NOV";
                break;
            case 12:
                str = "DEC";
                break;
            default:
                str = "Not a valid month";
        }
        return str;
    }
}

