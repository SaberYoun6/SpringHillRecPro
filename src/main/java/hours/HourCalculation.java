package hours;

import java.util.Hashtable;
import java.util.Scanner;

import exceptions.DaysNotFoundExecption;

public class HourCalculation implements Hours {
	private double timeIn0Saturday,timeOut0Saturday,timein1Saturday,timeOut1Saturday,timeIn0Sunday,timeOut0Sunday,timeIn1Sunday,timeOut1Sunday,timeIn0Monday,timeOut0Monday,timeIn1Monday,timeOut1Monday,timeIn0Tuesady,timeOut0Tuesday,timeIn1Tuesday,timeOut1Tuesday,timeOut0Wednesday,timeIn0Wednesday,timeOut1Wednesday,timeIn1Wednesday,timeOut0Thursday,timeIn0Thursday,timeOut1Thursday,timeIn1Thursday, timeOut0Friday,timeIn0Friday,timeIn1Friday,timeOut1Friday=0.0;
	
	
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
			ar[1] =dates.get(genDate + " Out");
		}
		if(dates.containsKey(genDateOne + " In")) {
			ar[2] = dates.get(genDateOne + " In");
			ar[3] = dates.get(genDateOne+ " Out" );
		}
		return ar;
	}
	@Override
	public void setHourlyValuesForDates(String genDate,double[] ar) throws DaysNotFoundExecption {
		String[] genDateValue= genDate.split(" ");
		int i =0;
		switch(genDateValue[0]){
		case "Saturday":
			this.setTimeIn0Saturday(ar[0]);
			this.setTimeOut0Saturday(ar[1]);
			this.setTimein1Saturday(ar[2]);
			this.setTimeOut1Saturday(ar[3]);
			break;
		case "Sunday":
			this.setTimeIn0Sunday(ar[0]);
			this.setTimeOut0Sunday(ar[1]);
			this.setTimeIn1Sunday(ar[2]);
			this.setTimeOut0Sunday(ar[3]);
			break;
		case "Monday":
			this.setTimeIn0Monday(ar[0]);
			this.setTimeOut0Monday(ar[1]);
			this.setTimeIn1Monday(ar[2]);
			this.setTimeOut1Monday(ar[3]);
			break;
		case "Tuesday":
			this.setTimeIn0Tuesady(ar[0]);
			this.setTimeOut0Tuesday(ar[1]);
			this.setTimeIn1Tuesday(ar[2]);
			this.setTimeOut1Tuesday(ar[3]);
			break;
		case "Wednesday":
			this.setTimeIn0Wednesday(ar[0]);
			this.setTimeOut0Wednesday(ar[1]);
			this.setTimeIn1Wednesday(ar[2]);
			this.setTimeOut1Wednesday(ar[3]);
			break;
		case "thursday":
			this.setTimeIn0Thursday(ar[0]);
			this.setTimeOut0Thursday(ar[1]);
			this.setTimeIn1Thursday(ar[2]);
			this.setTimeOut1Thursday(ar[3]);
			break;
		case "Friday" :
			this.setTimeIn0Friday(ar[0]);
			this.setTimeOut0Friday(ar[1]);
			this.setTimeIn1Friday(ar[2]);;
			this.setTimeOut1Friday(ar[3]);
			break;
			default :
				System.out.println("Day not Found");
		}
	}

}
