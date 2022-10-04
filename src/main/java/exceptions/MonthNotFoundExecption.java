package exceptions;

public class MonthsNotFoundExecption extends Exception {

	public MonthsNotFoundExecption() {
		super();
	}
	public MonthsNotFoundExecption(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message,cause,enableSuppression,writableStackTrace);
	}
	public MonthsNotFoundExecption(String message, Throwable cause) {
		super(message,cause);
	}
	public MonthsNotFoundExecption(String message) {
		super(message);
	}
}
