package exceptions;

public class WeekNotFoundException extends Exception {
	public WeekNotFoundException() {
		super();
	}
	public WeekNotFoundException(String message) {
		super(message);
	}
	public WeekNotFoundException(Throwable cause) {
		super(cause);
	}
	public WeekNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}
	public WeekNotFoundException(String message,Throwable cause,boolean enableSuppresion,boolean writableStackTrace) {
		super(message,cause,enableSuppresion,writableStackTrace);
	}

}
