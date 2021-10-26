package custom_exception.exceptions;

public class TempOutOfRangeException extends Exception{

	private static final long serialVersionUID = 1L;
	public TempOutOfRangeException() {
		this(null);
	}
	
	public TempOutOfRangeException(String message) {
		super(message);
	}
}
