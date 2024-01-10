public class tt {


    /**
 * Prints the calendars of all the years in the 20th century.
 */
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2; // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January

    /**
     * Prints the calendars of all the years in the 20th century. Also prints the
     * number of Sundays that occurred on the first day of the month during this
     * period.
     */
    public static void main(String args[]) {
        // Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999,
        // inclusive.
        // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints
        // "Sunday".
        // The following variable, used for debugging purposes, counts how many days were
        // advanced so far.
        int debugDaysCounter = 0;
        int SundaysCount = 0;

        while (year <= 1999) {
            // Write the body of the while
            advance();
            debugDaysCounter++;

            // Check if it's the first day of the month and a Sunday
            if (dayOfMonth == 1 && dayOfWeek == 0) {
                System.out.println(dayOfMonth + "/" + month + "/" + year + " is also Sunday");
                SundaysCount++;
            }

            // If you want to stop the loop after n days, replace the condition of the
            // if statement with the condition (debugDaysCounter == n)
            if (year == 2000) {
                break;
            }
        }

        // Write the necessary ending code here
        System.out.println("Total Sundays: " + SundaysCount);
    }

    // Advances the date (day, month, year) and the day-of-the-week.
    // If the month changes, sets the number of days in this month.
    // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek,
    // nDaysInMonth.
    private static void advance() {
        dayOfWeek = (dayOfWeek + 1) % 7; // Advance the day of the week

        // Check if we need to move to the next month
        if (dayOfMonth == nDaysInMonth) {
            dayOfMonth = 1; // Start a new month
            month++;

            if (month > 12) {
                month = 1; // Start a new year
                year++;

                // Set the number of days in the new month
                nDaysInMonth = nDaysInMonth(month, year);
            }
        } else {
            dayOfMonth++;
        }
    }

    // Returns true if the given year is a leap year, false otherwise.
    private static boolean isLeapYear(int year) {
        return ((year % 400) == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Returns the number of days in the given month and year.
    // April, June, September, and November have 30 days each.
    // February has 28 days in a common year, and 29 days in a leap year.
    // All the other months have 31 days.
    private static int nDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return isLeapYear(year) ? 29 : 28;

            default:
                return 0;
        }
    }
}

       
    

