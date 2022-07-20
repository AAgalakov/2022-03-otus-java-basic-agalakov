package hw05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Bank {

	private final int coins;

	private final Map<Client, List<Account>> clientListMap;
	private int availableIdNumber;

	public Bank(final Set<Client> clients, final Set<Account> accountSet) {

		final Map<String, List<Account>> collect = accountSet.stream()
			.collect(Collectors.groupingBy(Account::ownerName));
		this.clientListMap = clients.stream()
			.filter(client -> client.age() > 18)
			.collect(Collectors.toMap(Function.identity(), client -> collect.get(client.name())));
		this.coins = accountSet.stream()
			.map(Account::countOfCoins)
			.reduce(0, Integer::sum);
		int integer = accountSet.stream()
			.map(Account::id)
			.max(Integer::compareTo)
			.orElseThrow();
		this.availableIdNumber = ++integer;
	}

	public Client findClient(final Account account) {

		final String s = account.ownerName();
		return clientListMap.keySet()
			.stream()
			.filter(client -> client.name().equals(s))
			.findFirst()
			.orElseThrow();
	}

	public List<Account> getAccounts(final Client client) {

		return clientListMap.get(client);
	}

	public void addClient(final Client client) {

		if (client.age() > 18) {
			clientListMap.put(client, new ArrayList<>());
		} else {
			throw new IllegalArgumentException("Постарше бы");
		}
	}

	public void addAccount(final Account account) {

		final Optional<Client> clientOptional = clientListMap.keySet()
			.stream()
			.filter(client -> client.name().equals(account.ownerName()))
			.findFirst();
		if (clientOptional.isPresent()) {
			final List<Account> accounts = clientListMap.get(clientOptional.get());
			accounts.add(account);
			availableIdNumber++;
		} else {
			throw new IllegalArgumentException("Нет клиента с таким именем");
		}
	}

	public int clientsCount() {

		return clientListMap.size();
	}

	public int availableAccountId() {

		return availableIdNumber;
	}

	@Override
	public String toString() {

		return "Bank{" +
			"coins=" + coins +
			", clientListMap=" + clientListMap +
			'}';
	}
}
