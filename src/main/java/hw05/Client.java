package hw05;

public record Client(String name, int age) {


	@Override
	public boolean equals(final Object o) {

		if (this == o) return true;
		if (!(o instanceof Client)) return false;

		final Client client = (Client) o;

		return name().equals(client.name());
	}

	@Override
	public int hashCode() {

		return name().hashCode();
	}
}
