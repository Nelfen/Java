package Chapter21;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("¸®¼Ò½º°¡ close() µÇ¾ú½À´Ï´Ù.");
	}
	
}