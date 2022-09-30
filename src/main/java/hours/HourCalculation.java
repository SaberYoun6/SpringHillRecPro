package hours;

import java.util.ArrayList;

import exceptions.MonthNotFoundExecption;

public class HourCalculation implements Hours {
	private double totalSaturdayTime,timeIn0Saturday,timeOut0Saturday,timein1Saturday,timeOut1Saturday,totalSundayTime,timeIn0Sunday,timeOut0Sunday,timeIn1Sunday,timeOut1Sunday,totalMondayTime,timeIn0Monday,timeOut0Monday,timeIn1Monday,timeOut1Monday,totalTuedayTime,timeIn0Tuesady,timeOut0Tuesday,timeIn1Tuesday,timeOut1Tuesday,totalWednesdayTime,timeOut0Wednesday,timeIn0Wednesday,timeOut1Wednesday,timeIn1Wednesday,totalThursdayTime,timeOut0Thursday,timeIn0Thursday,timeOut1Thursday,timeIn1Thursday,totalFridayTime, timeOut0Friday,timeIn0Friday,timeIn1Friday,timeOut1Friday=0.0;
	public double getTotalSaturdayTime() {
		return totalSaturdayTime;
	}

	public void setTotalSaturdayTime(double totalSaturdayTime) {
		this.totalSaturdayTime = totalSaturdayTime;
	}

	public double getTotalSundayTime() {
		return totalSundayTime;
	}

	public void setTotalSundayTime(double totalSundayTime) {
		this.totalSundayTime = totalSundayTime;
	}

	public double getTotalMondayTime() {
		return totalMondayTime;
	}

	public void setTotalMondayTime(double totalMondayTime) {
		this.totalMondayTime = totalMondayTime;
	}

	public double getTotalTuedayTime() {
		return totalTuedayTime;
	}

	public void setTotalTuedayTime(double totalTuedayTime) {
		this.totalTuedayTime = totalTuedayTime;
	}

	public double getTotalWednesdayTime() {
		return totalWednesdayTime;
	}

	public void setTotalWednesdayTime(double totalWednesdayTime) {
		this.totalWednesdayTime = totalWednesdayTime;
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

	public double getTotalThursdayTime() {
		return totalThursdayTime;
	}

	public void setTotalThursdayTime(double totalThursdayTime) {
		this.totalThursdayTime = totalThursdayTime;
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

	public double gettotalFridayTime() {
		return totalFridayTime;
	}

	public void settotalFridayTime(double totalFridayTime) {
		this.totalFridayTime = totalFridayTime;
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
	public double dailyTotal(double in, double out) {
		return out-in;	
	}
	public double dailyTotal(double in, double out ,double in1,double out1) {
		return (out-in) + (out1 -in1);
	}

}
