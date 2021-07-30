package kodlamaio.nordwind.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;
	public DataResult(boolean success, T data) {
		super(success);
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}

	public DataResult(boolean success, String message, T data) {
		super(success, message);
		this.data = data;
	}
	
	public DataResult(String message, boolean success, T data) {
		super(success, message);
		this.data = data;
	}

	public DataResult(String message, T data, boolean success) {
		super(success, message);
		this.data = data;
	}
	public T getData() {
		return data;
	}

	
}
