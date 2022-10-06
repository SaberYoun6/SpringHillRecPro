package exceptions;

public class DateNotFoundExecption extends Exception{

		public DateNotFoundExecption() {
			super();
		}
		public DateNotFoundExecption(String message,Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message,cause,enableSuppression,writableStackTrace);
	}
		public DateNotFoundExecption(String message,Throwable cause) {
			super(message,cause);
		}
		public DateNotFoundExecption(String message) {
			super(message);
		}
		DateNotFoundExecption(Throwable cause){
			super(cause);
		}
}
