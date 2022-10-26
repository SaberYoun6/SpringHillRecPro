package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import exceptions.DatabaseConnectivityExecption;
import exceptions.WeekNotFoundException;
import weeks.WeeklyCalculations;
import weeks.WeeklyFunctions;

public interface WeeklyDAO {
	int createWeeklyDao(WeeklyFunctions weeks, Connection connection ) throws DatabaseConnectivityExecption,SQLException;
	WeeklyFunctions getWeeklyCalculation(int id) throws DatabaseConnectivityExecption, WeekNotFoundException;
	int updateWeeklyCalculation(int id, double newWeeklyTime) throws DatabaseConnectivityExecption;
	boolean deleteWeekbyID(int id) throws DatabaseConnectivityExecption;
	List<WeeklyFunctions> getAllWeeklyCalculation() throws DatabaseConnectivityExecption;
	
}
