//import java.util.Scanner();
public class Main{

     public static void main(String[] args){

      HoursCalculation weekZero = new HoursCalculation();
      HoursCalculation weekOne = new HoursCalculation();
      HoursCalculation weekTwo = new HoursCalculation();
      HoursCalculation weekThree = new HoursCalculation();
      HoursCalculation weekFour = new HoursCalculation();
      HoursCalculation weekFive = new HoursCalculation();

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
     // new way of setting individal day and then createing a calling that time value
      weekFive.setSaturdayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Saturday(), weekFive.getTimeIn0Saturday()));
      weekFive.setMondayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Monday(),weekFive.getTimeIn0Monday()));
      weekFive.setWednesdayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Wednesday(),weekFive.getTimeIn0Wednesday()));
      weekFive.setThursdayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Thursday(),weekFive.getTimeIn0Thursday()));
      weekFive.setFridayTotal(weekFive.dailyTotal(weekFive.getTimeOut0Friday(),weekFive.getTimeIn0Friday()));

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
     
      weekThree.setWeekTotal(weekThree.weeklyTotal(weekThreeTotalSaturdayHours,weekThreeSundayTotalHours, weekThreeMondayTotalHours, weeksTuesdayTotal,weeksWednesdayTotal,weekThreeThursdayTotalHours, weekThreeFridayTotalHours)); 
      weekFour.setWeekTotal(weekFour.weeklyTotal(weekFour.getSaturdayTotal(),weekFour.getSundayTotal(),weekFour.getMondayTotal(), weekOne.getTuesdayTotal(), weekFour.getWednesdayTotal(), weekFour.getThursdayTotal(),weekFour.getFridayTotal()));
      weekFive.setWeekTotal(weekFive.weeklyTotal(weekFive.getSaturdayTotal(),weekFive.getMondayTotal(),weekFive.getWednesdayTotal(),weekFive.getThursdayTotal(),weekFive.getFridayTotal()));
      
      System.out.println(weekFive.getWeekTotal());
      //This is used to indcate the total amount of hours that have been used
      weekOne.setSummedHoursForWeeksTotal(weekOne.summedTotalHours(weekZero.WeekZero , weekOne.getWeekTotal()));
      weekTwo.setSummedHoursForWeeksTotal(weekTwo.summedTotalHours(weekZero.WeekZero, weekOne.getWeekTotal(), weekTwo.getWeekTotal()));
      weekThree.setSummedHoursForWeeksTotal(weekThree.summedTotalHours(weekZero.WeekZero, weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
      weekFour.setSummedHoursForWeeksTotal(weekFour.summedTotalHours(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal()));
      weekFive.setSummedHoursForWeeksTotal(weekFive.summedTotalHours(weekOne.WeekZero, weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal()));
  
     // This is used to indicate how many hours I have
     weekZero.setTotalMinusWeeklyTotals(weekZero.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero));
     weekOne.setTotalMinusWeeklyTotals(weekOne.summedTotalsHoursMinusTotalHoursLefted(weekOne.WeekZero,weekOne.getWeekTotal()));
     weekTwo.setTotalMinusWeeklyTotals(weekTwo.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal()));
     weekThree.setTotalMinusWeeklyTotals(weekThree.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero, weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal()));
     weekFour.setTotalMinusWeeklyTotals(weekFour.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal()));
     weekFive.setTotalMinusWeeklyTotals(weekFive.summedTotalsHoursMinusTotalHoursLefted(weekZero.WeekZero,weekOne.getWeekTotal(),weekTwo.getWeekTotal(),weekThree.getWeekTotal(),weekFour.getWeekTotal(),weekFive.getWeekTotal()));
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
   }
}


