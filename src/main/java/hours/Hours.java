package hours;

import java.util.Hashtable;

import exceptions.DaysNotFoundExecption;

public interface Hours {
	void setHourlyValuesForDates(String genDate, double [] ar) throws DaysNotFoundExecption;
	double[] arrayOfHoursValues(String genDate, String genDateOne, Hashtable<String, Double> dates) ;
}
