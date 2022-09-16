import hours.HoursCalculation;
import hours.weeks.WeeklyCalculation;
import hours.weeks.scanner.ScansClass;
public class Main{

     public static void main(String[] args){
	     //constructors of class
    	 HoursCalculation weeksOfDayOne = new HoursCalculation();
	     HoursCalculation weeksOfDayTwo = new HoursCalculation();
	     HoursCalculation weeksOfDayThree = new HoursCalculation();
	     HoursCalculation weeksOfDayFour = new HoursCalculation();
	     HoursCalculation weeksOfDayFive = new HoursCalculation();
	     HoursCalculation weeksOfDaySix= new HoursCalculation();
	     HoursCalculation weekOfDaySeven = new HoursCalculation();
	     HoursCalculation weeksOfDayEight = new HoursCalculation();
	     HoursCalculation weeksOfDayNine = new HoursCalculation();
	     HoursCalculation weeksOfDayTen = new HoursCalculation();
	     HoursCalculation weeksOfDayEleven = new HoursCalculation();
	     HoursCalculation weeksOfDayTwelve = new HoursCalculation();
	     HoursCalculation weeksofDayThriteen = new HoursCalculation();
	     HoursCalculation weeksOfDayFourteen = new HoursCalculation();
	     HoursCalculation weeksOfDayFifteen = new HoursCalculation();
	     // This is a declarivate statment
	     
	     weeksOfDayTwelve.setTimeOut0Monday(21.25);
	     weeksOfDayTwelve.setTimeIn0Monday(16.00);
	     weeksOfDayTwelve.setTimeOut0Thursday(14.00);
	     weeksOfDayTwelve.setTimeIn0Thursday(6.00);
	     weeksOfDayTwelve.setTimeOut0Friday(12.50);
	     weeksOfDayTwelve.setTimeIn0Friday(6.00);
	     weeksOfDayTwelve.setTimeOut1Friday(21.00);
	     weeksOfDayTwelve.setTimeIn1Friday(19.00);
	     
	     weeksOfDayTwelve.setMondayTotal(weeksOfDayTwelve.dailyTotal(weeksOfDayTwelve.getTimeOut0Monday(),weeksOfDayTwelve.getTimeIn0Monday()));
	     weeksOfDayTwelve.setThursdayTotal(weeksOfDayTwelve.dailyTotal(weeksOfDayTwelve.getTimeOut0Thursday(),weeksOfDayTwelve.getTimeIn0Thursday()));
	     
	     weeksOfDayTen.setTimeOut0Saturday(18.25);
	     weeksOfDayTen.setTimeIn0Saturday(8.50);
	     weeksOfDayTen.setTimeOut0Sunday(20.25);
	     weeksOfDayTen.setTimeIn0Sunday(13.00);
	     weeksOfDayTen.setTimeOut0Monday(21.25);
	     weeksOfDayTen.setTimeIn0Monday(16.00);
	     weeksOfDayTen.setTimeOut0Thursday(21.25);
	     weeksOfDayTen.setTimeIn0Thursday(16.00);
	     weeksOfDayTen.setTimeOut0Friday(21.00);
	     weeksOfDayTen.setTimeIn0Friday(19.00);
	     
	     weeksOfDayOne.setTimeOut0Saturday(22.25);
	     weeksOfDayOne.setTimeIn0Saturday(15.00);
	     weeksOfDayOne.setTimeOut0Sunday(9.50);
	     weeksOfDayOne.setTimeIn0Sunday(7.00);
	     weeksOfDayOne.setTimeOut1Sunday(20.25);
	     weeksOfDayOne.setTimeIn1Sunday(13.50);
	     weeksOfDayOne.setTimeOut0Monday(14.00);
	     weeksOfDayOne.setTimeIn0Monday(6.00);
	     weeksOfDayOne.setTimeOut0Thursday(16.00);
	     weeksOfDayOne.setTimeIn0Thursday(6.0);

	     weeksOfDayTwo.setTimeOut0Saturday(18.25);
	     weeksOfDayTwo.setTimeIn0Saturday(13.00);
	     weeksOfDayTwo.setTimeOut0Sunday(9.75);
	     weeksOfDayTwo.setTimeIn0Sunday(7.00);
	     weeksOfDayTwo.setTimeOut1Sunday(17.25);
	     weeksOfDayTwo.setTimeIn1Sunday(13.50);
	     weeksOfDayTwo.setTimeOut0Monday(14.00);
	     weeksOfDayTwo.setTimeIn0Monday(7.50);
	     weeksOfDayTwo.setTimeOut0Thursday(15.50);
	     weeksOfDayTwo.setTimeIn0Thursday(6.00);
	     weeksOfDayTwo.setTimeOut0Friday(12.50);
	     weeksOfDayTwo.setTimeIn0Friday(6.00);

	     weeksOfDayThree.setTimeOut0Saturday(13.00);
	     weeksOfDayThree.setTimeIn0Saturday(8.50);
	     weeksOfDayThree.setTimeOut1Saturday(13.10);
	     weeksOfDayThree.setTimeIn1Saturday(13.00);
	     weeksOfDayThree.setTimeOut0Sunday(9.30);
	     weeksOfDayThree.setTimeIn0Sunday(7.00);
	     weeksOfDayThree.setTimeOut1Sunday(20.25);
	     weeksOfDayThree.setTimeIn1Sunday(13.50);
	     weeksOfDayThree.setTimeOut0Monday(14.00);
	     weeksOfDayThree.setTimeIn0Monday(6.00);
	     weeksOfDayThree.setTimeOut0Thursday(15.00);
	     weeksOfDayThree.setTimeIn0Thursday(6.00);
	     weeksOfDayThree.setTimeOut0Friday(12.50);
	     weeksOfDayThree.setTimeIn0Friday(6.00);
	     
	     
	     weeksOfDayFour.setTimeOut0Saturday(13.50);
	     weeksOfDayFour.setTimeIn0Saturday(8.50);
	     weeksOfDayFour.setTimeOut0Sunday(20.25);
	     weeksOfDayFour.setTimeIn0Sunday(13.50);
	     weeksOfDayFour.setTimeOut0Monday(14.00);
	     weeksOfDayFour.setTimeIn0Monday(6.00);
	     weeksOfDayFour.setTimeIn0Wednesday(13.50);
	     weeksOfDayFour.setTimeOut0Wednesday(21.25);
	     weeksOfDayFour.setTimeOut0Thursday(12.00);
	     weeksOfDayFour.setTimeIn0Thursday(6.00);
	     weeksOfDayFour.setTimeOut0Friday(12.50);
	     weeksOfDayFour.setTimeIn0Friday(6.00);

      
	     weeksOfDayFive.setTimeOut0Saturday(13.00);
	     weeksOfDayFive.setTimeIn0Saturday(7.00);
	     weeksOfDayFive.setTimeOut0Monday(14.00);
	     weeksOfDayFive.setTimeIn0Monday(6.00);
	     weeksOfDayFive.setTimeOut0Wednesday(20.00);
	     weeksOfDayFive.setTimeIn0Wednesday(12.00);
	     weeksOfDayFive.setTimeOut0Thursday(14.00);
	     weeksOfDayFive.setTimeIn0Thursday(6.00);
	     weeksOfDayFive.setTimeOut0Friday(13.00);
	     weeksOfDayFive.setTimeIn0Friday(6.00);

	     weeksOfDaySix.setTimeOut0Saturday(13.00);
	     weeksOfDaySix.setTimeIn0Saturday(8.50);
	     weeksOfDaySix.setTimeOut0Monday(14.00);
	     weeksOfDaySix.setTimeIn0Monday(6.00);
	     weeksOfDaySix.setTimeOut0Wednesday(21.25);
	     weeksOfDaySix.setTimeIn0Wednesday(14.00);
	     weeksOfDaySix.setTimeOut0Thursday(14.00);
	     weeksOfDaySix.setTimeIn0Thursday(6.00);
	     weeksOfDaySix.setTimeOut0Friday(12.50);
	     weeksOfDaySix.setTimeIn0Friday(6.00);

	     weekOfDaySeven.setTimeOut0Saturday(13.00);
	     weekOfDaySeven.setTimeIn0Saturday(8.50);
	     weekOfDaySeven.setTimeOut0Monday(14.00);
	     weekOfDaySeven.setTimeIn0Monday(6.00);
	     weekOfDaySeven.setTimeOut0Wednesday(21.15);
	     weekOfDaySeven.setTimeIn0Wednesday(14.00);
	     weekOfDaySeven.setTimeOut0Thursday(14.00);
	     weekOfDaySeven.setTimeIn0Thursday(6.00);
	     weekOfDaySeven.setTimeOut0Friday(12.5);
	     weekOfDaySeven.setTimeIn0Friday(6.00);
	     
	     weeksOfDayEight.setTimeOut0Saturday(18.25);
	     weeksOfDayEight.setTimeIn0Saturday(13.00);
	     weeksOfDayEight.setTimeOut0Sunday(20.25);
	     weeksOfDayEight.setTimeIn0Sunday(13.00);
	     weeksOfDayEight.setTimeIn1Sunday(7.00);
	     weeksOfDayEight.setTimeOut1Sunday(9.00);
	     
	     weeksOfDayNine.setTimeIn0Saturday(13.00);
	     weeksOfDayNine.setTimeOut0Saturday(18.25);
	     weeksOfDayNine.setTimeOut0Sunday(20.25);
	     weeksOfDayNine.setTimeIn0Sunday(13.00);
	     weeksOfDayNine.setTimeOut0Monday(14.00);
	     weeksOfDayNine.setTimeIn0Monday(6.00);
	     weeksOfDayNine.setTimeOut0Wednesday(21.25);
	     weeksOfDayNine.setTimeIn0Wednesday(14.00);
	     
	     weeksOfDayEleven.setTimeOut0Saturday(18.25);
	     weeksOfDayEleven.setTimeIn0Saturday(13.00);
	     weeksOfDayEleven.setTimeOut0Sunday(21.50);
	     weeksOfDayEleven.setTimeIn0Saturday(13.00);
	     weeksOfDayEleven.setTimeOut0Monday(21.25);
	     weeksOfDayEleven.setTimeIn0Monday(16.00);
	     
	     weeksOfDayNine.setSaturdayTotal(weeksOfDayNine.dailyTotal(weeksOfDayNine.getTimeOut0Saturday(),weeksOfDayNine.getTimeIn0Saturday()));
	     weeksOfDayNine.setSundayTotal(weeksOfDayNine.dailyTotal(weeksOfDayNine.getTimeOut0Sunday(),weeksOfDayNine.getTimeIn0Sunday()));
	     weeksOfDayNine.setMondayTotal(weeksOfDayNine.dailyTotal(weeksOfDayNine.getTimeOut0Monday(),weeksOfDayNine.getTimeIn0Monday()));
	     weeksOfDayNine.setWednesdayTotal(weeksOfDayNine.dailyTotal(weeksOfDayNine.getTimeOut0Wednesday(),weeksOfDayNine.getTimeIn0Wednesday()));
	     
	     weeksOfDayOne.setSaturdayTotal(weeksOfDayOne.dailyTotal(weeksOfDayOne.getTimeOut0Saturday(),weeksOfDayOne.getTimeIn0Saturday()));
	     weeksOfDayOne.setSundayTotal(weeksOfDayOne.dailyTotal(weeksOfDayOne.getTimeOut0Sunday(),weeksOfDayOne.getTimeIn0Sunday(),weeksOfDayOne.getTimeOut1Sunday(),weeksOfDayOne.getTimeOut1Sunday()));
	     weeksOfDayOne.setMondayTotal(weeksOfDayOne.dailyTotal(weeksOfDayOne.getTimeOut0Monday(), weeksOfDayOne.getTimeIn0Monday()));
	     weeksOfDayOne.setThursdayTotal(weeksOfDayOne.dailyTotal(weeksOfDayOne.getTimeOut0Thursday(), weeksOfDayOne.getTimeIn0Thursday()));
	     
	     weeksOfDayTwo.setSaturdayTotal(weeksOfDayTwo.dailyTotal(weeksOfDayTwo.getTimeOut0Saturday(),weeksOfDayTwo.getTimeIn0Saturday()));
	     weeksOfDayTwo.setSundayTotal(weeksOfDayTwo.dailyTotal(weeksOfDayTwo.getTimeOut0Sunday(),weeksOfDayTwo.getTimeIn0Sunday(),weeksOfDayTwo.getTimeOut1Sunday(),weeksOfDayTwo.getTimeIn1Sunday()));
	     weeksOfDayTwo.setMondayTotal(weeksOfDayTwo.dailyTotal(weeksOfDayTwo.getTimeOut0Monday(),weeksOfDayTwo.getTimeIn0Monday()));
	     weeksOfDayTwo.setThursdayTotal(weeksOfDayTwo.dailyTotal(weeksOfDayTwo.getTimeOut0Thursday(),weeksOfDayTwo.getTimeIn1Thursday()));
	     weeksOfDayTwo.setFridayTotal(weeksOfDayTwo.dailyTotal(weeksOfDayTwo.getTimeOut0Friday(),weeksOfDayTwo.getTimeIn0Friday()));
	     
	     weeksOfDayThree.setSaturdayTotal(weeksOfDayThree.dailyTotal(weeksOfDayThree.getTimeOut0Saturday(),weeksOfDayThree.getTimeIn0Saturday(),weeksOfDayThree.getTimeOut1Saturday(),weeksOfDayThree.getTimeIn1Saturday()));
	     weeksOfDayThree.setSundayTotal(weeksOfDayThree.dailyTotal(weeksOfDayThree.getTimeOut0Sunday(),weeksOfDayThree.getTimeIn0Sunday(),weeksOfDayThree.getTimeOut1Sunday(),weeksOfDayThree.getTimeIn1Sunday()));
	     weeksOfDayThree.setMondayTotal(weeksOfDayThree.dailyTotal(weeksOfDayThree.getTimeOut0Monday(), weeksOfDayThree.getTimeIn0Sunday()));
	     weeksOfDayThree.setThursdayTotal(weeksOfDayThree.dailyTotal(weeksOfDayThree.getTimeOut0Thursday(),weeksOfDayThree.getTimeIn0Thursday()));
	     weeksOfDayThree.setFridayTotal(weeksOfDayThree.dailyTotal(weeksOfDayThree.getTimeOut0Friday(),weeksOfDayThree.getTimeIn0Friday()));
	     
	     weeksOfDayFour.setSaturdayTotal(weeksOfDayFour.dailyTotal(weeksOfDayFour.getTimeOut0Saturday(),weeksOfDayFour.getTimeIn0Saturday()));
	     weeksOfDayFour.setSundayTotal(weeksOfDayFour.dailyTotal(weeksOfDayFour.getTimeOut0Sunday(),weeksOfDayFour.getTimeIn0Sunday()));
	     weeksOfDayFour.setMondayTotal(weeksOfDayFour.dailyTotal(weeksOfDayFour.getTimeOut0Monday(),weeksOfDayFour.getTimeIn0Monday()));
	     weeksOfDayFour.setThursdayTotal(weeksOfDayFour.dailyTotal(weeksOfDayFour.getTimeOut0Thursday(), weeksOfDayFour.getTimeIn0Thursday()));
	     weeksOfDayFour.setFridayTotal(weeksOfDayFour.dailyTotal(weeksOfDayFour.getTimeOut0Friday(),weeksOfDayFour.getTimeIn0Friday()));
	     
	     weeksOfDayFive.setSaturdayTotal(weeksOfDayFive.dailyTotal(weeksOfDayFive.getTimeOut0Saturday(), weeksOfDayFive.getTimeIn0Saturday()));
	     weeksOfDayFive.setMondayTotal(weeksOfDayFive.dailyTotal(weeksOfDayFive.getTimeOut0Monday(),weeksOfDayFive.getTimeIn0Monday()));
	     weeksOfDayFive.setWednesdayTotal(weeksOfDayFive.dailyTotal(weeksOfDayFive.getTimeOut0Wednesday(),weeksOfDayFive.getTimeIn0Wednesday()));
	     weeksOfDayFive.setThursdayTotal(weeksOfDayFive.dailyTotal(weeksOfDayFive.getTimeOut0Thursday(),weeksOfDayFive.getTimeIn0Thursday()));
	     weeksOfDayFive.setFridayTotal(weeksOfDayFive.dailyTotal(weeksOfDayFive.getTimeOut0Friday(),weeksOfDayFive.getTimeIn0Friday()));

	     weeksOfDaySix.setSaturdayTotal(weeksOfDaySix.dailyTotal(weeksOfDaySix.getTimeOut0Saturday(),weeksOfDaySix.getTimeIn0Saturday()));
	     weeksOfDaySix.setSundayTotal(weeksOfDaySix.dailyTotal(weeksOfDaySix.getTimeOut0Sunday(),weeksOfDaySix.getTimeIn0Sunday()));
	     weeksOfDaySix.setMondayTotal(weeksOfDaySix.dailyTotal(weeksOfDaySix.getTimeOut0Monday(),weeksOfDaySix.getTimeIn0Monday()));
	     weeksOfDaySix.setWednesdayTotal(weeksOfDaySix.dailyTotal(weeksOfDaySix.getTimeOut0Wednesday(),weeksOfDaySix.getTimeIn0Wednesday()));
	     weeksOfDaySix.setThursdayTotal(weeksOfDaySix.dailyTotal(weeksOfDaySix.getTimeOut0Thursday(),weeksOfDaySix.getTimeIn0Thursday()));
	     weeksOfDaySix.setFridayTotal(weeksOfDaySix.dailyTotal(weeksOfDaySix.getTimeOut0Friday(),weeksOfDaySix.getTimeIn0Friday()));
	     
	     weekOfDaySeven.setSundayTotal(weekOfDaySeven.dailyTotal(weekOfDaySeven.getTimeOut0Sunday(), weekOfDaySeven.getTimeIn0Sunday()));
	     weekOfDaySeven.setMondayTotal(weekOfDaySeven.dailyTotal(weekOfDaySeven.getTimeOut0Monday(),weekOfDaySeven.getTimeIn0Monday()));
	     weekOfDaySeven.setWednesdayTotal(weekOfDaySeven.dailyTotal(weekOfDaySeven.getTimeOut0Wednesday(), weekOfDaySeven.getTimeIn0Wednesday()));
	     weekOfDaySeven.setThursdayTotal(weekOfDaySeven.dailyTotal(weekOfDaySeven.getTimeOut0Thursday(), weekOfDaySeven.getTimeIn0Thursday()));
	     weekOfDaySeven.setFridayTotal(weekOfDaySeven.dailyTotal(weekOfDaySeven.getTimeOut0Friday(), weekOfDaySeven.getTimeIn0Friday()));

	     weeksOfDayEight.setSaturdayTotal(weeksOfDayEight.dailyTotal(weeksOfDayEight.getTimeOut0Saturday(), weeksOfDayEight.getTimeIn0Saturday()));
	     weeksOfDayEight.setSundayTotal(weeksOfDayEight.dailyTotal(weeksOfDayEight.getTimeOut1Sunday(), weeksOfDayEight.getTimeIn1Sunday(),weeksOfDayEight.getTimeOut0Sunday(), weeksOfDayEight.getTimeIn0Sunday()));
	     
	     weeksOfDayTen.setSaturdayTotal(weeksOfDayTen.dailyTotal(weeksOfDayTen.getTimeOut0Saturday(), weeksOfDayTen.getTimeIn0Saturday()));
	     weeksOfDayTen.setSundayTotal(weeksOfDayTen.dailyTotal(weeksOfDayTen.getTimeOut0Sunday(), weeksOfDayTen.getTimeIn0Sunday()));
	     weeksOfDayTen.setMondayTotal(weeksOfDayTen.dailyTotal(weeksOfDayTen.getTimeOut0Monday(), weeksOfDayTen.getTimeIn0Monday()));
	     weeksOfDayTen.setThursdayTotal(weeksOfDayTen.dailyTotal(weeksOfDayTen.getTimeOut0Thursday(), weeksOfDayTen.getTimeIn0Thursday()));
	     weeksOfDayTen.setFridayTotal(weeksOfDayTen.dailyTotal(weeksOfDayTen.getTimeOut0Friday(),weeksOfDayTen.getTimeIn0Friday()));
	     
	     weeksOfDayEleven.setSaturdayTotal(weeksOfDayEleven.dailyTotal(weeksOfDayEleven.getTimeOut0Saturday(),weeksOfDayEleven.getTimeIn0Saturday()));
	     weeksOfDayEleven.setSundayTotal(weeksOfDayEleven.dailyTotal(weeksOfDayEleven.getTimeOut0Sunday(), weeksOfDayEleven.getTimeIn0Sunday()));
	     weeksOfDayEleven.setMondayTotal(weeksOfDayEleven.dailyTotal(weeksOfDayEleven.getTimeOut0Monday(), weeksOfDayEleven.getTimeIn0Monday()));
	  
	     
	     
	     WeeklyCalculation WeekZero = new WeeklyCalculation();
	     WeeklyCalculation weekOne = new WeeklyCalculation(weeksOfDayOne.getSaturdayTotal(),weeksOfDayOne.getSundayTotal(),weeksOfDayOne.getMondayTotal(),weeksOfDayOne.getThursdayTotal() );
	     WeeklyCalculation weekTwo = new WeeklyCalculation(weeksOfDayTwo.getSaturdayTotal(),weeksOfDayTwo.getSundayTotal(),weeksOfDayTwo.getMondayTotal(),weeksOfDayTwo.getThursdayTotal(),weeksOfDayTwo.getFridayTotal());
	     WeeklyCalculation weekThree = new WeeklyCalculation(weeksOfDayThree.getSaturdayTotal(),weeksOfDayThree.getSundayTotal(),weeksOfDayThree.getMondayTotal(),weeksOfDayThree.getThursdayTotal(),weeksOfDayThree.getFridayTotal());
	     WeeklyCalculation weekFour = new WeeklyCalculation(weeksOfDayFour.getSaturdayTotal(),weeksOfDayFour.getSundayTotal(),weeksOfDayFour.getMondayTotal(),weeksOfDayFour.getThursdayTotal(),weeksOfDayFour.getFridayTotal());
	     WeeklyCalculation weekFive = new WeeklyCalculation(weeksOfDayFive.getSaturdayTotal(),weeksOfDayFive.getSundayTotal(),weeksOfDayFive.getMondayTotal(),weeksOfDayFive.getThursdayTotal(),weeksOfDayFive.getFridayTotal());
	     WeeklyCalculation weekSix = new WeeklyCalculation(weeksOfDaySix.getSaturdayTotal(),weeksOfDaySix.getSundayTotal(),weeksOfDaySix.getMondayTotal(),weeksOfDaySix.getThursdayTotal(),weeksOfDaySix.getFridayTotal());
	     WeeklyCalculation weekSeven = new WeeklyCalculation(weekOfDaySeven.getSaturdayTotal(),weekOfDaySeven.getSundayTotal(),weekOfDaySeven.getMondayTotal(),weekOfDaySeven.getThursdayTotal(),weekOfDaySeven.getFridayTotal());
	     WeeklyCalculation weekEight = new WeeklyCalculation(weeksOfDayEight.getSaturdayTotal(),weeksOfDayEight.getSundayTotal());
	     WeeklyCalculation weekNine = new WeeklyCalculation(weeksOfDayNine.getSaturdayTotal(),weeksOfDayNine.getSundayTotal(),weeksOfDayNine.getMondayTotal(),weeksOfDayNine.getWednesdayTotal());
	     WeeklyCalculation weekTen = new WeeklyCalculation(weeksOfDayTen.getSaturdayTotal(), weeksOfDayTen.getSundayTotal(), weeksOfDayTen.getMondayTotal(),weeksOfDayTen.getThursdayTotal(),weeksOfDayTen.getFridayTotal());
	     WeeklyCalculation weekEleven = new WeeklyCalculation(weeksOfDayEleven.getSaturdayTotal(), weeksOfDayEleven.getSundayTotal(), weeksOfDayEleven.getMondayTotal());
	     WeeklyCalculation weekTwelve = new WeeklyCalculation();
    //this is used to create indivial weekly totals

	     weekOne.setWeekTotal(weekOne.weeklyTotal(weekOne.getSatudayTotal(),weekOne.getSundayTotal(),weekOne.getMondayTotal(),weekOne.getThursdayTotal()));
	     weekTwo.setWeekTotal(weekTwo.weeklyTotal(weekTwo.getSatudayTotal(),weekTwo.getSundayTotal(),weekTwo.getMondayTotal(),weekTwo.getThursdayTotal(),weekTwo.getFridayTotal()));
	     weekThree.setWeekTotal(weekThree.weeklyTotal(weekThree.getSatudayTotal(),weekThree.getSundayTotal(), weekThree.getMondayTotal(), weekThree.getTuesdayTotal(),weekThree.getWednesdayTotal(),weekThree.getThursdayTotal(), weekThree.getFridayTotal())); 
	     
	     weekFour.setWeekTotal(weekFour.weeklyTotal(weekFour.getSaturdayTotal(),weekFour.getSundayTotal(),weekFour.getMondayTotal(), weekOne.getTuesdayTotal(), weekFour.getWednesdayTotal(), weekFour.getThursdayTotal(),weekFour.getFridayTotal()));
	     
	     weekFive.setWeekTotal(weekFive.weeklyTotal(weekFive.getSaturdayTotal(),weekFive.getMondayTotal(),weekFive.getWednesdayTotal(),weekFive.getThursdayTotal(),weekFive.getFridayTotal()));
	     weekSix.setWeekTotal(weekSix.weeklyTotal(weekSix.getSaturdayTotal(),weekSix.getSundayTotal(),weekSix.getMondayTotal(),weekSix.getWednesdayTotal(),weekSix.getThursdayTotal(),weekSix.getFridayTotal()));
	     weekSeven.setWeekTotal(weekSeven.weeklyTotal(weekSeven.getSundayTotal(),weekSeven.getMondayTotal(),weekSeven.getWednesdayTotal(),weekSeven.getThursdayTotal(),weekSeven.getFridayTotal()));
	     weekEight.setWeekTotal(weekEight.weeklyTotal(weekEight.getSaturdayTotal(),weekEight.getSundayTotal()));
	     weekNine.setWeekTotal(weekNine.weeklyTotal(weekNine.getSatudayTotal(),weekNine.getSundayTotal(),weekNine.getMondayTotal(),weekNine.getTuesdayTotal()));
	     weekTen.setWeekTotal(weekTen.weeklyTotal(weekTen.getSatudayTotal(),weekTen.getSundayTotal(),weekTen.getMondayTotal(),weekTen.getThursdayTotal(),weekTen.getFridayTotal()));
	     weekEleven.setWeekTotal(weekEleven.weeklyTotal(weekEleven.getSatudayTotal(),weekEleven.getSundayTotal(),weekEleven.getMondayTotal()));
      //This is used to indcate the total amount of hours that have been us
      //

	     weekOne.setSummedHoursForWeeksTotal(weekOne.summedTotalHours(WeekZero.getWeekZero() , weekOne.getWeekTotal()));
	     weekTwo.setSummedHoursForWeeksTotal(weekTwo.summedTotalHours(WeekZero.getWeekZero(), weekOne.getWeekTotal(), weekTwo.getWeekTotal()));
	     weekThree.setSummedHoursForWeeksTotal(weekThree.summedTotalHours(WeekZero.getWeekZero(), weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
	
	     weekFour.setSummedHoursForWeeksTotal(weekFour.summedTotalHours(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal()));
	
	     weekFive.setSummedHoursForWeeksTotal(weekFive.summedTotalHours(WeekZero.getWeekZero(), weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal()));
	     weekSix.setSummedHoursForWeeksTotal(weekSix.summedTotalHours(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal()));
	     
	     weekSeven.setSummedHoursForWeeksTotal(weekSeven.summedTotalHours(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal(),weekSeven.getWeekTotal()));
	     weekEight.setSummedHoursForWeeksTotal(weekEight.summedTotalHours(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal(),weekSeven.getWeekTotal(),weekEight.getWeekTotal()));
	     weekNine.setSummedHoursForWeeksTotal(weekNine.summedTotalHours(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal(),weekSeven.getWeekTotal(),weekEight.getWeekTotal(),weekNine.getWeekTotal()));
	     weekTen.setSummedHoursForWeeksTotal(weekTen.summedTotalHours(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal(),weekSeven.getWeekTotal(),weekEight.getWeekTotal(),weekNine.getWeekTotal(),weekTen.getWeekTotal()));
	     weekEleven.setSummedHoursForWeeksTotal(weekEleven.summedTotalHours(weekTen.getSummedHoursForWeeksTotal(),weekEleven.getWeekTotal()));
	     // This is used to indicate how many hours I have
  
	     WeekZero.setTotalMinusWeeklyTotals(WeekZero.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero()));
     
	     weekOne.setTotalMinusWeeklyTotals(weekOne.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal()));
     
	     weekTwo.setTotalMinusWeeklyTotals(weekTwo.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal()));
     
