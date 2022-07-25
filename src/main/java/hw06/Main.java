package hw06;

public class Main {

	public static void main(String[] args) {

//		throwException();
		wrightException();
//		wrappingException();

	}

	public static void throwException() {

		final MyAutoClose myAutoClose = new MyAutoClose();
		myAutoClose.throwException();
	}

	public static void wrightException() {

		try (final MyAutoClose myAutoClose = new MyAutoClose()) {
			myAutoClose.throwException();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void wrappingException() {

		try (final MyAutoClose myAutoClose = new MyAutoClose()) {
			myAutoClose.throwException();
		} catch (Exception e) {
			throw new RuntimeException("Wrapping exception", e);
		}
	}
}
