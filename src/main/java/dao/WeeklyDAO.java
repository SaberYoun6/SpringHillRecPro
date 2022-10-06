package dao;

import java.util.List;

import exceptions.DatabaseConnectivityExecption;
import exceptions.WeekNotFoundException;
import weeks.WeeklyCalculations;
import weeks.WeeklyFunctions;

public interface WeeklyDAO {
	int createWeeklyDao(WeeklyFunctions weeks) throws DatabaseConnectivityExecption;
	WeeklyFunctions getWeeklyCalculation(int id) throws DatabaseConnectivityExecption, WeekNotFoundException;
	double updateWeeklyCalculation(int id, double newWeeklyTime) throws DatabaseConnectivityExecption;
	boolean deleteWeekbyID(int id) throws DatabaseConnectivityExecption;
	List<WeeklyFunctions> getAllWeeklyCalculation() throws DatabaseConnectivityExecption;
	
}
