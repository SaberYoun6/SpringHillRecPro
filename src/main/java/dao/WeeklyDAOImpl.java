package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import exceptions.DatabaseConnectivityExecption;
import exceptions.WeekNotFoundException;
import util.ConnectionUtililties;
import weeks.WeeklyFunctions;

public class WeeklyDAOImpl implements WeeklyDAO{


	public int createWeeklyDao(WeeklyFunctions week) throws DatabaseConnectivityExecption {
		int createCount =0;
		try(Connection connection = ConnectionUtililties.getConnection()){
			String sql = "INSERT INTO jdbc_timeData.WeekData (date,WeekilyTotal,SummedTotalHours,summedTotalHoursMinusTotalHours"+
		                              "VALUES(?,?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			
			preparedStatement.setString(1, week.getDates());
			preparedStatement.setDouble(2, week.getWeeklyTotal());
			preparedStatement.setDouble(3, week.getSummedHours());
			preparedStatement.setDouble(4, week.getSummedTotalHoursMinusTotalHours());
			
			createCount=preparedStatement.executeUpdate();
			
			
		} catch (IOException|SQLException e) {
			throw new DatabaseConnectivityExecption("Something went wrong with establishing a connection");
		}
		return createCount;
	}

	public WeeklyFunctions getWeeklyCalculation(int id) throws DatabaseConnectivityExecption, WeekNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public double updateWeeklyCalculation(int id, double newWeeklyTime) throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteWeekbyID(int id) throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return false;
	}

	public List<WeeklyFunctions> getAllWeeklyCalculation() throws DatabaseConnectivityExecption {
		// TODO Auto-generated method stub
		return null;
	}

	
}
