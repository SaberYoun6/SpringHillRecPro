package hours.weeks;

import hours.HoursCalculation;

/*
 * here is where I would like to create a class  that will do all the priniting for the weekly information using and all the additional features and robustness to to how the week is calculationed
*/ 
public class WeeklyCalculation extends HoursCalculation{


  private final static double WeekZero= 21.0;

  private final static double totalAmountOfHours =1560.0 ;

  private double saturdayTotal; 
  private double sundayTotal;
  private double mondayTotal;
  private double tuesdayTotal;
  private double wednesdayTotal;
  private double thursdayTotal;
  private double fridayTotal;


  private double weekOneTotal;
  private double weekTwoTotal;

  private double paycheck;
  private double summedTotalHours;
  private double summedTotalHoursMinusTotalAmountofHours;
  private double overTimeHours; 


  public WeeklyCalculation( double saturdayTotal, double sundayTotal, double mondayTotal, double tuesdayTotal, double wednesdayTotal, double thursdayTotal, double fridayTotal){
    this.saturdayTotal = saturdayTotal;
    this.sundayTotal = sundayTotal;
    this.mondayTotal = mondayTotal;
    this.tuesdayTotal=tuesdayTotal;
    this.wednesdayTotal = wednesdayTotal;
    this.thursdayTotal = thursdayTotal;
    this.fridayTotal = fridayTotal;
  }
  public WeeklyCalculation(double saturdayTotal, double sundayTotal, double fridayTotal){
    this.saturdayTotal = saturdayTotal;
    this.sundayTotal = sundayTotal;
    this.fridayTotal = fridayTotal;
  }
  public WeeklyCalculation(){
     saturdayTotal=0.0;
    sundayTotal =0.0;
    mondayTotal =0.0;
    tuesdayTotal= 0.0;
    wednesdayTotal=0.0;
    thursdayTotal=0.0;
    fridayTotal=0.0;
  }
  public WeeklyCalculation(double saturdayTotal, double mondayTotal,double wednesdayTotal, double thursdayTotal, double fridayTotal){
    this.saturdayTotal= saturdayTotal;
    this.mondayTotal = mondayTotal;
    this.wednesdayTotal = wednesdayTotal;
    this.thursdayTotal = thursdayTotal;
    this.fridayTotal= fridayTotal;
  }
  public WeeklyCalculation(double saturdayTotal, double mondayTotal,double tuesdayTotal,double wednesdayTotal,double thrusdayTotal, double fridayTotal){
    this.saturdayTotal = saturdayTotal;
    this.mondayTotal = mondayTotal;
    this.tuesdayTotal = tuesdayTotal;
    this.wednesdayTotal = wednesdayTotal;
    this.thursdayTotal= thursdayTotal;
    this.fridayTotal = fridayTotal;
  }
  public WeeklyCalculation(double saturdayTotal, double sundayTotal,double mondayTotal, double tuesdayTotal) {
       this.saturdayTotal = saturdayTotal;
       this.sundayTotal = sundayTotal;
       this.mondayTotal = mondayTotal;
       this.tuesdayTotal = tuesdayTotal;

  }
  public WeeklyCalculation(double saturdayTotal, double sundayTotal) {
	  this.saturdayTotal= saturdayTotal;
	  this.sundayTotal = sundayTotal;
  }
  public double getWeekZero(){
    return WeekZero;
  }

  public void setSummedTotalHours(double summedTotalHours){
    this.summedTotalHours = summedTotalHours;
  }
  public double getSummedTotalHours(){
    return summedTotalHours;
  }
  public void setSummedTotalHoursMinusTotalAmountofHours(double summedTotalHoursMinusTotalAmountofHours){
    this.summedTotalHoursMinusTotalAmountofHours = summedTotalHoursMinusTotalAmountofHours;
  }
  public double getsummedTotalHoursMinusTotalAmountofHours(){
    return summedTotalHoursMinusTotalAmountofHours;
  }
  public void setSaturdayTotal(double saturdayTotal){
    this.saturdayTotal = saturdayTotal;
  }
  public double getSatudayTotal(){
    return saturdayTotal;
  }
  public void setSundayTotal(double sundayTotal) {
	  this.sundayTotal= sundayTotal;
  }
  public double getSundayTotal() {
	  return sundayTotal;
  }
  public void setMondayTotal(double mondayTotal){
    this.mondayTotal = mondayTotal;
  }
  public double getMondayTotal(){
    return mondayTotal;
  }
  public void setTuesdayTotal(double tuesdayTotal){
    this.tuesdayTotal = tuesdayTotal;
  }
  public double getTuesdayTotal(){
    return tuesdayTotal;
  }
  public void setWednesdayTotal(double wednesdayTotal){
    this.wednesdayTotal = wednesdayTotal;
  }
  public double getWednesdayTotal(){
    return wednesdayTotal;
  }
  public void setThursdayTotal(double thursdayTotal){
    this.thursdayTotal = thursdayTotal;
  }
  public double getThursdayTotal(){
    return thursdayTotal;
  }
  public void setFridayTotal(double fridayTotal){
    this.fridayTotal = fridayTotal;
  }
  public double getFridayTotal(){
    return fridayTotal;
  }
  public double getweekOneTotal(){
    return weekOneTotal;
  }
  public void setWeekOneTotal(double weekOneTotal){
    this.weekOneTotal = weekOneTotal;
  }
  public void setWeekTwoTotal(double weekTwoTotal){
    this.weekTwoTotal=weekTwoTotal;
  }
  public double getWeekTwoTotal(double weekTwoTotal){
    return weekTwoTotal;
  }
  public void setPaycheck(double paycheck){
    this.paycheck = paycheck;
  }
  public double getPaycheck(){
    return paycheck;
  }
  public double weeklyTotal(double ... dailyTotalHours){
    double totalWeeklyfHours=0.0;
    for (double dailyHours : dailyTotalHours){
    	totalWeeklyfHours =totalWeeklyfHours +dailyHours;
    }
    return totalWeeklyfHours;
  }
  public double totalityOfHours(double ...  weeks){
    double totalityHours = 0.0;
    for( double incrementalWeeks : weeks){
      totalityHours = totalityHours + incrementalWeeks;
    }
    return totalityHours;
  }
  public double totalityOfHoursMinusTotalHours(Double  ... weeks ){
    double totalityHours = 0.0;
    for (double incrementalWeeks : weeks){
      totalityHours = totalityHours + incrementalWeeks;
    }
    return totalAmountOfHours - totalityHours;
  }
  public double payChecks(double weekOneTotal, double weekTwoTotal){
    return weekOneTotal + weekTwoTotal;
  }
  public static double getWeekzero() {
		return WeekZero;
	}
public double getOverTime() { 
	return overTimeHours;
	}
public void setOverTime( double overTimeHours) {
	this.overTimeHours = overTimeHours;
}

public boolean OverTimeif (double weeks) {
	if (weeks > 40) {
		return true;
	}else {
		return false;
	}
	}
public double OverTimeValueHours(double week, boolean overTimes) {
	double overTimed=0.0;
	if (overTimes) {
		overTimed = week - 40;
	}else {
		overTimed = week;
	}
	return overTimed;
}
}
