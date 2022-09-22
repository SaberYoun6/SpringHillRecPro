package hours;

interface class Hours{

	double dailyTotal(double out, double in);
	double dailyTotal(double out0, double in0, double out1, double in1);
	double weeklyTotal(double ... dailyTotalHOurs);

}
