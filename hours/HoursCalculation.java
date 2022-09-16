package hours;

public class HoursCalculation extends Hours{ 
  public static double WeekZero =21.0;
  private double saturdayTotal;
  private double timeIn0Saturday;
  private double timeIn1Saturday;
  private double timeOut0Saturday;
  private double timeOut1Saturday;
  private double sundayTotal;
  private double timeIn0Sunday;
  private double timeIn1Sunday;
  private double timeOut0Sunday;
  private double timeOut1Sunday;
  private double mondayTotal;
  private double timeIn0Monday;
  private double timeIn1Monday;
  private double timeOut0Monday;
  private double timeOut1Monday;
  private double tuesdayTotal;
  private double timeIn0Tuesday;
  private double timeIn1Tuesday;
  private double timeOut0Tuesday;
  private double timeOut1Tuesday;
  private double wednesdayTotal;
  private double timeIn0Wednesday;
  private double timeIn1Wednesday;
  private double timeOut0Wednesday;
  private double timeOut1Wednesday;
  private double thursdayTotal;
  private double timeIn0Thursday;
  private double timeIn1Thursday;
  private double timeOut0Thursday;
  private double timeOut1Thursday;
  private double fridayTotal;
  private double timeIn0Friday;
  private double timeIn1Friday;
  private double timeOut0Friday;
  private double timeOut1Friday;
  private double weekTotal;
  private double summedHoursForWeeksTotal;
  private double totalMinusweeklyTotals;
  private double paycheck;



  public void setPaycheck(double paycheck){
    this.paycheck = paycheck;
  }
  public double getPaycheck(){
    return paycheck;
  }


  public void setWeekTotal(double weekTotal){
    this.weekTotal =weekTotal;
  }

  public double getWeekTotal(){
   return weekTotal;
   }
  public void setSaturdayTotal(double saturdayTotal){
     this.saturdayTotal = saturdayTotal; 
  }
  public double getSaturdayTotal(){
    return saturdayTotal;
  }
 
  public void setTimeIn0Saturday(double timeIn0Saturday){
      this.timeIn0Saturday= timeIn0Saturday;
  }
  public double getTimeIn0Saturday(){
     return timeIn0Saturday;
  }
  public void setTimeIn1Saturday(double  timeIn1Saturday){
    this.timeIn1Saturday = timeIn1Saturday;
  }
  public double  getTimeIn1Saturday(){
     return timeIn1Saturday;
  }
  public void setTimeOut0Saturday (double timeOut0Saturday){
      this.timeOut0Saturday= timeOut0Saturday ;
  }
  public double getTimeOut0Saturday(){
     return timeOut0Saturday ;
  }
  public void setTimeOut1Saturday(double timeOut1Saturday){
    this.timeOut1Saturday = timeOut1Saturday;
  }
  public double getTimeOut1Saturday(){
    return timeOut1Saturday;
  }


  public void setSundayTotal(double sundayTotal){
      this.sundayTotal= sundayTotal;
  }
  public double getSundayTotal(){
    return sundayTotal;
  }
  public void setTimeIn0Sunday(double timeIn0Sunday){
      this.timeIn0Sunday= timeIn0Sunday;
  }
  public double getTimeIn0Sunday(){
     return timeIn0Sunday;
  }
  public void setTimeIn1Sunday(double  timeIn1Sunday){
    this.timeIn1Sunday = timeIn1Sunday;
  }
  public double  getTimeIn1Sunday(){
     return timeIn1Sunday;
  }
  public void setTimeOut0Sunday(double timeOut0Sunday){
      this.timeOut0Sunday= timeOut0Sunday ;
  }
  public double getTimeOut0Sunday(){
     return timeOut0Sunday ;
  }
  public void setTimeOut1Sunday(double timeOut1Sunday){
    this.timeOut1Sunday = timeOut1Sunday;
  }
  public double getTimeOut1Sunday(){
    return timeOut1Sunday;
  }


  public void setMondayTotal( double mondayTotal){
      this.mondayTotal = mondayTotal;
  }
  public double getMondayTotal(){
      return mondayTotal;
  }
  
  public void setTimeIn0Monday(double timeIn0Monday){
      this.timeIn0Monday= timeIn0Monday;
  }
  public double getTimeIn0Monday(){
     return timeIn0Monday;
  }
  public void setTimeIn1Monday(double  timeIn1Monday){
    this.timeIn1Monday = timeIn1Monday;
  }
  public double  getTimeIn1Monday(){
     return timeIn1Monday;
  }
  public void setTimeOut0Monday (double timeOut0Monday){
      this.timeOut0Monday= timeOut0Monday ;
  }
  public double getTimeOut0Monday(){
     return timeOut0Monday ;
  }
  public void setTimeOut1Monday(double timeOut1Monday){
    this.timeOut1Monday = timeOut1Monday;
  }
  public double getTimeOut1Monday(){
    return timeOut1Monday;
  }
  
  public void setTuesdayTotal(double tuesdayTotal){
      this.tuesdayTotal= tuesdayTotal;
  }
  public double getTuesdayTotal(){
    return tuesdayTotal;
  }
  public void setTimeIn0Tuesday(double timeIn0Tuesday){
      this.timeIn0Tuesday= timeIn0Tuesday;
  }
  public double getTimeIn0Tuesday(){
     return timeIn0Tuesday;
  }
  public void setTimeIn1Tuesday(double  timeIn1Tuesday){
    this.timeIn1Tuesday = timeIn1Tuesday;
  }
  public double  getTimeIn1Tuesday(){
     return timeIn1Tuesday;
  }
  public void setTimeOut0Tuesday (double timeOut0Tuesday){
      this.timeOut0Tuesday= timeOut0Tuesday ;
  }
  public double getTimeOut0Tuesday(){
     return timeOut0Tuesday;
  }
  public void setTimeOut1Tuesday(double timeOut1Tuesday){
    this.timeOut1Tuesday = timeOut1Tuesday;
  }
  public double getTimeOut1Tuesday(){
    return timeOut1Tuesday;
  }
  
