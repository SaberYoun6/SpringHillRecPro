package weeks;

import java.util.Objects;

import days.DailyCalculation;

public class WeeklyCalculations extends DailyCalculation implements  Week {
	private double saturdayTotal,sundayTotal,mondayTotal,tuesdayTotal,wednesdayTotal,thursdayTotal,fridayTotal=0.0;
	private final static double totalHours= 1560.0;
	private double summedHours,summedHoursMinusTotalHours,weeklyTotalily,paychecks=0.0;
	private String dayOfTheWeek= null;
	private int id;
	
	public double getPaychecks() {
		return paychecks;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dayOfTheWeek, fridayTotal, id, mondayTotal, paychecks, saturdayTotal, summedHours,
				summedHoursMinusTotalHours, sundayTotal, thursdayTotal, tuesdayTotal, wednesdayTotal, weeklyTotalily);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeeklyCalculations other = (WeeklyCalculations) obj;
		return Objects.equals(dayOfTheWeek, other.dayOfTheWeek)
				&& Double.doubleToLongBits(fridayTotal) == Double.doubleToLongBits(other.fridayTotal) && id == other.id
				&& Double.doubleToLongBits(mondayTotal) == Double.doubleToLongBits(other.mondayTotal)
				&& Double.doubleToLongBits(paychecks) == Double.doubleToLongBits(other.paychecks)
				&& Double.doubleToLongBits(saturdayTotal) == Double.doubleToLongBits(other.saturdayTotal)
				&& Double.doubleToLongBits(summedHours) == Double.doubleToLongBits(other.summedHours)
				&& Double.doubleToLongBits(summedHoursMinusTotalHours) == Double
						.doubleToLongBits(other.summedHoursMinusTotalHours)
				&& Double.doubleToLongBits(sundayTotal) == Double.doubleToLongBits(other.sundayTotal)
				&& Double.doubleToLongBits(thursdayTotal) == Double.doubleToLongBits(other.thursdayTotal)
				&& Double.doubleToLongBits(tuesdayTotal) == Double.doubleToLongBits(other.tuesdayTotal)
				&& Double.doubleToLongBits(wednesdayTotal) == Double.doubleToLongBits(other.wednesdayTotal)
				&& Double.doubleToLongBits(weeklyTotalily) == Double.doubleToLongBits(other.weeklyTotalily);
	}


	public void setPaychecks(double paychecks) {
		this.paychecks = paychecks;
	}


	public double getWeeklyTotalily() {
		return weeklyTotalily;
	}


	public void setWeeklyTotalily(double weeklyTotalily) {
		this.weeklyTotalily = weeklyTotalily;
	}

	
	public double getSummedHours() {
		return summedHours;
	}

	public void setSummedHours(double summedHours) {
		this.summedHours = summedHours;
	}

	public double getSummedHoursMinusTotalHours() {
		return summedHoursMinusTotalHours;
	}

	public void setSummedHoursMinusTotalHours(double summedHoursMinusTotalHours) {
		this.summedHoursMinusTotalHours = summedHoursMinusTotalHours;
	}

	public static double getTotalhours() {
		return totalHours;
	}

	public double getSaturdayTotal() {
		return saturdayTotal;
	}

	public void setSaturdayTotal(double saturdayTotal) {
		this.saturdayTotal = saturdayTotal;
	}

	public double getSundayTotal() {
		return sundayTotal;
	}


	public void setSundayTotal(double sundayTotal) {
		this.sundayTotal = sundayTotal;
	}

	public double getMondayTotal() {
		return mondayTotal;
	}

	public void setMondayTotal(double mondayTotal) {
		this.mondayTotal = mondayTotal;
	}

	public double getTuesdayTotal() {
		return tuesdayTotal;
	}

	public void setTuesdayTotal(double tuesdayTotal) {
		this.tuesdayTotal = tuesdayTotal;
	}

	public double getWednesdayTotal() {
		return wednesdayTotal;
	}

	public void setWednesdayTotal(double wednesdayTotal) {
		this.wednesdayTotal = wednesdayTotal;
	}

	public double getThursdayTotal() {
		return thursdayTotal;
	}

	public void setThursdayTotal(double thursdayTotal) {
		this.thursdayTotal = thursdayTotal;
	}

	public double getFridayTotal() {
		return fridayTotal;
	}

	public void setFridayTotal(double fridayTotal) {
		this.fridayTotal = fridayTotal;
	}
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}


	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public WeeklyCalculations() {
		super();
		saturdayTotal=0.0;
		sundayTotal=0.0;
		mondayTotal=0.0;
		tuesdayTotal=0.0;
		wednesdayTotal=0.0;
		thursdayTotal=0.0;
		fridayTotal=0.0;
	}
	public WeeklyCalculations( double saturdayTotal) {
		this.saturdayTotal = saturdayTotal;
	}
	public WeeklyCalculations(double saturdayTotal,double sundayTotal){
		this.saturdayTotal = saturdayTotal;
		this.sundayTotal = sundayTotal;
	}
	public WeeklyCalculations(double saturdayTotal, double sundayTotal, double fridayTotal) {
		this.saturdayTotal = saturdayTotal;
		this.sundayTotal = sundayTotal;
		this.fridayTotal = fridayTotal;
	}
	public WeeklyCalculations(double saturdayTotal, double sundayTotal,double mondayTotal,double fridayTotal) {
		this.saturdayTotal = saturdayTotal;
		this.sundayTotal = sundayTotal;
		this.mondayTotal = mondayTotal;
		this.fridayTotal = fridayTotal;
	}
	public WeeklyCalculations(double saturdayTotal, double sundayTotal,double mondayTotal,double tuesdayTotal,double fridayTotal) {
		this.saturdayTotal = saturdayTotal;
		this.sundayTotal = sundayTotal;
		this.mondayTotal = mondayTotal;
		this.tuesdayTotal=tuesdayTotal;
		this.fridayTotal = fridayTotal;
	}
	public WeeklyCalculations(double saturdayTotal, double sundayTotal,double mondayTotal,double tuesdayTotal,
			double thursdayTotal,double fridayTotal) {
		this.saturdayTotal = saturdayTotal;
		this.sundayTotal = sundayTotal;
		this.mondayTotal = mondayTotal;
		this.tuesdayTotal=tuesdayTotal;
		this.thursdayTotal=thursdayTotal;
		this.fridayTotal = fridayTotal;
	}
	public WeeklyCalculations(double saturdayTotal, double sundayTotal,double mondayTotal,double tuesdayTotal,
			double wednesdayTotal,double thursdayTotal,double fridayTotal) {
		this.saturdayTotal = saturdayTotal;
		this.sundayTotal = sundayTotal;
		this.mondayTotal = mondayTotal;
		this.tuesdayTotal=tuesdayTotal;
		this.wednesdayTotal = wednesdayTotal;
		this.thursdayTotal=thursdayTotal;
		this.fridayTotal = fridayTotal;
	}

	public double WeeklyTotal(double... weeks) {
		double weeklyTotal=0.0;
		for ( double incrementalWeeks : weeks)
		{
			weeklyTotal =  weeklyTotal + incrementalWeeks;
		}
		return weeklyTotal;
	}

	public double WeeklyTotalMinusTotalAmountOfHours(double weeklyTotal) {

		return totalHours - weeklyTotal;
	}

	//This is a method overlaoding 
	public double paycheck(double week0total, double week1total) {
		return week0total + week1total;
	}
	public double paycheck(double weekTotal) {
		return weekTotal;
	}

	public double convertHourlyTotalIntoWeeklyTotal(double... hour) {

		double totalAmountOfHours=0.0;
		for (double incrementalHours : hour){
			totalAmountOfHours = totalAmountOfHours + incrementalHours ;
		}
		return totalAmountOfHours;
	}

}
