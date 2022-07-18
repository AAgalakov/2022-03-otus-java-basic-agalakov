package hw05;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		final Account vasya1 = new Account(1, "Vasya", 100);
		final Account alyosha1 = new Account(2, "Alyosha", 50);
		final Account alyosha2 = new Account(3, "Alyosha", 50);
		final Set<Account> accounts = new HashSet<>(Set.of(vasya1, alyosha1, alyosha2));

		final Client vasya = new Client("Vasya", 20);
		final Client alyosha = new Client("Alyosha", 25);
		final Client vasilisa = new Client("Vasilisa", 17);
		final Set<Client> clients = new HashSet<>(Set.of(vasya, alyosha, vasilisa));
		final Bank bank = new Bank(clients, accounts);

		bank.addClient(new Client("Pasha", 30));
		bank.addAccount(new Account(bank.availableAccountId(), "Pasha", 30));


		final Client client = bank.findClient(alyosha1);
		System.out.println(client);
		System.out.println(alyosha);
		final List<Account> accounts1 = bank.getAccounts(alyosha);
		System.out.println(accounts1.size());

		System.out.printf("Количество клиентов -> %d\n", bank.clientsCount());
		System.out.println(bank);
		bank.addClient(new Client("Fedor", 35));
		try {
			final Account fedor = new Account(bank.availableAccountId() - 1, "Fedor", 50);
			bank.addAccount(fedor);
		}catch (Exception e){
			System.out.println("Ошибка " + e.getMessage());
		}
		try {
			bank.addClient(vasilisa);
		} catch (IllegalArgumentException e){
			System.out.println("Ошибка " + e.getMessage());
		}
		System.out.println();
		System.out.println(bank);

	}
}
