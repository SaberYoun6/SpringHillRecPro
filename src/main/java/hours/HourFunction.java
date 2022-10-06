package hours;

public class HourFunction extends HourCalculation {
private int id=0;
private double hourIn, hourOut =0.0;
private String date = null;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getHourIn() {
	return hourIn;
}
public void setHourIn(double hourIn) {
	this.hourIn = hourIn;
}
public double getHourOut() {
	return hourOut;
}
public void setHourOut(double hourOut) {
	this.hourOut = hourOut;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
