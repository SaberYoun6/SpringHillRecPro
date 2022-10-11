package monthly;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Logger;

import org.postgresql.core.v3.BatchedQuery;

import days.DailyCalculation;
import exceptions.DateNotFoundExecption;
import exceptions.DaysNotFoundExecption;
import exceptions.MonthsNotFoundExecption;
import hours.HourCalculation;
import weeks.WeeklyCalculations;

public class MonthlyCalculationImp implements MonthylyCalculations {

	private static Logger log = Logger.getLogger("Main.class");
	private Scanner keyboard = new Scanner(System.in);
	private double januaryTotal,februaryTotal,marchTotal,aprilTotal,mayTotal,juneTotal,julyTotal,augustTotal,septemberTotal,octoberTotal,novemberTotal,decemberTotal = 0.0;
	
	
	public double getJanuaryTotal() {
		return januaryTotal;
	}
	public void setJanuaryTotal(double januaryTotal) {
		this.januaryTotal = januaryTotal;
	}
	public double getFebruaryTotal() {
		return februaryTotal;
	}
	public void setFebruaryTotal(double februaryTotal) {
		this.februaryTotal = februaryTotal;
	}
	public double getMarchTotal() {
		return marchTotal;
	}
	public void setMarchTotal(double marchTotal) {
		this.marchTotal = marchTotal;
	}
	public double getAprilTotal() {
		return aprilTotal;
	}
	public void setAprilTotal(double aprilTotal) {
		this.aprilTotal = aprilTotal;
	}
	public double getMayTotal() {
		return mayTotal;
	}
	public void setMayTotal(double mayTotal) {
		this.mayTotal = mayTotal;
	}
	public double getJuneTotal() {
		return juneTotal;
	}
	public void setJuneTotal(double juneTotal) {
		this.juneTotal = juneTotal;
	}
	public double getJulyTotal() {
		return julyTotal;
	}
	public void setJulyTotal(double julyTotal) {
		this.julyTotal = julyTotal;
	}
	public double getAugustTotal() {
		return augustTotal;
	}
	public void setAugustTotal(double augustTotal) {
		this.augustTotal = augustTotal;
	}
	public double getSeptemberTotal() {
		return septemberTotal;
	}
	public void setSeptemberTotal(double septemberTotal) {
		this.septemberTotal = septemberTotal;
	}
	public double getOctoberTotal() {
		return octoberTotal;
	}
	public void setOctoberTotal(double octoberTotal) {
		this.octoberTotal = octoberTotal;
	}
	public double getNovemberTotal() {
		return novemberTotal;
	}
	public void setNovemberTotal(double novemberTotal) {
		this.novemberTotal = novemberTotal;
	}
	public double getDecemberTotal() {
		return decemberTotal;
	}
	public void setDecemberTotal(double decemberTotal) {
		this.decemberTotal = decemberTotal;
	}
	public double [] arrangingDates (String genDates, double [] ar ,int size )  {
		int sizes=size+1;
		double [] ars= new double [sizes];
		String [] dates=genDates.split(" ");
		DailyCalculation todayCal = new DailyCalculation();
		HourCalculation hourCal = new HourCalculation(); 
		try {
			hourCal.setHourlyValuesForDates(genDates, ar);
		} catch (DaysNotFoundExecption e) {
			e.printStackTrace();
		}
		for (int i = 1 ; i <= sizes ;i++) {
			if( Integer.getInteger(dates[2]) == 1 && Integer.getInteger(dates[3]) < size) {
				todayCal.setDailyTotal(todayCal.hourlyConvertedIntoDaily(hourCal.getDayIn0(), hourCal.getDayOut0(), hourCal.getDayIn1(), hourCal.getDayOut1() ));
				ars[i]=todayCal.getDailyTotal();
				if  (Integer.getInteger(dates[2]) <= size) {
					todayCal.setDailyTotal(todayCal.hourlyConvertedIntoDaily(hourCal.getDayIn0(),hourCal.getDayOut0()));
					ars[i]=todayCal.getDailyTotal();	
				}
			}
		}
		return ars;
		}
			
	@Override
	public double [] monthName(String genDate, double[] ar) {
		String [] genericDates = genDate.split(" ");
		double [] monthlyTotality = new double [12];
		switch (genericDates[1]) {
		case "January":
			this.setJanuaryTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[0] = getJanuaryTotal();
			break;
		case "February":
			this.setFebruaryTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[1]= getFebruaryTotal();
			break;
		case "March": 
			this.setMarchTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[2]=getMarchTotal();
			break;
		case "April":
			for (double dates : ar) 
			this.setAprilTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[3]=getAprilTotal();
			break;
		case "May":
			this.setMayTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[4]=getMayTotal();
			break; 
		case "June":
			this.setJuneTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[5]= getJuneTotal();
			break;
		case "July" : 
			this.setJulyTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[6]=getJulyTotal();
			break;
		case "August":

			this.setAugustTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[7]=getAugustTotal();
			break;
		case "September":
			this.setSeptemberTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[8]=getSeptemberTotal();
			break;
		case "October":
		
				this.setOctoberTotal(dailyConvertMonthlyTotal(ar));
				monthlyTotality[9]= getOctoberTotal();
				break;
		case "November":
			this.setNovemberTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[10]= getNovemberTotal();
			break;
		case "December":
			this.setDecemberTotal(dailyConvertMonthlyTotal(ar));
			monthlyTotality[11]=getDecemberTotal();
			break;
		default:
			System.out.println("they error occured month not found ");
	}
		return monthlyTotality;
	}
		
		@Override
		public double dailyConvertMonthlyTotal(double[] days) {
		  double MonthlyTotal = 0.0;
		  for (double day: days) {
			  MonthlyTotal= MonthlyTotal + day;
		  }
			return MonthlyTotal;
		}
		


}
