package monthly;

import java.util.ArrayList;
import java.util.Hashtable;

public interface MonthylyCalculations {
	String verifMonth(int Month);
	String verifDate(int date);
	ArrayList<Double> dateVerification(Hashtable<String, Double> dayInfo, String day, String month, String date );
	String verifDay(String dateInfo);
	

}
