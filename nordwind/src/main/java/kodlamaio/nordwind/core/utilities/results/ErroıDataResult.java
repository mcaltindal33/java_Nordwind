package kodlamaio.nordwind.core.utilities.results;

public class ErroıDataResult<T> extends DataResult<T> {
	
	public ErroıDataResult( ) {
		super(true, null);
	}
	
	public ErroıDataResult(T data) {
		super(true, data);
	}
	
	public ErroıDataResult(String message, T data) {
		super(true, message, data);
	}
	
	public ErroıDataResult(T data, String message) {
		super(true, message, data);
	}
	
	public ErroıDataResult( String message) {
		super(true, message, null);
	}
	
}
