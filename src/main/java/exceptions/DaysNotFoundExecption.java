package exceptions;

import java.lang.reflect.Executable;

public class DaysNotFoundExecption extends Exception {
	
	DaysNotFoundExecption(){
		super();
	}
	DaysNotFoundExecption(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace){
		super(message,cause,enableSuppression,writableStackTrace);
	}
	DaysNotFoundExecption(String message, Throwable cause){
		super(message,cause);
	}
	DaysNotFoundExecption(String message){
		super(message);
	}
	DaysNotFoundExecption(Throwable cause){
		super(cause);
	}
	
}