	     weekThree.setTotalMinusWeeklyTotals(weekThree.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(), weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
	     
	     weekFour.setTotalMinusWeeklyTotals(weekFour.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal()));
    
	     weekFive.setTotalMinusWeeklyTotals(weekFive.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal()));
     
	     weekSix.setTotalMinusWeeklyTotals(weekSix.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal()));
	     
	     weekSeven.setTotalMinusWeeklyTotals(weekSeven.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal(),weekSeven.getWeekTotal()));
	     weekEight.setTotalMinusWeeklyTotals(weekEight.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal(),weekSeven.getWeekTotal(),weekEight.getWeekTotal()));
	     weekNine.setTotalMinusWeeklyTotals(weekNine.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero(),weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal(),weekSeven.getWeekTotal(),weekEight.getWeekTotal(),weekNine.getWeekTotal()));
	     weekTen.setTotalMinusWeeklyTotals(weekTen.summedTotalsHoursMinusTotalHoursLefted(weekTen.getSummedHoursForWeeksTotal()));
	     weekEleven.setTotalMinusWeeklyTotals(weekEleven.summedTotalsHoursMinusTotalHoursLefted(weekEleven.getSummedHoursForWeeksTotal()));
	     
	     
	     

	     
	     
	     
	     /*System.out.println();
	     System.out.println();
	     */

     // new way of setting individal day and then createing a calling that time value
	     
	  
	     // old way of calling and create each individal day
      //

	     // this is used to indicate how much each paycheck is worth
     
	     weekOne.setPaycheck(weekOne.paycheck(WeekZero.getWeekZero(),weekOne.getWeekTotal()));
	     weekThree.setPaycheck(weekThree.paycheck(weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
	     weekFive.setPaycheck(weekFive.paycheck(weekFour.getWeekTotal(),weekFive.getWeekTotal()));
	     weekSeven.setPaycheck(weekSeven.payChecks(weekSix.getWeekTotal(), weekSeven.getWeekTotal()));
	     weekNine.setPaycheck(weekNine.paycheck(weekNine.getWeekTotal(), weekEight.getWeekTotal()));
	     weekEleven.setPaycheck(weekEleven.paycheck(weekTen.getWeekTotal(), weekEleven.getWeekTotal()));
	     //This is the printed statements
	     System.out.println(" # of weeks |     dates        | hours  | total hours | hours - 1560 | paychecks");  
	     System.out.printf("    1       | Jan 01 - Jan 07  | %.2f  |   %.2f     |    %.2f   |%n " , WeekZero.getWeekZero(), WeekZero.getWeekZero(), WeekZero.getTotalMinusWeeklyTotals());
	     System.out.printf("   2       | Jan 08 - Jan 14  | %.2f  |   %.2f     |    %.2f   | %.2f %n " , weekOne.getWeekTotal() , weekOne.getSummedHoursForWeeksTotal(),weekOne.getTotalMinusWeeklyTotals(), weekOne.getPaycheck());
	     System.out.printf("   3       | Jan 15 - Jan 21  | %.2f  |   %.2f     |    %.2f   |  %n",weekTwo.getWeekTotal(),weekTwo.getSummedHoursForWeeksTotal(),weekTwo.getTotalMinusWeeklyTotals());
	     System.out.printf("    4       | Jan 22 - Jan 28  | %.2f  |  %.2f     |    %.2f   | %.2f %n",weekThree.getWeekTotal(),weekThree.getSummedHoursForWeeksTotal(), weekThree.getTotalMinusWeeklyTotals(),weekThree.getPaycheck());
	     System.out.printf("    5       | Jan 29 - Feb 04  | %.2f  |  %.2f     |    %.2f   | %n", weekFour.getWeekTotal() ,weekFour.getSummedHoursForWeeksTotal() ,weekFour.getTotalMinusWeeklyTotals() );
	     System.out.printf("    6       | Feb 05 - Feb 11  | %.2f  |  %.2f     |    %.2f   | %.2f %n", weekFive.getWeekTotal(), weekFive.getSummedHoursForWeeksTotal(),weekFive.getTotalMinusWeeklyTotals(),weekFive.getPaycheck());
	     System.out.printf("    7       | Feb 12 - Feb 18  | %.2f  |  %.2f     |    %.2f   | %n", weekSix.getWeekTotal(), weekSix.getSummedHoursForWeeksTotal(),weekSix.getTotalMinusWeeklyTotals());
	     System.out.printf("    8       | Feb 19 - Feb 24  | %.2f  |  %.2f     |    %.2f   | %.2f %n", weekSeven.getWeekTotal(), weekSeven.getSummedHoursForWeeksTotal(),weekSeven.getTotalMinusWeeklyTotals(),weekSeven.getPaycheck());
	     System.out.printf("    9       | Feb 25 - Mar 4   | %.2f   |  %.2f     |    %.2f   | %n", weekEight.getWeekTotal(), weekEight.getSummedHoursForWeeksTotal(),weekEight.getTotalMinusWeeklyTotals());
	     System.out.printf("   10       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f   | %.2f %n" ,weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   11       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f   | %n ",weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("  12       | Mar 19 - Mar 25  | %.2f  |  %.2f     |    %.2f   | %.2f %n", weekEleven.getWeekTotal(), weekEleven.getSummedHoursForWeeksTotal(),weekEleven.getTotalMinusWeeklyTotals(),weekEleven.getPaycheck());
	     /*System.out.printf("   13       | Mar 25 - Apr 1   | %.2f  |  %.2f     |    %.2f  | %n "weekTwelve.getWeekTotal(), weekTwelve.getSummedHoursForWeeksTotal(),weekTwelve.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   14       | Apr 2  - Apr 8   | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekThriteen.getWeekTotal(), weekThriteen.getSummedHoursForWeeksTotal(),weekThriteen.getTotalMinusWeeklyTotals(),weekThriteen.getPaycheck());
	     System.out.printf("   15       | Apr 9  - Apr 15  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   16       | Apr 16 - Apr 22  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   17       | Apr 23 - Apr 30  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   18       | May 1  - May 7   | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   19       | May 8 - May 14   | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   20       | May 15  - May 21 | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   21       | May 22 - May 28  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   22       | May 29 - Jun 3   | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   23       | Jun 4  - Jun 10  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   24       | Jun 11  -Jun 17  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   25       | Jun 18 - Jun 24  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   26       | Jun 25 - Jul 1   | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   27       | Jul 2  - Jul 8   | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   28       | Jul 9  - Jul 15  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   29       | Jul 16 - Jul 22  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   30       | Jul 23 - Jul 29  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   31       | Jul 30 - Aug 5   | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   32       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   33       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   34       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   35       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   36       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   37       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   38       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   39       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   40       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   41       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  |  %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   42       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   43       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   44       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   45       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   46       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   47       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   48       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   49       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   50       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f  | %n "weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   51       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   52       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f  | %.2f %n" weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
     */
     }
     
}

