package hours;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Logger;

import exceptions.DaysNotFoundExecption;

public class HourCalculation implements Hours {
	private static Logger log = Logger.getLogger("Main.class");
	private double timeIn0Saturday,timeOut0Saturday,timein1Saturday,timeOut1Saturday,timeIn0Sunday,timeOut0Sunday,timeIn1Sunday,timeOut1Sunday,timeIn0Monday,timeOut0Monday,timeIn1Monday,timeOut1Monday,timeIn0Tuesady,timeOut0Tuesday,timeIn1Tuesday,timeOut1Tuesday,timeOut0Wednesday,timeIn0Wednesday,timeOut1Wednesday,timeIn1Wednesday,timeOut0Thursday,timeIn0Thursday,timeOut1Thursday,timeIn1Thursday, timeOut0Friday,timeIn0Friday,timeIn1Friday,timeOut1Friday=0.0;
	private double dayIn0,dayOut0,dayIn1,dayOut1;
	public double getDayIn0() {
		return dayIn0;
	}

	public void setDayIn0(double dayIn0) {
		this.dayIn0 = dayIn0;
	}

	public double getDayOut0() {
		return dayOut0;
	}

	public void setDayOut0(double dayOut0) {
		this.dayOut0 = dayOut0;
	}

	public double getDayIn1() {
		return dayIn1;
	}

	public void setDayIn1(double dayIn1) {
		this.dayIn1 = dayIn1;
	}

	public double getDayOut1() {
		return dayOut1;
	}

	public void setDayOut1(double dayOut1) {
		this.dayOut1 = dayOut1;
	}
	
	public double getTimeOut0Wednesday() {
		return timeOut0Wednesday;
	}

	public void setTimeOut0Wednesday(double timeOut0Wednesday) {
		this.timeOut0Wednesday = timeOut0Wednesday;
	}

	public double getTimeIn0Wednesday() {
		return timeIn0Wednesday;
	}

	public void setTimeIn0Wednesday(double timeIn0Wednesday) {
		this.timeIn0Wednesday = timeIn0Wednesday;
	}
	public double getTimeOut1Wednesday() {
		return timeOut1Wednesday;
	}
	public void setTimeOut1Wednesday(double timeOut1Wednesday) {
		this.timeOut1Wednesday = timeOut1Wednesday;
	}
	public double getTimeIn1Wednesday() {
		return timeIn1Wednesday;
	}
	public void setTimeIn1Wednesday(double timeIn1Wednesday) {
		this.timeIn1Wednesday = timeIn1Wednesday;
	}
	public double getTimeOut0Thursday() {
		return timeOut0Thursday;
	}
	public void setTimeOut0Thursday(double timeOut0Thursday) {
		this.timeOut0Thursday = timeOut0Thursday;
	}
	public double getTimeIn0Thursday() {
		return timeIn0Thursday;
	}
	public void setTimeIn0Thursday(double timeIn0Thursday) {
		this.timeIn0Thursday = timeIn0Thursday;
	}
	public double getTimeOut1Thursday() {
		return timeOut1Thursday;
	}
	public void setTimeOut1Thursday(double timeOut1Thursday) {
		this.timeOut1Thursday = timeOut1Thursday;
	}
	public double getTimeIn1Thursday() {
		return timeIn1Thursday;
	}
	public void setTimeIn1Thursday(double timeIn1Thursday) {
		this.timeIn1Thursday = timeIn1Thursday;
	}
	public double getTimeOut0Friday() {
		return timeOut0Friday;
	}

	public void setTimeOut0Friday(double timeOut0Friday) {
		this.timeOut0Friday = timeOut0Friday;
	}

	public double getTimeIn0Friday() {
		return timeIn0Friday;
	}

	public void setTimeIn0Friday(double timeIn0Friday) {
		this.timeIn0Friday = timeIn0Friday;
	}

	public double getTimeIn1Friday() {
		return timeIn1Friday;
	}

	public void setTimeIn1Friday(double timeIn1Friday) {
		this.timeIn1Friday = timeIn1Friday;
	}

