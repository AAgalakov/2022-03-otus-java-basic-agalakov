package hw05;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Bank {
	private final int coins;
	private final Set<Client> clients;
	private final Set<Account> accountSet;
	private int availableIdNumber;

	public Bank(final Set<Client> clients, final Set<Account> accountSet) {

		this.clients = clients.stream().filter(client -> client.age() > 18).collect(Collectors.toSet());
		this.accountSet = accountSet;
		this.coins = accountSet.stream()
			.map(Account::countOfCoins)
			.reduce(0, Integer::sum);
		int integer = accountSet.stream()
			.map(Account::id)
			.max(Integer::compareTo)
			.orElseThrow();
		this.availableIdNumber = ++integer;
	}

	public Client findClient(final Account account){
		return clients.stream()
			.filter(client -> client.name().equals(account.ownerName()))
			.findFirst()
			.orElseThrow();
	}

	public List<Account> getAccounts(final Client client){
		return accountSet.stream()
			.filter(account -> account.ownerName().equals(client.name()))
			.collect(Collectors.toList());
	}

	public void addClient(final Client client){
		if (client.age() > 18){
			clients.add(client);
		} else {
			throw new IllegalArgumentException("Постарше бы");
		}
	}

	public void addAccount(final Account account){
		boolean result = true;
		if (clients.stream()
			.map(Client::name)
			.anyMatch(s -> s.equals(account.ownerName()))){
			result = accountSet.add(account);
		} else {
			throw new IllegalArgumentException("Нет клиента с таким именем");
		}
		if (!result){
			throw new IllegalArgumentException("Не добавился аккаунт");
		}
			availableIdNumber++;
	}

	public int clientsCount(){
		return clients.size();
	}

	public int availableAccountId(){
		return availableIdNumber;
	}

	@Override
	public String toString() {

		return "Bank{" +
			"coins=" + coins +
			", clients=" + clients +
			", accountSet=" + accountSet +
			'}';
	}
}
