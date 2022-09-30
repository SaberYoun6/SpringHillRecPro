package weeks;

public interface Week {
	double WeeklyTotal(double ... weeks);
	double WeeklyTotalMinusTotalAmountOfHours(double weeklyTotal);
	double paycheck(double week0total, double week1total);
	double convertHourlyTotalIntoWeeklyTotal(double ... hour);
	
}
