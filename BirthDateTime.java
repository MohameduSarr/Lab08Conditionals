
import java.util.Scanner;
public class BirthDateTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter a year", 1950, 2010);
        int month = SafeInput.getRangedInt(in, "Enter a month", 1, 12);
        int dayOfMonth;
        boolean isLeapYear = false;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isLeapYear = true;
        }
        switch (month) {
            case 2:
                dayOfMonth = 28;
                if (isLeapYear) {
                    dayOfMonth = 29;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            default:
                dayOfMonth = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter a day", 1, dayOfMonth);
        int hours = SafeInput.getRangedInt(in, "Enter hours", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter minutes", 1, 59);
        System.out.printf("\nYou were born on %d/%d/%d at %d:%d.\n", month, day, year, hours, minutes);
    }
}