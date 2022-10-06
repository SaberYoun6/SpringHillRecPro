package exceptions;

public class HourlyNotFoundException extends Exception {
	public HourlyNotFoundException() {
		super();
	}
	public HourlyNotFoundException(String message) {
		super(message);
	}
	public HourlyNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}
	public HourlyNotFoundException(Throwable cause) {
		super(cause);
	}
	public HourlyNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writStackTrace) {
		super(message,cause,enableSuppression,writStackTrace);
	}
}
