package kodlamaio.nordwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {
	
	public SuccessDataResult( ) {
		super(true, null);
	}
	
	public SuccessDataResult(T data) {
		super(true, data);
	}
	
	public SuccessDataResult(T data, String message) {
		super(true, message, data);
	}
	
	public SuccessDataResult(String message, T data) {
		super(true, message, data);
	}
	
	public SuccessDataResult(String message) {
		super(true, message, null);
	}
	
}