	public double getTimeOut1Friday() {
		return timeOut1Friday;
	}

	public void setTimeOut1Friday(double timeOut1Friday) {
		this.timeOut1Friday = timeOut1Friday;
	}

	public double getTimeIn0Saturday() {
		return timeIn0Saturday;
	}

	public void setTimeIn0Saturday(double timeIn0Saturday) {
		this.timeIn0Saturday = timeIn0Saturday;
	}

	public double getTimeOut0Saturday() {
		return timeOut0Saturday;
	}

	public void setTimeOut0Saturday(double timeOut0Saturday) {
		this.timeOut0Saturday = timeOut0Saturday;
	}

	public double getTimein1Saturday() {
		return timein1Saturday;
	}

	public void setTimein1Saturday(double timein1Saturday) {
		this.timein1Saturday = timein1Saturday;
	}

	public double getTimeOut1Saturday() {
		return timeOut1Saturday;
	}

	public void setTimeOut1Saturday(double timeOut1Saturday) {
		this.timeOut1Saturday = timeOut1Saturday;
	}

	public double getTimeIn0Sunday() {
		return timeIn0Sunday;
	}

	public void setTimeIn0Sunday(double timeIn0Sunday) {
		this.timeIn0Sunday = timeIn0Sunday;
	}

	public double getTimeOut0Sunday() {
		return timeOut0Sunday;
	}

	public void setTimeOut0Sunday(double timeOut0Sunday) {
		this.timeOut0Sunday = timeOut0Sunday;
	}

	public double getTimeIn1Sunday() {
		return timeIn1Sunday;
	}

	public void setTimeIn1Sunday(double timeIn1Sunday) {
		this.timeIn1Sunday = timeIn1Sunday;
	}

	public double getTimeOut1Sunday() {
		return timeOut1Sunday;
	}

	public void setTimeOut1Sunday(double timeOut1Sunday) {
		this.timeOut1Sunday = timeOut1Sunday;
	}

	public double getTimeIn0Monday() {
		return timeIn0Monday;
	}

	public void setTimeIn0Monday(double timeIn0Monday) {
		this.timeIn0Monday = timeIn0Monday;
	}

	public double getTimeOut0Monday() {
		return timeOut0Monday;
	}

	public void setTimeOut0Monday(double timeOut0Monday) {
		this.timeOut0Monday = timeOut0Monday;
	}

	public double getTimeIn1Monday() {
		return timeIn1Monday;
	}

	public void setTimeIn1Monday(double timeIn1Monday) {
		this.timeIn1Monday = timeIn1Monday;
	}

	public double getTimeOut1Monday() {
		return timeOut1Monday;
	}

	public void setTimeOut1Monday(double timeOut1Monday) {
		this.timeOut1Monday = timeOut1Monday;
	}

	public double getTimeIn0Tuesady() {
		return timeIn0Tuesady;
	}

	public void setTimeIn0Tuesady(double timeIn0Tuesady) {
		this.timeIn0Tuesady = timeIn0Tuesady;
	}

	public double getTimeOut0Tuesday() {
		return timeOut0Tuesday;
	}

	public void setTimeOut0Tuesday(double timeOut0Tuesday) {
		this.timeOut0Tuesday = timeOut0Tuesday;
	}

	public double getTimeIn1Tuesday() {
		return timeIn1Tuesday;
	}

	public void setTimeIn1Tuesday(double timeIn1Tuesday) {
		this.timeIn1Tuesday = timeIn1Tuesday;
	}

	public double getTimeOut1Tuesday() {
		return timeOut1Tuesday;
	}

