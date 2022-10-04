package weeks;

import hours.HourCalculation;
import hours.Hours;

public class WeeklyCalculations extends HourCalculation implements Hours, Week {
	private double saturdayTotal,sundayTotal,mondayTotal,tuesdayTotal,wednesdayTotal,thursdayTotal,fridayTotal=0.0;
	private final static double totalHours= 1560.0;
	private final double WeekZero=21.0;
	private double summedHours,summedHoursMinusTotalHours,weeklyTotalily,paychecks=0.0;
	
	public double getPaychecks() {
		return paychecks;
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


	public double getWeekZero() {
		return WeekZero;
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
	public WeeklyCalculations() {
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

	public double dailyTotal(double inTime, double outTime) {
		// TODO Auto-generated method stub
		return super.dailyTotal(inTime, outTime);
	}

	public double dailyTotal(double inTime0, double outTime0, double inTime1, double outTime1) {
		// TODO Auto-generated method stub
		return super.dailyTotal(inTime0, outTime0, inTime1, outTime1);
	}


}
