package monthly;

import java.util.ArrayList;
import java.util.Hashtable;

public interface MonthylyCalculations {
	double dailyConvertMonthlyTotal( double [] days);
	double [] monthName(String genDate,double [] ar);
	double [] arrangingDates(String genDates ,double [] ar, int size);
	
	

}
