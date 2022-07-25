package hw06;

public class MyAutoClose implements AutoCloseable {

	public void throwException(){
		throw new RuntimeException("Bad thing");
	}

	@Override
	public void close() throws Exception {

		System.out.println("Закрываем ресурс");
	}
}
