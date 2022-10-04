package monthly;

import java.util.ArrayList;
import java.util.Hashtable;

import exceptions.DateNotFoundExecption;
import exceptions.MonthsNotFoundExecption;

public class MonthlyCalculationImp implements MonthylyCalculations {

	
	private String january = "January";
	private String febuaray = "Feburary";
	private String march;
	private String april;
	private String may;
	private String june;
	private String july;
	private String august;
	private String september;
	private String october;
	private String november;
	private String december;
	public MonthsNotFoundExecption monthNotFoundExecption = new MonthsNotFoundExecption();
	
	public String daysInformation (Hashtable<String ,Double> dateInfo) {
		String [] arrayOfdays = {"Saturday","Sunday","Monday","Tuesday","Wednesday","thursay","Friday"};
		for (String day: arrayOfdays) {
			if (dateInfo.contains(day)) {
				return day;
			}
		}
		return null;
		
	}
	public MonthlyCalculationImp() {
		this.setJanuary("January");
		this.setFebuaray("Febuaray");
		this.setMarch("March");
		this.setApril("April");
		this.setMay("May");
		this.setJune("June");
		this.setJuly("July");
		this.setAugust("August");
		this.setSeptember("September");
		this.setOctober("October");
		this.setNovember("November");
		this.setDecember("December");
	}
	
	public String getJanuary() {
		return january;
	}

	public void setJanuary(String january) {
		this.january = january;
	}

	public String getFebuaray() {
		return febuaray;
	}

	public void setFebuaray(String febuaray) {
		this.febuaray = febuaray;
	}

	public String getMarch() {
		return march;
	}

	public void setMarch(String march) {
		this.march = march;
	}
	public String getApril() {
		return april;
	}

	public void setApril(String april) {
		this.april = april;
	}

	public String getMay() {
		return may;
	}

	public void setMay(String may) {
		this.may = may;
	}

	public String getJune() {
		return june;
	}

	public void setJune(String june) {
		this.june = june;
	}

	public String getJuly() {
		return july;
	}

	public void setJuly(String july) {
		this.july = july;
	}

	public String getAugust() {
		return august;
	}

	public void setAugust(String august) {
		this.august = august;
	}

	public String getSeptember() {
		return september;
	}

	public void setSeptember(String september) {
		this.september = september;
	}

	public String getOctober() {
		return october;
	}

	public void setOctober(String october) {
		this.october = october;
	}

	public String getNovember() {
		return november;
	}

	public void setNovember(String november) {
		this.november = november;
	}

	public String getDecember() {
		return december;
	}

	public void setDecember(String december) {
		this.december = december;
	}

	public String verifMonth(int Month) {
		String month = null;
		switch (Month){
		case 1 : 
			month = getJanuary();
			break;
		case 2: 
			month = getFebuaray();
			break;
		case 3:
			month = getMarch();
			break;
		case 4:
			month = getApril();
			break;
		case 5:
			month = getMay();
			break;
		case 6:
			month = getJune();
			break;
		case 7: 
			month = getJuly();
			break;
		case 8: 
			month = getAugust();
			break;
		case 9:
			month = getSeptember();
			break;
		case 10:
			month = getOctober();
			break;
		case 11:
			month = getNovember();
			break;
		case 12:
			month = getDecember();
			break;
			default:
				
				monthNotFoundExecption.getLocalizedMessage();
		}
		return month;
	}



	public String verifDate(int date) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String verifDay(String dateInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Double> dateVerification(Hashtable<String, Double> dayInfo, String day, String month, String date){
		ArrayList<Double> al = new ArrayList<Double>(); 
		try {
			if (dayInfo.contains( month + "  " + date + " In")) {
				al.add(dayInfo.get(this.daysInformation(dayInfo) + " " + month +" " + date + " In"));
				al.add(dayInfo.get(this.daysInformation(dayInfo) + " " + month +" " + date + " Out"));
			}
			if (dayInfo.contains( month + " 1 " + date + "In")){ 
				al.add(dayInfo.get(this.daysInformation(dayInfo) + " "+ month + " 1 " + date + " In"));
				al.add(dayInfo.get(this.daysInformation(dayInfo) + " "+ month + " 1 " + date + " Out"));
			}
		}catch( Exception DateNotFoundExecption) {
			log.info()
		}
		return al;
	}


}
