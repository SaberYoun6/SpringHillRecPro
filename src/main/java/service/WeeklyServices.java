package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.WeeklyDAO;
import dao.WeeklyDAOImpl;
import exceptions.DatabaseConnectivityExecption;
import exceptions.WeekNotFoundException;
import util.ConnectionUtililties;
import weeks.WeeklyFunctions;

public class WeeklyServices {
	public WeeklyDAO weekDAO;
	public WeeklyServices() {
		weekDAO = new WeeklyDAOImpl();
	}
	public int createWeek(int idnumber ,String date, double weeklyHours, double summedHours, double summedMinusTotalHours) {
		int count =0;
		
		WeeklyFunctions weeks = new WeeklyFunctions(idnumber, date,weeklyHours, summedHours, summedMinusTotalHours);
		try (Connection connection =ConnectionUtililties.getConnection()){
			connection.setAutoCommit(false);
			
			count = weekDAO.createWeeklyDao(weeks, connection);
			
			connection.commit();
		}catch(SQLException | DatabaseConnectivityExecption | IOException e) {
			System.out.println(e.getMessage());
		}
		return count;
	}
	public int deleteWeekbyId(int idnumber) {
		int count =0;
		WeeklyFunctions weeks = new WeeklyFunctions(idnumber);
		try {
			if(!weekDAO.deleteWeekbyID(idnumber)) {
				return idnumber;
			}else {
				weekDAO.deleteWeekbyID(idnumber);
			}
		} catch (DatabaseConnectivityExecption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
}