	public void setTimeOut1Tuesday(double timeOut1Tuesday) {
		this.timeOut1Tuesday = timeOut1Tuesday;
		
	}
	@Override
	public double [] arrayOfHoursValues( String genDate, String genDateOne,Hashtable<String,Double> dates) {
		double [] ar= {0.0,0.0,0.0,0.0} ;
		if (dates.containsKey(genDate + " In")) {
			ar[0] = dates.get(genDate + " In");
			ar[1] = dates.get(genDate + " Out");
		}
		if(dates.containsKey(genDateOne + " In")) {
			ar[2] = dates.get(genDateOne + " In");
			ar[3] = dates.get(genDateOne + " Out" );
		}
		return ar;
	}
	// the objective of this is to read in based upon the zero split in which is supposed to be a day / option then to put the values into buckets and set those ones into the proper
	//bucket 
	@Override
	public void setHourlyValuesForDates(String genDate,double[] ar) throws DaysNotFoundExecption {
		String[] genDateValue= genDate.split(" ");
		switch(genDateValue[0]){
		case "Saturday":
			this.setDayIn0(ar[0]);
			this.setDayOut0(ar[1]);
			this.setDayIn1(ar[2]);
			this.setDayOut1(ar[3]);
			this.setTimeIn0Saturday(getDayIn0());
			this.setTimeOut0Saturday(getDayOut0());
			this.setTimein1Saturday(getDayIn1());
			this.setTimeOut1Saturday(getDayOut1());
			break;
		case "Sunday":
			this.setDayIn0(ar[0]);
			this.setDayOut0(ar[1]);
			this.setDayIn1(ar[2]);
			this.setDayOut1(ar[3]);
			this.setTimeIn0Sunday(getDayIn0());
			this.setTimeOut0Sunday(getDayOut0());
			this.setTimeIn1Sunday(getDayIn1());
			this.setTimeOut1Sunday(getDayOut1());
			break;
		case "Monday":
			this.setDayIn0(ar[0]);
			this.setDayOut0(ar[1]);
			this.setDayIn1(ar[2]);
			this.setDayOut1(ar[3]);
			this.setTimeIn0Monday(getDayIn0());
			this.setTimeOut0Monday(getDayOut0());
			this.setTimeIn1Monday(getDayIn1());
			this.setTimeOut1Monday(getDayOut1());
			break;
		case "Tuesday":
			this.setDayIn0(ar[0]);
			this.setDayOut0(ar[1]);
			this.setDayIn1(ar[2]);
			this.setDayOut1(ar[3]);
			this.setTimeIn0Tuesady(getDayIn0());
			this.setTimeOut0Tuesday(getDayOut0());
			this.setTimeIn1Tuesday(getDayIn1());
			this.setTimeOut1Tuesday(getDayOut1());
			break;
		case "Wednesday":
			this.setDayIn0(ar[0]);
			this.setDayOut0(ar[1]);
			this.setDayIn1(ar[2]);
			this.setDayOut1(ar[3]);
			this.setTimeIn0Wednesday(getDayIn0());
			this.setTimeOut0Wednesday(getDayOut0());
			this.setTimeIn1Wednesday(getDayIn1());
			this.setTimeOut1Wednesday(getDayOut1());
			break;
		case "thursday":
			this.setDayIn0(ar[0]);
			this.setDayOut0(ar[1]);
			this.setDayIn1(ar[2]);
			this.setDayOut1(ar[3]);
			this.setTimeIn0Thursday(getDayIn0());
			this.setTimeOut0Thursday(getDayOut0());
			this.setTimeIn1Thursday(getDayIn1());
			this.setTimeOut1Thursday(getDayOut1());
			break;
		case "Friday" :
			this.setDayIn0(ar[0]);
			this.setDayOut0(ar[1]);
			this.setDayIn1(ar[2]);
			this.setDayOut1(ar[3]);
			this.setTimeIn0Friday(getDayIn0());
			this.setTimeOut0Friday(getDayOut0());
			this.setTimeIn1Friday(getDayIn1());;
			this.setTimeOut1Friday(getDayOut1());
			break;
			default :
				System.out.println("Day not Found");
		}
	}

	@Override
	public double[] arrayOfHoursValues(String genDate, Hashtable<String, Double> dates) {
		double [] ar =  new double [4];
		if (dates.containsKey(genDate + " In")) {
			ar[0] = dates.get(genDate + " In");
			ar[1] = dates.get(genDate + " Out");
		}
		return ar;
	}

}
