package dao;

import java.awt.dnd.DropTargetDragEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		WeeklyFunctions weeks = null;
		try(Connection connection = ConnectionUtililties.getConnection())
		{
			String sql = "SELECT * FROM jdbc_timeData.WeekData WHERE id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				weeks = new WeeklyFunctions();
				weeks.setId(rs.getInt("id"));
				weeks.setDates(rs.getString("date"));
				weeks.setWeeklyTotalily(rs.getDouble("weekly_totalily"));
				weeks.setSummedHours(rs.getDouble("summed Hours"));
				weeks.setSummedHoursMinusTotalHours(rs.getDouble("summed_hours_minus_total_Hours"));
			}else {
				throw new WeekNotFoundException("No week was found with id "+ id );
			}
			}catch (SQLException | IOException e) {
				throw new DatabaseConnectivityExecption("Something went wrong with establishing a connection");
			}
		return weeks;
	}

	public int updateWeeklyCalculation(int id, double newWeeklyTime) throws DatabaseConnectivityExecption {
		WeeklyFunctions weeks = null;
		try (Connection connection = ConnectionUtililties.getConnection()){
			String sql = "UPDATE * FROM jdbc_timeData.WeekData set WeeklTimes= ? Where id = ?";
			PreparedStatement preparedStatement =  connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				weeks.setId(rs.getInt("id"));
				weeks.setWeeklyTotalily(newWeeklyTime);
			}
		} catch (SQLException |IOException e) {
			throw new DatabaseConnectivityExecption("Something went wrong with estalishing a connection");
		}
		
		return id;
	}

	public boolean deleteWeekbyID(int id) throws DatabaseConnectivityExecption {
		try (Connection connection = ConnectionUtililties.getConnection()){
			String sql = "delete * from jdbc_timeData.weekData where id =?";
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					if(rs.next()) {
						
					}
			
		}
		return false;
	}

	public List<WeeklyFunctions> getAllWeeklyCalculation() throws DatabaseConnectivityExecption {
		List<WeeklyFunctions> weekList =new ArrayList<>();
		try (Connection connection = ConnectionUtililties.getConnection()) {
			String sql = "Select * From jdbc_timeData.WeekData";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				WeeklyFunctions weeks = new WeeklyFunctions();
				weeks.setId(rs.getInt("id"));
				weeks.setDates(rs.getString("dates"));
				weeks.setWeeklyTotalily(rs.getDouble("Weekly_ totality"));
				weeks.setSummedHours(rs.getDouble("summed hours"));
				weeks.setSummedHoursMinusTotalHours(rs.getDouble("summed_hours_minus_total_hours"));
				
				weekList.add(weeks);
			}
		} catch(SQLException| IOException e) {
			throw new DatabaseConnectivityExecption("Something went wrong with establish a connection");
		}
		
		return weekList;
	}

	
}
