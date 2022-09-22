<<<<<<< HEAD
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Hashtable;
import java.util.Map;
=======
>>>>>>> parent of cb51485 (start adding portion to main)

import javax.annotation.processing.FilerException;

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
<<<<<<< HEAD
	     ScansClass sc = new ScansClass();
	     //PTF = PATH TO FILE
	     String file =System.getenv("PTF") ;
	     aList = sc.ScanFile(file);
	     hts= sc.interruptedData(aList);
	     if (hts.containsKey("Friday July 15 in")) {
	    	 double dataEntry1 = hts.get("Friday July 15 in"); 
	    	 System.out.println("Friday July 15th in:"+dataEntry1);
=======
	   /*  ScansClass sc = new ScansClass();
	     String file = "/home/TragicMoonLIghtFire/git/SpringHillRecPro/dateTimeObj.txt";
	     ArrayList<String> aList= new ArrayList<>();
	     try {
	     aList= sc.ScanFile(file);
	     }finally {
	    	 sc.close();
>>>>>>> parent of cb51485 (start adding portion to main)
	     }
	     */
	     weeksofDayThriteen.setTimeOut0Saturday(18.25);
	     weeksofDayThriteen.setTimeIn0Saturday(13.00);
	     weeksofDayThriteen.setTimeOut0Monday(21.25);
	     weeksofDayThriteen.setTimeIn0Monday(12.00);
	     weeksofDayThriteen.setTimeOut0Thursday(14.00);
	     weeksofDayThriteen.setTimeIn0Thursday(6.00);
	     weeksofDayThriteen.setTimeOut0Friday(12.00);
	     weeksofDayThriteen.setTimeIn0Friday(6.00);
	     weeksofDayThriteen.setTimeOut1Friday(21.00);
	     weeksofDayThriteen.setTimeIn1Friday(19.00);
	     
	     weeksofDayThriteen.setSaturdayTotal(weeksofDayThriteen.dailyTotal(weeksofDayThriteen.getTimeOut0Saturday(),weeksofDayThriteen.getTimeIn0Saturday()));
	     weeksofDayThriteen.setMondayTotal(weeksofDayThriteen.dailyTotal(weeksofDayThriteen.getTimeOut0Monday(),weeksofDayThriteen.getTimeIn0Monday()));
	     weeksofDayThriteen.setThursdayTotal(weeksofDayThriteen.dailyTotal(weeksofDayThriteen.getTimeOut0Thursday(),weeksofDayThriteen.getTimeIn0Thursday()));
	     weeksofDayThriteen.setFridayTotal(weeksofDayThriteen.dailyTotal(weeksofDayThriteen.getTimeOut0Friday(),weeksofDayThriteen.getTimeIn0Friday(),weeksofDayThriteen.getTimeOut1Friday(),weeksofDayThriteen.getTimeIn1Friday()));
	     
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
	     weeksOfDayTwelve.setFridayTotal(weeksOfDayTwelve.dailyTotal(weeksOfDayTwelve.getTimeOut0Friday(), weeksOfDayTwelve.getTimeIn0Friday(), weeksOfDayTwelve.getTimeOut1Friday(), weeksOfDayTwelve.getTimeIn1Friday()));
	     
	     
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
=======
//import java.util.Scanner()
import Hours.HoursCalculation;
public class Main{

     public static void main(String[] args){
>>>>>>> parent of 55ee6eb (add more date in the main)

      HoursCalculation weekZero = new HoursCalculation();
      HoursCalculation weekOne = new HoursCalculation();
      HoursCalculation weekTwo = new HoursCalculation();
      HoursCalculation weekThree = new HoursCalculation();
      HoursCalculation weekFour = new HoursCalculation();
      HoursCalculation weekFive = new HoursCalculation();
      HoursCalculation weekSix= new HoursCalculation();

      weekTwo.setTimeOut0Saturday(18.25);
      weekTwo.setTimeIn0Saturday(13.00);

      weekTwo.setTimeOut1Saturday(0.0);
      weekTwo.setTimeIn1Saturday(0.0);


      double weekTwoTotalSaturdayHours = (weekTwo.getTimeOut0Saturday() - weekTwo.getTimeIn0Saturday()) + (weekTwo.getTimeOut1Saturday() - weekTwo.getTimeIn1Saturday());

      weekTwo.setSaturdayTotal(weekTwoTotalSaturdayHours);

      weekTwo.setTimeOut0Sunday(9.80);
      weekTwo.setTimeIn0Sunday(7.00);
      weekTwo.setTimeOut1Sunday(17.30);
      weekTwo.setTimeIn1Sunday(13.50);
      double weekTwoSundayTotalHours = (weekTwo.getTimeOut0Sunday() - weekTwo.getTimeIn0Sunday()) + (weekTwo.getTimeOut1Sunday()- weekTwo.getTimeIn1Sunday());
      weekTwo.setSundayTotal(weekTwoSundayTotalHours);
      
      weekTwo.setTimeOut0Monday(14.00);
      weekTwo.setTimeIn0Monday(7.50);
      weekTwo.setTimeIn1Monday(0.0);
      weekTwo.setTimeOut1Monday(0.0);
      double weekTwoMondayTotalHours= (weekTwo.getTimeOut0Monday() - weekTwo.getTimeIn0Monday() ) + ( weekTwo.getTimeOut1Monday() - weekTwo.getTimeIn1Monday());
      weekTwo.setMondayTotal(weekTwoMondayTotalHours);

      weekTwo.setTimeOut0Thursday(15.50);
      weekTwo.setTimeIn0Thursday(6.00);
      weekTwo.setTimeOut1Thursday(0.0);
      weekTwo.setTimeIn1Thursday(0.0);
      double weekTwoThursdayTotalHours = ( weekTwo.getTimeOut0Thursday() - weekTwo.getTimeIn0Thursday() )+ (weekTwo.getTimeOut1Thursday() - weekTwo.getTimeIn1Thursday());
      weekTwo.setThursdayTotal(weekTwoThursdayTotalHours);

      weekTwo.setTimeOut0Friday(12.50);
      weekTwo.setTimeIn0Friday(6.00);
      weekTwo.setTimeOut1Friday(0.0);
      weekTwo.setTimeIn1Friday(0.0);

      double weekTwoFridayTotalHours =( weekTwo.getTimeOut0Friday() - weekTwo.getTimeIn0Friday()) +( weekTwo.getTimeOut1Friday() - weekTwo.getTimeIn1Friday());

<<<<<<< HEAD
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
	     WeeklyCalculation weekTwelve = new WeeklyCalculation(weeksOfDayTwelve.getMondayTotal(),weeksOfDayTwelve.getThursdayTotal(),weeksOfDayTwelve.getFridayTotal());
	     WeeklyCalculation weekThriteen = new WeeklyCalculation(weeksofDayThriteen.getSaturdayTotal(),weeksofDayThriteen.getMondayTotal(),weeksofDayThriteen.getThursdayTotal(),weeksofDayThriteen.getFridayTotal());
    //this is used to create indivial weekly totals

	     weekOne.setWeekTotal(weekOne.weeklyTotal(weekOne.getSaturdayTotal(),weekOne.getSundayTotal(),weekOne.getMondayTotal(),weekOne.getThursdayTotal()));
	     weekTwo.setWeekTotal(weekTwo.weeklyTotal(weekTwo.getSaturdayTotal(),weekTwo.getSundayTotal(),weekTwo.getMondayTotal(),weekTwo.getThursdayTotal(),weekTwo.getFridayTotal()));
	     weekThree.setWeekTotal(weekThree.weeklyTotal(weekThree.getSaturdayTotal(),weekThree.getSundayTotal(), weekThree.getMondayTotal(), weekThree.getTuesdayTotal(),weekThree.getWednesdayTotal(),weekThree.getThursdayTotal(), weekThree.getFridayTotal())); 
	     
	     weekFour.setWeekTotal(weekFour.weeklyTotal(weekFour.getSaturdayTotal(),weekFour.getSundayTotal(),weekFour.getMondayTotal(), weekOne.getTuesdayTotal(), weekFour.getWednesdayTotal(), weekFour.getThursdayTotal(),weekFour.getFridayTotal()));
	     
	     weekFive.setWeekTotal(weekFive.weeklyTotal(weekFive.getSaturdayTotal(),weekFive.getMondayTotal(),weekFive.getWednesdayTotal(),weekFive.getThursdayTotal(),weekFive.getFridayTotal()));
	     weekSix.setWeekTotal(weekSix.weeklyTotal(weekSix.getSaturdayTotal(),weekSix.getSundayTotal(),weekSix.getMondayTotal(),weekSix.getWednesdayTotal(),weekSix.getThursdayTotal(),weekSix.getFridayTotal()));
	     weekSeven.setWeekTotal(weekSeven.weeklyTotal(weekSeven.getSundayTotal(),weekSeven.getMondayTotal(),weekSeven.getWednesdayTotal(),weekSeven.getThursdayTotal(),weekSeven.getFridayTotal()));
	     weekEight.setWeekTotal(weekEight.weeklyTotal(weekEight.getSaturdayTotal(),weekEight.getSundayTotal()));
	     weekNine.setWeekTotal(weekNine.weeklyTotal(weekNine.getSaturdayTotal(),weekNine.getSundayTotal(),weekNine.getMondayTotal(),weekNine.getTuesdayTotal()));
	     weekTen.setWeekTotal(weekTen.weeklyTotal(weekTen.getSaturdayTotal(),weekTen.getSundayTotal(),weekTen.getMondayTotal(),weekTen.getThursdayTotal(),weekTen.getFridayTotal()));
	     weekEleven.setWeekTotal(weekEleven.weeklyTotal(weekEleven.getSaturdayTotal(),weekEleven.getSundayTotal(),weekEleven.getMondayTotal()));
	     weekTwelve.setWeekTotal(weekTwelve.weeklyTotal(weekTwelve.getSaturdayTotal(),weekTwelve.getSundayTotal(),weekTwelve.getFridayTotal()));
	     weekThriteen.setWeekTotal(weekThriteen.weeklyTotal(weekThriteen.getSaturdayTotal(),weekThriteen.getSundayTotal(),weekThriteen.getMondayTotal(),weekThriteen.getTuesdayTotal()));
	     //This is used to indcate the total amount of hours that have been us
      //

	     weekOne.setSummedHoursForWeeksTotal(weekOne.summedTotalHours(WeekZero.getWeekZero() , weekOne.getWeekTotal()));
	     weekTwo.setSummedHoursForWeeksTotal(weekTwo.summedTotalHours( weekOne.getSummedHoursForWeeksTotal(), weekTwo.getWeekTotal()));
	     weekThree.setSummedHoursForWeeksTotal(weekThree.summedTotalHours(weekTwo.getSummedHoursForWeeksTotal(),weekThree.getWeekTotal()));
	     weekFour.setSummedHoursForWeeksTotal(weekFour.summedTotalHours(weekThree.getSummedHoursForWeeksTotal(),weekFour.getWeekTotal()));
	     weekFive.setSummedHoursForWeeksTotal(weekFive.summedTotalHours(weekFour.getSummedHoursForWeeksTotal(),weekFive.getWeekTotal()));
	     weekSix.setSummedHoursForWeeksTotal(weekSix.summedTotalHours(weekFive.getSummedHoursForWeeksTotal(),weekSix.getWeekTotal()));
	     weekSeven.setSummedHoursForWeeksTotal(weekSeven.summedTotalHours(weekSix.getSummedHoursForWeeksTotal(),weekSeven.getWeekTotal()));
	     weekEight.setSummedHoursForWeeksTotal(weekEight.summedTotalHours(weekSeven.getSummedHoursForWeeksTotal(),weekEight.getWeekTotal()));
	     weekNine.setSummedHoursForWeeksTotal(weekNine.summedTotalHours(weekEight.getSummedHoursForWeeksTotal(),weekNine.getWeekTotal()));
	     weekTen.setSummedHoursForWeeksTotal(weekTen.summedTotalHours(weekNine.getSummedHoursForWeeksTotal(),weekTen.getWeekTotal()));
	     weekEleven.setSummedHoursForWeeksTotal(weekEleven.summedTotalHours(weekTen.getSummedHoursForWeeksTotal(),weekEleven.getWeekTotal()));
	     weekTwelve.setSummedHoursForWeeksTotal(weekTwelve.summedTotalHours(weekEleven.getSummedHoursForWeeksTotal(),weekTwelve.getWeekTotal()));
	     weekThriteen.setSummedHoursForWeeksTotal(weekThriteen.summedTotalHours(weekTwelve.getSummedHoursForWeeksTotal(),weekThriteen.getWeekTotal()));
	     // This is used to indicate how many hours I have
  
	     WeekZero.setTotalMinusWeeklyTotals(WeekZero.summedTotalsHoursMinusTotalHoursLefted(WeekZero.getWeekZero()));
	     weekOne.setTotalMinusWeeklyTotals(weekOne.summedTotalsHoursMinusTotalHoursLefted(weekOne.getSummedHoursForWeeksTotal()));
	     weekTwo.setTotalMinusWeeklyTotals(weekTwo.summedTotalsHoursMinusTotalHoursLefted(weekTwo.getSummedHoursForWeeksTotal())); 
	     weekThree.setTotalMinusWeeklyTotals(weekThree.summedTotalsHoursMinusTotalHoursLefted(weekThree.getSummedHoursForWeeksTotal()));
	     weekFour.setTotalMinusWeeklyTotals(weekFour.summedTotalsHoursMinusTotalHoursLefted(weekFour.getSummedHoursForWeeksTotal()));
	     weekFive.setTotalMinusWeeklyTotals(weekFive.summedTotalsHoursMinusTotalHoursLefted(weekFive.getSummedHoursForWeeksTotal()));
	     weekSix.setTotalMinusWeeklyTotals(weekSix.summedTotalsHoursMinusTotalHoursLefted(weekSix.getSummedHoursForWeeksTotal()));
	     weekSeven.setTotalMinusWeeklyTotals(weekSeven.summedTotalsHoursMinusTotalHoursLefted(weekSeven.getSummedHoursForWeeksTotal()));
	     weekEight.setTotalMinusWeeklyTotals(weekEight.summedTotalsHoursMinusTotalHoursLefted(weekEight.getSummedHoursForWeeksTotal()));
	     weekNine.setTotalMinusWeeklyTotals(weekNine.summedTotalsHoursMinusTotalHoursLefted(weekNine.getSummedHoursForWeeksTotal()));
	     weekTen.setTotalMinusWeeklyTotals(weekTen.summedTotalsHoursMinusTotalHoursLefted(weekTen.getSummedHoursForWeeksTotal()));
	     weekEleven.setTotalMinusWeeklyTotals(weekEleven.summedTotalsHoursMinusTotalHoursLefted(weekEleven.getSummedHoursForWeeksTotal()));
	     weekTwelve.setTotalMinusWeeklyTotals(weekTwelve.summedTotalsHoursMinusTotalHoursLefted(weekTwelve.getSummedHoursForWeeksTotal()));
	     weekThriteen.setTotalMinusWeeklyTotals(weekThriteen.summedTotalsHoursMinusTotalHoursLefted(weekThriteen.getSummedHoursForWeeksTotal()));
	     
=======
      weekTwo.setFridayTotal(weekTwoFridayTotalHours);

   

      weekThree.setTimeOut0Saturday(13.00);
      weekThree.setTimeIn0Saturday(8.50);

      weekThree.setTimeOut1Saturday(13.10);
      weekThree.setTimeIn1Saturday(13.00);

      double weekThreeTotalSaturdayHours = (weekThree.getTimeOut0Saturday() - weekThree.getTimeIn0Saturday()) + (weekThree.getTimeOut1Saturday() - weekThree.getTimeIn1Saturday());

      weekThree.setSaturdayTotal(weekThreeTotalSaturdayHours);

      weekThree.setTimeOut0Sunday(9.30);
      weekThree.setTimeIn0Sunday(7.00);
      weekThree.setTimeOut1Sunday(20.30);
      weekThree.setTimeIn1Sunday(13.50);
      double weekThreeSundayTotalHours = (weekThree.getTimeOut0Sunday() - weekTwo.getTimeIn0Sunday()) + (weekThree.getTimeOut1Sunday()- weekThree.getTimeIn1Sunday());
      weekThree.setSundayTotal(weekThreeSundayTotalHours);
      
      weekThree.setTimeOut0Monday(14.00);
      weekThree.setTimeIn0Monday(6.00);
      weekThree.setTimeIn1Monday(0.0);
      weekThree.setTimeOut1Monday(0.0);
      double weekThreeMondayTotalHours= (weekThree.getTimeOut0Monday() - weekThree.getTimeIn0Monday() ) + ( weekThree.getTimeOut1Monday() - weekThree.getTimeIn1Monday());
      weekThree.setMondayTotal(weekThreeMondayTotalHours);

      weekThree.setTimeOut0Thursday(15.00);
      weekThree.setTimeIn0Thursday(6.00);
      weekThree.setTimeOut1Thursday(0.0);
      weekThree.setTimeIn1Thursday(0.0);
      double weekThreeThursdayTotalHours = ( weekThree.getTimeOut0Thursday() - weekThree.getTimeIn0Thursday() )+ (weekThree.getTimeOut1Thursday() - weekThree.getTimeIn1Thursday());
      weekThree.setThursdayTotal(weekThreeThursdayTotalHours);

      weekThree.setTimeOut0Friday(12.50);
      weekThree.setTimeIn0Friday(6.00);
      weekThree.setTimeOut1Friday(0.0);
      weekThree.setTimeIn1Friday(0.0);

      double weekThreeFridayTotalHours =( weekThree.getTimeOut0Friday() - weekThree.getTimeIn0Friday()) +( weekThree.getTimeOut1Friday() - weekThree.getTimeIn1Friday());
      weekThree.setFridayTotal(weekThreeFridayTotalHours);


      weekOne.setTimeOut0Saturday(22.30);
      weekOne.setTimeIn0Saturday(15.00);
      weekOne.setTimeOut1Saturday(0.0);
      weekOne.setTimeIn1Saturday(0.0);
      double weekSaturdayTotal = ( weekOne.getTimeOut0Saturday() - weekOne.getTimeIn0Saturday() ) + ( weekOne.getTimeOut1Saturday() - weekOne.getTimeIn1Saturday() );
      weekOne.setSaturdayTotal(weekSaturdayTotal);
      weekOne.setTimeOut0Sunday(9.50);
      weekOne.setTimeIn0Sunday(7.00);
      weekOne.setTimeOut1Sunday(20.25);
      weekOne.setTimeIn1Sunday(13.50);
      double weekSundayTotal = (weekOne.getTimeOut0Sunday() - weekOne.getTimeIn0Sunday()) + (weekOne.getTimeOut1Sunday()- weekOne.getTimeIn1Sunday());
      weekOne.setSundayTotal(weekSundayTotal);
    
      weekOne.setTimeOut0Monday(14.00);
      weekOne.setTimeIn0Monday(6.00);
      weekOne.setTimeIn1Monday(0.0);
      weekOne.setTimeOut1Monday(0.0);
      double weekMondayTotal= (weekOne.getTimeOut0Monday() - weekOne.getTimeIn0Monday() ) + ( weekOne.getTimeOut1Monday() - weekOne.getTimeIn1Monday());
      weekOne.setMondayTotal(weekMondayTotal);
      
      weekOne.setTimeIn0Tuesday(0.0);
      weekOne.setTimeOut0Tuesday(0.0);
      weekOne.setTimeIn1Tuesday(0.0);
      weekOne.setTimeOut1Tuesday(0.0);
      double weeksTuesdayTotal= (weekOne.getTimeOut0Tuesday() - weekOne.getTimeIn0Tuesday()) + (weekOne.getTimeOut1Tuesday()- weekOne.getTimeIn1Tuesday());

      weekOne.setTuesdayTotal(weeksTuesdayTotal);
      
      weekOne.setTimeIn0Wednesday(0.0);
      weekOne.setTimeIn1Wednesday(0.0);
      weekOne.setTimeOut1Wednesday(0.0);
      weekOne.setTimeOut0Wednesday(0.0);

      double weeksWednesdayTotal= ( weekOne.getTimeOut0Wednesday() - weekOne.getTimeIn0Wednesday() ) + ( weekOne.getTimeOut1Wednesday() - weekOne.getTimeIn1Wednesday() );  

      weekOne.setWednesdayTotal(weeksWednesdayTotal);
      
      weekOne.setTimeOut0Thursday(16.00);
      weekOne.setTimeIn0Thursday(6.0);
      weekOne.setTimeOut1Thursday(0.0);
      weekOne.setTimeIn1Thursday(0.0);
      double weekThursdayTotal = ( weekOne.getTimeOut0Thursday() - weekOne.getTimeIn0Thursday() )+ (weekOne.getTimeOut1Thursday() - weekOne.getTimeIn1Thursday());
      weekOne.setThursdayTotal(weekThursdayTotal);
     
      weekOne.setTimeOut0Friday(0.0);
      weekOne.setTimeIn0Friday(0.0);
      weekOne.setTimeOut1Friday(0.0);
      weekOne.setTimeIn1Friday(0.0);

      double weekFridayTotal =( weekOne.getTimeOut0Friday() - weekOne.getTimeIn0Friday()) +( weekOne.getTimeOut1Friday() - weekOne.getTimeIn1Friday());
      	weekOne.setFridayTotal(weekFridayTotal);

      weekFour.setTimeOut0Saturday(13.50);
      weekFour.setTimeIn0Saturday(8.50);
      weekFour.setTimeOut0Sunday(20.25);
      weekFour.setTimeIn0Sunday(13.50);
      weekFour.setTimeOut1Sunday(0.0);
      weekFour.setTimeIn1Sunday(0.0);
      weekFour.setTimeOut0Monday(14.00);
      weekFour.setTimeIn0Monday(6.00);
      weekFour.setTimeIn0Wednesday(13.50);
      weekFour.setTimeOut0Wednesday(21.25);
      weekFour.setTimeOut0Thursday(12.00);
      weekFour.setTimeIn0Thursday(6.00);
      weekFour.setTimeOut0Friday(12.50);
      weekFour.setTimeIn0Friday(6.00);

      weekFive.setTimeOut0Saturday(12.00);
      weekFive.setTimeIn0Saturday(6.25);
      weekFive.setTimeOut0Monday(14.00);
      weekFive.setTimeIn0Monday(6.00);
      weekFive.setTimeOut0Wednesday(21.25);
      weekFive.setTimeIn0Wednesday(14.00);
      weekFive.setTimeOut0Thursday(12.00);
      weekFive.setTimeIn0Thursday(6.00);
      weekFive.setTimeOut0Friday(12.50);
      weekFive.setTimeIn0Friday(6.00);

      weekSix.setTimeOut0Saturday(13.00);
      weekSix.setTimeIn0Saturday(8.50);
      weekSix.setTimeOut0Sunday(9.50);
      weekSix.setTimeIn0Sunday(7.00);
      weekSix.setTimeOut0Monday(14.00);
      weekSix.setTimeIn0Monday(6.00);
      weekSix.setTimeOut0Wednesday(21.25);
      weekSix.setTimeIn0Wednesday(14.00);
      weekSix.setTimeOut0Thursday(14.00);
      weekSix.setTimeIn0Thursday(6.00);
      weekSix.setTimeOut0Friday(12.50);
      weekSix.setTimeIn0Friday(6.00);
>>>>>>> parent of 55ee6eb (add more date in the main)


     // new way of setting individal day and then createing a calling that time value
      weekFive.setSaturdayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Saturday(), weekFive.getTimeIn0Saturday()));
      weekFive.setMondayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Monday(),weekFive.getTimeIn0Monday()));
      weekFive.setWednesdayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Wednesday(),weekFive.getTimeIn0Wednesday()));
      weekFive.setThursdayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Thursday(),weekFive.getTimeIn0Thursday()));
      weekFive.setFridayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Friday(),weekFive.getTimeIn0Friday()));

