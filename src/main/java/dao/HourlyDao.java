package dao;

import java.util.List;

import exceptions.DatabaseConnectivityExecption;
import exceptions.HourlyNotFoundException;
import hours.HourCalculation;
import hours.HourFunction;

public interface HourlyDao {
	
	int createHours(HourFunction hours) throws DatabaseConnectivityExecption;
	HourFunction getHour(int id) throws DatabaseConnectivityExecption,HourlyNotFoundException;
	List<HourFunction> getAllHours() throws DatabaseConnectivityExecption;
	double updateHourIn(int id, double newTimeIn) throws DatabaseConnectivityExecption;
	double updateHoutOut(int id, double newTimeOut) throws DatabaseConnectivityExecption;
	boolean deleteHoursById(int id) throws DatabaseConnectivityExecption;

}
