package hw03;

public record Answer(int id, String text) {

	@Override
	public boolean equals(final Object o) {

		if (this == o) {
			return true;
		}
		if (!(o instanceof final Answer answer)) {
			return false;
		}

		if (id() != answer.id()) {
			return false;
		}
		return text() != null ? text().equals(answer.text()) : answer.text() == null;
	}

	@Override
	public int hashCode() {

		int result = id();
		result = 31 * result + (text() != null ? text().hashCode() : 0);
		return result;
	}
}