  public void setWednesdayTotal(double wednesdayTotal){
      this.wednesdayTotal= wednesdayTotal;
  }
  public double getWednesdayTotal(){
    return wednesdayTotal;
  }
  public void setTimeIn0Wednesday(double timeIn0Wednesday){
      this.timeIn0Wednesday= timeIn0Wednesday;
  }
  public double getTimeIn0Wednesday(){
     return timeIn0Wednesday;
  }
  public void setTimeIn1Wednesday(double  timeIn1Wednesday){
    this.timeIn1Wednesday = timeIn1Wednesday;
  }
  public double  getTimeIn1Wednesday(){
     return timeIn1Wednesday;
  }
  public void setTimeOut0Wednesday (double timeOut0Wednesday){
      this.timeOut0Wednesday = timeOut0Wednesday ;
  }
  public double getTimeOut0Wednesday(){
     return timeOut0Wednesday ;
  }
  public void setTimeOut1Wednesday(double timeOut1Wednesday){
    this.timeOut1Wednesday = timeOut1Wednesday;
  }
  public double getTimeOut1Wednesday(){
    return timeOut1Wednesday;
  }
  
  public void setThursdayTotal(double thursdayTotal){
      this.thursdayTotal= thursdayTotal;
  }
  public double getThursdayTotal(){
    return thursdayTotal;
  }
  public void setTimeIn0Thursday(double timeIn0Thursday){
      this.timeIn0Thursday= timeIn0Thursday;
  }
  public double getTimeIn0Thursday(){
     return timeIn0Thursday;
  }
  public void setTimeIn1Thursday(double  timeIn1Thursday){
    this.timeIn1Thursday = timeIn1Thursday;
  }
  public double  getTimeIn1Thursday(){
     return timeIn1Thursday;
  }
  public void setTimeOut0Thursday (double timeOut0Thursday){
      this.timeOut0Thursday= timeOut0Thursday ;
  }
  public double getTimeOut0Thursday(){
     return timeOut0Thursday ;
  }
  public void setTimeOut1Thursday(double timeOut1Thursday){
    this.timeOut1Thursday = timeOut1Thursday;
  }
  public double getTimeOut1Thursday(){
    return timeOut1Thursday;
  }
  
  public void setFridayTotal(double fridayTotal){
      this.fridayTotal = fridayTotal;
  }
  public double getFridayTotal(){
    return fridayTotal;
  }
  public void setTimeIn0Friday(double timeIn0Friday){
      this.timeIn0Friday= timeIn0Friday;
  }
  public double getTimeIn0Friday(){
     return timeIn0Friday;
  }
  public void setTimeIn1Friday(double  timeIn1Friday){
    this.timeIn1Friday = timeIn1Friday;
  }
  public double  getTimeIn1Friday(){
     return timeIn1Friday;
  }
  public void setTimeOut0Friday (double timeOut0Friday){
      this.timeOut0Friday= timeOut0Friday ;
  }
  public double getTimeOut0Friday(){
     return timeOut0Friday ;
  }
  public void setTimeOut1Friday(double timeOut1Friday){
    this.timeOut1Friday = timeOut1Friday;
  }
  public double getTimeOut1Friday(){
    return timeOut1Friday;
  }
  public void setSummedHoursForWeeksTotal(double summedHoursForWeeksTotal){
    this.summedHoursForWeeksTotal = summedHoursForWeeksTotal;
  }
  public double getSummedHoursForWeeksTotal(){
    return summedHoursForWeeksTotal;
  }

  public void setTotalMinusWeeklyTotals(double totalMinusweeklyTotals){
    this.totalMinusweeklyTotals = totalMinusweeklyTotals;
  }
  public double getTotalMinusWeeklyTotals(){
    return totalMinusweeklyTotals;
  }

  public double weeklyTotal(double ... dailyTotalHours){
 
   double totalAmountOfHours=0.0;
   for (double incrementalHours : dailyTotalHours){
     totalAmountOfHours = totalAmountOfHours + incrementalHours ;
   }
  return totalAmountOfHours;

   }
  @Override
  public double dailyTotal(double out, double in)
  {
    double dailyTot = out - in;
    return  dailyTot;
  }
  @Override
  public double dailyTotal(double out0 , double in0, double out1, double in1)
  {
    double total0 =   out0 - in0;
    double total1 =   out1 - in1;
    double dailyTot= total0 + total1; 
    return dailyTot;
  }
 
  public double summedTotalsHoursMinusTotalHoursLefted(double ... weeks){
    double totalAmountOfHours=1560.0; 
    double summedTotalHours = 0.0;
     for (double incrementalWeeks : weeks){
       summedTotalHours = summedTotalHours + incrementalWeeks;
     }
     return totalAmountOfHours-summedTotalHours;
  }
  public double summedTotalHours (double ... weeks){
     double weeklyTotal=0.0;
     for ( double incrementalWeeks : weeks){
          weeklyTotal =  weeklyTotal + incrementalWeeks;
      }
      return weeklyTotal;
  }
  public double paycheck(double weekzero, double weekone){
    return weekzero + weekone;
  }
 
}

