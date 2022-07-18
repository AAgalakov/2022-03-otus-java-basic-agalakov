package hw05;

public record Account(int id, String ownerName, int countOfCoins) {


	@Override
	public boolean equals(final Object o) {

		if (this == o) return true;
		if (!(o instanceof Account)) return false;

		final Account account = (Account) o;

		return id() == account.id();
	}

	@Override
	public int hashCode() {

		return id();
	}
}
