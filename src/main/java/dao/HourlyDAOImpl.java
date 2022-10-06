package dao;

import java.util.List;

import exceptions.DatabaseConnectivityExecption;
import exceptions.HourlyNotFoundException;
import hours.HourFunction;

public class HourlyDAOImpl implements HourlyDao {

	@Override
	public int createHours(HourFunction hours) throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HourFunction getHour(int id) throws DatabaseConnectivityExecption, HourlyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HourFunction> getAllHours() throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double updateHourIn(int id, double newTimeIn) throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double updateHoutOut(int id, double newTimeOut) throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean deleteHoursById(int id) throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return false;
	}
	
}