<<<<<<< HEAD
	     // this is used to indicate how much each paycheck is worth
     
	     weekOne.setPaycheck(weekOne.paycheck(WeekZero.getWeekZero(),weekOne.getWeekTotal()));
	     weekThree.setPaycheck(weekThree.paycheck(weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
	     weekFive.setPaycheck(weekFive.paycheck(weekFour.getWeekTotal(),weekFive.getWeekTotal()));
	     weekSeven.setPaycheck(weekSeven.payChecks(weekSix.getWeekTotal(), weekSeven.getWeekTotal()));
	     weekNine.setPaycheck(weekNine.paycheck(weekNine.getWeekTotal(), weekEight.getWeekTotal()));
	     weekEleven.setPaycheck(weekEleven.paycheck(weekTen.getWeekTotal(), weekEleven.getWeekTotal()));
	     weekThriteen.setPaycheck(weekThriteen.payChecks(weekTwelve.getWeekTotal(), weekThriteen.getWeekTotal()));
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
	     System.out.printf("    9       | Feb 25 - Mar 4   | %.2f  |  %.2f     |    %.2f   | %n", weekEight.getWeekTotal(), weekEight.getSummedHoursForWeeksTotal(),weekEight.getTotalMinusWeeklyTotals());
	     System.out.printf("   10       | Mar 5  - Mar 11  | %.2f  |  %.2f     |    %.2f   | %.2f %n" ,weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   11       | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f   | %n ",weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("  12       | Mar 19 - Mar 25  | %.2f  |  %.2f     |    %.2f   | %.2f %n", weekEleven.getWeekTotal(), weekEleven.getSummedHoursForWeeksTotal(),weekEleven.getTotalMinusWeeklyTotals(),weekEleven.getPaycheck());
	     System.out.printf("   13       | Mar 25 - Apr 1   | %.2f  |  %.2f     |    %.2f   | %n ",weekTwelve.getWeekTotal(), weekTwelve.getSummedHoursForWeeksTotal(),weekTwelve.getTotalMinusWeeklyTotals()); 
	     System.out.printf("  14       | Apr 2  - Apr 8   | %.2f  |  %.2f     |    %.2f   | %.2f %n", weekThriteen.getWeekTotal(), weekThriteen.getSummedHoursForWeeksTotal(),weekThriteen.getTotalMinusWeeklyTotals(),weekThriteen.getPaycheck());
	     /*System.out.printf("   15       | Apr 9  - Apr 15  | %.2f  |  %.2f     |    %.2f  | %n ",weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
	     System.out.printf("   16       | Apr 16 - Apr 22  | %.2f  |  %.2f     |    %.2f  | %.2f %n" ,weekNine.getWeekTotal(), weekNine.getSummedHoursForWeeksTotal(),weekNine.getTotalMinusWeeklyTotals(),weekNine.getPaycheck());
	     System.out.printf("   17       | Apr 23 - Apr 30  | %.2f  |  %.2f     |    %.2f  | %n ",weekTen.getWeekTotal(), weekTen.getSummedHoursForWeeksTotal(),weekTen.getTotalMinusWeeklyTotals()); 
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
=======
      weekSix.setSaturdayTotal(weekSix.dailyTotal(weekSix.getTimeOut0Saturday(),weekSix.getTimeIn0Saturday()));
      weekSix.setSundayTotal(weekSix.dailyTotal(weekSix.getTimeOut0Sunday(),weekSix.getTimeIn0Sunday()));
      weekSix.setMondayTotal(weekSix.dailyTotal(weekSix.getTimeOut0Monday(),weekSix.getTimeIn0Monday()));
      weekSix.setWednesdayTotal(weekSix.dailyTotal(weekSix.getTimeOut0Wednesday(),weekSix.getTimeIn0Wednesday()));
      weekSix.setThursdayTotal(weekSix.dailyTotal(weekSix.getTimeOut0Thursday(),weekSix.getTimeIn0Thursday()));
      weekSix.setFridayTotal(weekSix.dailyTotal(weekSix.getTimeOut0Friday(),weekSix.getTimeIn0Friday()));
      // old way of calling and create each individal day
      double weekFourSaturdayTotal= weekFour.dailyTotal(weekFour.getTimeOut0Saturday(),weekFour.getTimeIn0Saturday(),weekOne.getTimeOut1Saturday(),weekOne.getTimeIn1Saturday());
      weekFour.setSaturdayTotal(weekFourSaturdayTotal);
      double weekFourSundayTotal= weekFour.dailyTotal(weekFour.getTimeOut0Sunday(),weekFour.getTimeIn0Sunday(),weekFour.getTimeOut1Sunday(),weekFour.getTimeIn1Sunday());
      weekFour.setSundayTotal(weekFourSundayTotal);
      double weekFourMondayTotal= weekFour.dailyTotal(weekFour.getTimeOut0Monday(),weekFour.getTimeIn0Monday(),weekOne.getTimeOut1Monday(),weekOne.getTimeIn1Monday());
      weekFour.setMondayTotal(weekFourMondayTotal);
      double weekFourWednesdayTotal= weekFour.dailyTotal(weekFour.getTimeOut0Wednesday(),weekFour.getTimeIn0Wednesday(),weekOne.getTimeOut1Wednesday(),weekOne.getTimeIn1Wednesday());
      weekFour.setWednesdayTotal(weekFourWednesdayTotal);
      double weekFourThursdayTotal= weekFour.dailyTotal(weekFour.getTimeOut0Thursday(),weekFour.getTimeIn0Thursday(),weekOne.getTimeOut1Thursday(),weekOne.getTimeIn1Thursday());
      weekFour.setThursdayTotal(weekFourThursdayTotal);
      double weekFourFridayTotal= weekFour.dailyTotal(weekFour.getTimeOut0Friday(),weekFour.getTimeIn0Friday(),weekOne.getTimeOut1Friday(),weekOne.getTimeIn1Friday());
      weekFour.setFridayTotal(weekFourFridayTotal);



    //this is used to create indivial weekly totals
     weekOne.setWeekTotal(weekOne.weeklyTotal(weekSaturdayTotal,weekSundayTotal,weekMondayTotal,weeksTuesdayTotal,weeksWednesdayTotal,weekThursdayTotal,weekFridayTotal));

     weekTwo.setWeekTotal(weekTwo.weeklyTotal(weekTwoTotalSaturdayHours ,weekTwoSundayTotalHours,weekTwoMondayTotalHours,weeksTuesdayTotal,weeksWednesdayTotal,weekTwoThursdayTotalHours,weekTwoFridayTotalHours));
>>>>>>> parent of 55ee6eb (add more date in the main)
     
      weekThree.setWeekTotal(weekThree.weeklyTotal(weekThreeTotalSaturdayHours,weekThreeSundayTotalHours, weekThreeMondayTotalHours, weeksTuesdayTotal,weeksWednesdayTotal,weekThreeThursdayTotalHours, weekThreeFridayTotalHours)); 
      weekFour.setWeekTotal(weekFour.weeklyTotal(weekFour.getSaturdayTotal(),weekFour.getSundayTotal(),weekFour.getMondayTotal(), weekOne.getTuesdayTotal(), weekFour.getWednesdayTotal(), weekFour.getThursdayTotal(),weekFour.getFridayTotal()));
      weekFive.setWeekTotal(weekFive.weeklyTotal(weekFive.getSaturdayTotal(),weekFive.getMondayTotal(),weekFive.getWednesdayTotal(),weekFive.getThursdayTotal(),weekFive.getFridayTotal()));
      
      weekSix.setWeekTotal(weekSix.weeklyTotal(weekSix.getSaturdayTotal(),weekSix.getSundayTotal(),weekSix.getMondayTotal(),weekSix.getWednesdayTotal(),weekSix.getThursdayTotal(),weekSix.getFridayTotal()));
      //This is used to indcate the total amount of hours that have been used
      weekOne.setSummedHoursForWeeksTotal(weekOne.summedTotalHours(weekZero.WeekZero , weekOne.getWeekTotal()));
      weekTwo.setSummedHoursForWeeksTotal(weekTwo.summedTotalHours(weekZero.WeekZero, weekOne.getWeekTotal(), weekTwo.getWeekTotal()));
      weekThree.setSummedHoursForWeeksTotal(weekThree.summedTotalHours(weekZero.WeekZero, weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
      weekFour.setSummedHoursForWeeksTotal(weekFour.summedTotalHours(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal()));
      weekFive.setSummedHoursForWeeksTotal(weekFive.summedTotalHours(weekOne.WeekZero, weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal()));
     weekSix.setSummedHoursForWeeksTotal(weekSix.summedTotalHours(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal()));
     // This is used to indicate how many hours I have
     weekZero.setTotalMinusWeeklyTotals(weekZero.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero));
     weekOne.setTotalMinusWeeklyTotals(weekOne.summedTotalsHoursMinusTotalHoursLefted(weekOne.WeekZero,weekOne.getWeekTotal()));
     weekTwo.setTotalMinusWeeklyTotals(weekTwo.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal()));
     weekThree.setTotalMinusWeeklyTotals(weekThree.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero, weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
     weekFour.setTotalMinusWeeklyTotals(weekFour.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal()));
     weekFive.setTotalMinusWeeklyTotals(weekFive.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal()));
     weekSix.setTotalMinusWeeklyTotals(weekSix.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal(),weekSix.getWeekTotal()));
     // this is used to indicate how much each paycheck is worth
     weekOne.setPaycheck(weekOne.paycheck(weekZero.WeekZero,weekOne.getWeekTotal()));
     weekThree.setPaycheck(weekThree.paycheck(weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
     weekFive.setPaycheck(weekFive.paycheck(weekFour.getWeekTotal(),weekFive.getWeekTotal()));
     System.out.println(" # of weeks |     dates        | hours  | total hours | hours - 1560 | paychecks");  
      System.out.printf("    1       | Jan 01 - Jan 07  | %.2f  |   %.2f     |    %.2f   |%n " , weekZero.WeekZero, weekZero.WeekZero, weekZero.getTotalMinusWeeklyTotals());
      System.out.printf("   2       | Jan 08 - Jan 14  | %.2f  |   %.2f     |    %.2f   | %.2f %n " , weekOne.getWeekTotal() , weekOne.getSummedHoursForWeeksTotal(),weekOne.getTotalMinusWeeklyTotals(), weekOne.getPaycheck());
      System.out.printf("   3       | Jan 15 - Jan 21  | %.2f  |   %.2f     |    %.2f   |  %n",weekTwo.getWeekTotal(),weekTwo.getSummedHoursForWeeksTotal(),weekTwo.getTotalMinusWeeklyTotals());
      System.out.printf("    4       | Jan 22 - Jan 28  | %.2f  |  %.2f     |    %.2f   | %.2f %n",weekThree.getWeekTotal(),weekThree.getSummedHoursForWeeksTotal(), weekThree.getTotalMinusWeeklyTotals(),weekThree.getPaycheck());
      System.out.printf("    5       | Jan 29 - Feb 04  | %.2f  |  %.2f     |    %.2f   | %n", weekFour.getWeekTotal() ,weekFour.getSummedHoursForWeeksTotal() ,weekFour.getTotalMinusWeeklyTotals() );
      System.out.printf("    6       | Feb 05 - Feb 11  | %.2f  |  %.2f     |    %.2f   | %.2f %n", weekFive.getWeekTotal(), weekFive.getSummedHoursForWeeksTotal(),weekFive.getTotalMinusWeeklyTotals(),weekFive.getPaycheck());
      System.out.printf("    7       | Feb 12 - Feb 18  | %.2f  |  %.2f     |    %.2f   | %n", weekSix.getWeekTotal(), weekSix.getSummedHoursForWeeksTotal(),weekSix.getTotalMinusWeeklyTotals());
   }
}


