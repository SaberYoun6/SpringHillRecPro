import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Logger;

import days.DailyCalculation;
import hours.HourCalculation;
import scanners.ScanClass;
import weeks.WeeklyCalculations;

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
	     daysOfWeekSeven.setTimeOut0Wednesday(21.15);
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
	     /*
	     daysOfWeeksFive.setTotalSaturdayTime(daysOfWeeksFive.dailyTotal(daysOfWeeksFive.getTimeIn0Saturday(),daysOfWeeksFive.getTimeOut0Saturday()));
	     daysOfWeeksFive.setTotalMondayTime(daysOfWeeksFive.dailyTotal(daysOfWeeksFive.getTimeIn0Monday(),daysOfWeeksFive.getTimeOut0Monday()));
	     daysOfWeeksFive.setTotalWednesdayTime(daysOfWeeksFive.dailyTotal(daysOfWeeksFive.getTimeIn0Wednesday(), daysOfWeeksFive.getTimeOut0Wednesday()));
	     daysOfWeeksFive.setTotalThursdayTime(daysOfWeeksFive.dailyTotal(daysOfWeeksFive.getTimeIn0Thursday(), daysOfWeeksFive.getTimeOut0Thursday()));
	     daysOfWeeksFive.settotalFridayTime(daysOfWeeksFive.dailyTotal(daysOfWeeksFive.getTimeIn0Friday(), daysOfWeeksFive.getTimeOut0Friday()));
	     /*
	     daysOfWeeksSix.setTotalSaturdayTime(daysOfWeeksSix.dailyTotal(daysOfWeeksSix.getTimeIn0Saturday(), daysOfWeeksSix.getTimeOut0Saturday()));
	     daysOfWeeksSix.setTotalSundayTime(daysOfWeeksSix.dailyTotal(daysOfWeeksSix.getTimeIn0Sunday(), daysOfWeeksSix.getTimeOut0Sunday()));
	     daysOfWeeksSix.setTotalMondayTime(daysOfWeeksSix.dailyTotal(daysOfWeeksSix.getTimeIn0Monday(), daysOfWeeksSix.getTimeOut0Monday()));
	     daysOfWeeksSix.setTotalWednesdayTime(daysOfWeeksSix.dailyTotal(daysOfWeeksSix.getTimeIn0Wednesday(), daysOfWeeksSix.getTimeOut0Wednesday()));
	     daysOfWeeksSix.setTotalThursdayTime(daysOfWeeksSix.dailyTotal(daysOfWeeksSix.getTimeIn0Thursday(), daysOfWeeksSix.getTimeOut0Thursday()));
	     daysOfWeeksSix.settotalFridayTime(daysOfWeeksSix.dailyTotal(daysOfWeeksSix.getTimeIn0Friday(), daysOfWeeksSix.getTimeOut0Friday()));

	     daysOfWeekSeven.setTotalSaturdayTime(daysOfWeekSeven.dailyTotal(daysOfWeekSeven.getTimeIn0Saturday(), daysOfWeekSeven.getTimeOut0Saturday()));
	     daysOfWeekSeven.setTotalMondayTime(daysOfWeekSeven.dailyTotal(daysOfWeekSeven.getTimeIn0Monday(), daysOfWeekSeven.getTimeOut0Monday()));
	     daysOfWeekSeven.setTotalWednesdayTime(daysOfWeekSeven.dailyTotal(daysOfWeekSeven.getTimeIn0Wednesday(), daysOfWeekSeven.getTimeOut0Wednesday()));
	     daysOfWeekSeven.setTotalThursdayTime(daysOfWeekSeven.dailyTotal(daysOfWeekSeven.getTimeIn0Thursday(), daysOfWeekSeven.getTimeOut0Thursday()));
	     daysOfWeekSeven.settotalFridayTime(daysOfWeekSeven.dailyTotal(daysOfWeekSeven.getTimeIn0Friday(), daysOfWeekSeven.getTimeOut0Friday()));
	
	     
	     daysOfWeeksEight.setTotalSaturdayTime(daysOfWeeksEight.dailyTotal(daysOfWeeksEight.getTimeIn0Saturday(), daysOfWeeksEight.getTimeOut0Saturday()));
	     daysOfWeeksEight.setTotalSundayTime(daysOfWeeksEight.dailyTotal(daysOfWeeksEight.getTimeIn0Sunday(), daysOfWeeksEight.getTimeOut0Sunday(), daysOfWeeksEight.getTimeIn1Sunday(), daysOfWeeksEight.getTimeOut1Sunday()));
	     
	     daysOfWeeksNine.setTotalSaturdayTime(daysOfWeeksNine.dailyTotal(daysOfWeeksNine.getTimeIn0Saturday(), daysOfWeeksNine.getTimeOut0Saturday()));
	     daysOfWeeksNine.setTotalSundayTime(daysOfWeeksNine.dailyTotal(daysOfWeeksNine.getTimeIn0Sunday(), daysOfWeeksNine.getTimeOut0Sunday()));
	     daysOfWeeksNine.setTotalMondayTime(daysOfWeeksNine.dailyTotal(daysOfWeeksNine.getTimeIn0Monday(), daysOfWeeksNine.getTimeOut0Monday()));
	     daysOfWeeksNine.setTotalWednesdayTime(daysOfWeeksNine.dailyTotal(daysOfWeeksNine.getTimeIn0Wednesday(), daysOfWeeksNine.getTimeOut0Wednesday()));
	     
	     daysOfWeeksTen.setTotalSaturdayTime(daysOfWeeksTen.dailyTotal(daysOfWeeksTen.getTimeIn0Saturday(), daysOfWeeksTen.getTimeOut0Saturday()));
	     daysOfWeeksTen.setTotalSundayTime(daysOfWeeksTen.dailyTotal(daysOfWeeksTen.getTimeIn0Sunday(), daysOfWeeksTen.getTimeOut0Sunday()));
	     daysOfWeeksTen.setTotalMondayTime(daysOfWeeksTen.dailyTotal(daysOfWeeksTen.getTimeIn0Monday(),daysOfWeeksTen.getTimeOut0Monday()));
	     daysOfWeeksTen.setTotalThursdayTime(daysOfWeeksTen.dailyTotal(daysOfWeeksTen.getTimeIn0Thursday(), daysOfWeeksTen.getTimeOut0Thursday()));
	     daysOfWeeksTen.settotalFridayTime(daysOfWeeksTen.dailyTotal(daysOfWeeksTen.getTimeIn0Friday(), daysOfWeeksTen.getTimeOut0Friday()));
	     
	     daysOfWeeksEleven.setTotalSaturdayTime(daysOfWeeksEleven.dailyTotal(daysOfWeeksEleven .getTimeIn0Saturday(),daysOfWeeksEleven.getTimeOut0Saturday()));
		 daysOfWeeksEleven.setTotalSundayTime(daysOfWeeksEleven.dailyTotal(daysOfWeeksEleven.getTimeIn0Sunday(), daysOfWeeksEleven.getTimeOut0Sunday()));
		 daysOfWeeksEleven.setTotalMondayTime(daysOfWeeksEleven.dailyTotal(daysOfWeeksEleven.getTimeIn0Monday(), daysOfWeeksEleven.getTimeOut0Monday()));
		 
		 daysOfWeeksTwelve.setTotalMondayTime(daysOfWeeksTwelve.dailyTotal(daysOfWeeksTwelve.getTimeIn0Monday(), daysOfWeeksTwelve.getTimeOut0Monday()));
	     daysOfWeeksTwelve.setTotalThursdayTime(daysOfWeeksTwelve.dailyTotal(daysOfWeeksTwelve.getTimeIn0Thursday(), daysOfWeeksTwelve.getTimeOut0Thursday()));
	     daysOfWeeksTwelve.settotalFridayTime(daysOfWeeksTwelve.dailyTotal(daysOfWeeksTwelve.getTimeIn0Friday(), daysOfWeeksTwelve.getTimeOut0Friday(), daysOfWeeksTwelve.getTimeIn1Friday(), daysOfWeeksTwelve.getTimeOut1Friday()));
	     
		 
		 daysOfWeeksThriteen.setTotalSaturdayTime(daysOfWeeksThriteen.dailyTotal(daysOfWeeksThriteen.getTimeIn0Saturday(), daysOfWeeksThriteen.getTimeOut0Saturday()));
	     daysOfWeeksThriteen.setTotalMondayTime(daysOfWeeksThriteen.dailyTotal(daysOfWeeksThriteen.getTimeIn0Monday(), daysOfWeeksThriteen.getTimeOut0Monday()));
	     daysOfWeeksThriteen.setTotalThursdayTime(daysOfWeeksThriteen.dailyTotal(daysOfWeeksThriteen.getTimeIn0Thursday(), daysOfWeeksThriteen.getTimeOut0Thursday()));
	     daysOfWeeksThriteen.settotalFridayTime(daysOfWeeksThriteen.dailyTotal(daysOfWeeksThriteen.getTimeIn0Friday(), daysOfWeeksThriteen.getTimeOut0Friday(),daysOfWeeksThriteen.getTimeIn1Friday(),daysOfWeeksThriteen.getTimeOut1Friday()));
	     
		 
	     daysOfWeeksForteenth.setTotalSaturdayTime(daysOfWeeksForteenth.dailyTotal(daysOfWeeksForteenth.getTimeIn0Saturday(), daysOfWeeksForteenth.getTimeOut0Saturday()));
		 daysOfWeeksForteenth.setTotalSundayTime(daysOfWeeksForteenth.dailyTotal(daysOfWeeksForteenth.getTimeIn0Saturday(), daysOfWeeksForteenth.getTimeOut0Saturday()));
		 daysOfWeeksForteenth.setTotalMondayTime(daysOfWeeksForteenth.dailyTotal(daysOfWeeksForteenth.getTimeIn0Monday(), daysOfWeeksForteenth.getTimeOut0Monday()));
		 daysOfWeeksForteenth.setTotalTuedayTime(daysOfWeeksForteenth.dailyTotal(daysOfWeeksForteenth.getTimeIn0Tuesady(), daysOfWeeksForteenth.getTimeOut0Tuesday()));
		 daysOfWeeksForteenth.setTotalWednesdayTime(daysOfWeeksForteenth.dailyTotal(daysOfWeeksForteenth.getTimeIn0Wednesday(), daysOfWeeksForteenth.getTimeOut0Wednesday()));
		 daysOfWeeksForteenth.setTotalThursdayTime(daysOfWeeksForteenth.dailyTotal(daysOfWeeksForteenth.getTimeIn0Thursday(), daysOfWeeksForteenth.getTimeOut0Thursday()));
		 daysOfWeeksForteenth.settotalFridayTime(daysOfWeeksForteenth.dailyTotal(daysOfWeeksForteenth.getTimeIn0Friday(), daysOfWeeksForteenth.getTimeOut0Friday(), daysOfWeeksForteenth.getTimeIn1Friday(), daysOfWeeksForteenth.getTimeOut0Friday()));
		
		 daysOfWeeksFifteenth.setTotalMondayTime(daysOfWeeksFifteenth.dailyTotal(daysOfWeeksFifteenth.getTimeIn0Monday(), daysOfWeeksFifteenth.getTimeOut0Monday()));
		 daysOfWeeksFifteenth.setTotalWednesdayTime(daysOfWeeksFifteenth.dailyTotal(daysOfWeeksFifteenth.getTimeIn0Wednesday(), daysOfWeeksFifteenth.getTimeOut0Wednesday()));
		 daysOfWeeksFifteenth.setTotalThursdayTime(daysOfWeeksFifteenth.dailyTotal(daysOfWeeksFifteenth.getTimeIn0Thursday(), daysOfWeeksFifteenth.getTimeOut0Thursday()));
		 daysOfWeeksFifteenth.settotalFridayTime(daysOfWeeksFifteenth.dailyTotal(daysOfWeeksFifteenth.getTimeIn0Friday(), daysOfWeeksFifteenth.getTimeOut0Friday())); 
		 
	     daysOfWeeksSixteenth.setTotalSundayTime(daysOfWeeksSixteenth.dailyTotal(daysOfWeeksSixteenth.getTimeIn0Sunday(), daysOfWeeksSixteenth.getTimeOut0Sunday()));
	 	 daysOfWeeksSixteenth.setTotalMondayTime(daysOfWeeksSixteenth.dailyTotal(daysOfWeeksSixteenth.getTimeIn0Monday(), daysOfWeeksSixteenth.getTimeOut0Monday(), daysOfWeeksSixteenth.getTimeIn1Monday(), daysOfWeeksSixteenth.getTimeOut1Monday()));
		 daysOfWeeksSixteenth.setTotalWednesdayTime(daysOfWeeksSixteenth.dailyTotal(daysOfWeeksSixteenth.getTimeIn0Wednesday(), daysOfWeeksSixteenth.getTimeOut0Wednesday()));
		 daysOfWeeksSixteenth.settotalFridayTime(daysOfWeeksSixteenth.dailyTotal(daysOfWeeksSixteenth.getTimeIn0Friday(), daysOfWeeksSixteenth.getTimeOut0Friday()));

		 daysOfWeekSeventeenth.setTotalSundayTime(daysOfWeekSeventeenth.dailyTotal(daysOfWeekSeventeenth.getTimeIn0Sunday(), daysOfWeekSeventeenth.getTimeOut0Sunday()));
		 daysOfWeekSeventeenth.setTotalMondayTime(daysOfWeekSeventeenth.dailyTotal(daysOfWeekSeventeenth.getTimeIn0Monday(), daysOfWeekSeventeenth.getTimeOut0Monday(), daysOfWeekSeventeenth.getTimeIn1Monday(),daysOfWeekSeventeenth.getTimeOut1Monday()));
		 daysOfWeekSeventeenth.setTotalWednesdayTime(daysOfWeekSeventeenth.dailyTotal(daysOfWeekSeventeenth.getTimeIn0Wednesday(), daysOfWeekSeventeenth.getTimeOut0Wednesday()));
		 daysOfWeekSeventeenth.setTotalThursdayTime(daysOfWeekSeventeenth.dailyTotal(daysOfWeekSeventeenth.getTimeIn0Thursday(), daysOfWeekSeventeenth.getTimeOut0Thursday()));
		 daysOfWeekSeventeenth.settotalFridayTime(daysOfWeekSeventeenth.dailyTotal(daysOfWeekSeventeenth.getTimeIn0Friday(), daysOfWeekSeventeenth.getTimeOut0Friday()));
		
		 
		 daysOfWeekEightteenth.setTotalSundayTime(daysOfWeekEightteenth.dailyTotal(daysOfWeekEightteenth.getTimeIn0Sunday(), daysOfWeekEightteenth.getTimeOut0Sunday()));
		 daysOfWeekEightteenth.setTotalMondayTime(daysOfWeekEightteenth.dailyTotal(daysOfWeekEightteenth.getTimeIn0Monday(), daysOfWeekEightteenth.getTimeOut0Monday()));
		 daysOfWeekEightteenth.setTotalTuedayTime(daysOfWeekEightteenth.dailyTotal(daysOfWeekEightteenth.getTimeIn0Tuesady(), daysOfWeekEightteenth.getTimeOut0Tuesday()));
		 daysOfWeekEightteenth.setTotalWednesdayTime(daysOfWeekEightteenth.dailyTotal(daysOfWeekEightteenth.getTimeIn0Wednesday(), daysOfWeekEightteenth.getTimeOut0Wednesday()));
		 daysOfWeekEightteenth.settotalFridayTime(daysOfWeekEightteenth.dailyTotal(daysOfWeekEightteenth.getTimeIn0Friday(), daysOfWeekEightteenth.getTimeOut0Friday()));
		 
		 daysOfWeeksNinteenth.settotalFridayTime(daysOfWeeksNinteenth.dailyTotal(daysOfWeeksNinteenth.getTimeIn0Friday(), daysOfWeeksNinteenth.getTimeOut0Friday()));
		 daysOfWeeksNinteenth.setTotalWednesdayTime(daysOfWeeksNinteenth.dailyTotal(daysOfWeeksNinteenth.getTimeIn0Wednesday(), daysOfWeeksNinteenth.getTimeOut0Wednesday()));
		 daysOfWeeksNinteenth.setTotalTuedayTime(daysOfWeeksNinteenth.dailyTotal(daysOfWeeksNinteenth.getTimeIn0Tuesady(), daysOfWeeksNinteenth.getTimeOut0Tuesday()));
		 daysOfWeeksNinteenth.setTotalMondayTime(daysOfWeeksNinteenth.dailyTotal(daysOfWeeksNinteenth.getTimeIn0Monday(), daysOfWeeksNinteenth.getTimeOut0Monday()));
		 daysOfWeeksNinteenth.setTotalSundayTime(daysOfWeeksNinteenth.dailyTotal(daysOfWeeksNinteenth.getTimeIn0Sunday(), daysOfWeeksNinteenth.getTimeOut0Sunday()));
			
		 daysOfWeeksTwentyth.setTotalSaturdayTime(daysOfWeeksTwentyth.dailyTotal(daysOfWeeksTwentyth.getTimeIn0Saturday(), daysOfWeeksTwentyth.getTimeOut0Saturday()));
		 daysOfWeeksTwentyth.setTotalMondayTime(daysOfWeeksTwentyth.dailyTotal(daysOfWeeksTwentyth.getTimeIn0Monday(), daysOfWeeksTwentyth.getTimeOut0Monday()));
		 daysOfWeeksTwentyth.setTotalTuedayTime(daysOfWeeksTwentyth.dailyTotal(daysOfWeeksTwentyth.getTimeIn0Tuesady(), daysOfWeeksTwentyth.getTimeOut0Tuesday()));
		 daysOfWeeksTwentyth.setTotalWednesdayTime(daysOfWeeksTwentyth.dailyTotal(daysOfWeeksTwentyth.getTimeIn0Wednesday(), daysOfWeeksTwentyth.getTimeOut0Wednesday()));
		 daysOfWeeksTwentyth.settotalFridayTime(daysOfWeeksTwentyth.dailyTotal(daysOfWeeksTwentyth.getTimeIn0Friday(), daysOfWeeksTwentyth.getTimeOut0Friday()));
		
		 daysofWeeksTwentyFrist.setTotalSaturdayTime(daysofWeeksTwentyFrist.dailyTotal(daysofWeeksTwentyFrist.getTimeIn0Saturday(),daysofWeeksTwentyFrist.getTimeOut0Saturday()));
		 
		 daysOfWeeksTwentySecond.setTotalWednesdayTime(daysOfWeeksTwentySecond.dailyTotal(daysOfWeeksTwentySecond.getTimeIn0Wednesday(), daysOfWeeksTwentySecond.getTimeOut0Wednesday()));
		 daysOfWeeksTwentySecond.setTotalThursdayTime(daysOfWeeksTwentySecond.dailyTotal(daysOfWeeksTwentySecond.getTimeIn0Thursday(), daysOfWeeksTwentySecond.getTimeOut0Thursday()));
		 daysOfWeeksTwentySecond.settotalFridayTime(daysOfWeeksTwentySecond.dailyTotal(daysOfWeeksTwentySecond.getTimeIn0Friday(), daysOfWeeksTwentySecond.getTimeOut0Friday()));
		 
		 
		 daysOfWeeksTwentythird.setTotalMondayTime(daysOfWeeksTwentythird.dailyTotal(daysOfWeeksTwentythird.getTimeIn0Monday(), daysOfWeeksTwentythird.getTimeOut0Monday()));
		 daysOfWeeksTwentythird.setTotalTuedayTime(daysOfWeeksTwentythird.dailyTotal(daysOfWeeksTwentythird.getTimeIn0Tuesady(), daysOfWeeksTwentythird.getTimeOut0Tuesday()));
		 daysOfWeeksTwentythird.setTotalWednesdayTime(daysOfWeeksTwentythird.dailyTotal(daysOfWeeksTwentythird.getTimeIn0Wednesday(), daysOfWeeksTwentythird.getTimeOut0Wednesday()));
		 daysOfWeeksTwentythird.setTotalThursdayTime(daysOfWeeksTwentythird.dailyTotal(daysOfWeeksTwentythird.getTimeIn0Thursday(), daysOfWeeksTwentythird.getTimeOut0Thursday()));
		 daysOfWeeksTwentythird.settotalFridayTime(daysOfWeeksTwentythird.dailyTotal(daysOfWeeksTwentythird.getTimeIn0Friday(), daysOfWeeksTwentythird.getTimeOut0Friday()));
			
		 
		 daysOfWeeksTwentyFourth.setTotalMondayTime(daysOfWeeksTwentyFourth.dailyTotal(daysOfWeeksTwentyFourth.getTimeIn0Monday(), daysOfWeeksTwentyFourth.getTimeOut0Monday()));
		 daysOfWeeksTwentyFourth.setTotalTuedayTime(daysOfWeeksTwentyFourth.dailyTotal(daysOfWeeksTwentyFourth.getTimeIn0Tuesady(), daysOfWeeksTwentyFourth.getTimeOut0Tuesday()));
		 daysOfWeeksTwentyFourth.setTotalThursdayTime(daysOfWeeksTwentyFourth.dailyTotal(daysOfWeeksTwentyFourth.getTimeIn0Thursday(), daysOfWeeksTwentyFourth.getTimeOut0Thursday()));
		 daysOfWeeksTwentyFourth.settotalFridayTime(daysOfWeeksTwentyFourth.dailyTotal(daysOfWeeksTwentyFourth.getTimeIn0Friday(), daysOfWeeksTwentyFourth.getTimeOut0Friday()));
			
		 daysOfWeeksTwentyFifith.setTotalSaturdayTime(daysOfWeeksTwentyFifith.dailyTotal(daysOfWeeksTwentyFifith.getTimeIn0Saturday(), daysOfWeeksTwentyFifith.getTimeOut0Saturday()));
		 daysOfWeeksTwentyFifith.setTotalSundayTime(daysOfWeeksTwentyFifith.dailyTotal(daysOfWeeksTwentyFifith.getTimeIn0Sunday(), daysOfWeeksTwentyFifith.getTimeOut0Sunday()));
		 daysOfWeeksTwentyFifith.setTotalThursdayTime(daysOfWeeksTwentyFifith.dailyTotal(daysOfWeeksTwentyFifith.getTimeIn0Thursday(), daysOfWeeksTwentyFifith.getTimeOut0Thursday()));
		  
		 dayOfWeeksTwentySeventh.settotalFridayTime(dayOfWeeksTwentySeventh.dailyTotal(dayOfWeeksTwentySeventh.getTimeIn0Friday(), dayOfWeeksTwentySeventh.getTimeOut0Friday()));
		
		 daysOfWeeksTwentyEighth.setTotalMondayTime(daysOfWeeksTwentyEighth.dailyTotal(daysOfWeeksTwentyEighth.getTimeIn0Monday(), daysOfWeeksTwentyEighth.getTimeOut0Monday()));
		 daysOfWeeksTwentyEighth.setTotalTuedayTime(daysOfWeeksTwentyEighth.dailyTotal(daysOfWeeksTwentyEighth.getTimeIn0Tuesady(), daysOfWeeksTwentyEighth.getTimeOut0Tuesday()));
		 daysOfWeeksTwentyEighth.setTotalWednesdayTime(daysOfWeeksTwentyEighth.dailyTotal(daysOfWeeksTwentyEighth.getTimeIn0Wednesday(), daysOfWeeksTwentyEighth.getTimeOut0Wednesday()));
		 daysOfWeeksTwentyEighth.setTotalThursdayTime(daysOfWeeksTwentyEighth.dailyTotal(daysOfWeeksTwentyEighth.getTimeIn0Thursday(), daysOfWeeksTwentyEighth.getTimeOut0Thursday()));
		 
		 daysOfWeeksThirtieth.setTotalSaturdayTime(daysOfWeeksThirtieth.dailyTotal(daysOfWeeksThirtieth.getTimeIn0Saturday(), daysOfWeeksThirtieth.getTimeOut0Saturday()));
		 
			*/	
			
	     //Constructors with parameters
	     WeeklyCalculations weekOne = new WeeklyCalculations(datesOfWeekOne.getSaturdayTotal(),datesOfWeekOne.getSundayTotal(),datesOfWeekOne.getMondayTotal(),datesOfWeekOne.getThursdayTotal());
	     WeeklyCalculations weekTwo = new WeeklyCalculations(datesOfWeekTwo.getSundayTotal(), datesOfWeekTwo.getMondayTotal(), datesOfWeekTwo.getThursdayTotal(),datesOfWeekTwo.getFridayTotal());
	     WeeklyCalculations weekThree = new WeeklyCalculations(datesOfWeekThree.getSaturdayTotal(),datesOfWeekThree.getSundayTotal() ,datesOfWeekThree.getMondayTotal(),datesOfWeekThree.getThursdayTotal(),datesOfWeekThree.getFridayTotal());
	     WeeklyCalculations weekFour = new WeeklyCalculations(datesOfWeekFour.getSaturdayTotal(), datesOfWeekFour.getSundayTotal(),datesOfWeekFour.getMondayTotal(),datesOfWeekFour.getWednesdayTotal(),datesOfWeekFour.getThursdayTotal(),datesOfWeekFour.getFridayTotal());
	     /*WeeklyCalculations weekFive = new WeeklyCalculations(daysOfWeeksFive.getTotalSaturdayTime(), daysOfWeeksFive.getTotalMondayTime(), daysOfWeeksFive.getTotalWednesdayTime(), daysOfWeeksFive.getTotalThursdayTime(), daysOfWeeksFive.gettotalFridayTime());
	     /*WeeklyCalculations weekSix = new WeeklyCalculations(daysOfWeeksSix.getTotalSaturdayTime(),daysOfWeeksSix.getTotalSundayTime(),daysOfWeeksSix.getTotalMondayTime(),daysOfWeeksSix.getTotalWednesdayTime(),daysOfWeeksSix.getTotalThursdayTime(),daysOfWeeksSix.gettotalFridayTime());
	     WeeklyCalculations weekSeven = new WeeklyCalculations(daysOfWeekSeven.getTotalSaturdayTime(),daysOfWeekSeven.getTotalMondayTime(),daysOfWeekSeven.getTotalWednesdayTime(),daysOfWeekSeven.getTotalThursdayTime(),daysOfWeekSeven.gettotalFridayTime());
	     WeeklyCalculations weekEight = new WeeklyCalculations(daysOfWeeksEight.getTotalSaturdayTime(),daysOfWeeksEight.getTotalSundayTime());
	     WeeklyCalculations weekNine = new WeeklyCalculations(daysOfWeeksNine.getTotalSaturdayTime(),daysOfWeeksNine.getTotalSundayTime(),daysOfWeeksNine.getTotalMondayTime(),daysOfWeeksNine.getTotalWednesdayTime());
	     WeeklyCalculations weekTen = new WeeklyCalculations(daysOfWeeksTen.getTotalSaturdayTime(),daysOfWeeksTen.getTotalSundayTime(),daysOfWeeksTen.getTotalMondayTime(),daysOfWeeksTen.getTotalThursdayTime(),daysOfWeeksTen.gettotalFridayTime());
	     WeeklyCalculations weekEleven = new WeeklyCalculations(daysOfWeeksEleven.getTotalSaturdayTime(),daysOfWeeksEleven.getTotalSundayTime(),daysOfWeeksEleven.getTotalMondayTime());
	     WeeklyCalculations weekTwelve= new WeeklyCalculations(daysOfWeeksTwelve.getTotalMondayTime(), daysOfWeeksTwelve.getTotalThursdayTime(), daysOfWeeksTwelve.gettotalFridayTime());
		 WeeklyCalculations weekThriteen = new WeeklyCalculations(daysOfWeeksThriteen.getTotalSaturdayTime(),daysOfWeeksThriteen.getTotalMondayTime(),daysOfWeeksThriteen.getTotalThursdayTime(),daysOfWeeksThriteen.gettotalFridayTime());
	     WeeklyCalculations weekForteenth = new WeeklyCalculations(daysOfWeeksForteenth.getTotalSaturdayTime(),daysOfWeeksForteenth.getTotalSundayTime(),daysOfWeeksForteenth.getTotalMondayTime(),daysOfWeeksForteenth.getTotalTuedayTime(),daysOfWeeksForteenth.getTotalWednesdayTime(),daysOfWeeksForteenth.getTimeOut0Thursday(),daysOfWeeksForteenth.gettotalFridayTime());
	     WeeklyCalculations weekFifteenth = new WeeklyCalculations(daysOfWeeksFifteenth.getTotalMondayTime(),daysOfWeeksFifteenth.getTotalWednesdayTime(),daysOfWeeksFifteenth.getTotalThursdayTime(),daysOfWeeksFifteenth.gettotalFridayTime());
	     WeeklyCalculations weekSixteenth= new WeeklyCalculations(daysOfWeeksSixteenth.getTotalSundayTime(),daysOfWeeksSixteenth.getTotalMondayTime(),daysOfWeeksSixteenth.getTotalWednesdayTime(),daysOfWeeksSixteenth.gettotalFridayTime());
	     WeeklyCalculations weekSeventeenth = new WeeklyCalculations(daysOfWeekSeventeenth.getTotalSundayTime(), daysOfWeekSeventeenth.getTotalMondayTime(), daysOfWeekSeventeenth.getTotalWednesdayTime(), daysOfWeekSeventeenth.getTotalThursdayTime(), daysOfWeekSeventeenth.gettotalFridayTime());
	     WeeklyCalculations weekEightteenth = new WeeklyCalculations(daysOfWeekEightteenth.getTotalSundayTime(),daysOfWeekEightteenth.getTotalMondayTime(),daysOfWeekEightteenth.getTotalTuedayTime(),daysOfWeekEightteenth.getTotalWednesdayTime(),daysOfWeekEightteenth.gettotalFridayTime());
	     WeeklyCalculations weekNinteenth = new WeeklyCalculations(daysOfWeeksNinteenth.getTotalSundayTime(), daysOfWeeksNinteenth.getTotalMondayTime(), daysOfWeeksNinteenth.getTotalTuedayTime(), daysOfWeeksNinteenth.getTotalWednesdayTime(), daysOfWeeksNinteenth.gettotalFridayTime());
	     WeeklyCalculations weekTwentyth = new WeeklyCalculations(daysOfWeeksTwentyth.getTotalSaturdayTime(),daysOfWeeksTwentyth.getTotalMondayTime(),daysOfWeeksTwentyth.getTotalTuedayTime(),daysOfWeeksTwentyth.getTotalWednesdayTime(),daysOfWeeksTwentyth.gettotalFridayTime());
	     WeeklyCalculations weekTwentyFrist = new WeeklyCalculations(daysofWeeksTwentyFrist.getTotalSaturdayTime());
	     WeeklyCalculations weekTwentySecond = new WeeklyCalculations(daysOfWeeksTwentySecond.getTotalWednesdayTime(), daysOfWeeksTwentySecond.getTotalThursdayTime(), daysOfWeeksTwentySecond.gettotalFridayTime());
	     WeeklyCalculations weekTwentyThird  = new WeeklyCalculations(daysOfWeeksTwentythird.getTotalMondayTime(), daysOfWeeksTwentythird.getTotalTuedayTime(), daysOfWeeksTwentythird.getTotalWednesdayTime(), daysOfWeeksTwentythird.getTotalThursdayTime(), daysOfWeeksTwentythird.gettotalFridayTime());
	     WeeklyCalculations weekTwentyFourth = new WeeklyCalculations(daysOfWeeksTwentyFourth.getTotalMondayTime(), daysOfWeeksTwentyFourth.getTotalTuedayTime(), daysOfWeeksTwentyFourth.getTotalThursdayTime(),daysOfWeeksTwentyFourth.gettotalFridayTime());
	     WeeklyCalculations weekTwentyFifith = new WeeklyCalculations(daysOfWeeksTwentyFifith.getTotalSaturdayTime(), daysOfWeeksTwentyFifith.getTotalSundayTime(), daysOfWeeksTwentyFifith.getTotalThursdayTime());
	     WeeklyCalculations weekTwentySixth = new WeeklyCalculations();
	     WeeklyCalculations weekTwentySeventh= new WeeklyCalculations(dayOfWeeksTwentySeventh.gettotalFridayTime());
	     WeeklyCalculations weekTwentyEighth = new WeeklyCalculations(daysOfWeeksTwentyEighth.getTotalMondayTime(), daysOfWeeksTwentyEighth.getTotalTuedayTime(), daysOfWeeksTwentyEighth.getTotalWednesdayTime(), daysOfWeeksTwentyEighth.getTotalThursdayTime());
	     WeeklyCalculations weekTwentyNinth = new WeeklyCalculations();
	     WeeklyCalculations weekThirtieth = new WeeklyCalculations(daysOfWeeksThirtieth.getTotalSaturdayTime());
	     WeeklyCalculations weekThrityFirst = new WeeklyCalculations();
	     */
	     weekOne.setWeeklyTotalily(weekOne.convertHourlyTotalIntoWeeklyTotal(weekOne.getSaturdayTotal(),weekOne.getSundayTotal(),weekOne.getMondayTotal(),weekOne.getFridayTotal()));
	     weekTwo.setWeeklyTotalily(weekTwo.convertHourlyTotalIntoWeeklyTotal(weekTwo.getSaturdayTotal(),weekTwo.getSundayTotal(),weekTwo.getMondayTotal(),weekTwo.getFridayTotal()));
	     weekThree.setWeeklyTotalily(weekThree.convertHourlyTotalIntoWeeklyTotal(weekThree.getSaturdayTotal(),weekThree.getSundayTotal(),weekThree.getMondayTotal(),weekThree.getTuesdayTotal(),weekThree.getFridayTotal()));
	     weekFour.setWeeklyTotalily(weekFour.convertHourlyTotalIntoWeeklyTotal(weekFour.getSaturdayTotal(),weekFour.getSundayTotal(),weekFour.getMondayTotal(),weekFour.getTuesdayTotal(),weekFour.getFridayTotal()));
	     /*weekFive.setWeeklyTotalily(weekFive.convertHourlyTotalIntoWeeklyTotal(weekFive.getSaturdayTotal(),weekFive.getSundayTotal(),weekFive.getMondayTotal(),weekFive.getTuesdayTotal(),weekFive.getFridayTotal()));
	     /*weekSix.setWeeklyTotalily(weekSix.convertHourlyTotalIntoWeeklyTotal(weekSix.getSaturdayTotal(),weekSix.getSundayTotal(),weekSix.getMondayTotal(),weekSix.getTuesdayTotal(),weekSix.getThursdayTotal(),weekSix.getFridayTotal()));
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
	     weekTwentySixth.setWeeklyTotalily(0);
	     weekTwentySeventh.setWeeklyTotalily(weekTwentySeventh.convertHourlyTotalIntoWeeklyTotal(weekTwentySeventh.getSaturdayTotal()));
	     weekTwentyEighth.setWeeklyTotalily(weekTwentyEighth.convertHourlyTotalIntoWeeklyTotal(weekTwentyEighth.getSaturdayTotal(),weekTwentyEighth.getSundayTotal(),weekTwentyEighth.getMondayTotal(),weekTwentyEighth.getFridayTotal()));
	     weekTwentyNinth.setWeeklyTotalily(0);
	     weekThirtieth.setWeeklyTotalily(weekThirtieth.getSaturdayTotal());
	     weekThrityFirst.setWeeklyTotalily(0);
	     */
	     
	     weekOne.setSummedHours(weekOne.WeeklyTotal(weekOne.getWeeklyTotalily()));
	     weekTwo.setSummedHours(weekTwo.WeeklyTotal(weekOne.getSummedHours(),weekTwo.getWeeklyTotalily()));
	     weekThree.setSummedHours(weekThree.WeeklyTotal(weekTwo.getSummedHours(),weekThree.getWeeklyTotalily()));
	     weekFour.setSummedHours(weekFour.WeeklyTotal(weekThree.getSummedHours(),weekFour.getWeeklyTotalily()));
	     /*weekFive.setSummedHours(weekFive.WeeklyTotal(weekFour.getSummedHours(),weekFive.getWeeklyTotalily()));
	     /*weekSix.setSummedHours(weekSix.WeeklyTotal(weekFive.getSummedHours(),weekSix.getWeeklyTotalily()));
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
	     weekTwentyFifith.setSummedHours(weekTwentyFifith.WeeklyTotal(weekTwentyFifith.getWeeklyTotalily(),weekTwentyFourth.getSummedHours()));
	     weekTwentySixth.setSummedHours(weekTwentySixth.WeeklyTotal(weekTwentyFifith.getSummedHours(),weekTwentySixth.getWeeklyTotalily()));
	     weekTwentySeventh.setSummedHours(weekTwentySeventh.WeeklyTotal(weekTwentySixth.getSummedHours(),weekTwentySeventh.getWeeklyTotalily()));
	     weekTwentyEighth.setSummedHours(weekTwentyEighth.WeeklyTotal(weekTwentyEighth.getWeeklyTotalily(),weekTwentySeventh.getSummedHours()));
	     weekTwentyNinth.setSummedHours(weekTwentyNinth.WeeklyTotal(weekTwentyNinth.getWeeklyTotalily(),weekTwentyEighth.getSummedHours()));
	     weekThirtieth.setSummedHours(weekThirtieth.WeeklyTotal(weekThirtieth.getWeeklyTotalily(),weekTwentyNinth.getSummedHours()));
	     weekThrityFirst.setSummedHours(weekThrityFirst.convertHourlyTotalIntoWeeklyTotal(weekThrityFirst.getWeeklyTotalily(),weekThirtieth.getSummedHours()));
	     */
	     weekOne.setSummedHoursMinusTotalHours(weekOne.WeeklyTotalMinusTotalAmountOfHours(weekOne.getSummedHours()));
	     weekTwo.setSummedHoursMinusTotalHours(weekTwo.WeeklyTotalMinusTotalAmountOfHours(weekTwo.getSummedHours()));
	     weekThree.setSummedHoursMinusTotalHours(weekThree.WeeklyTotalMinusTotalAmountOfHours(weekThree.getSummedHours()));
	     weekFour.setSummedHoursMinusTotalHours(weekFour.WeeklyTotalMinusTotalAmountOfHours(weekFour.getSummedHours()));
	     /*weekFive.setSummedHoursMinusTotalHours(weekFive.WeeklyTotalMinusTotalAmountOfHours(weekFive.getSummedHours()));
	     /*weekSix.setSummedHoursMinusTotalHours(weekSix.WeeklyTotalMinusTotalAmountOfHours(weekSix.getSummedHours()));
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
	     */
	     weekTwo.setPaychecks(weekOne.paycheck(weekOne.getWeeklyTotalily(),weekTwo.getWeeklyTotalily()));
	     weekFour.setPaychecks(weekThree.paycheck(weekFour.getWeeklyTotalily(), weekFour.getWeeklyTotalily()));
	     /*weekFive.setPaychecks(weekFive.paycheck(weekFour.getWeeklyTotalily(), weekFive.getWeeklyTotalily()));
	     weekSeven.setPaychecks(weekSeven.paycheck(weekSix.getWeeklyTotalily(), weekSeven.getWeeklyTotalily()));
	     weekNine.setPaychecks(weekNine.paycheck(weekEight.getWeeklyTotalily(), weekNine.getWeeklyTotalily()));
	     weekEleven.setPaychecks(weekEleven.paycheck(weekTen.getWeeklyTotalily(), weekEleven.getWeeklyTotalily()));
	     weekThriteen.setPaychecks(weekThriteen.paycheck(weekThriteen.getWeeklyTotalily(), weekTwelve.getWeeklyTotalily()));
	     weekFifteenth.setPaychecks(weekFifteenth.paycheck(weekFifteenth.getWeeklyTotalily(), weekForteenth.getWeeklyTotalily()));
	     weekSeventeenth.setPaychecks(weekSeventeenth.paycheck(weekSeventeenth.getWeeklyTotalily(), weekSixteenth.getWeeklyTotalily()));
	     weekNinteenth.setPaychecks(weekNinteenth.paycheck(weekNinteenth.getWeeklyTotalily(), weekEightteenth.getWeeklyTotalily()));
	     weekTwentyFrist.setPaychecks(weekTwentyFrist.paycheck(weekTwentyFrist.getWeeklyTotalily(), weekTwentyth.getWeeklyTotalily()));
	     weekTwentyThird.setPaychecks(weekTwentyThird.paycheck(weekTwentyThird.getWeeklyTotalily(), weekTwentySecond.getWeeklyTotalily()));
	     weekTwentyFifith.setPaychecks(weekTwentyFifith.paycheck(weekTwentyFourth.getWeeklyTotalily(), weekTwentyFifith.getWeeklyTotalily()));
	     weekTwentySeventh.setPaychecks(weekTwentySeventh.paycheck(weekTwentySeventh.getWeeklyTotalily(), weekTwentySixth.getWeeklyTotalily()));
	     weekTwentyNinth.setPaychecks(weekTwentyNinth.paycheck(weekTwentyEighth.getWeeklyTotalily(),weekTwentyNinth.getWeeklyTotalily()));
	     weekThrityFirst.setPaychecks(weekThrityFirst.paycheck(weekThirtieth.getWeeklyTotalily(), weekThrityFirst.getWeeklyTotalily()));
	     */
	     System.out.println(" # of weeks |     dates        | hours  | total hours | hours - 1560 | paychecks");  
	     System.out.printf("    1       | Jan 01 - Jan 07  | %.2f  |   %.2f     |    %.2f   | %n " , weekOne.getWeeklyTotalily() , weekOne.getSummedHours(),weekOne.getSummedHoursMinusTotalHours());
	     System.out.printf("   2       | Jan 08 - Jan 14  | %.2f  |   %.2f     |    %.2f   | %.2f %n " ,weekTwo.getWeeklyTotalily(),weekTwo.getSummedHours(),weekTwo.getSummedHoursMinusTotalHours(),weekTwo.getPaychecks());
	     System.out.printf("   3       | Jan 15 - Jan 21  | %.2f  |   %.2f    |    %.2f   |  %n",weekThree.getWeeklyTotalily(),weekThree.getSummedHours(), weekThree.getSummedHoursMinusTotalHours());
	     System.out.printf("    4       | Jan 22 - Jan 28  | %.2f  |   %.2f    |    %.2f   | %.2f %n",weekFour.getWeeklyTotalily() ,weekFour.getSummedHours() ,weekFour.getSummedHoursMinusTotalHours(),weekFour.getPaychecks());
	     /*System.out.printf("    5       | Jan 29 - Feb 04  | %.2f  |  %.2f     |    %.2f   | %.2f %n",  weekFive.getWeeklyTotalily(), weekFive.getSummedHours(),weekFive.getSummedHoursMinusTotalHours(),weekFive.getPaychecks());
	     /*System.out.printf("    6       | Feb 05 - Feb 11  | %.2f  |  %.2f     |    %.2f   | %n", weekSix.getWeeklyTotalily(), weekSix.getSummedHours(),weekSix.getSummedHoursMinusTotalHours());
	     System.out.printf("    7       | Feb 12 - Feb 18  | %.2f  |  %.2f     |    %.2f   | %.2f %n", weekSeven.getWeeklyTotalily(), weekSeven.getSummedHours(),weekSeven.getSummedHoursMinusTotalHours(),weekSeven.getPaychecks());
	     System.out.printf("    8       | Feb 19 - Feb 25  | %.2f  |  %.2f     |    %.2f   |%n", weekEight.getWeeklyTotalily(),weekEight.getSummedHours(),weekEight.getSummedHoursMinusTotalHours());
	     System.out.printf("    9       | Feb 26 - Mar  4  | %.2f  |  %.2f     |    %.2f   |%.2f %n",weekNine.getWeeklyTotalily(),weekNine.getSummedHours(),weekNine.getSummedHoursMinusTotalHours(), weekNine.getPaychecks() );
	     System.out.printf("    10      | Mar  5 - Mar 11  | %.2f  |  %.2f     |    %.2f   | %n",weekTen.getWeeklyTotalily(),weekTen.getSummedHours(), weekTen.getSummedHoursMinusTotalHours());
	     System.out.printf("    11      | Mar 12 - Mar 18  | %.2f  |  %.2f     |    %.2f   |%.2f %n ",weekEleven.getWeeklyTotalily(),weekEleven.getSummedHours(),weekEleven.getSummedHoursMinusTotalHours(), weekEleven.getPaychecks());
	     System.out.printf("   12      | Mar 19 - Mar 25  | %.2f  |  %.2f     |    %.2f   |  %n",weekTwelve.getWeeklyTotalily(),weekTwelve.getSummedHours(),weekTwelve.getSummedHoursMinusTotalHours());
	     System.out.printf("    13      | Mar 25 - Apr  1  | %.2f  |  %.2f     |    %.2f   | %n ",weekTwelve.getWeeklyTotalily(),weekTwelve.getSummedHours(),weekTwelve.getSummedHoursMinusTotalHours());
	     System.out.printf("   14      | Apr  2 - Apr  8  | %.2f  |  %.2f     |    %.2f   | %.2f %n",weekThriteen.getWeeklyTotalily(),weekThriteen.getSummedHours(),weekThriteen.getSummedHoursMinusTotalHours(),weekThriteen.getPaychecks());
	     System.out.printf("    15      | Apr  9 - Apr 15  | %.2f  |  %.2f     |    %.2f   | %n", weekForteenth.getWeeklyTotalily(),weekForteenth.getSummedHours(),weekForteenth.getSummedHoursMinusTotalHours());
	     System.out.printf("    16      | Apr 16- Apr  22  | %.2f  |  %.2f     |    %.2f   | %.2f %n",weekFifteenth.getWeeklyTotalily(),weekFifteenth.getSummedHours(),weekFifteenth.getSummedHoursMinusTotalHours(),weekFifteenth.getPaychecks());
	     System.out.printf("    17      | Apr 23 - Apr 29  | %.2f  |  %.2f     |    %.2f   | %n", weekSixteenth.getWeeklyTotalily(),weekSixteenth.getSummedHours(),weekSixteenth.getSummedHoursMinusTotalHours());
	     System.out.printf("    18      | Apr 30 - May  6  | %.2f  |  %.2f     |    %.2f   | %.2f %n",weekSeventeenth.getWeeklyTotalily(),weekSeventeenth.getSummedHours(),weekSeventeenth.getSummedHoursMinusTotalHours(),weekSeventeenth.getPaychecks());
	     System.out.printf("    19      | May  7 - May 13  | %.2f  |  %.2f     |    %.2f    |  %n",weekEightteenth.getWeeklyTotalily(), weekEightteenth.getSummedHours(),weekEightteenth.getSummedHoursMinusTotalHours());
	     System.out.printf("    20      | May 14 - May 20  | %.2f  |  %.2f     |    %.2f    | %.2f %n",weekNinteenth.getWeeklyTotalily(),weekNinteenth.getSummedHours(),weekNinteenth.getSummedHoursMinusTotalHours(),weekNinteenth.getPaychecks());
	     System.out.printf("    21      | May 21 - May 27  | %.2f  |  %.2f     |    %.2f    | %n",weekTwentyth.getWeeklyTotalily(),weekTwentyth.getSummedHours(),weekTwentyth.getSummedHoursMinusTotalHours());
	     System.out.printf("    22      | May 28 - Jun  5  | %.2f   |  %.2f     |    %.2f    | %.2f %n",weekTwentyFrist.getWeeklyTotalily(),weekTwentyFrist.getSummedHours(),weekTwentyFrist.getSummedHoursMinusTotalHours(),weekTwentyFrist.getPaychecks());
	     System.out.printf("    23      | Jun  6 - Jun 10  | %.2f  |  %.2f     |    %.2f    | %n ", weekTwentySecond.getWeeklyTotalily(), weekTwentySecond.getSummedHours(),weekTwentySecond.getSummedHoursMinusTotalHours());
	     System.out.printf("   24      | Jun 11 - Jun 17  | %.2f  |  %.2f     |    %.2f    | %.2f %n",weekTwentyThird.getWeeklyTotalily(),weekTwentyThird.getSummedHours(),weekTwentyThird.getSummedHoursMinusTotalHours(),weekTwentyThird.getPaychecks());
	     System.out.printf("    25      | Jun 18 - Jun 24  | %.2f  |  %.2f     |    %.2f    |  %n", weekTwentyFourth.getWeeklyTotalily(),weekTwentyFourth.getSummedHours(),weekTwentyFourth.getSummedHoursMinusTotalHours() );
	     System.out.printf("    26      | Jun 25 - Jul  1  | %.2f  |  %.2f     |    %.2f    | %.2f %n", weekTwentyFifith.getWeeklyTotalily(),weekTwentyFifith.getSummedHours(),weekTwentyFifith.getSummedHoursMinusTotalHours(),weekTwentyFifith.getPaychecks());
	     System.out.printf("    27      | Jul  2 - Jul  8  | %.2f   |  %.2f     |    %.2f    | %n", weekTwentySixth.getWeeklyTotalily(),weekTwentySixth.getSummedHours(),weekTwentySixth.getSummedHoursMinusTotalHours());
	     System.out.printf("    28      | Jul 9  - Jul 15  | %.2f   |  %.2f     |    %.2f    | %.2f %n",weekTwentySeventh.getWeeklyTotalily(),weekTwentySeventh.getSummedHours(),weekTwentySeventh.getSummedHoursMinusTotalHours(),weekTwentySeventh.getPaychecks() );
	     System.out.printf("    29      | Jul 16 - Jul 22  | %.2f  |  %.2f     |    %.2f    | %n", weekTwentyEighth.getWeeklyTotalily(),weekTwentyEighth.getSummedHours(),weekTwentyEighth.getSummedHoursMinusTotalHours());
	     System.out.printf("    30      | Jul 23 - Jul 29  | %.2f   |  %.2f     |    %.2f    | %.2f %n",weekTwentyNinth.getWeeklyTotalily(),weekTwentyNinth.getSummedHours(),weekTwentyNinth.getSummedHoursMinusTotalHours(),weekTwentyNinth.getPaychecks());
	     System.out.printf("    31      | Jul 31 - Aug  5  | %.2f   |  %.2f     |    %.2f    | %n",weekThirtieth.getWeeklyTotalily(),weekThirtieth.getSummedHours(),weekThirtieth.getSummedHoursMinusTotalHours());
	     System.out.printf("    32      | Aug  6 - Aug 12  | %.2f   |  %.2f     |    %.2f    | %.2f %n", weekThrityFirst.getWeeklyTotalily(),weekThrityFirst.getSummedHours(),weekThrityFirst.getSummedHoursMinusTotalHours(),weekThrityFirst.getPaychecks());
		*/
	}

}
