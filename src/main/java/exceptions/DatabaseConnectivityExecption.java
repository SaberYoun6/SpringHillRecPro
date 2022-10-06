package exceptions;

public class DatabaseConnectivityExecption extends Exception {
	DatabaseConnectivityExecption(){
		super();
	}
	public DatabaseConnectivityExecption(String message){
		super(message);
	}
	DatabaseConnectivityExecption(Throwable cause){
		super(cause);
	}
	DatabaseConnectivityExecption(String message,Throwable cause){
		super(message, cause);
	}
	DatabaseConnectivityExecption(String message,Throwable cause, boolean enableSuppression, boolean writableStackTrace){
		super(message,cause,enableSuppression,writableStackTrace);
	}
}
