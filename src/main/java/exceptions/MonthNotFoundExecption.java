package exceptions;

public class MonthNotFoundExecption extends Exception {

	public MonthNotFoundExecption() {
		super();
	}
	public MonthNotFoundExecption(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message,cause,enableSuppression,writableStackTrace);
	}
	public MonthNotFoundExecption(String message, Throwable cause) {
		super(message,cause);
	}
	public MonthNotFoundExecption(String message) {
		super(message);
	}
}
