import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Logger;

import dao.WeeklyDAOImpl;
import days.DailyCalculation;
import hours.HourCalculation;
import scanners.ScanClass;
import weeks.WeeklyCalculations;
import weeks.WeeklyFunctions;

public class Main {
	private static Logger log = Logger.getLogger("Main.class");
	
	public static void main(String[] args) throws Exception {
		// This is a Constructors
		ScanClass sc = new ScanClass();
		HourCalculation daysOfWeeksForteenth = new HourCalculation();
		HourCalculation daysOfWeeksFifteenth = new HourCalculation();
		HourCalculation daysOfWeeksSixteenth = new HourCalculation();
		HourCalculation daysOfWeekSeventeenth = new HourCalculation();
		HourCalculation daysOfWeekEightteenth = new HourCalculation();
		HourCalculation daysOfWeeksNinteenth = new HourCalculation();
		HourCalculation daysOfWeeksTwentyth = new HourCalculation();
		HourCalculation daysofWeeksTwentyFrist= new HourCalculation();
		HourCalculation daysOfWeeksTwentySecond= new HourCalculation();
		HourCalculation daysOfWeeksTwentythird = new HourCalculation();
		HourCalculation daysOfWeeksTwentyFourth = new HourCalculation();
		HourCalculation daysOfWeeksTwentyFifith = new HourCalculation();
		HourCalculation daysOfWeeksThirtieth = new HourCalculation();
		HourCalculation dayOfWeeksTwentySeventh = new HourCalculation();
		HourCalculation daysOfWeeksTwentyEighth = new HourCalculation();
		HourCalculation daysOfWeeksThirtFrist = new HourCalculation();
		HourCalculation daysOfWeeksThritySecond = new HourCalculation();
		HourCalculation daysOfWeekThritythird = new HourCalculation();
		HourCalculation daysOfWeekThirtySixth = new HourCalculation();
		HourCalculation daysOfWeekThirtySeventh = new HourCalculation();
		HourCalculation daysOfWeekThrityEighth = new HourCalculation();
		HourCalculation daysOfWeekThirtyNinth = new HourCalculation();
		HourCalculation daysOfWeekfortieth = new HourCalculation();
		HourCalculation daysOfWeekFortyFirst = new HourCalculation();
		HourCalculation daysOfWeekFortySecond = new HourCalculation();
		
		
		Hashtable<String,Double> hts = new Hashtable<String,Double>();
		ArrayList <String> al = new ArrayList<String>();
	//	HourCalculation daysofWeeks= new HourCalculation();
		//PATH TO FILE = PTF
		String home = System.getenv("HOME");
		String files = home + "/dateTimeObj.txt";
		al = sc.scanFile(files);
		for (String message: al)
		{
			System.out.println(message);
		}
		hts = sc.interruptedData(al);
	
		if (hts.containsKey("Saturday April 9 In")){
			daysOfWeeksForteenth.setTimeIn0Saturday(hts.get("Saturday April 9 In"));
			daysOfWeeksForteenth.setTimeOut0Saturday(hts.get("Saturday April 9 Out"));
		}
		if(hts.containsKey("Sunday April 10 In")) {
			daysOfWeeksForteenth.setTimeIn0Sunday(hts.get("Sunday April 10 In"));
			daysOfWeeksForteenth.setTimeOut0Sunday(hts.get("Sunday April 10 Out"));
		}
		if (hts.containsKey("Monday April 11 In")){
			daysOfWeeksForteenth.setTimeIn0Monday(hts.get("Monday April 11 In"));
			daysOfWeeksForteenth.setTimeOut0Monday(hts.get("Monday April 11 Out" ));
		}
		if (hts.containsKey("Tuesday April 12 In")) {
			daysOfWeeksForteenth.setTimeIn0Tuesady(hts.get("Tuesday April 12 In"));
			daysOfWeeksForteenth.setTimeOut0Tuesday(hts.get("Tuesday April 12 Out"));
		}
		if (hts.containsKey("Wednesday April 13 In")) {
			daysOfWeeksForteenth.setTimeIn0Wednesday(hts.get("Wednesday April 13 In"));
			daysOfWeeksForteenth.setTimeOut0Wednesday(hts.get("Wednesday April 13 Out"));
		}
		if (hts.containsKey("thursday April 14 In")) {
			daysOfWeeksForteenth.setTimeIn0Thursday(hts.get("thursday April 14 In"));
			daysOfWeeksForteenth.setTimeOut0Thursday(hts.get("thursday April 14 Out"));
		}
		if (hts.containsKey("Friday April 15 In")) {
			daysOfWeeksForteenth.setTimeIn0Friday(hts.get("Friday April 15 In"));
			daysOfWeeksForteenth.setTimeOut0Friday(hts.get("Friday April 15 Out"));
			daysOfWeeksForteenth.setTimeIn1Friday(hts.get("Friday April 1 15 In"));
			daysOfWeeksForteenth.setTimeOut1Friday(hts.get("Friday April 1 15 Out"));
		}
		if (hts.containsKey("Saturday April 16 In")) {
			daysOfWeeksFifteenth.setTimeIn0Saturday(hts.get("Saturday April 16 In"));
			daysOfWeeksFifteenth.setTimeOut0Saturday(hts.get("Saturday April 16 Out"));
			daysOfWeeksFifteenth.setTimein1Saturday(hts.get("Saturday April 16 1 In"));
			daysOfWeeksFifteenth.setTimeOut1Saturday(hts.get("Saturday April 16 1 Out"));
		}
		daysOfWeeksFifteenth.setTimeIn0Monday(hts.get("Monday April 18 In"));
		daysOfWeeksFifteenth.setTimeOut0Monday(hts.get("Monday April 18 Out"));
		daysOfWeeksFifteenth.setTimeIn0Wednesday(hts.get("Wednesday April 20 In"));
		daysOfWeeksFifteenth.setTimeOut0Wednesday(hts.get("Wednesday April 20 Out"));
		daysOfWeeksFifteenth.setTimeIn0Thursday(hts.get("thursday April 21 In"));
		daysOfWeeksFifteenth.setTimeOut0Thursday(hts.get("thursday April 21 Out"));
		daysOfWeeksFifteenth.setTimeIn0Friday(hts.get("Friday April 22 In"));
		daysOfWeeksFifteenth.setTimeOut0Friday(hts.get("Friday April 22 Out"));
		
		daysOfWeeksSixteenth.setTimeIn0Sunday(hts.get("Sunday April 24 In"));
		daysOfWeeksSixteenth.setTimeOut0Sunday(hts.get("Sunday April 24 Out"));
		daysOfWeeksSixteenth.setTimeIn0Monday(hts.get("Monday April 25 In"));
		daysOfWeeksSixteenth.setTimeOut0Monday(hts.get("Monday April 25 Out"));
		daysOfWeeksSixteenth.setTimeIn1Monday(hts.get("Monday April 1  25 In"));
		daysOfWeeksSixteenth.setTimeOut1Monday(hts.get("Monday April 1  25 Out"));
		daysOfWeeksSixteenth.setTimeIn0Wednesday(hts.get("Wednesay April 27 In"));
		daysOfWeeksSixteenth.setTimeOut0Wednesday(hts.get("Wednesay April 27 Out"));
		daysOfWeeksSixteenth.setTimeIn0Friday(hts.get("Friday April 29 In"));
		daysOfWeeksSixteenth.setTimeOut0Friday(hts.get("Friday April 29 Out"));
		
		daysOfWeekSeventeenth.setTimeIn0Sunday(hts.get("Sunday May 1 In"));
		daysOfWeekSeventeenth.setTimeOut0Sunday(hts.get("Sunday May 1 Out"));
		daysOfWeekSeventeenth.setTimeIn0Monday(hts.get("Monday May 2 In"));
		daysOfWeekSeventeenth.setTimeOut0Monday(hts.get("Monday May 2 Out"));
		daysOfWeekSeventeenth.setTimeIn1Monday(hts.get("Monday May 1 2 In"));
		daysOfWeekSeventeenth.setTimeOut1Monday(hts.get("Monday May 1 2 Out"));
		daysOfWeekSeventeenth.setTimeIn0Wednesday(hts.get("Wednesday May 4 In"));
		daysOfWeekSeventeenth.setTimeOut0Wednesday(hts.get("Wednesday May 4 Out"));
		daysOfWeekSeventeenth.setTimeOut0Thursday(hts.get("thursday May 5 Out"));
		daysOfWeekSeventeenth.setTimeIn0Thursday(hts.get("thursday May 5 In"));
		daysOfWeekSeventeenth.setTimeIn0Friday(hts.get("Friday May 6 In"));
		daysOfWeekSeventeenth.setTimeOut0Friday(hts.get("Friday May 6 Out"));
	
		
		daysOfWeekEightteenth.setTimeIn0Sunday(hts.get("Sunday May 8 In"));
		daysOfWeekEightteenth.setTimeOut0Sunday(hts.get("Sunday May 8 Out"));
		daysOfWeekEightteenth.setTimeIn0Monday(hts.get("Monday May 9 In"));
		daysOfWeekEightteenth.setTimeOut0Monday(hts.get("Monday May 9 Out"));
		daysOfWeekEightteenth.setTimeIn0Tuesady(hts.get("Tuesday May 10 In"));
		daysOfWeekEightteenth.setTimeOut0Tuesday(hts.get("Tuesday May 10 Out"));
		daysOfWeekEightteenth.setTimeIn0Wednesday(hts.get("Wednesday May 11 In"));
		daysOfWeekEightteenth.setTimeOut0Wednesday(hts.get("Wednesday May 11 Out"));
		daysOfWeekEightteenth.setTimeIn0Friday(hts.get("Friday May 13 In"));
		daysOfWeekEightteenth.setTimeOut0Friday(hts.get("Friday May 13 Out"));
		
		daysOfWeeksNinteenth.setTimeIn0Sunday(hts.get("Sunday May 15 In"));
		daysOfWeeksNinteenth.setTimeOut0Sunday(hts.get("Sunday May 15 Out"));
		daysOfWeeksNinteenth.setTimeIn0Monday(hts.get("Monday May 16 In"));
		daysOfWeeksNinteenth.setTimeOut0Monday(hts.get("Monday May 16 Out"));
		daysOfWeeksNinteenth.setTimeIn0Tuesady(hts.get("Tuesday May 17 In"));
		daysOfWeeksNinteenth.setTimeOut0Tuesday(hts.get("Tuesday May 17 Out"));
		daysOfWeeksNinteenth.setTimeIn0Wednesday(hts.get("Wednesday May 18 In"));
		daysOfWeeksNinteenth.setTimeOut0Wednesday(hts.get("Wednesday May 18 Out"));
		if (hts.containsKey("Thursday May 19 In")){
			daysOfWeeksNinteenth.setTimeIn0Thursday(hts.get("thursday May 19 In"));
			daysOfWeeksNinteenth.setTimeOut0Thursday(hts.get("Thursday May 19 Out"));
			if (hts.containsKey("Thursday May 1 19 In")) {
				daysOfWeeksNinteenth.setTimeIn1Thursday(hts.get("thursday May 1 19 In"));
				daysOfWeeksNinteenth.setTimeOut1Thursday(hts.get("thursday May 1 19 Out"));				
			}
		}
		daysOfWeeksNinteenth.setTimeIn0Friday(hts.get("Friday May 20 In"));
		daysOfWeeksNinteenth.setTimeOut0Friday(hts.get("Friday May 20 Out"));
		
		daysOfWeeksTwentyth.setTimeIn0Saturday(hts.get("Saturday May 21 In"));
		daysOfWeeksTwentyth.setTimeOut0Saturday(hts.get("Saturday May 21 Out"));
		daysOfWeeksTwentyth.setTimeIn0Monday(hts.get("Monday May 23 In"));
		daysOfWeeksTwentyth.setTimeOut0Monday(hts.get("Monday May 23 Out"));
		daysOfWeeksTwentyth.setTimeIn0Tuesady(hts.get("Tuesday May 24 In"));
		daysOfWeeksTwentyth.setTimeOut0Tuesday(hts.get("Tuesday May 24 Out"));
		daysOfWeeksTwentyth.setTimeIn0Wednesday(hts.get("Wednesday May 25 In"));
		daysOfWeeksTwentyth.setTimeOut0Wednesday(hts.get("Wednesday May 25 Out"));
		daysOfWeeksTwentyth.setTimeIn0Friday(hts.get("Friday May 27 In"));
		daysOfWeeksTwentyth.setTimeOut0Friday(hts.get("Friday May 27 Out"));
		
		daysofWeeksTwentyFrist.setTimeIn0Saturday(hts.get("Saturday May 28 In"));
		daysofWeeksTwentyFrist.setTimeOut0Saturday(hts.get("Saturday May 28 Out"));
		
		
		daysOfWeeksTwentySecond.setTimeIn0Wednesday(hts.get("Wednesday June 8 In"));
		daysOfWeeksTwentySecond.setTimeOut0Wednesday(hts.get("Wednesday June 8 Out"));
		daysOfWeeksTwentySecond.setTimeIn0Thursday(hts.get("thursday June 9 In"));
		daysOfWeeksTwentySecond.setTimeOut0Thursday(hts.get("thursday June 9 Out"));
		daysOfWeeksTwentySecond.setTimeIn0Friday(hts.get("Friday June 10 In"));
		daysOfWeeksTwentySecond.setTimeOut0Friday(hts.get("Friday June 10 Out"));
		
		daysOfWeeksTwentythird.setTimeIn0Monday(hts.get("Monday June 13 In"));
		daysOfWeeksTwentythird.setTimeOut0Monday(hts.get("Monday June 13 Out"));
		daysOfWeeksTwentythird.setTimeIn0Tuesady(hts.get("Tuesday June 14 In"));
		daysOfWeeksTwentythird.setTimeOut0Tuesday(hts.get("Tuesday June 14 Out"));
		daysOfWeeksTwentythird.setTimeIn0Wednesday(hts.get("Wednesday June 15 In"));
		daysOfWeeksTwentythird.setTimeOut0Wednesday(hts.get("Wednesday June 15 Out"));
		daysOfWeeksTwentythird.setTimeIn0Thursday(hts.get("thursday June 16 In"));
		daysOfWeeksTwentythird.setTimeOut0Thursday(hts.get("thursday June 16 Out"));
		daysOfWeeksTwentythird.setTimeIn0Friday(hts.get("Friday June 17 In"));
		daysOfWeeksTwentythird.setTimeOut0Friday(hts.get("Friday June 17 Out"));
		
		
		daysOfWeeksTwentyFourth.setTimeIn0Monday(hts.get("Monday June 20 In"));
		daysOfWeeksTwentyFourth.setTimeOut0Monday(hts.get("Monday June 20 Out"));
		daysOfWeeksTwentyFourth.setTimeIn0Tuesady(hts.get("Tuesday June 21 In"));
		daysOfWeeksTwentyFourth.setTimeOut0Tuesday(hts.get("Tuesday June 21 Out"));
		daysOfWeeksTwentyFourth.setTimeIn0Thursday(hts.get("thursday June 23 In"));
		daysOfWeeksTwentyFourth.setTimeOut0Thursday(hts.get("thursday June 23 Out"));
		daysOfWeeksTwentyFourth.setTimeIn0Friday(hts.get("Friday June 24 In"));
		daysOfWeeksTwentyFourth.setTimeOut0Friday(hts.get("Friday June 24 Out"));
		
		daysOfWeeksTwentyFifith.setTimeIn0Saturday(hts.get("Saturday June 25 In"));
		daysOfWeeksTwentyFifith.setTimeOut0Saturday(hts.get("Saturday June 25 Out"));
		daysOfWeeksTwentyFifith.setTimeIn0Sunday(hts.get("Sunday June 26 In"));
		daysOfWeeksTwentyFifith.setTimeOut0Sunday(hts.get("Sunday June 26 Out"));
		daysOfWeeksTwentyFifith.setTimeIn0Thursday(hts.get("thursday June 30 In"));
		daysOfWeeksTwentyFifith.setTimeOut0Thursday(hts.get("thursday June 30 Out"));
		
		dayOfWeeksTwentySeventh.setTimeIn0Friday(hts.get("Friday July 15 In"));
		dayOfWeeksTwentySeventh.setTimeOut0Friday(hts.get("Friday July 15 Out"));
		
		daysOfWeeksTwentyEighth.setTimeIn0Monday(hts.get("Monday July 18 In"));
		daysOfWeeksTwentyEighth.setTimeOut0Monday(hts.get("Monday July 18 Out"));
		daysOfWeeksTwentyEighth.setTimeIn0Tuesady(hts.get("Tuesday July 19 In"));
		daysOfWeeksTwentyEighth.setTimeOut0Tuesday(hts.get("Tuesday July 19 Out"));
		daysOfWeeksTwentyEighth.setTimeIn0Wednesday(hts.get("Wednesday July 20 In"));
		daysOfWeeksTwentyEighth.setTimeOut0Wednesday(hts.get("Wednesday July 20 Out"));
		daysOfWeeksTwentyEighth.setTimeIn0Thursday(hts.get("thursday July 21 In"));
		daysOfWeeksTwentyEighth.setTimeOut0Thursday(hts.get("thursday July 21 Out"));
		
		
		daysOfWeeksThirtieth.setTimeIn0Saturday(hts.get("Saturday July 30 In"));
		daysOfWeeksThirtieth.setTimeOut0Saturday(hts.get("Saturday July 30 Out"));
		
		String mondayAugusteigth="Monday August 8";
		String mondayAugustEigthOne = "Monday August 1 8";
		double [] mondayAugustEigthArray = daysOfWeeksThirtFrist.arrayOfHoursValues(mondayAugusteigth, mondayAugustEigthOne, hts);
		daysOfWeeksThirtFrist.setHourlyValuesForDates(mondayAugustEigthOne, mondayAugustEigthArray);
		log.info("Monday August eigth In value="+ daysOfWeeksThirtFrist.getTimeIn0Monday());
		String thursdayAugusteleven= "thursday August 11";
		String thursdayAugustelevenOne= "thursday August 1 11";
		daysOfWeeksThirtFrist.setHourlyValuesForDates(thursdayAugustelevenOne, daysOfWeeksThirtFrist.arrayOfHoursValues(thursdayAugusteleven, thursdayAugustelevenOne, hts));
		
		
		String waterminedate = "Saturday August 13";
		String watermindate = "Saturday August 1 13";
		daysOfWeeksThritySecond.setHourlyValuesForDates(waterminedate, daysOfWeeksThritySecond.arrayOfHoursValues(waterminedate, watermindate, hts));
		String thrusdayAugust18th ="thursday August 18";
		String thrusdayAugust18One ="thursday August 1 18";
		daysOfWeeksThritySecond.setHourlyValuesForDates(thrusdayAugust18th, daysOfWeeksThritySecond.arrayOfHoursValues(thrusdayAugust18th, thrusdayAugust18One, hts));
		daysOfWeeksThritySecond.setHourlyValuesForDates("Friday August 19",daysOfWeeksThritySecond.arrayOfHoursValues("Friday August 19", "Friday August 1 19", hts));
		
		daysOfWeekThritythird.setHourlyValuesForDates("Saturday August 20", daysOfWeekThritythird.arrayOfHoursValues("Saturday August 20", hts));
		daysOfWeekThritythird.setHourlyValuesForDates("Sunday August 21", daysOfWeekThritythird.arrayOfHoursValues("Sunday August 21", hts));
		daysOfWeekThritythird.setHourlyValuesForDates("Monday August 22", daysOfWeekThritythird.arrayOfHoursValues("Monday August 22", hts));
		daysOfWeekThritythird.setHourlyValuesForDates("Tuesday August 23", daysOfWeekThritythird.arrayOfHoursValues("Tuesday August 23", hts));
		daysOfWeekThritythird.setHourlyValuesForDates("Wednesday August 24",daysOfWeekThritythird.arrayOfHoursValues("Wednesday August 24", hts));
		
		daysOfWeekThirtySixth.setHourlyValuesForDates("Saturday September 10",daysOfWeekThirtySixth.arrayOfHoursValues("Saturday September 10", hts));
		daysOfWeekThirtySixth.setHourlyValuesForDates("Sunday September 11", daysOfWeekThirtySixth.arrayOfHoursValues("Sunday September 11", hts));
		daysOfWeekThirtySixth.setHourlyValuesForDates("Wednesday September 14", daysOfWeekThirtySixth.arrayOfHoursValues("Wednesday September 14", hts));
		daysOfWeekThirtySixth.setHourlyValuesForDates("thursday September 15", daysOfWeekThirtySixth.arrayOfHoursValues("thursday September 15", hts));
		daysOfWeekThirtySixth.setHourlyValuesForDates("Friday September 16", daysOfWeekThirtySixth.arrayOfHoursValues("Friday September 16",hts));
		
		daysOfWeekThirtySeventh.setHourlyValuesForDates("Saturday September 17", daysOfWeekThirtySeventh.arrayOfHoursValues("Saturday September 17", hts));
		daysOfWeekThirtySeventh.setHourlyValuesForDates("Sunday September 18", daysOfWeekThirtySeventh.arrayOfHoursValues("Sunday September 18", hts));
		daysOfWeekThirtySeventh.setHourlyValuesForDates("Monday September 19", daysOfWeekThirtySeventh.arrayOfHoursValues("Monday September 19", hts));
		daysOfWeekThirtySeventh.setHourlyValuesForDates("Wednesday September 21", daysOfWeekThirtySeventh.arrayOfHoursValues("Wednesday September 21", hts));
		daysOfWeekThirtySeventh.setHourlyValuesForDates("thursday September 22", daysOfWeekThirtySeventh.arrayOfHoursValues("thursday September 22", hts));
		daysOfWeekThirtySeventh.setHourlyValuesForDates("Friday September 23", daysOfWeekThirtySeventh.arrayOfHoursValues("Friday September 23", hts));
		
		daysOfWeekThrityEighth.setHourlyValuesForDates("Saturday September 24", daysOfWeekThrityEighth.arrayOfHoursValues("Saturday September 24", hts));
		daysOfWeekThrityEighth.setHourlyValuesForDates("Sunday September 25", daysOfWeekThrityEighth.arrayOfHoursValues("Sunday September 25", hts));
		daysOfWeekThrityEighth.setHourlyValuesForDates("Tuesday September 27", daysOfWeekThrityEighth.arrayOfHoursValues("Tuesday September 27", hts));
		daysOfWeekThrityEighth.setHourlyValuesForDates("thursday September 29", daysOfWeekThrityEighth.arrayOfHoursValues("thursday September 29", hts));
		daysOfWeekThrityEighth.setHourlyValuesForDates("Friday September 30", daysOfWeekThrityEighth.arrayOfHoursValues("Friday September 30", hts));
		
		daysOfWeekThirtyNinth.setHourlyValuesForDates("Saturday October 1", daysOfWeekThirtyNinth.arrayOfHoursValues("Saturday October 1", hts));
		daysOfWeekThirtyNinth.setHourlyValuesForDates("Tuesday October 4", daysOfWeekThirtyNinth.arrayOfHoursValues("Tuesday October 4", hts));
		daysOfWeekThirtyNinth.setHourlyValuesForDates("thursday October 6", daysOfWeekThirtyNinth.arrayOfHoursValues("thursday October 6", hts));
		daysOfWeekThirtyNinth.setHourlyValuesForDates("Friday October 7", daysOfWeekThirtyNinth.arrayOfHoursValues("Friday October 7", hts));
		
		
		daysOfWeekfortieth.setHourlyValuesForDates("Saturday October 8", daysOfWeekfortieth.arrayOfHoursValues("Saturday October 8", hts));
		daysOfWeekfortieth.setHourlyValuesForDates("Sunday October 9", daysOfWeekfortieth.arrayOfHoursValues("Sunday October 9", hts));
		daysOfWeekfortieth.setHourlyValuesForDates("Tuesday October 11",daysOfWeekfortieth.arrayOfHoursValues("Tuesday October 11", hts) );
		daysOfWeekfortieth.setHourlyValuesForDates("Wednesday October 12", daysOfWeekfortieth.arrayOfHoursValues("Wednesday October 12", hts));
		daysOfWeekfortieth.setHourlyValuesForDates("thursday October 13", daysOfWeekfortieth.arrayOfHoursValues("thursday October 13", hts));
		daysOfWeekfortieth.setHourlyValuesForDates("Friday October 14", daysOfWeekfortieth.arrayOfHoursValues("Friday October 14", hts));
		
		
		
		DailyCalculation datesOFweekThritySeventh = new DailyCalculation();
		DailyCalculation dateOfWeekThirtyEighth = new DailyCalculation();
		DailyCalculation datesOfWeekThirtyNinth = new DailyCalculation();
		DailyCalculation datesOfWeekFortieth = new DailyCalculation();
		//datesOfWeekThirtyNinth daysOfWeekThirtyNinth
		datesOfWeekThirtyNinth.setSaturdayTotal(datesOfWeekThirtyNinth.hourlyConvertedIntoDaily(daysOfWeekThirtyNinth.getTimeIn0Saturday(), daysOfWeekThirtyNinth.getTimeOut0Saturday()));
		datesOfWeekThirtyNinth.setTuesdayTotal(datesOfWeekThirtyNinth.hourlyConvertedIntoDaily(daysOfWeekThirtyNinth.getTimeIn0Tuesady(), daysOfWeekThirtyNinth.getTimeOut0Tuesday()));
		datesOfWeekThirtyNinth.setThursdayTotal(datesOfWeekThirtyNinth.hourlyConvertedIntoDaily(daysOfWeekThirtyNinth.getTimeIn0Thursday(), daysOfWeekThirtyNinth.getTimeOut0Thursday()));
		datesOfWeekThirtyNinth.setFridayTotal(datesOfWeekThirtyNinth.hourlyConvertedIntoDaily(daysOfWeekThirtyNinth.getTimeIn0Friday(), daysOfWeekThirtyNinth.getTimeOut0Friday()));
		//datesOfWeekFortieth daysOfWeekfortieth
		datesOfWeekFortieth.setSaturdayTotal(datesOfWeekFortieth.hourlyConvertedIntoDaily(daysOfWeekfortieth.getTimeIn0Saturday(), daysOfWeekfortieth.getTimeOut0Saturday()));
		datesOfWeekFortieth.setSundayTotal(datesOfWeekFortieth.hourlyConvertedIntoDaily(daysOfWeekfortieth.getTimeIn0Sunday(), daysOfWeekfortieth.getTimeOut0Sunday()));
		datesOfWeekFortieth.setTuesdayTotal(datesOfWeekFortieth.hourlyConvertedIntoDaily(daysOfWeekfortieth.getTimeIn0Tuesady(), daysOfWeekfortieth.getTimeOut0Tuesday()));
		datesOfWeekFortieth.setWednesdayTotal(datesOfWeekFortieth.hourlyConvertedIntoDaily(daysOfWeekfortieth.getTimeIn0Wednesday(), daysOfWeekfortieth.getTimeOut0Wednesday()));
		datesOfWeekFortieth.setThursdayTotal(datesOfWeekFortieth.hourlyConvertedIntoDaily(daysOfWeekfortieth.getTimeIn0Thursday(), daysOfWeekfortieth.getTimeOut0Thursday()));
		datesOfWeekFortieth.setFridayTotal(datesOfWeekFortieth.hourlyConvertedIntoDaily(daysOfWeekfortieth.getTimeIn0Friday(), daysOfWeekfortieth.getTimeOut0Friday()));
		//datesOFweekThritySeventh daysOfWeekThirtySeventh 
		datesOFweekThritySeventh.setSaturdayTotal(datesOFweekThritySeventh.hourlyConvertedIntoDaily(daysOfWeekThirtySeventh.getTimeIn0Saturday(), daysOfWeekThirtySeventh.getTimeOut0Saturday()));
		datesOFweekThritySeventh.setSundayTotal(datesOFweekThritySeventh.hourlyConvertedIntoDaily(daysOfWeekThirtySeventh.getTimeIn0Sunday(), daysOfWeekThirtySeventh.getTimeOut0Sunday()));
		datesOFweekThritySeventh.setMondayTotal(datesOFweekThritySeventh.hourlyConvertedIntoDaily(daysOfWeekThirtySeventh.getTimeIn0Monday(), daysOfWeekThirtySeventh.getTimeOut0Monday()));
		datesOFweekThritySeventh.setWednesdayTotal(datesOFweekThritySeventh.hourlyConvertedIntoDaily(daysOfWeekThirtySeventh .getTimeIn0Wednesday(), daysOfWeekThirtySeventh.getTimeOut0Wednesday()));
		datesOFweekThritySeventh.setThursdayTotal(datesOFweekThritySeventh.hourlyConvertedIntoDaily(daysOfWeekThirtySeventh.getTimeIn0Thursday(), daysOfWeekThirtySeventh.getTimeOut0Thursday()));
		datesOFweekThritySeventh.setFridayTotal(datesOFweekThritySeventh.hourlyConvertedIntoDaily(daysOfWeekThirtySeventh.getTimeIn0Friday(),daysOfWeekThirtySeventh.getTimeOut0Friday()));
		//dateOfWeekThirtyEighth daysOfWeekTHrityEighth
		dateOfWeekThirtyEighth.setSaturdayTotal(dateOfWeekThirtyEighth.hourlyConvertedIntoDaily(daysOfWeekThrityEighth.getTimeIn0Saturday(), daysOfWeekThrityEighth.getTimeOut0Saturday()));
		dateOfWeekThirtyEighth.setSundayTotal(dateOfWeekThirtyEighth.hourlyConvertedIntoDaily(daysOfWeekThrityEighth.getTimeIn0Sunday(), daysOfWeekThrityEighth.getTimeOut0Sunday()));
		dateOfWeekThirtyEighth.setTuesdayTotal(dateOfWeekThirtyEighth.hourlyConvertedIntoDaily(daysOfWeekThrityEighth.getTimeIn0Tuesady(), daysOfWeekThrityEighth.getTimeOut0Tuesday()));
		dateOfWeekThirtyEighth.setThursdayTotal(dateOfWeekThirtyEighth.hourlyConvertedIntoDaily(daysOfWeekThrityEighth.getTimeIn0Thursday(), daysOfWeekThrityEighth.getTimeOut0Thursday()));
		dateOfWeekThirtyEighth.setFridayTotal(dateOfWeekThirtyEighth.hourlyConvertedIntoDaily(daysOfWeekThrityEighth.getTimeIn0Friday(), daysOfWeekThrityEighth.getTimeOut0Friday()));
		
		
		WeeklyCalculations weekThirtyEight = new WeeklyCalculations(dateOfWeekThirtyEighth.getSaturdayTotal(), dateOfWeekThirtyEighth.getSundayTotal(), dateOfWeekThirtyEighth.getTuesdayTotal(), dateOfWeekThirtyEighth.getThursdayTotal(),dateOfWeekThirtyEighth.getFridayTotal());
		WeeklyCalculations weekThiryNinth = new WeeklyCalculations(datesOfWeekThirtyNinth.getSaturdayTotal(),datesOfWeekThirtyNinth.getTuesdayTotal(),datesOfWeekThirtyNinth.getThursdayTotal(),datesOfWeekThirtyNinth.getFridayTotal());
		WeeklyCalculations weekFortieth = new WeeklyCalculations(datesOfWeekFortieth.getSaturdayTotal(), datesOfWeekFortieth.getSundayTotal(), datesOfWeekFortieth.getTuesdayTotal(), datesOfWeekFortieth.getWednesdayTotal(), datesOfWeekFortieth.getThursdayTotal(),datesOfWeekFortieth.getFridayTotal());
		
		//Non Autocmated calcaultions
		//Constuctors of classes
		 HourCalculation daysOfWeeksOne = new HourCalculation();
	     HourCalculation daysOfWeeksTwo = new HourCalculation();
	     HourCalculation daysOfWeeksThree = new HourCalculation();
	     HourCalculation daysOfWeeksFour = new HourCalculation();
	     HourCalculation daysOfWeeksFive = new HourCalculation();
	     HourCalculation daysOfWeeksSix= new HourCalculation();
	     HourCalculation daysOfWeekSeven = new HourCalculation();
	     HourCalculation daysOfWeeksEight = new HourCalculation();
	     HourCalculation daysOfWeeksNine = new HourCalculation();
	     HourCalculation daysOfWeeksTen = new HourCalculation();
	     HourCalculation daysOfWeeksEleven = new HourCalculation();
	     HourCalculation daysOfWeeksTwelve = new HourCalculation();
	     HourCalculation daysOfWeeksThriteen = new HourCalculation();
	     
	     daysOfWeeksOne.setTimeOut0Saturday(22.25);
	     daysOfWeeksOne.setTimeIn0Saturday(15.00);
	     daysOfWeeksOne.setTimeOut0Sunday(9.50);
	     daysOfWeeksOne.setTimeIn0Sunday(7.00);
	     daysOfWeeksOne.setTimeOut1Sunday(20.25);
	     daysOfWeeksOne.setTimeIn1Sunday(13.50);
	     daysOfWeeksOne.setTimeOut0Monday(14.00);
	     daysOfWeeksOne.setTimeIn0Monday(6.00);
	     daysOfWeeksOne.setTimeOut0Thursday(16.00);
	     daysOfWeeksOne.setTimeIn0Thursday(6.0);
	     
	     
	     daysOfWeeksTwo.setTimeOut0Sunday(9.80);
	     daysOfWeeksTwo.setTimeIn0Sunday(7.00);
	     daysOfWeeksTwo.setTimeOut1Sunday(17.30);
	     daysOfWeeksTwo.setTimeIn1Sunday(13.50);
	     daysOfWeeksTwo.setTimeOut0Monday(14.00);
	     daysOfWeeksTwo.setTimeIn0Monday(7.50);
	     daysOfWeeksTwo.setTimeOut0Thursday(15.50);
	     daysOfWeeksTwo.setTimeIn0Thursday(6.00);
	     daysOfWeeksTwo.setTimeOut0Friday(12.50);
	     daysOfWeeksTwo.setTimeIn0Friday(6.00);
	     
	     
	     daysOfWeeksThree.setTimeOut0Saturday(13.00);
	     daysOfWeeksThree.setTimeIn0Saturday(8.50);
	     daysOfWeeksThree.setTimeOut1Saturday(13.10);
	     daysOfWeeksThree.setTimein1Saturday(13.00);
	     daysOfWeeksThree.setTimeOut0Sunday(9.30);
	     daysOfWeeksThree.setTimeIn0Sunday(7.00);
	     daysOfWeeksThree.setTimeOut1Sunday(20.30);
	     daysOfWeeksThree.setTimeIn1Sunday(13.50);
	     daysOfWeeksThree.setTimeOut0Monday(14.00);
	     daysOfWeeksThree.setTimeIn0Monday(6.00);
	     daysOfWeeksThree.setTimeOut0Thursday(15.00);
	     daysOfWeeksThree.setTimeIn0Thursday(6.00);
	     daysOfWeeksThree.setTimeOut0Friday(12.50);
	     daysOfWeeksThree.setTimeIn0Friday(6.00);
	     
	     
	     daysOfWeeksFour.setTimeOut0Saturday(13.50);
	     daysOfWeeksFour.setTimeIn0Saturday(8.50);
	     daysOfWeeksFour.setTimeOut0Sunday(20.25);
	     daysOfWeeksFour.setTimeIn0Sunday(13.50);
	     daysOfWeeksFour.setTimeOut0Monday(14.00);
	     daysOfWeeksFour.setTimeIn0Monday(6.00);
	     daysOfWeeksFour.setTimeIn0Wednesday(13.50);
	     daysOfWeeksFour.setTimeOut0Wednesday(21.25);
	     daysOfWeeksFour.setTimeOut0Thursday(12.00);
	     daysOfWeeksFour.setTimeIn0Thursday(6.00);
	     daysOfWeeksFour.setTimeOut0Friday(12.50);
	     daysOfWeeksFour.setTimeIn0Friday(6.00);
	     
	     daysOfWeeksFive.setTimeOut0Saturday(12.00);
	     daysOfWeeksFive.setTimeIn0Saturday(6.25);
	     daysOfWeeksFive.setTimeOut0Monday(14.00);
	     daysOfWeeksFive.setTimeIn0Monday(6.00);
	     daysOfWeeksFive.setTimeOut0Wednesday(21.25);
	     daysOfWeeksFive.setTimeIn0Wednesday(14.00);
	     daysOfWeeksFive.setTimeOut0Thursday(12.00);
	     daysOfWeeksFive.setTimeIn0Thursday(6.00);
	     daysOfWeeksFive.setTimeOut0Friday(12.50);
	     daysOfWeeksFive.setTimeIn0Friday(6.00);
	     
	     daysOfWeeksSix.setTimeOut0Saturday(13.00);
	     daysOfWeeksSix.setTimeIn0Saturday(8.50);
	     daysOfWeeksSix.setTimeOut0Sunday(9.50);
	     daysOfWeeksSix.setTimeIn0Sunday(7.00);
	     daysOfWeeksSix.setTimeOut0Monday(14.00);
	     daysOfWeeksSix.setTimeIn0Monday(6.00);
	     daysOfWeeksSix.setTimeOut0Wednesday(21.25);
	     daysOfWeeksSix.setTimeIn0Wednesday(14.00);
	     daysOfWeeksSix.setTimeOut0Thursday(14.00);
	     daysOfWeeksSix.setTimeIn0Thursday(6.00);
	     daysOfWeeksSix.setTimeOut0Friday(12.50);
	     daysOfWeeksSix.setTimeIn0Friday(6.00);
	     
	     
	     daysOfWeekSeven.setTimeOut0Saturday(13.00);
	     daysOfWeekSeven.setTimeIn0Saturday(8.50);
	     daysOfWeekSeven.setTimeOut0Monday(14.00);
	     daysOfWeekSeven.setTimeIn0Monday(6.00);
	     daysOfWeekSeven.setTimeOut0Wednesday(21.25);
	     daysOfWeekSeven.setTimeIn0Wednesday(14.00);
	     daysOfWeekSeven.setTimeOut0Thursday(14.00);
	     daysOfWeekSeven.setTimeIn0Thursday(6.00);
	     daysOfWeekSeven.setTimeOut0Friday(12.5);
	     daysOfWeekSeven.setTimeIn0Friday(6.00);

	     daysOfWeeksEight.setTimeOut0Saturday(18.25);
	     daysOfWeeksEight.setTimeIn0Saturday(13.00);
	     daysOfWeeksEight.setTimeOut0Sunday(20.25);
	     daysOfWeeksEight.setTimeIn0Sunday(13.00);
	     daysOfWeeksEight.setTimeIn1Sunday(7.00);
	     daysOfWeeksEight.setTimeOut1Sunday(9.00);
	     
	     
	     
	     daysOfWeeksNine.setTimeIn0Saturday(13.00);
	     daysOfWeeksNine.setTimeOut0Saturday(18.25);
	     daysOfWeeksNine.setTimeOut0Sunday(20.25);
	     daysOfWeeksNine.setTimeIn0Sunday(13.00);
	     daysOfWeeksNine.setTimeOut0Monday(14.00);
	     daysOfWeeksNine.setTimeIn0Monday(6.00);
	     daysOfWeeksNine.setTimeOut0Wednesday(21.25);
	     daysOfWeeksNine.setTimeIn0Wednesday(14.00);
	   
	     
	     daysOfWeeksTen.setTimeOut0Saturday(18.25);
	     daysOfWeeksTen.setTimeIn0Saturday(8.50);
	     daysOfWeeksTen.setTimeOut0Sunday(20.25);
	     daysOfWeeksTen.setTimeIn0Sunday(13.00);
	     daysOfWeeksTen.setTimeOut0Monday(21.25);
	     daysOfWeeksTen.setTimeIn0Monday(16.00);
	     daysOfWeeksTen.setTimeOut0Thursday(21.25);
	     daysOfWeeksTen.setTimeIn0Thursday(16.00);
	     daysOfWeeksTen.setTimeOut0Friday(21.00);
	     daysOfWeeksTen.setTimeIn0Friday(19.00);
	     
	     
	     
	     daysOfWeeksEleven.setTimeOut0Saturday(18.25);
	     daysOfWeeksEleven.setTimeIn0Saturday(13.00);
	     daysOfWeeksEleven.setTimeOut0Sunday(21.50);
	     daysOfWeeksEleven.setTimeIn0Sunday(13.00);
	     daysOfWeeksEleven.setTimeOut0Monday(21.25);
	     daysOfWeeksEleven.setTimeIn0Monday(16.00);
	    
	     daysOfWeeksTwelve.setTimeOut0Monday(21.25);
	     daysOfWeeksTwelve.setTimeIn0Monday(16.00);
	     daysOfWeeksTwelve.setTimeOut0Thursday(14.00);
	     daysOfWeeksTwelve.setTimeIn0Thursday(6.00);
	     daysOfWeeksTwelve.setTimeOut0Friday(12.50);
	     daysOfWeeksTwelve.setTimeIn0Friday(6.00);
	     daysOfWeeksTwelve.setTimeOut1Friday(21.00);
	     daysOfWeeksTwelve.setTimeIn1Friday(19.00);
	     
	     daysOfWeeksThriteen.setTimeOut0Saturday(18.25);
	     daysOfWeeksThriteen.setTimeIn0Saturday(13.00);
	     daysOfWeeksThriteen.setTimeOut0Monday(21.25);
	     daysOfWeeksThriteen.setTimeIn0Monday(12.00);
	     daysOfWeeksThriteen.setTimeOut0Thursday(14.00);
	     daysOfWeeksThriteen.setTimeIn0Thursday(6.00);
	     daysOfWeeksThriteen.setTimeOut0Friday(12.00);
	     daysOfWeeksThriteen.setTimeIn0Friday(6.00);
	     daysOfWeeksThriteen.setTimeOut1Friday(21.00);
	     daysOfWeeksThriteen.setTimeIn1Friday(19.00);
	     
	     
	     
	     
	     
	     DailyCalculation datesOfWeekOne = new DailyCalculation();
	     DailyCalculation datesOfWeekTwo = new DailyCalculation();
	     DailyCalculation datesOfWeekThree = new DailyCalculation();
		 DailyCalculation datesOfWeekFour = new DailyCalculation();
		 DailyCalculation datesOfWeekFive = new DailyCalculation();
		 DailyCalculation datesOfWeekSix = new DailyCalculation();
		 DailyCalculation datesOfWeekSeven = new DailyCalculation();
		 DailyCalculation datesOfWeekEight = new DailyCalculation();
		 DailyCalculation datesOfWeekNine = new DailyCalculation();
		 DailyCalculation datesofWeekTen = new DailyCalculation();
		 DailyCalculation datesOfWeekEleven = new DailyCalculation();
		 DailyCalculation datesOfWeekTwelve = new DailyCalculation();
		 DailyCalculation datesOFweekthriteen = new DailyCalculation();
		 DailyCalculation datesOfWeekforteenth = new DailyCalculation();
		 DailyCalculation datesOfWeekFifteenth = new DailyCalculation();
		 DailyCalculation datesOFweekSixteenth = new DailyCalculation();
		 DailyCalculation datesOfWeekseventeenth = new DailyCalculation();
		 DailyCalculation datesOfWeekEighteenth = new DailyCalculation();
		 DailyCalculation datesOfWeekNinteenth = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentith = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentyFirst = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentySecond = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentyThird = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentyFourth = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentyFifith = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentySeventh = new DailyCalculation();
		 DailyCalculation datesOfWeekTwentyEigth = new DailyCalculation();
		 DailyCalculation datesOfWeekThirtieth = new DailyCalculation();
		 DailyCalculation datesOFthrityFirst = new DailyCalculation();
		 DailyCalculation datesOfWeekThritySecond = new DailyCalculation();
		 DailyCalculation  datesOfWeekThirtyThird = new DailyCalculation();
		 DailyCalculation datesOfWeekThirtySixth = new DailyCalculation();

		 
	     datesOfWeekOne.setSaturdayTotal(datesOfWeekOne.hourlyConvertedIntoDaily(daysOfWeeksOne.getTimeIn0Saturday(), daysOfWeeksOne.getTimeOut0Saturday()));
	     datesOfWeekOne.setSundayTotal(datesOfWeekOne.hourlyConvertedIntoDaily(daysOfWeeksOne.getTimeIn0Sunday(), daysOfWeeksOne.getTimeOut0Sunday(),daysOfWeeksOne.getTimeIn1Sunday(), daysOfWeeksOne.getTimeOut1Sunday()));
	     datesOfWeekOne.setMondayTotal(datesOfWeekOne.hourlyConvertedIntoDaily(daysOfWeeksOne.getTimeIn0Monday(), daysOfWeeksOne.getTimeOut0Monday()));
	     datesOfWeekOne.setThursdayTotal(datesOfWeekOne.hourlyConvertedIntoDaily(daysOfWeeksOne.getTimeIn0Thursday(),daysOfWeeksOne.getTimeOut0Thursday()));
	     
	     
	     datesOfWeekTwo.setSundayTotal(datesOfWeekTwo.hourlyConvertedIntoDaily(daysOfWeeksTwo.getTimeIn0Sunday(), daysOfWeeksTwo.getTimeOut0Sunday(), daysOfWeeksTwo.getTimeIn1Sunday(), daysOfWeeksTwo.getTimeOut1Sunday()));
	     datesOfWeekTwo.setMondayTotal(datesOfWeekTwo.hourlyConvertedIntoDaily(daysOfWeeksTwo.getTimeIn0Monday(), daysOfWeeksTwo.getTimeOut0Monday()));
	     datesOfWeekTwo.setThursdayTotal(datesOfWeekTwo.hourlyConvertedIntoDaily(daysOfWeeksTwo.getTimeIn0Thursday(),daysOfWeeksTwo.getTimeOut0Thursday()));
	     datesOfWeekTwo.setFridayTotal(datesOfWeekTwo.hourlyConvertedIntoDaily(daysOfWeeksTwo.getTimeIn0Friday(), daysOfWeeksTwo.getTimeOut0Friday()));
	     
	     datesOfWeekThree.setSaturdayTotal(datesOfWeekThree.hourlyConvertedIntoDaily(daysOfWeeksThree.getTimeIn0Saturday(), daysOfWeeksThree.getTimeOut0Saturday(),daysOfWeeksThree.getTimein1Saturday(), daysOfWeeksThree.getTimeOut1Saturday()));
	     datesOfWeekThree.setSundayTotal(datesOfWeekThree.hourlyConvertedIntoDaily(daysOfWeeksThree.getTimeIn0Sunday(),daysOfWeeksThree.getTimeOut0Sunday(),daysOfWeeksThree.getTimeIn1Sunday(),daysOfWeeksThree.getTimeOut1Sunday()));
	     datesOfWeekThree.setMondayTotal(datesOfWeekThree.hourlyConvertedIntoDaily(daysOfWeeksThree.getTimeIn0Monday(),daysOfWeeksThree.getTimeOut0Monday()));
	     datesOfWeekThree.setThursdayTotal(datesOfWeekThree.hourlyConvertedIntoDaily(daysOfWeeksThree.getTimeIn0Thursday(),daysOfWeeksThree.getTimeOut0Thursday()));
	     datesOfWeekThree.setFridayTotal(datesOfWeekThree.hourlyConvertedIntoDaily(daysOfWeeksThree.getTimeIn0Friday(),daysOfWeeksThree.getTimeOut0Friday()));
	     
	     datesOfWeekFour.setSaturdayTotal(datesOfWeekFour.hourlyConvertedIntoDaily(daysOfWeeksFour.getTimeIn0Saturday(),daysOfWeeksFour.getTimeOut0Saturday()));
	     datesOfWeekFour.setSundayTotal(datesOfWeekFour.hourlyConvertedIntoDaily(daysOfWeeksFour.getTimeIn0Sunday(), daysOfWeeksFour.getTimeOut0Sunday()));
	     datesOfWeekFour.setMondayTotal(datesOfWeekFour.hourlyConvertedIntoDaily(daysOfWeeksFour.getTimeIn0Monday(), daysOfWeeksFour.getTimeOut0Monday()));
	     datesOfWeekFour.setWednesdayTotal(datesOfWeekFour.hourlyConvertedIntoDaily(daysOfWeeksFour.getTimeIn0Wednesday(), daysOfWeeksFour.getTimeOut0Wednesday()));
	     datesOfWeekFour.setThursdayTotal(datesOfWeekFour.hourlyConvertedIntoDaily(daysOfWeeksFour.getTimeIn0Thursday(), daysOfWeeksFour.getTimeOut0Thursday()));
	     datesOfWeekFour.setFridayTotal(datesOfWeekFour.hourlyConvertedIntoDaily(daysOfWeeksFour.getTimeIn0Friday(), daysOfWeeksFour.getTimeOut0Friday()));
	     
	     datesOfWeekFive.setSaturdayTotal(datesOfWeekFive.hourlyConvertedIntoDaily(daysOfWeeksFive.getTimeIn0Saturday(),daysOfWeeksFive.getTimeOut0Saturday()));
	     log.info("datesofweekFive Saturday= "+datesOfWeekFive.getSaturdayTotal());
	     datesOfWeekFive.setMondayTotal(datesOfWeekFive.hourlyConvertedIntoDaily(daysOfWeeksFive.getTimeIn0Monday(),daysOfWeeksFive.getTimeOut0Monday()));
	     datesOfWeekFive.setWednesdayTotal(datesOfWeekFive.hourlyConvertedIntoDaily(daysOfWeeksFive.getTimeIn0Wednesday(), daysOfWeeksFive.getTimeOut0Wednesday()));
	     datesOfWeekFive.setThursdayTotal(datesOfWeekFive.hourlyConvertedIntoDaily(daysOfWeeksFive.getTimeIn0Thursday(), daysOfWeeksFive.getTimeOut0Thursday()));
	     datesOfWeekFive.setFridayTotal(datesOfWeekFive.hourlyConvertedIntoDaily(daysOfWeeksFive.getTimeIn0Friday(), daysOfWeeksFive.getTimeOut0Friday()));
	     
	     datesOfWeekSix.setSaturdayTotal(datesOfWeekSix.hourlyConvertedIntoDaily(daysOfWeeksSix.getTimeIn0Saturday(), daysOfWeeksSix.getTimeOut0Saturday()));
	     datesOfWeekSix.setSundayTotal(datesOfWeekSix.hourlyConvertedIntoDaily(daysOfWeeksSix.getTimeIn0Sunday(), daysOfWeeksSix.getTimeOut0Sunday()));
	     datesOfWeekSix.setMondayTotal(datesOfWeekSix.hourlyConvertedIntoDaily(daysOfWeeksSix.getTimeIn0Monday(), daysOfWeeksSix.getTimeOut0Monday()));
	     datesOfWeekSix.setWednesdayTotal(datesOfWeekSix.hourlyConvertedIntoDaily(daysOfWeeksSix.getTimeIn0Wednesday(), daysOfWeeksSix.getTimeOut0Wednesday()));
	     datesOfWeekSix.setThursdayTotal(datesOfWeekSix.hourlyConvertedIntoDaily(daysOfWeeksSix.getTimeIn0Thursday(), daysOfWeeksSix.getTimeOut0Thursday()));
	     datesOfWeekSix.setFridayTotal(datesOfWeekSix.hourlyConvertedIntoDaily(daysOfWeeksSix.getTimeIn0Friday(), daysOfWeeksSix.getTimeOut0Friday()));
	     
	     datesOfWeekSeven.setSaturdayTotal(datesOfWeekSeven.hourlyConvertedIntoDaily(daysOfWeekSeven.getTimeIn0Saturday(), daysOfWeekSeven.getTimeOut0Saturday()));
	     datesOfWeekSeven.setMondayTotal(datesOfWeekSeven.hourlyConvertedIntoDaily(daysOfWeekSeven.getTimeIn0Monday(), daysOfWeekSeven.getTimeOut0Monday()));
	     datesOfWeekSeven.setWednesdayTotal(datesOfWeekSeven.hourlyConvertedIntoDaily(daysOfWeekSeven.getTimeIn0Wednesday(), daysOfWeekSeven.getTimeOut0Wednesday()));
	     datesOfWeekSeven.setThursdayTotal(datesOfWeekSeven.hourlyConvertedIntoDaily(daysOfWeekSeven.getTimeIn0Thursday(), daysOfWeekSeven.getTimeOut0Thursday()));
	     datesOfWeekSeven.setFridayTotal(datesOfWeekSeven.hourlyConvertedIntoDaily(daysOfWeekSeven.getTimeIn0Friday(), daysOfWeekSeven.getTimeOut0Friday()));
	
	     
	     datesOfWeekEight.setSaturdayTotal(datesOfWeekEight.hourlyConvertedIntoDaily(daysOfWeeksEight.getTimeIn0Saturday(), daysOfWeeksEight.getTimeOut0Saturday()));
	     datesOfWeekEight.setSundayTotal(datesOfWeekEight.hourlyConvertedIntoDaily(daysOfWeeksEight.getTimeIn0Sunday(), daysOfWeeksEight.getTimeOut0Sunday(), daysOfWeeksEight.getTimeIn1Sunday(), daysOfWeeksEight.getTimeOut1Sunday()));
	     
	     datesOfWeekNine.setSaturdayTotal(datesOfWeekNine.hourlyConvertedIntoDaily(daysOfWeeksNine.getTimeIn0Saturday(), daysOfWeeksNine.getTimeOut0Saturday()));
	     datesOfWeekNine.setSundayTotal(datesOfWeekNine.hourlyConvertedIntoDaily(daysOfWeeksNine.getTimeIn0Sunday(), daysOfWeeksNine.getTimeOut0Sunday(),daysOfWeeksNine.getTimeIn1Sunday(),daysOfWeeksNine.getTimeOut1Sunday()));
	     datesOfWeekNine.setMondayTotal(datesOfWeekNine.hourlyConvertedIntoDaily(daysOfWeeksNine.getTimeIn0Monday(), daysOfWeeksNine.getTimeOut0Monday()));
	     datesOfWeekNine.setWednesdayTotal(datesOfWeekNine.hourlyConvertedIntoDaily(daysOfWeeksNine.getTimeIn0Wednesday(), daysOfWeeksNine.getTimeOut0Wednesday()));
	     
	     datesofWeekTen.setSaturdayTotal(datesofWeekTen.hourlyConvertedIntoDaily(daysOfWeeksTen.getTimeIn0Saturday(), daysOfWeeksTen.getTimeOut0Saturday()));
	     datesofWeekTen.setSundayTotal(datesofWeekTen.hourlyConvertedIntoDaily(daysOfWeeksTen.getTimeIn0Sunday(), daysOfWeeksTen.getTimeOut0Sunday()));
	     datesofWeekTen.setMondayTotal(datesofWeekTen.hourlyConvertedIntoDaily(daysOfWeeksTen.getTimeIn0Monday(),daysOfWeeksTen.getTimeOut0Monday()));
	     datesofWeekTen.setThursdayTotal(datesofWeekTen.hourlyConvertedIntoDaily(daysOfWeeksTen.getTimeIn0Thursday(), daysOfWeeksTen.getTimeOut0Thursday()));
	     datesofWeekTen.setFridayTotal(datesofWeekTen.hourlyConvertedIntoDaily(daysOfWeeksTen.getTimeIn0Friday(), daysOfWeeksTen.getTimeOut0Friday()));
	     
	     datesOfWeekEleven.setSaturdayTotal(datesOfWeekEleven.hourlyConvertedIntoDaily(daysOfWeeksEleven .getTimeIn0Saturday(),daysOfWeeksEleven.getTimeOut0Saturday()));
	     datesOfWeekEleven.setSundayTotal(datesOfWeekEleven.hourlyConvertedIntoDaily(daysOfWeeksEleven.getTimeIn0Sunday(), daysOfWeeksEleven.getTimeOut0Sunday()));
	     datesOfWeekEleven.setMondayTotal(datesOfWeekEleven.hourlyConvertedIntoDaily(daysOfWeeksEleven.getTimeIn0Monday(), daysOfWeeksEleven.getTimeOut0Monday()));
		 
	     datesOfWeekTwelve.setMondayTotal(datesOfWeekTwelve.hourlyConvertedIntoDaily(daysOfWeeksTwelve.getTimeIn0Monday(), daysOfWeeksTwelve.getTimeOut0Monday()));
	     datesOfWeekTwelve.setThursdayTotal(datesOfWeekTwelve.hourlyConvertedIntoDaily(daysOfWeeksTwelve.getTimeIn0Thursday(), daysOfWeeksTwelve.getTimeOut0Thursday()));
	     datesOfWeekTwelve.setFridayTotal(datesOfWeekTwelve.hourlyConvertedIntoDaily(daysOfWeeksTwelve.getTimeIn0Friday(), daysOfWeeksTwelve.getTimeOut0Friday(), daysOfWeeksTwelve.getTimeIn1Friday(), daysOfWeeksTwelve.getTimeOut1Friday()));
	     
		 datesOFweekthriteen.setSaturdayTotal(datesOFweekthriteen.hourlyConvertedIntoDaily(daysOfWeeksThriteen.getTimeIn0Saturday(), daysOfWeeksThriteen.getTimeOut0Saturday()));
		 datesOFweekthriteen.setMondayTotal(datesOFweekthriteen.hourlyConvertedIntoDaily(daysOfWeeksThriteen.getTimeIn0Monday(), daysOfWeeksThriteen.getTimeOut0Monday()));
		 datesOFweekthriteen.setThursdayTotal(datesOFweekthriteen.hourlyConvertedIntoDaily(daysOfWeeksThriteen.getTimeIn0Thursday(), daysOfWeeksThriteen.getTimeOut0Thursday()));
		 datesOFweekthriteen.setFridayTotal(datesOFweekthriteen.hourlyConvertedIntoDaily(daysOfWeeksThriteen.getTimeIn0Friday(), daysOfWeeksThriteen.getTimeOut0Friday(),daysOfWeeksThriteen.getTimeIn1Friday(),daysOfWeeksThriteen.getTimeOut1Friday()));
	     
		 
		 datesOfWeekforteenth.setSaturdayTotal(datesOfWeekforteenth.hourlyConvertedIntoDaily(daysOfWeeksForteenth.getTimeIn0Saturday(), daysOfWeeksForteenth.getTimeOut0Saturday()));
		 datesOfWeekforteenth.setSundayTotal(datesOfWeekforteenth.hourlyConvertedIntoDaily(daysOfWeeksForteenth.getTimeIn0Sunday(), daysOfWeeksForteenth.getTimeOut0Sunday()));
		 datesOfWeekforteenth.setMondayTotal(datesOfWeekforteenth.hourlyConvertedIntoDaily(daysOfWeeksForteenth.getTimeIn0Monday(), daysOfWeeksForteenth.getTimeOut0Monday()));
		 datesOfWeekforteenth.setTuesdayTotal(datesOfWeekforteenth.hourlyConvertedIntoDaily(daysOfWeeksForteenth.getTimeIn0Tuesady(), daysOfWeeksForteenth.getTimeOut0Tuesday()));
		 datesOfWeekforteenth.setWednesdayTotal(datesOfWeekforteenth.hourlyConvertedIntoDaily(daysOfWeeksForteenth.getTimeIn0Wednesday(), daysOfWeeksForteenth.getTimeOut0Wednesday()));
		 datesOfWeekforteenth.setThursdayTotal(datesOfWeekforteenth.hourlyConvertedIntoDaily(daysOfWeeksForteenth.getTimeIn0Thursday(), daysOfWeeksForteenth.getTimeOut0Thursday()));
		 datesOfWeekforteenth.setFridayTotal(datesOfWeekforteenth.hourlyConvertedIntoDaily(daysOfWeeksForteenth.getTimeIn0Friday(), daysOfWeeksForteenth.getTimeOut0Friday(), daysOfWeeksForteenth.getTimeIn1Friday(), daysOfWeeksForteenth.getTimeOut0Friday()));
		 
		 datesOfWeekFifteenth.setMondayTotal(datesOfWeekFifteenth.hourlyConvertedIntoDaily(daysOfWeeksFifteenth.getTimeIn0Monday(), daysOfWeeksFifteenth.getTimeOut0Monday()));
		 datesOfWeekFifteenth.setWednesdayTotal(datesOfWeekFifteenth.hourlyConvertedIntoDaily(daysOfWeeksFifteenth.getTimeIn0Wednesday(), daysOfWeeksFifteenth.getTimeOut0Wednesday()));
		 datesOfWeekFifteenth.setThursdayTotal(datesOfWeekFifteenth.hourlyConvertedIntoDaily(daysOfWeeksFifteenth.getTimeIn0Thursday(), daysOfWeeksFifteenth.getTimeOut0Thursday()));
		 datesOfWeekFifteenth.setFridayTotal(datesOfWeekFifteenth.hourlyConvertedIntoDaily(daysOfWeeksFifteenth.getTimeIn0Friday(), daysOfWeeksFifteenth.getTimeOut0Friday())); 
		 
	     datesOFweekSixteenth.setSundayTotal(datesOFweekSixteenth.hourlyConvertedIntoDaily(daysOfWeeksSixteenth.getTimeIn0Sunday(), daysOfWeeksSixteenth.getTimeOut0Sunday()));
	     datesOFweekSixteenth.setMondayTotal(datesOFweekSixteenth.hourlyConvertedIntoDaily(daysOfWeeksSixteenth.getTimeIn0Monday(), daysOfWeeksSixteenth.getTimeOut0Monday(), daysOfWeeksSixteenth.getTimeIn1Monday(), daysOfWeeksSixteenth.getTimeOut1Monday()));
	     datesOFweekSixteenth.setWednesdayTotal(datesOFweekSixteenth.hourlyConvertedIntoDaily(daysOfWeeksSixteenth.getTimeIn0Wednesday(), daysOfWeeksSixteenth.getTimeOut0Wednesday()));
	     datesOFweekSixteenth.setFridayTotal(datesOFweekSixteenth.hourlyConvertedIntoDaily(daysOfWeeksSixteenth.getTimeIn0Friday(), daysOfWeeksSixteenth.getTimeOut0Friday()));
		 
	     datesOfWeekseventeenth.setSundayTotal(datesOfWeekseventeenth.hourlyConvertedIntoDaily(daysOfWeekSeventeenth.getTimeIn0Sunday(), daysOfWeekSeventeenth.getTimeOut0Sunday()));
	     datesOfWeekseventeenth.setMondayTotal(datesOfWeekseventeenth.hourlyConvertedIntoDaily(daysOfWeekSeventeenth.getTimeIn0Monday(), daysOfWeekSeventeenth.getTimeOut0Monday(), daysOfWeekSeventeenth.getTimeIn1Monday(),daysOfWeekSeventeenth.getTimeOut1Monday()));
	     datesOfWeekseventeenth.setWednesdayTotal(datesOfWeekseventeenth.hourlyConvertedIntoDaily(daysOfWeekSeventeenth.getTimeIn0Wednesday(), daysOfWeekSeventeenth.getTimeOut0Wednesday()));
	     datesOfWeekseventeenth.setThursdayTotal(datesOfWeekseventeenth.hourlyConvertedIntoDaily(daysOfWeekSeventeenth.getTimeIn0Thursday(), daysOfWeekSeventeenth.getTimeOut0Thursday()));
	     datesOfWeekseventeenth.setFridayTotal(datesOfWeekseventeenth.hourlyConvertedIntoDaily(daysOfWeekSeventeenth.getTimeIn0Friday(), daysOfWeekSeventeenth.getTimeOut0Friday()));
		
		 
	     datesOfWeekEighteenth.setSundayTotal(datesOfWeekEighteenth.hourlyConvertedIntoDaily(daysOfWeekEightteenth.getTimeIn0Sunday(), daysOfWeekEightteenth.getTimeOut0Sunday()));
	     datesOfWeekEighteenth.setMondayTotal(datesOfWeekEighteenth.hourlyConvertedIntoDaily(daysOfWeekEightteenth.getTimeIn0Monday(), daysOfWeekEightteenth.getTimeOut0Monday()));
	     datesOfWeekEighteenth.setTuesdayTotal(datesOfWeekEighteenth.hourlyConvertedIntoDaily(daysOfWeekEightteenth.getTimeIn0Tuesady(), daysOfWeekEightteenth.getTimeOut0Tuesday()));
	     datesOfWeekEighteenth.setWednesdayTotal(datesOfWeekEighteenth.hourlyConvertedIntoDaily(daysOfWeekEightteenth.getTimeIn0Wednesday(), daysOfWeekEightteenth.getTimeOut0Wednesday()));
	     datesOfWeekEighteenth.setFridayTotal(datesOfWeekEighteenth.hourlyConvertedIntoDaily(daysOfWeekEightteenth.getTimeIn0Friday(), daysOfWeekEightteenth.getTimeOut0Friday()));
		 
	     datesOfWeekNinteenth.setFridayTotal(datesOfWeekNinteenth.hourlyConvertedIntoDaily(daysOfWeeksNinteenth.getTimeIn0Friday(), daysOfWeeksNinteenth.getTimeOut0Friday()));
	     datesOfWeekNinteenth.setWednesdayTotal(datesOfWeekNinteenth.hourlyConvertedIntoDaily(daysOfWeeksNinteenth.getTimeIn0Wednesday(), daysOfWeeksNinteenth.getTimeOut0Wednesday()));
	     datesOfWeekNinteenth.setTuesdayTotal(datesOfWeekNinteenth.hourlyConvertedIntoDaily(daysOfWeeksNinteenth.getTimeIn0Tuesady(), daysOfWeeksNinteenth.getTimeOut0Tuesday()));
	     datesOfWeekNinteenth.setMondayTotal(datesOfWeekNinteenth.hourlyConvertedIntoDaily(daysOfWeeksNinteenth.getTimeIn0Monday(), daysOfWeeksNinteenth.getTimeOut0Monday()));
	     datesOfWeekNinteenth.setSundayTotal(datesOfWeekNinteenth.hourlyConvertedIntoDaily(daysOfWeeksNinteenth.getTimeIn0Sunday(), daysOfWeeksNinteenth.getTimeOut0Sunday()));
		 
	     datesOfWeekTwentith.setSaturdayTotal(datesOfWeekTwentith.hourlyConvertedIntoDaily(daysOfWeeksTwentyth.getTimeIn0Saturday(), daysOfWeeksTwentyth.getTimeOut0Saturday()));
	     datesOfWeekTwentith.setMondayTotal(datesOfWeekTwentith.hourlyConvertedIntoDaily(daysOfWeeksTwentyth.getTimeIn0Monday(), daysOfWeeksTwentyth.getTimeOut0Monday()));
	     datesOfWeekTwentith.setTuesdayTotal(datesOfWeekTwentith.hourlyConvertedIntoDaily(daysOfWeeksTwentyth.getTimeIn0Tuesady(), daysOfWeeksTwentyth.getTimeOut0Tuesday()));
	     datesOfWeekTwentith.setWednesdayTotal(datesOfWeekTwentith.hourlyConvertedIntoDaily(daysOfWeeksTwentyth.getTimeIn0Wednesday(), daysOfWeeksTwentyth.getTimeOut0Wednesday()));
	     datesOfWeekTwentith.setFridayTotal(datesOfWeekTwentith.hourlyConvertedIntoDaily(daysOfWeeksTwentyth.getTimeIn0Friday(), daysOfWeeksTwentyth.getTimeOut0Friday()));
		 
	     datesOfWeekTwentyFirst.setSaturdayTotal(datesOfWeekTwentyFirst.hourlyConvertedIntoDaily(daysofWeeksTwentyFrist.getTimeIn0Saturday(),daysofWeeksTwentyFrist.getTimeOut0Saturday()));
		 
	     datesOfWeekTwentySecond.setWednesdayTotal(datesOfWeekTwentySecond.hourlyConvertedIntoDaily(daysOfWeeksTwentySecond.getTimeIn0Wednesday(), daysOfWeeksTwentySecond.getTimeOut0Wednesday()));
	     datesOfWeekTwentySecond.setThursdayTotal(datesOfWeekTwentySecond.hourlyConvertedIntoDaily(daysOfWeeksTwentySecond.getTimeIn0Thursday(), daysOfWeeksTwentySecond.getTimeOut0Thursday()));
	     datesOfWeekTwentySecond.setFridayTotal(datesOfWeekTwentySecond.hourlyConvertedIntoDaily(daysOfWeeksTwentySecond.getTimeIn0Friday(), daysOfWeeksTwentySecond.getTimeOut0Friday()));
	     //datesOfWeekTwentySecond datesOfWeekTwentyThird datesOfWeekTwentyFourth
		 
	     datesOfWeekTwentyThird.setMondayTotal(datesOfWeekTwentyThird.hourlyConvertedIntoDaily(daysOfWeeksTwentythird.getTimeIn0Monday(), daysOfWeeksTwentythird.getTimeOut0Monday()));
	     datesOfWeekTwentyThird.setTuesdayTotal(datesOfWeekTwentyThird.hourlyConvertedIntoDaily(daysOfWeeksTwentythird.getTimeIn0Tuesady(), daysOfWeeksTwentythird.getTimeOut0Tuesday()));
	     datesOfWeekTwentyThird.setWednesdayTotal(datesOfWeekTwentyThird.hourlyConvertedIntoDaily(daysOfWeeksTwentythird.getTimeIn0Wednesday(), daysOfWeeksTwentythird.getTimeOut0Wednesday()));
	     datesOfWeekTwentyThird.setThursdayTotal(datesOfWeekTwentyThird.hourlyConvertedIntoDaily(daysOfWeeksTwentythird.getTimeIn0Thursday(), daysOfWeeksTwentythird.getTimeOut0Thursday()));
	     datesOfWeekTwentyThird.setFridayTotal(datesOfWeekTwentyThird.hourlyConvertedIntoDaily(daysOfWeeksTwentythird.getTimeIn0Friday(), daysOfWeeksTwentythird.getTimeOut0Friday()));
		 
		 
	     datesOfWeekTwentyFourth.setMondayTotal(datesOfWeekTwentyFourth.hourlyConvertedIntoDaily(daysOfWeeksTwentyFourth.getTimeIn0Monday(), daysOfWeeksTwentyFourth.getTimeOut0Monday()));
	     datesOfWeekTwentyFourth.setTuesdayTotal(datesOfWeekTwentyFourth.hourlyConvertedIntoDaily(daysOfWeeksTwentyFourth.getTimeIn0Tuesady(), daysOfWeeksTwentyFourth.getTimeOut0Tuesday()));
	     datesOfWeekTwentyFourth.setThursdayTotal(datesOfWeekTwentyFourth.hourlyConvertedIntoDaily(daysOfWeeksTwentyFourth.getTimeIn0Thursday(), daysOfWeeksTwentyFourth.getTimeOut0Thursday()));
	     datesOfWeekTwentyFourth.setFridayTotal(datesOfWeekTwentyFourth.hourlyConvertedIntoDaily(daysOfWeeksTwentyFourth.getTimeIn0Friday(), daysOfWeeksTwentyFourth.getTimeOut0Friday()));
		
	     datesOfWeekTwentyFifith.setSaturdayTotal(datesOfWeekTwentyFifith.hourlyConvertedIntoDaily(daysOfWeeksTwentyFifith.getTimeIn0Saturday(), daysOfWeeksTwentyFifith.getTimeOut0Saturday()));
	     datesOfWeekTwentyFifith.setSundayTotal(datesOfWeekTwentyFifith.hourlyConvertedIntoDaily(daysOfWeeksTwentyFifith.getTimeIn0Sunday(), daysOfWeeksTwentyFifith.getTimeOut0Sunday()));
	     datesOfWeekTwentyFifith.setThursdayTotal(datesOfWeekTwentyFifith.hourlyConvertedIntoDaily(daysOfWeeksTwentyFifith.getTimeIn0Thursday(), daysOfWeeksTwentyFifith.getTimeOut0Thursday()));
		 
		 datesOfWeekTwentySeventh.setFridayTotal(datesOfWeekTwentySeventh.hourlyConvertedIntoDaily(dayOfWeeksTwentySeventh.getTimeIn0Friday(), dayOfWeeksTwentySeventh.getTimeOut0Friday()));
		
		 datesOfWeekTwentyEigth.setMondayTotal(datesOfWeekTwentyEigth.hourlyConvertedIntoDaily(daysOfWeeksTwentyEighth.getTimeIn0Monday(), daysOfWeeksTwentyEighth.getTimeOut0Monday()));
		 datesOfWeekTwentyEigth.setTuesdayTotal(datesOfWeekTwentyEigth.hourlyConvertedIntoDaily(daysOfWeeksTwentyEighth.getTimeIn0Tuesady(), daysOfWeeksTwentyEighth.getTimeOut0Tuesday()));
		 datesOfWeekTwentyEigth.setWednesdayTotal(datesOfWeekTwentyEigth.hourlyConvertedIntoDaily(daysOfWeeksTwentyEighth.getTimeIn0Wednesday(), daysOfWeeksTwentyEighth.getTimeOut0Wednesday()));
		 datesOfWeekTwentyEigth.setThursdayTotal(datesOfWeekTwentyEigth.hourlyConvertedIntoDaily(daysOfWeeksTwentyEighth.getTimeIn0Thursday(), daysOfWeeksTwentyEighth.getTimeOut0Thursday()));
		
		 datesOfWeekThirtieth.setSaturdayTotal(datesOfWeekThirtieth.hourlyConvertedIntoDaily(daysOfWeeksThirtieth.getTimeIn0Saturday(), daysOfWeeksThirtieth.getTimeOut0Saturday()));
		 	
	     datesOFthrityFirst.setMondayTotal(datesOFthrityFirst.hourlyConvertedIntoDaily(daysOfWeeksThirtFrist.getTimeIn0Monday(), daysOfWeeksThirtFrist.getTimeOut0Monday()));
	     datesOFthrityFirst.setThursdayTotal(datesOFthrityFirst.hourlyConvertedIntoDaily(daysOfWeeksThirtFrist.getTimeIn0Thursday(), daysOfWeeksThirtFrist.getTimeOut0Thursday()));
	     
	     
	     datesOfWeekThritySecond.setSaturdayTotal(datesOfWeekThritySecond.hourlyConvertedIntoDaily(daysOfWeeksThritySecond.getTimeIn0Saturday(), daysOfWeeksThritySecond.getTimeOut0Saturday()));
		 datesOfWeekThritySecond.setThursdayTotal(datesOfWeekThritySecond.hourlyConvertedIntoDaily(daysOfWeeksThritySecond.getTimeIn0Thursday(), daysOfWeeksThritySecond.getTimeOut0Thursday()));
		 datesOfWeekThritySecond.setFridayTotal(datesOfWeekThritySecond.hourlyConvertedIntoDaily(daysOfWeeksThritySecond.getTimeIn0Friday(), daysOfWeeksThritySecond.getTimeOut0Friday(), daysOfWeeksThritySecond.getTimeIn1Friday(), daysOfWeeksThritySecond.getTimeOut1Friday()));
		
		  
		 
		 
		 datesOfWeekThirtyThird.setSaturdayTotal(datesOfWeekThirtyThird.hourlyConvertedIntoDaily(daysOfWeekThritythird.getTimeIn0Saturday(), daysOfWeekThritythird.getTimeOut0Saturday()));
		 datesOfWeekThirtyThird.setSundayTotal(datesOfWeekThirtyThird.hourlyConvertedIntoDaily(daysOfWeekThritythird.getTimeIn0Sunday(), daysOfWeekThritythird.getTimeOut0Sunday()));
		 datesOfWeekThirtyThird.setMondayTotal(datesOfWeekThirtyThird.hourlyConvertedIntoDaily(daysOfWeekThritythird.getTimeIn0Monday(), daysOfWeekThritythird.getTimeOut0Monday()));
		 datesOfWeekThirtyThird.setTuesdayTotal(datesOfWeekThirtyThird.hourlyConvertedIntoDaily(daysOfWeekThritythird.getTimeIn0Tuesady(), daysOfWeekThritythird.getTimeOut0Tuesday()));
		 datesOfWeekThirtyThird.setWednesdayTotal(datesOfWeekThirtyThird.hourlyConvertedIntoDaily(daysOfWeekThritythird.getTimeIn0Wednesday(), daysOfWeekThritythird.getTimeOut0Wednesday()));
		 
		 
		 
		 
		 datesOfWeekThirtySixth.setSaturdayTotal(datesOfWeekThirtySixth.hourlyConvertedIntoDaily(daysOfWeekThirtySixth.getTimeIn0Saturday(), daysOfWeekThirtySixth.getTimeOut0Saturday()));
		 datesOfWeekThirtySixth.setSundayTotal(datesOfWeekThirtySixth.hourlyConvertedIntoDaily(daysOfWeekThirtySixth.getTimeIn0Sunday(), daysOfWeekThirtySixth.getTimeOut0Sunday()));
		 datesOfWeekThirtySixth.setWednesdayTotal(datesOfWeekThirtySixth.hourlyConvertedIntoDaily(daysOfWeekThirtySixth.getTimeIn0Wednesday(), daysOfWeekThirtySixth.getTimeOut0Wednesday()));
		 datesOfWeekThirtySixth.setThursdayTotal(datesOfWeekThirtySixth.hourlyConvertedIntoDaily(daysOfWeekThirtySixth.getTimeIn0Thursday(), daysOfWeekThirtySixth.getTimeOut0Thursday()));
		 datesOfWeekThirtySixth.setFridayTotal(datesOfWeekThirtySixth.hourlyConvertedIntoDaily(daysOfWeekThirtySixth.getTimeIn0Friday(), daysOfWeekThirtySixth.getTimeOut0Friday()));
		
		 
	     //Constructors with parameters
	     WeeklyCalculations weekOne = new WeeklyCalculations(datesOfWeekOne.getSaturdayTotal(),datesOfWeekOne.getSundayTotal(),datesOfWeekOne.getMondayTotal(),datesOfWeekOne.getThursdayTotal());
	     WeeklyCalculations weekTwo = new WeeklyCalculations(datesOfWeekTwo.getSundayTotal(), datesOfWeekTwo.getMondayTotal(), datesOfWeekTwo.getThursdayTotal(),datesOfWeekTwo.getFridayTotal());
	     WeeklyCalculations weekThree = new WeeklyCalculations(datesOfWeekThree.getSaturdayTotal(),datesOfWeekThree.getDailyTotal() ,datesOfWeekThree.getMondayTotal(),datesOfWeekThree.getThursdayTotal(),datesOfWeekThree.getFridayTotal());
	     WeeklyCalculations weekFour = new WeeklyCalculations(datesOfWeekFour.getSaturdayTotal(), datesOfWeekFour.getSundayTotal(),datesOfWeekFour.getMondayTotal(),datesOfWeekFour.getWednesdayTotal(),datesOfWeekFour.getThursdayTotal(),datesOfWeekFour.getFridayTotal());
	     WeeklyCalculations weekFive = new WeeklyCalculations(datesOfWeekFive.getSaturdayTotal(), datesOfWeekFive.getMondayTotal(), datesOfWeekFive.getWednesdayTotal(), datesOfWeekFive.getThursdayTotal(), datesOfWeekFive.getFridayTotal());
	     WeeklyCalculations weekSix = new WeeklyCalculations(datesOfWeekSix.getSaturdayTotal(),datesOfWeekSix.getSundayTotal(),datesOfWeekSix.getMondayTotal(),datesOfWeekSix.getWednesdayTotal(),datesOfWeekSix.getThursdayTotal(),datesOfWeekSix.getFridayTotal());
	     WeeklyCalculations weekSeven = new WeeklyCalculations(datesOfWeekSeven.getSaturdayTotal(),datesOfWeekSeven.getMondayTotal(),datesOfWeekSeven.getWednesdayTotal(),datesOfWeekSeven.getThursdayTotal(),datesOfWeekSeven.getFridayTotal());
	     WeeklyCalculations weekEight = new WeeklyCalculations(datesOfWeekEight.getSaturdayTotal(),datesOfWeekEight.getSundayTotal());
	     WeeklyCalculations weekNine = new WeeklyCalculations(datesOfWeekNine.getSaturdayTotal(),datesOfWeekNine.getSundayTotal(),datesOfWeekNine.getMondayTotal(),datesOfWeekNine.getWednesdayTotal());
	     WeeklyCalculations weekTen = new WeeklyCalculations(datesofWeekTen.getSaturdayTotal(),datesofWeekTen.getSundayTotal(),datesofWeekTen.getMondayTotal(), datesofWeekTen.getThursdayTotal(),datesofWeekTen.getFridayTotal());
	     WeeklyCalculations weekEleven = new WeeklyCalculations(datesOfWeekEleven.getSaturdayTotal(),datesOfWeekEleven.getSundayTotal(),datesOfWeekEleven.getMondayTotal());
	     WeeklyCalculations weekTwelve= new WeeklyCalculations(datesOfWeekTwelve.getMondayTotal(), datesOfWeekTwelve.getThursdayTotal(), datesOfWeekTwelve.getFridayTotal());
		 WeeklyCalculations weekThriteen = new WeeklyCalculations(datesOFweekthriteen.getSaturdayTotal(),datesOFweekthriteen.getMondayTotal(),datesOFweekthriteen.getThursdayTotal(),datesOFweekthriteen.getFridayTotal());
	     WeeklyCalculations weekForteenth = new WeeklyCalculations(datesOfWeekforteenth.getSaturdayTotal(),datesOfWeekforteenth.getSundayTotal(),datesOfWeekforteenth.getMondayTotal(),datesOfWeekforteenth.getTuesdayTotal(),datesOfWeekforteenth.getWednesdayTotal(),datesOfWeekforteenth.getThursdayTotal(),datesOfWeekforteenth.getFridayTotal());
	     WeeklyCalculations weekFifteenth = new WeeklyCalculations(datesOfWeekFifteenth.getMondayTotal(),datesOfWeekFifteenth.getWednesdayTotal(),datesOfWeekFifteenth.getThursdayTotal(),datesOfWeekFifteenth.getFridayTotal());
	     WeeklyCalculations weekSixteenth= new WeeklyCalculations(datesOFweekSixteenth.getSundayTotal(),datesOFweekSixteenth.getMondayTotal(),datesOFweekSixteenth.getWednesdayTotal(),datesOFweekSixteenth.getFridayTotal());
	     WeeklyCalculations weekSeventeenth = new WeeklyCalculations(datesOfWeekseventeenth.getSundayTotal(), datesOfWeekseventeenth.getMondayTotal(), datesOfWeekseventeenth.getWednesdayTotal(), datesOfWeekseventeenth.getThursdayTotal(), datesOfWeekseventeenth.getFridayTotal());
	     WeeklyCalculations weekEightteenth = new WeeklyCalculations(datesOfWeekEighteenth.getSundayTotal(),datesOfWeekEighteenth.getMondayTotal(),datesOfWeekEighteenth.getTuesdayTotal(),datesOfWeekEighteenth.getWednesdayTotal(),datesOfWeekEighteenth.getFridayTotal());
	     WeeklyCalculations weekNinteenth = new WeeklyCalculations(datesOfWeekNinteenth.getSundayTotal(), datesOfWeekNinteenth.getMondayTotal(), datesOfWeekNinteenth.getTuesdayTotal(), datesOfWeekNinteenth.getWednesdayTotal(), datesOfWeekNinteenth.getFridayTotal());
	     //datesOfWeekTwentyFirst datesOfWeekTwentith datesOfWeekTwentySecond datesOfWeekTwentyThird datesOfWeekTwentyFourth
	     WeeklyCalculations weekTwentyth = new WeeklyCalculations(datesOfWeekTwentith.getSaturdayTotal(),datesOfWeekTwentith.getMondayTotal(),datesOfWeekTwentith.getTuesdayTotal(),datesOfWeekTwentith.getWednesdayTotal(),datesOfWeekTwentith.getFridayTotal());
	     WeeklyCalculations weekTwentyFrist = new WeeklyCalculations(datesOfWeekTwentyFirst.getSaturdayTotal());
	     WeeklyCalculations weekTwentySecond = new WeeklyCalculations(datesOfWeekTwentySecond.getWednesdayTotal(), datesOfWeekTwentySecond.getThursdayTotal(), datesOfWeekTwentySecond.getFridayTotal());
	     WeeklyCalculations weekTwentyThird  = new WeeklyCalculations(datesOfWeekTwentyThird.getMondayTotal(), datesOfWeekTwentyThird.getTuesdayTotal(), datesOfWeekTwentyThird.getWednesdayTotal(), datesOfWeekTwentyThird.getThursdayTotal(), datesOfWeekTwentyThird.getFridayTotal());
	     WeeklyCalculations weekTwentyFourth = new WeeklyCalculations(datesOfWeekTwentyFourth.getMondayTotal(), datesOfWeekTwentyFourth.getTuesdayTotal(), datesOfWeekTwentyFourth.getThursdayTotal(),datesOfWeekTwentyFourth.getFridayTotal());
	     WeeklyCalculations weekTwentyFifith = new WeeklyCalculations(datesOfWeekTwentyFifith.getSaturdayTotal(), datesOfWeekTwentyFifith.getSundayTotal(), datesOfWeekTwentyFifith.getThursdayTotal());
	     WeeklyCalculations weekTwentySixth = new WeeklyCalculations();
	     WeeklyCalculations weekTwentySeventh= new WeeklyCalculations(datesOfWeekTwentySeventh.getFridayTotal());
	     WeeklyCalculations weekTwentyEighth = new WeeklyCalculations(datesOfWeekTwentyEigth.getMondayTotal(), datesOfWeekTwentyEigth.getTuesdayTotal(), datesOfWeekTwentyEigth.getWednesdayTotal(), datesOfWeekTwentyEigth.getThursdayTotal());
	     WeeklyCalculations weekTwentyNinth = new WeeklyCalculations();
	     WeeklyCalculations weekThirtieth = new WeeklyCalculations(datesOfWeekThirtieth.getSaturdayTotal());
	     WeeklyCalculations weekThrityFirst = new WeeklyCalculations(datesOFthrityFirst.getMondayTotal(),datesOFthrityFirst.getThursdayTotal());
	     WeeklyCalculations weekThritySecond = new WeeklyCalculations(datesOfWeekThritySecond.getSaturdayTotal(),datesOfWeekThritySecond.getThursdayTotal(),datesOfWeekThritySecond.getFridayTotal());
	     WeeklyCalculations weekThirtyThird = new WeeklyCalculations(datesOfWeekThirtyThird.getSaturdayTotal(),datesOfWeekThirtyThird.getSundayTotal(),datesOfWeekThirtyThird.getMondayTotal() , datesOfWeekThirtyThird.getTuesdayTotal(),datesOfWeekThirtyThird.getWednesdayTotal());
	     WeeklyCalculations weekThirtyFourth = new WeeklyCalculations();
	     WeeklyCalculations weekThirtyFifth = new WeeklyCalculations();
	     WeeklyCalculations weekThirtySixth = new WeeklyCalculations(datesOfWeekThirtySixth.getSaturdayTotal(), datesOfWeekThirtySixth.getSundayTotal(), datesOfWeekThirtySixth.getWednesdayTotal(), datesOfWeekThirtySixth.getThursdayTotal(), datesOfWeekThirtySixth.getFridayTotal());
	     WeeklyCalculations weekThirtySeventh = new WeeklyCalculations(datesOFweekThritySeventh.getSaturdayTotal(),datesOFweekThritySeventh.getSundayTotal(),datesOFweekThritySeventh.getMondayTotal(),datesOFweekThritySeventh.getWednesdayTotal(),datesOFweekThritySeventh.getThursdayTotal(),datesOFweekThritySeventh.getFridayTotal());
	     WeeklyCalculations weekThirtyEighth = new WeeklyCalculations(dateOfWeekThirtyEighth.getSaturdayTotal(), dateOfWeekThirtyEighth.getSundayTotal(), dateOfWeekThirtyEighth.getTuesdayTotal(), dateOfWeekThirtyEighth.getThursdayTotal(),dateOfWeekThirtyEighth.getFridayTotal());
	     
	     
	     
	     weekOne.setWeeklyTotalily(weekOne.convertHourlyTotalIntoWeeklyTotal(weekOne.getSaturdayTotal(),weekOne.getSundayTotal(),weekOne.getMondayTotal(),weekOne.getFridayTotal()));
	     weekTwo.setWeeklyTotalily(weekTwo.convertHourlyTotalIntoWeeklyTotal(weekTwo.getSaturdayTotal(),weekTwo.getSundayTotal(),weekTwo.getMondayTotal(),weekTwo.getFridayTotal()));
	     weekThree.setWeeklyTotalily(weekThree.convertHourlyTotalIntoWeeklyTotal(weekThree.getSaturdayTotal(),weekThree.getSundayTotal(),weekThree.getMondayTotal(),weekThree.getTuesdayTotal(),weekThree.getFridayTotal()));
	     weekFour.setWeeklyTotalily(weekFour.convertHourlyTotalIntoWeeklyTotal(weekFour.getSaturdayTotal(),weekFour.getSundayTotal(),weekFour.getMondayTotal(),weekFour.getTuesdayTotal(),weekFour.getFridayTotal()));
	     weekFive.setWeeklyTotalily(weekFive.convertHourlyTotalIntoWeeklyTotal(weekFive.getSaturdayTotal(),weekFive.getSundayTotal(),weekFive.getMondayTotal(),weekFive.getTuesdayTotal(),weekFive.getFridayTotal()));
	     weekSix.setWeeklyTotalily(weekSix.convertHourlyTotalIntoWeeklyTotal(weekSix.getSaturdayTotal(),weekSix.getSundayTotal(),weekSix.getMondayTotal(),weekSix.getTuesdayTotal(),weekSix.getThursdayTotal(),weekSix.getFridayTotal()));
	     weekSeven.setWeeklyTotalily(weekSeven.convertHourlyTotalIntoWeeklyTotal(weekSeven.getSaturdayTotal(),weekSeven.getSundayTotal(),weekSeven.getMondayTotal(),weekSeven.getTuesdayTotal(),weekSeven.getFridayTotal()));
	     weekEight.setWeeklyTotalily(weekEight.convertHourlyTotalIntoWeeklyTotal(weekEight.getSaturdayTotal(),weekEight.getSundayTotal()));
	     weekNine.setWeeklyTotalily(weekNine.convertHourlyTotalIntoWeeklyTotal(weekNine.getSaturdayTotal(),weekNine.getSundayTotal(),weekNine.getMondayTotal(),weekNine.getFridayTotal()));
	     weekTen.setWeeklyTotalily(weekTen.convertHourlyTotalIntoWeeklyTotal(weekTen.getSaturdayTotal(),weekTen.getSundayTotal(),weekTen.getMondayTotal(),weekTen.getThursdayTotal(),weekTen.getFridayTotal()));
	     weekEleven.setWeeklyTotalily(weekEleven.convertHourlyTotalIntoWeeklyTotal(weekEleven.getSaturdayTotal(),weekEleven.getSundayTotal(),weekEleven.getFridayTotal()));
	     weekTwelve.setWeeklyTotalily(weekTwelve.convertHourlyTotalIntoWeeklyTotal(weekTwelve.getSaturdayTotal(),weekTwelve.getSundayTotal(),weekTwelve.getFridayTotal()));
	     weekThriteen.setWeeklyTotalily(weekThriteen.convertHourlyTotalIntoWeeklyTotal(weekThriteen.getSaturdayTotal(),weekThriteen.getSundayTotal(),weekThriteen.getMondayTotal(),weekThriteen.getFridayTotal()));
	     weekForteenth.setWeeklyTotalily(weekForteenth.convertHourlyTotalIntoWeeklyTotal(weekForteenth.getSaturdayTotal(),weekForteenth.getSundayTotal(),weekForteenth.getMondayTotal(),weekForteenth.getTuesdayTotal(),weekForteenth.getWednesdayTotal(),weekForteenth.getThursdayTotal(),weekForteenth.getFridayTotal()));
	     weekFifteenth.setWeeklyTotalily(weekFifteenth.convertHourlyTotalIntoWeeklyTotal(weekFifteenth.getSaturdayTotal(),weekFifteenth.getSundayTotal(),weekFifteenth.getMondayTotal(),weekFifteenth.getFridayTotal()));
	     weekSixteenth.setWeeklyTotalily(weekSixteenth.convertHourlyTotalIntoWeeklyTotal(weekSixteenth.getSaturdayTotal(),weekSixteenth.getSundayTotal(),weekSixteenth.getMondayTotal(),weekSixteenth.getFridayTotal()));
	     weekSeventeenth.setWeeklyTotalily(weekSeventeenth.convertHourlyTotalIntoWeeklyTotal(weekSeventeenth.getSaturdayTotal(),weekSeventeenth.getSundayTotal(),weekSeventeenth.getMondayTotal(),weekSeventeenth.getTuesdayTotal(),weekSeventeenth.getFridayTotal()));
	     weekEightteenth.setWeeklyTotalily(weekEightteenth.convertHourlyTotalIntoWeeklyTotal(weekEightteenth.getSaturdayTotal(),weekEightteenth.getSundayTotal(),weekEightteenth.getMondayTotal(),weekEightteenth.getTuesdayTotal(),weekEightteenth.getFridayTotal()));
	     weekNinteenth.setWeeklyTotalily(weekNinteenth.convertHourlyTotalIntoWeeklyTotal(weekNinteenth.getSaturdayTotal(),weekNinteenth.getSundayTotal(),weekNinteenth.getMondayTotal(),weekNinteenth.getTuesdayTotal(),weekNinteenth.getFridayTotal()));
	     weekTwentyth.setWeeklyTotalily(weekTwentyth.convertHourlyTotalIntoWeeklyTotal(weekTwentyth.getSaturdayTotal(),weekTwentyth.getSundayTotal(),weekTwentyth.getMondayTotal(),weekTwentyth.getTuesdayTotal(),weekTwentyth.getFridayTotal()));
	     weekTwentyFrist.setWeeklyTotalily(weekTwentyFrist.getSaturdayTotal());
	     weekTwentySecond.setWeeklyTotalily( weekTwentySecond.convertHourlyTotalIntoWeeklyTotal(weekTwentySecond.getSaturdayTotal(),weekTwentySecond.getSundayTotal(),weekTwentySecond.getFridayTotal()));
	     weekTwentyThird.setWeeklyTotalily(weekTwentyThird.convertHourlyTotalIntoWeeklyTotal(weekTwentyThird.getSaturdayTotal(),weekTwentyThird.getSundayTotal(),weekTwentyThird.getMondayTotal(),weekTwentyThird.getTuesdayTotal(),weekTwentyThird.getFridayTotal()));
	     weekTwentyFourth.setWeeklyTotalily(weekTwentyFourth.convertHourlyTotalIntoWeeklyTotal(weekTwentyFourth.getSaturdayTotal(),weekTwentyFourth.getSundayTotal(),weekTwentyFourth.getMondayTotal(),weekTwentyFourth.getFridayTotal()));
	     weekTwentyFifith.setWeeklyTotalily(weekTwentyFifith.convertHourlyTotalIntoWeeklyTotal(weekTwentyFifith.getSaturdayTotal(),weekTwentyFifith.getSundayTotal(),weekTwentyFifith.getFridayTotal()));
	     weekTwentySixth.setWeeklyTotalily(weekTwentySixth.getSaturdayTotal());
	     weekTwentySeventh.setWeeklyTotalily(weekTwentySeventh.convertHourlyTotalIntoWeeklyTotal(weekTwentySeventh.getSaturdayTotal()));
	     weekTwentyEighth.setWeeklyTotalily(weekTwentyEighth.convertHourlyTotalIntoWeeklyTotal(weekTwentyEighth.getSaturdayTotal(),weekTwentyEighth.getSundayTotal(),weekTwentyEighth.getMondayTotal(),weekTwentyEighth.getFridayTotal()));
	     weekTwentyNinth.setWeeklyTotalily(weekTwentyNinth.getSaturdayTotal());
	     weekThirtieth.setWeeklyTotalily(weekThirtieth.getSaturdayTotal());
	     weekThrityFirst.setWeeklyTotalily(weekThrityFirst.convertHourlyTotalIntoWeeklyTotal(weekThrityFirst.getSaturdayTotal(),weekThrityFirst.getSundayTotal()));
	     weekThritySecond.setWeeklyTotalily(weekThritySecond.convertHourlyTotalIntoWeeklyTotal(weekThritySecond.getSaturdayTotal(),datesOfWeekThritySecond.getSundayTotal(),datesOfWeekThritySecond.getFridayTotal()));
	     weekThirtyThird.setWeeklyTotalily(weekThirtyThird.convertHourlyTotalIntoWeeklyTotal(weekThirtyThird.getSaturdayTotal(),weekThirtyThird.getSundayTotal(),weekThirtyThird.getMondayTotal(),weekThirtyThird.getTuesdayTotal(),weekThirtyThird.getFridayTotal()));
	     weekThirtyFourth.setWeeklyTotalily(weekThirtyFourth.getSaturdayTotal());
	     weekThirtyFifth.setWeeklyTotalily(weekThirtyFifth.getSaturdayTotal());
	     weekThirtySixth.setWeeklyTotalily(weekThirtySixth.convertHourlyTotalIntoWeeklyTotal(weekThirtySixth.getSaturdayTotal(),weekThirtySixth.getSundayTotal(),weekThirtySixth.getMondayTotal(),weekThirtySixth.getTuesdayTotal(),weekThirtySixth.getFridayTotal()));
	     weekThirtySeventh.setWeeklyTotalily(weekThirtySeventh.convertHourlyTotalIntoWeeklyTotal(weekThirtySeventh.getSaturdayTotal(),weekThirtySeventh.getSundayTotal(),weekThirtySeventh.getMondayTotal(),weekThirtySeventh.getTuesdayTotal(),weekThirtySeventh.getThursdayTotal(),weekThirtySeventh.getFridayTotal()));
	     weekThirtyEighth.setWeeklyTotalily(weekThirtyEighth.convertHourlyTotalIntoWeeklyTotal(weekThirtyEighth.getSaturdayTotal(),weekThirtyEighth.getSundayTotal(),weekThirtyEighth.getMondayTotal(),weekThirtyEighth.getTuesdayTotal(),weekThirtyEighth.getFridayTotal()));
	     weekThiryNinth.setWeeklyTotalily(weekThiryNinth.convertHourlyTotalIntoWeeklyTotal(weekThiryNinth.getSaturdayTotal(),weekThiryNinth.getSundayTotal(),weekThiryNinth.getMondayTotal(),weekThiryNinth.getFridayTotal()));
	     weekFortieth.setWeeklyTotalily(weekFortieth.convertHourlyTotalIntoWeeklyTotal(weekFortieth.getSaturdayTotal(),weekFortieth.getSundayTotal(),weekFortieth.getMondayTotal(),weekFortieth.getTuesdayTotal(),weekFortieth.getThursdayTotal(),weekFortieth.getFridayTotal()));
	    
	     
	     
	     
	     
	     weekOne.setSummedHours(weekOne.WeeklyTotal(weekOne.getWeeklyTotalily()));
	     weekTwo.setSummedHours(weekTwo.WeeklyTotal(weekOne.getSummedHours(),weekTwo.getWeeklyTotalily()));
	     weekThree.setSummedHours(weekThree.WeeklyTotal(weekTwo.getSummedHours(),weekThree.getWeeklyTotalily()));
	     weekFour.setSummedHours(weekFour.WeeklyTotal(weekThree.getSummedHours(),weekFour.getWeeklyTotalily()));
	     weekFive.setSummedHours(weekFive.WeeklyTotal(weekFour.getSummedHours(),weekFive.getWeeklyTotalily()));
	     weekSix.setSummedHours(weekSix.WeeklyTotal(weekFive.getSummedHours(),weekSix.getWeeklyTotalily()));
	     weekSeven.setSummedHours(weekSeven.WeeklyTotal(weekSix.getSummedHours(),weekSeven.getWeeklyTotalily()));
	     weekEight.setSummedHours(weekEight.WeeklyTotal(weekSeven.getSummedHours(),weekEight.getWeeklyTotalily()));
	     weekNine.setSummedHours(weekNine.WeeklyTotal(weekEight.getSummedHours(),weekNine.getWeeklyTotalily()));
	     weekTen.setSummedHours(weekTen.WeeklyTotal(weekNine.getSummedHours(),weekTen.getWeeklyTotalily()));
	     weekEleven.setSummedHours(weekEleven.WeeklyTotal(weekTen.getSummedHours(),weekEleven.getWeeklyTotalily()));
	     weekTwelve.setSummedHours(weekTwelve.WeeklyTotal(weekEleven.getSummedHours(),weekTwelve.getWeeklyTotalily()));
	     weekThriteen.setSummedHours(weekThriteen.WeeklyTotal(weekTwelve.getSummedHours(),weekThriteen.getWeeklyTotalily()));
	     weekForteenth.setSummedHours(weekSeven.WeeklyTotal(weekThriteen.getSummedHours(),weekForteenth.getWeeklyTotalily()));
	     weekFifteenth.setSummedHours(weekFifteenth.WeeklyTotal(weekForteenth.getSummedHours(),weekFifteenth.getWeeklyTotalily()));
	     weekSixteenth.setSummedHours(weekSixteenth.WeeklyTotal(weekFifteenth.getSummedHours(),weekSixteenth.getWeeklyTotalily()));
	     weekSeventeenth.setSummedHours(weekSeventeenth.WeeklyTotal(weekSixteenth.getSummedHours(),weekSeventeenth.getWeeklyTotalily()));
	     weekEightteenth.setSummedHours(weekEightteenth.WeeklyTotal(weekEightteenth.getWeeklyTotalily(),weekSeventeenth.getSummedHours()));
	     weekNinteenth.setSummedHours(weekNinteenth.WeeklyTotal(weekNinteenth.getWeeklyTotalily(),weekEightteenth.getSummedHours()));
	     weekTwentyth.setSummedHours(weekTwentyth.WeeklyTotal(weekTwentyth.getWeeklyTotalily(),weekNinteenth.getSummedHours()));
	     weekTwentyFrist.setSummedHours(weekTwentyFrist.WeeklyTotal(weekTwentyFrist.getWeeklyTotalily(),weekTwentyth.getSummedHours()));
	     weekTwentySecond.setSummedHours(weekTwentySecond.WeeklyTotal(weekTwentySecond.getWeeklyTotalily(),weekTwentyFrist.getSummedHours()));
	     weekTwentyThird.setSummedHours(weekTwentyThird.WeeklyTotal(weekTwentyThird.getWeeklyTotalily(),weekTwentySecond.getSummedHours()));
	     weekTwentyFourth.setSummedHours(weekTwentyFourth.WeeklyTotal(weekTwentyFourth.getWeeklyTotalily(),weekTwentyThird.getSummedHours()));
	     weekTwentyFifith.setSummedHours(weekTwentyFifith.WeeklyTotal(weekTwentyFifith.getWeeklyTotalily(),weekNinteenth.getSummedHours()));
	     weekTwentySixth.setSummedHours(weekTwentySixth.WeeklyTotal(weekTwentyFifith.getSummedHours(),weekTwentySixth.getWeeklyTotalily()));
	     weekTwentySeventh.setSummedHours(weekTwentySeventh.WeeklyTotal(weekTwentySixth.getSummedHours(),weekTwentySeventh.getWeeklyTotalily()));
	     weekTwentyEighth.setSummedHours(weekTwentyEighth.WeeklyTotal(weekTwentyEighth.getWeeklyTotalily(),weekTwentySeventh.getSummedHours()));
	     weekTwentyNinth.setSummedHours(weekTwentyNinth.WeeklyTotal(weekTwentyNinth.getWeeklyTotalily(),weekTwentyEighth.getSummedHours()));
	     weekThirtieth.setSummedHours(weekThirtieth.WeeklyTotal(weekThirtieth.getWeeklyTotalily(),weekTwentyNinth.getSummedHours()));
	     weekThrityFirst.setSummedHours(weekThrityFirst.WeeklyTotal(weekThrityFirst.getWeeklyTotalily(),weekThirtieth.getSummedHours()));
	     weekThritySecond.setSummedHours(weekThritySecond.WeeklyTotal(weekThritySecond.getWeeklyTotalily(),weekThrityFirst.getSummedHours()));
	     weekThirtyThird.setSummedHours(weekThirtyThird.WeeklyTotal(weekThirtyThird.getWeeklyTotalily(),weekThritySecond.getSummedHours()));
	     weekThirtyFourth.setSummedHours(weekThirtyFourth.WeeklyTotal(weekThirtyFourth.getWeeklyTotalily(),weekThirtyThird.getSummedHours()));
	     weekThirtyFifth.setSummedHours(weekThirtyFifth.WeeklyTotal(weekThirtyFifth.getWeeklyTotalily(),weekThirtyFourth.getSummedHours()));
	     weekThirtySixth.setSummedHours(weekThirtySixth.WeeklyTotal(weekThirtySixth.getWeeklyTotalily(),weekThirtyFifth.getSummedHours()));
	     weekThirtySeventh.setSummedHours(weekThirtySeventh.WeeklyTotal(weekThirtySeventh.getWeeklyTotalily(),weekThirtySixth.getSummedHours()));
	     weekThirtyEighth.setSummedHours(weekThirtyEighth.WeeklyTotal(weekThirtyEighth.getWeeklyTotalily(),weekThirtySeventh.getSummedHours()));
	     weekThiryNinth.setSummedHours(weekThiryNinth.convertHourlyTotalIntoWeeklyTotal(weekThiryNinth.getWeeklyTotalily(),weekThirtyEighth.getSummedHours()));
	     weekFortieth.setSummedHours(weekFortieth.convertHourlyTotalIntoWeeklyTotal(weekFortieth.getWeeklyTotalily(),weekThiryNinth.getSummedHours()));
	     
	     
	     
	     
	     
	     weekOne.setSummedHoursMinusTotalHours(weekOne.WeeklyTotalMinusTotalAmountOfHours(weekOne.getSummedHours()));
	     weekTwo.setSummedHoursMinusTotalHours(weekTwo.WeeklyTotalMinusTotalAmountOfHours(weekTwo.getSummedHours()));
	     weekThree.setSummedHoursMinusTotalHours(weekThree.WeeklyTotalMinusTotalAmountOfHours(weekThree.getSummedHours()));
	     weekFour.setSummedHoursMinusTotalHours(weekFour.WeeklyTotalMinusTotalAmountOfHours(weekFour.getSummedHours()));
	     weekFive.setSummedHoursMinusTotalHours(weekFive.WeeklyTotalMinusTotalAmountOfHours(weekFive.getSummedHours()));
	     weekSix.setSummedHoursMinusTotalHours(weekSix.WeeklyTotalMinusTotalAmountOfHours(weekSix.getSummedHours()));
	     weekSeven.setSummedHoursMinusTotalHours(weekSeven.WeeklyTotalMinusTotalAmountOfHours(weekSeven.getSummedHours()));
	     weekEight.setSummedHoursMinusTotalHours(weekEight.WeeklyTotalMinusTotalAmountOfHours(weekEight.getSummedHours()));
	     weekNine.setSummedHoursMinusTotalHours(weekNine.WeeklyTotalMinusTotalAmountOfHours(weekNine.getSummedHours()));
	     weekTen.setSummedHoursMinusTotalHours(weekTen.WeeklyTotalMinusTotalAmountOfHours(weekTen.getSummedHours()));
	     weekEleven.setSummedHoursMinusTotalHours(weekEleven.WeeklyTotalMinusTotalAmountOfHours(weekEleven.getSummedHours()));
	     weekTwelve.setSummedHoursMinusTotalHours(weekTwelve.WeeklyTotalMinusTotalAmountOfHours(weekTwelve.getSummedHours()));
	     weekThriteen.setSummedHoursMinusTotalHours(weekThriteen.WeeklyTotalMinusTotalAmountOfHours(weekThriteen.getSummedHours()));
	     weekForteenth.setSummedHoursMinusTotalHours(weekForteenth.WeeklyTotalMinusTotalAmountOfHours(weekForteenth.getSummedHours()));
	     weekFifteenth.setSummedHoursMinusTotalHours(weekFifteenth.WeeklyTotalMinusTotalAmountOfHours(weekFifteenth.getSummedHours()));
	     weekSixteenth.setSummedHoursMinusTotalHours(weekSixteenth.WeeklyTotalMinusTotalAmountOfHours(weekSixteenth.getSummedHours()));
	     weekSeventeenth.setSummedHoursMinusTotalHours(weekSeventeenth.WeeklyTotalMinusTotalAmountOfHours(weekSeventeenth.getSummedHours()));
	     weekEightteenth.setSummedHoursMinusTotalHours(weekEightteenth.WeeklyTotalMinusTotalAmountOfHours(weekEightteenth.getSummedHours()));
	     weekNinteenth.setSummedHoursMinusTotalHours(weekNinteenth.WeeklyTotalMinusTotalAmountOfHours(weekNinteenth.getSummedHours()));
	     weekTwentyth.setSummedHoursMinusTotalHours(weekTwentyth.WeeklyTotalMinusTotalAmountOfHours(weekTwentyth.getSummedHours()));
	     weekTwentyFrist.setSummedHoursMinusTotalHours(weekTwentyFrist.WeeklyTotalMinusTotalAmountOfHours(weekTwentyFrist.getSummedHours()));
	     weekTwentySecond.setSummedHoursMinusTotalHours(weekTwentySecond.WeeklyTotalMinusTotalAmountOfHours(weekTwentySecond.getSummedHours()));
	     weekTwentyThird.setSummedHoursMinusTotalHours(weekTwentyThird.WeeklyTotalMinusTotalAmountOfHours(weekTwentyThird.getSummedHours()));
	     weekTwentyFourth.setSummedHoursMinusTotalHours(weekTwentyFourth.WeeklyTotalMinusTotalAmountOfHours(weekTwentyFourth.getSummedHours()));
	     weekTwentyFifith.setSummedHoursMinusTotalHours(weekTwentyFifith.WeeklyTotalMinusTotalAmountOfHours(weekTwentyFifith.getSummedHours()));
	     weekTwentySixth.setSummedHoursMinusTotalHours(weekTwentySixth.WeeklyTotalMinusTotalAmountOfHours(weekTwentySixth.getSummedHours()));
	     weekTwentySeventh.setSummedHoursMinusTotalHours(weekTwentySeventh.WeeklyTotalMinusTotalAmountOfHours(weekTwentySeventh.getSummedHours()));
	     weekTwentyEighth.setSummedHoursMinusTotalHours(weekTwentyEighth.WeeklyTotalMinusTotalAmountOfHours(weekTwentyEighth.getSummedHours()));
	     weekTwentyNinth.setSummedHoursMinusTotalHours(weekTwentyNinth.WeeklyTotalMinusTotalAmountOfHours(weekTwentyNinth.getSummedHours()));
	     weekThirtieth.setSummedHoursMinusTotalHours(weekThirtieth.WeeklyTotalMinusTotalAmountOfHours(weekThirtieth.getSummedHours()));
	     weekThrityFirst.setSummedHoursMinusTotalHours(weekThrityFirst.WeeklyTotalMinusTotalAmountOfHours(weekThrityFirst.getSummedHours()));
	     weekThritySecond.setSummedHoursMinusTotalHours(weekThritySecond.WeeklyTotalMinusTotalAmountOfHours(weekThritySecond.getSummedHours()));
	     weekThirtyThird.setSummedHoursMinusTotalHours(weekThirtyThird.WeeklyTotalMinusTotalAmountOfHours(weekThirtyThird.getSummedHours()));
	     weekThirtyFourth.setSummedHoursMinusTotalHours(weekThirtyFourth.WeeklyTotalMinusTotalAmountOfHours(weekThirtyFourth.getSummedHours()));
	     weekThirtyFifth.setSummedHoursMinusTotalHours(weekThirtyFifth.WeeklyTotalMinusTotalAmountOfHours(weekThirtyFifth.getSummedHours()));
	     weekThirtySixth.setSummedHoursMinusTotalHours(weekThirtySixth.WeeklyTotalMinusTotalAmountOfHours(weekThirtySixth.getSummedHours()));
	     weekThirtySeventh.setSummedHoursMinusTotalHours(weekThirtySeventh.WeeklyTotalMinusTotalAmountOfHours(weekThirtySeventh.getSummedHours()));
	     weekThirtyEighth.setSummedHoursMinusTotalHours(weekThirtyEighth.WeeklyTotalMinusTotalAmountOfHours(weekThirtyEighth.getSummedHours()));
	     weekThiryNinth.setSummedHoursMinusTotalHours(weekThiryNinth.WeeklyTotalMinusTotalAmountOfHours(weekThiryNinth.getSummedHours()));
	     weekFortieth.setSummedHoursMinusTotalHours(weekFortieth.WeeklyTotalMinusTotalAmountOfHours(weekFortieth.getSummedHours()));
	     
	     
	     
	     
	     weekTwo.setPaychecks(weekOne.paycheck(weekOne.getWeeklyTotalily(),weekTwo.getWeeklyTotalily()));
	     weekFour.setPaychecks(weekThree.paycheck(weekFour.getWeeklyTotalily(), weekFour.getWeeklyTotalily()));
	     weekSix.setPaychecks(weekSix.paycheck(weekSix.getWeeklyTotalily(), weekFive.getWeeklyTotalily()));
	     weekEight.setPaychecks(weekSeven.paycheck(weekEight.getWeeklyTotalily(), weekSeven.getWeeklyTotalily()));
	     weekTen.setPaychecks(weekNine.paycheck(weekTen.getWeeklyTotalily(), weekNine.getWeeklyTotalily()));
	     weekTwelve.setPaychecks(weekEleven.paycheck(weekTwelve.getWeeklyTotalily(), weekEleven.getWeeklyTotalily()));
	     weekForteenth.setPaychecks(weekThriteen.paycheck(weekThriteen.getWeeklyTotalily(), weekForteenth.getWeeklyTotalily()));
	     weekSixteenth.setPaychecks(weekFifteenth.paycheck(weekFifteenth.getWeeklyTotalily(),weekSixteenth.getWeeklyTotalily() ));
	     weekEightteenth.setPaychecks(weekEightteenth.paycheck(weekSeventeenth.getWeeklyTotalily(), weekEightteenth.getWeeklyTotalily()));
	     weekTwentyth.setPaychecks(weekNinteenth.paycheck(weekNinteenth.getWeeklyTotalily(), weekTwentyth.getWeeklyTotalily()));
	     weekTwentySecond.setPaychecks(weekTwentySecond.paycheck(weekTwentyFrist.getWeeklyTotalily(), weekTwentySecond.getWeeklyTotalily()));
	     weekTwentyFourth.setPaychecks(weekTwentyThird.paycheck(weekTwentyThird.getWeeklyTotalily(), weekTwentyFourth.getWeeklyTotalily()));
	     weekTwentySixth.setPaychecks(weekTwentySixth.paycheck(weekTwentyFifith.getWeeklyTotalily(), weekTwentySixth.getWeeklyTotalily()));
	     weekTwentyEighth.setPaychecks(weekTwentyEighth.paycheck(weekTwentyEighth.getWeeklyTotalily(),weekTwentySeventh.getWeeklyTotalily()));
	     weekThirtieth.setPaychecks(weekThrityFirst.paycheck(weekThirtieth.getWeeklyTotalily(),weekTwentyNinth.getWeeklyTotalily() ));
	     weekThritySecond.setPaychecks(weekThritySecond.paycheck(weekThritySecond.getWeeklyTotalily(),weekThrityFirst.getWeeklyTotalily()));
	     weekThirtyFourth.setPaychecks(weekThirtyFifth.paycheck(weekThirtyThird.getWeeklyTotalily(), weekThirtyFourth.getWeeklyTotalily()));
	     weekThirtySixth.setPaychecks(weekThirtySixth.paycheck(weekThirtySixth.getWeeklyTotalily(), weekThirtyFifth.getWeeklyTotalily()));
	     weekThirtyEighth.setPaychecks(weekThirtyEight.paycheck(weekThirtyEighth.getWeeklyTotalily(), weekThirtySeventh.getWeeklyTotalily()));
	     weekFortieth.setPaychecks(weekFortieth.paycheck(weekFortieth.getWeeklyTotalily(), weekThiryNinth.getWeeklyTotalily()));
	     
	     WeeklyFunctions WeekFunOne = new WeeklyFunctions(0, "Jan 1 - Jan 7", weekOne.getWeeklyTotalily(), weekOne.getSummedHours(), weekOne.getSummedHoursMinusTotalHours());
	     System.out.println(WeekFunOne.toString());
	     //Will add back in once I figure out what is going wrong
	     //WeeklyDAOImpl weekCRUDOpers = new WeeklyDAOImpl();
	     //weekCRUDOpers.createWeeklyDao(WeekFunOne);
	     
	     System.out.println(" # of weeks |     dates        | hours  |  hours | hours - 1560 | paychecks");  
	     System.out.printf("    1       | Jan 01 - Jan 07  | %.2f  |   %.2f     |    %.2f   | %n" , weekOne.getWeeklyTotalily() , weekOne.getSummedHours(),weekOne.getSummedHoursMinusTotalHours());
	     System.out.printf("    2       | Jan 08 - Jan 14  | %.2f  |   %.2f     |    %.2f   | %.2f %n" ,weekTwo.getWeeklyTotalily(),weekTwo.getSummedHours(),weekTwo.getSummedHoursMinusTotalHours(),weekTwo.getPaychecks());
	     System.out.printf("    3       | Jan 15 - Jan 21  | %.2f  |   %.2f     |    %.2f   |  %n",weekThree.getWeeklyTotalily(),weekThree.getSummedHours(), weekThree.getSummedHoursMinusTotalHours());
	     System.out.printf("    4       | Jan 22 - Jan 28  | %.2f  |   %.2f    |    %.2f   | %.2f %n",weekFour.getWeeklyTotalily() ,weekFour.getSummedHours() ,weekFour.getSummedHoursMinusTotalHours(),weekFour.getPaychecks());
	     System.out.printf("    5       | Jan 29 - Feb 04  | %.2f  |   %.2f    |    %.2f   | %n",  weekFive.getWeeklyTotalily(), weekFive.getSummedHours(),weekFive.getSummedHoursMinusTotalHours());
	     System.out.printf("    6       | Feb 05 - Feb 11  | %.2f  |   %.2f    |    %.2f   | %.2f %n", weekSix.getWeeklyTotalily(), weekSix.getSummedHours(),weekSix.getSummedHoursMinusTotalHours(),weekSix.getPaychecks());
	     System.out.printf("    7       | Feb 12 - Feb 18  | %.2f  |   %.2f    |    %.2f   | %n", weekSeven.getWeeklyTotalily(), weekSeven.getSummedHours(),weekSeven.getSummedHoursMinusTotalHours());
	     System.out.printf("    8       | Feb 19 - Feb 25  | %.2f  |   %.2f    |    %.2f   | %.2f %n", weekEight.getWeeklyTotalily(),weekEight.getSummedHours(),weekEight.getSummedHoursMinusTotalHours(),weekEight.getPaychecks());
	     System.out.printf("    9       | Feb 26 - Mar  4  | %.2f  |   %.2f    |    %.2f   | %n",weekNine.getWeeklyTotalily(),weekNine.getSummedHours(),weekNine.getSummedHoursMinusTotalHours() );
	     System.out.printf("    10      | Mar  5 - Mar 11  | %.2f  |   %.2f    |    %.2f   | %.2f  %n",weekTen.getWeeklyTotalily(),weekTen.getSummedHours(), weekTen.getSummedHoursMinusTotalHours(), weekTen.getPaychecks());
	     System.out.printf("    11      | Mar 12 - Mar 18  | %.2f  |   %.2f    |    %.2f   | %n ",weekEleven.getWeeklyTotalily(),weekEleven.getSummedHours(),weekEleven.getSummedHoursMinusTotalHours());
	     System.out.printf("   12      | Mar 19 - Mar 25  | %.2f  |   %.2f    |    %.2f   | %.2f %n",weekTwelve.getWeeklyTotalily(),weekTwelve.getSummedHours(),weekTwelve.getSummedHoursMinusTotalHours(),weekTwelve.getPaychecks());
	     System.out.printf("    13      | Mar 25 - Apr  1  | %.2f  |   %.2f    |    %.2f   | %n ",weekThriteen.getWeeklyTotalily(),weekThriteen.getSummedHours(),weekThriteen.getSummedHoursMinusTotalHours());
	     System.out.printf("   14      | Apr  2 - Apr  8  | %.2f  |   %.2f    |    %.2f   | %.2f %n",weekForteenth.getWeeklyTotalily(),weekForteenth.getSummedHours(),weekForteenth.getSummedHoursMinusTotalHours(),weekForteenth.getPaychecks());
	     System.out.printf("    15      | Apr 16- Apr  22  | %.2f  |   %.2f    |    %.2f   |  %n",weekFifteenth.getWeeklyTotalily(),weekFifteenth.getSummedHours(),weekFifteenth.getSummedHoursMinusTotalHours());
	     System.out.printf("    16      | Apr 23 - Apr 29  | %.2f  |   %.2f    |    %.2f   | %.2f %n", weekSixteenth.getWeeklyTotalily(),weekSixteenth.getSummedHours(),weekSixteenth.getSummedHoursMinusTotalHours(),weekSixteenth.getPaychecks());
	     System.out.printf("    17      | Apr 30 - May  6  | %.2f  |   %.2f    |    %.2f   |  %n",weekSeventeenth.getWeeklyTotalily(),weekSeventeenth.getSummedHours(),weekSeventeenth.getSummedHoursMinusTotalHours());
	     System.out.printf("    18      | May  7 - May 13  | %.2f  |   %.2f    |    %.2f    | %.2f %n",weekEightteenth.getWeeklyTotalily(), weekEightteenth.getSummedHours(),weekEightteenth.getSummedHoursMinusTotalHours(),weekEightteenth.getPaychecks());
	     System.out.printf("    19      | May 14 - May 20  | %.2f  |   %.2f    |    %.2f    |  %n",weekNinteenth.getWeeklyTotalily(),weekNinteenth.getSummedHours(),weekNinteenth.getSummedHoursMinusTotalHours());
	     System.out.printf("    20      | May 21 - May 27  | %.2f  |   %.2f    |    %.2f    | %.2f %n",weekTwentyth.getWeeklyTotalily(),weekTwentyth.getSummedHours(),weekTwentyth.getSummedHoursMinusTotalHours(),weekTwentyth.getPaychecks());
	     System.out.printf("    21      | May 28 - Jun  5  | %.2f   |   %.2f    |    %.2f    | %n",weekTwentyFrist.getWeeklyTotalily(),weekTwentyFrist.getSummedHours(),weekTwentyFrist.getSummedHoursMinusTotalHours());
	     System.out.printf("    22      | Jun  6 - Jun 10  | %.2f  |   %.2f    |    %.2f    | %.2f %n", weekTwentySecond.getWeeklyTotalily(), weekTwentySecond.getSummedHours(),weekTwentySecond.getSummedHoursMinusTotalHours(),weekTwentySecond.getPaychecks());
	     System.out.printf("    23      | Jun 11 - Jun 17  | %.2f  |   %.2f    |    %.2f    | %n",weekTwentyThird.getWeeklyTotalily(),weekTwentyThird.getSummedHours(),weekTwentyThird.getSummedHoursMinusTotalHours(),weekTwentyThird.getPaychecks());
	     System.out.printf("    24      | Jun 18 - Jun 24  | %.2f  |   %.2f    |    %.2f    | %.2f  %n", weekTwentyFourth.getWeeklyTotalily(),weekTwentyFourth.getSummedHours(),weekTwentyFourth.getSummedHoursMinusTotalHours(),weekTwentyFourth.getPaychecks());
	     System.out.printf("    25      | Jun 25 - Jul  1  | %.2f  |   %.2f    |    %.2f    |  %n", weekTwentyFifith.getWeeklyTotalily(),weekTwentyFifith.getSummedHours(),weekTwentyFifith.getSummedHoursMinusTotalHours(),weekTwentyFifith.getPaychecks());
	     System.out.printf("    26      | Jul  2 - Jul  8  | %.2f   |   %.2f    |    %.2f    | %.2f %n", weekTwentySixth.getWeeklyTotalily(),weekTwentySixth.getSummedHours(),weekTwentySixth.getSummedHoursMinusTotalHours(),weekTwentySixth.getPaychecks());
	     System.out.printf("    27      | Jul 9  - Jul 15  | %.2f   |   %.2f    |    %.2f    | %n",weekTwentySeventh.getWeeklyTotalily(),weekTwentySeventh.getSummedHours(),weekTwentySeventh.getSummedHoursMinusTotalHours() );
	     System.out.printf("    28      | Jul 16 - Jul 22  | %.2f  |   %.2f    |    %.2f    | %.2f  %n", weekTwentyEighth.getWeeklyTotalily(),weekTwentyEighth.getSummedHours(),weekTwentyEighth.getSummedHoursMinusTotalHours(),weekTwentyEighth.getPaychecks());
	     System.out.printf("    29      | Jul 23 - Jul 29  | %.2f   |   %.2f    |    %.2f    |  %n",weekTwentyNinth.getWeeklyTotalily(),weekTwentyNinth.getSummedHours(),weekTwentyNinth.getSummedHoursMinusTotalHours());
	     System.out.printf("    30      | Jul 31 - Aug  5  | %.2f   |   %.2f    |    %.2f    | %.2f %n",weekThirtieth.getWeeklyTotalily(),weekThirtieth.getSummedHours(),weekThirtieth.getSummedHoursMinusTotalHours(),weekThirtieth.getPaychecks());	     
	     System.out.printf("    31      | Aug  6 - Aug 12  | %.2f  |   %.2f    |    %.2f    | %n", weekThrityFirst.getWeeklyTotalily(),weekThrityFirst.getSummedHours(),weekThrityFirst.getSummedHoursMinusTotalHours());
	     System.out.printf("    32      | Aug 13 - Aug 19  | %.2f  |   %.2f    |    %.2f    | %.2f %n",weekThritySecond.getWeeklyTotalily() , weekThritySecond.getSummedHours() , weekThritySecond.getSummedHoursMinusTotalHours() , weekThritySecond.getPaychecks());
	     System.out.printf("    33      | Aug 20 - Aug 25  | %.2f  |   %.2f    |    %.2f    | %n", weekThirtyThird.getWeeklyTotalily(),weekThirtyThird.getSummedHours(),weekThirtyThird.getSummedHoursMinusTotalHours());
	     System.out.printf("    34      | Aug 26 - Sep  2  | %.2f   |   %.2f    |    %.2f    | %.2f %n", weekThirtyFourth.getWeeklyTotalily(),weekThirtyFourth.getSummedHours(),weekThirtyFourth.getSummedHoursMinusTotalHours(),weekThirtyFourth.getPaychecks());
	     System.out.printf("    35      | Sep  3 - Sep  9  | %.2f   |   %.2f    |    %.2f    | %n", weekThirtyFifth.getWeeklyTotalily(),weekThirtyFifth.getSummedHours(),weekThirtyFifth.getSummedHoursMinusTotalHours());
	     System.out.printf("    36      | Sep 10 - Sep 16  | %.2f  |   %.2f    |    %.2f    | %.2f %n",weekThirtySixth.getWeeklyTotalily(),weekThirtySixth.getSummedHours(), weekThirtySixth.getSummedHoursMinusTotalHours(),weekThirtySixth.getPaychecks());
	     System.out.printf("    37      | Sep 17 - Sep 23  | %.2f  |   %.2f    |    %.2f    | %n", weekThirtySeventh.getWeeklyTotalily(),weekThirtySeventh.getSummedHours(),weekThirtySeventh.getSummedHoursMinusTotalHours());
	     System.out.printf("    38      | Sep 24 - Sep 30  | %.2f  |   %.2f    |    %.2f    | %.2f %n",weekThirtyEighth.getWeeklyTotalily(),weekThirtyEighth.getSummedHours(),weekThirtyEighth.getSummedHoursMinusTotalHours(),weekThirtyEighth.getPaychecks());
	     System.out.printf("    39      | Oct  1 - Oct  7  | %.2f  |   %.2f    |    %.2f    | %n",weekThiryNinth.getWeeklyTotalily(),weekThiryNinth.getSummedHours(),weekThiryNinth.getSummedHoursMinusTotalHours());
	     System.out.printf("    40      | Oct  8 - Oct 14  | %.2f  |   %.2f    |    %.2f    | %.2f %n" ,weekFortieth.getWeeklyTotalily(),weekFortieth.getSummedHours(),weekFortieth.getSummedHoursMinusTotalHours(),weekFortieth.getPaychecks());
	}

}
