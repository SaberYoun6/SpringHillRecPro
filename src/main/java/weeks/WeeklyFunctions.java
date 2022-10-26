package weeks;

import java.util.Objects;

public class WeeklyFunctions extends WeeklyCalculations {
	private double weeklyTotal,summedHours,summedTotalHoursMinusTotalHours;
	private String dates;
	private int weeklyId;
	
	public WeeklyFunctions() {
		super();
	}
	public WeeklyFunctions(int weeklyId,String dates, double weeklyTotal,double summedHours,double summedTotalHoursMinusTotalHours) {
		this.weeklyId = weeklyId;
		this.dates =dates;
		this.weeklyTotal = weeklyTotal;
		this.summedHours = summedHours;
		this.summedTotalHoursMinusTotalHours = summedTotalHoursMinusTotalHours;
	}
	public WeeklyFunctions(int weeklyId) {
		this.weeklyId = weeklyId;
	}
	public double getWeeklyTotal() {
		return weeklyTotal;
	}
	public void setWeeklyTotal(double weeklyTotal) {
		this.weeklyTotal = weeklyTotal;
	}
	public double getSummedHours() {
		return summedHours;
	}
	public void setSummedHours(double summedHours) {
		this.summedHours = summedHours;
	}
	public double getSummedTotalHoursMinusTotalHours() {
		return summedTotalHoursMinusTotalHours;
	}
	public void setSummedTotalHoursMinusTotalHours(double summedTotalHoursMinusTotalHours) {
		this.summedTotalHoursMinusTotalHours = summedTotalHoursMinusTotalHours;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}

	public int getWeeklyId() {
		return weeklyId;
	}
	public void setWeeklyId(int weeklyId) {
		this.weeklyId = weeklyId;
	}
	@Override
	public String toString() {
		return "WeeklyFunctions [weeklyId="+ weeklyId +",dates=" +dates + ", weeklyTotal=" + weeklyTotal +
				", summedHours=" + summedHours+", summedTotalHoursMinusTotalHours="+summedTotalHoursMinusTotalHours+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dates, summedHours, summedTotalHoursMinusTotalHours, weeklyId, weeklyTotal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeeklyFunctions other = (WeeklyFunctions) obj;
		return Objects.equals(dates, other.dates)
				&& Double.doubleToLongBits(summedHours) == Double.doubleToLongBits(other.summedHours)
				&& Double.doubleToLongBits(summedTotalHoursMinusTotalHours) == Double
						.doubleToLongBits(other.summedTotalHoursMinusTotalHours)
				&& weeklyId == other.weeklyId
				&& Double.doubleToLongBits(weeklyTotal) == Double.doubleToLongBits(other.weeklyTotal);
	}

	
}
