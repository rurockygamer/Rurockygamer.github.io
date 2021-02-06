public class A&B_Day
{

	//this is the date that you want to find whether if is A or B day
	private int year;
	private int month;
	private int day;

	//this is the date of a day that is known to be A day
	private static int AYear;
	private static int AMonth;
	private static int ADay;

	public static int AorBDayFromDate(int year, int month, int day)
	{

		for(y = 2020; y <= year; y++)
		{
			for(m = 1; m <= month; m++)
			{
				if(m == 2){

					for(d = 1; d <= 29; d++)
					{

					}
				} else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				
					for(d = 1; d <= 31; d++)
					{

					}
				} else {

					for(d = 1; d <= 30; d++)
					{

					}
				}

			} //months	

		} //years
	}

	/**this one does this: if yesterday was A day, today is B day
	*/
	public static int AorB(int dayBefore)
	{
		if (/*this will chech if today is not an A or B day*/){
			
		} else if(dayBefore == 1){
			return 0;
		} else if (dayBefore == 0) {
			return 1;
		}
	}


}//the class

