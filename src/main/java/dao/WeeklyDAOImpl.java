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


	public int createWeeklyDao(WeeklyFunctions week, Connection connection) throws DatabaseConnectivityExecption, SQLException {
		int createCount =0;
			String sql = "INSERT INTO weekdata (id,date,weeks_total,summed_hours,summed_hours_minus_total_hours)"+
		                              "VALUES(?,?,?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, week.getWeeklyId());
			preparedStatement.setString(2, week.getDates());
			preparedStatement.setDouble(3, week.getWeeklyTotal());
			preparedStatement.setDouble(4, week.getSummedHours());
			preparedStatement.setDouble(5, week.getSummedTotalHoursMinusTotalHours());
			
			createCount=preparedStatement.executeUpdate();
			
		return createCount;
	}

	public WeeklyFunctions getWeeklyCalculation(int id) throws DatabaseConnectivityExecption, WeekNotFoundException {
		WeeklyFunctions weeks = null;
		try(Connection connection = ConnectionUtililties.getConnection())
		{
			String sql = "SELECT * FROM weekdata WHERE id = ?";
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
			String sql = "UPDATE * FROM weekdata set WeeklTimes= ? Where id = ?";
			PreparedStatement preparedStatement =  connection.prepareStatement(sql);
			preparedStatement.setDouble(1, newWeeklyTime);
			preparedStatement.setInt(2, id);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				weeks = new WeeklyFunctions();
				weeks.setId(rs.getInt("id"));
				weeks.setWeeklyTotalily(rs.getDouble("new_weekly_time"));
			}
		} catch (SQLException |IOException e) {
			throw new DatabaseConnectivityExecption("Something went wrong with estalishing a connection");
		}
		
		return id;
	}

	public boolean deleteWeekbyID(int id) throws DatabaseConnectivityExecption {
		WeeklyFunctions weeks = null;
		try (Connection connection = ConnectionUtililties.getConnection()){
			String sql = "delete from weekdata where id =(?)";
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					ResultSet rs = preparedStatement.executeQuery();
					preparedStatement.setInt(1,id);
					if(rs.next()) {
						weeks = new WeeklyFunctions();
						weeks.setId(rs.getInt("id"));
					}else {
						return false;
					}
		} catch(SQLException | IOException e) {
			throw  new DatabaseConnectivityExecption("Something went wrong with establising a connection");
		
		}
		return true;
	}

	public List<WeeklyFunctions> getAllWeeklyCalculation() throws DatabaseConnectivityExecption {
		List<WeeklyFunctions> weekList =new ArrayList<>();
		try (Connection connection = ConnectionUtililties.getConnection()) {
			String sql = "Select * From weekdata";
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
