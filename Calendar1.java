/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
		int SundaysCount = 0;
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year <= 1999) {
	 		//// Write the body of the while 

			if (dayOfMonth == 1 && dayOfWeek == 1)
			{
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                SundaysCount++;
			}
			else
			{
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}

			advance();
	 		debugDaysCounter++;

	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if ((year == 2000)) { 
	 			break;
	 		}
        }
	 	//// Write the necessary ending code here
		 System.out.println("During the 20th century, " + SundaysCount + " Sundays fell on the first day of the month");
		 //System.out.println("number of lines" + debugDaysCounter);
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		// Replace this comment with your code
		

		if(dayOfMonth == nDaysInMonth(month, year))
		{
			month++;
			dayOfMonth = 0;
		}
			if( month > 12)
			{
				month = 1;
				year++;
			}
		else
		{
			dayOfMonth++;
		}
		dayOfWeek = ( dayOfWeek +1 ) % 7; //add one for the day and save the format of 7 days per week
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    Boolean isLeapYear = false;
		isLeapYear = ((year%400) == 0);
		isLeapYear = isLeapYear || (((year %4 == 0) && (year % 100 != 0)));

		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		int op1 = 30;
		int op2 = 31;
		switch (month) {
			case 1:
				return op2;
				
			case 2:
				if(isLeapYear(year))
				{
					return 29;
				}
				else
				{
					return 28;
				}
					
			case 3:
				return op2;
				
			case 4:
				return op1;
				
			case 5:
				return op2;
				
			case 6:
				return op1;
				
			case 7:
				
				return op2;
			case 8:
				return op2;
				
			case 9:
				return op1;
				
			case 10:
				return op2;
				
			case 11:
				return op1;
				
			case 12:
				return op2;
				

			default:
				break;
		}
		return 0;
	}
	}
