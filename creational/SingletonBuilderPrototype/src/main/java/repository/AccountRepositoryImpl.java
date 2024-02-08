package repository;

import SingletonBuilderPrototype.model.AccountStatus;
import SingletonBuilderPrototype.model.AccountType;
import SingletonBuilderPrototype.model.BankAccount;
import SingletonBuilderPrototype.model.Director;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class AccountRepositoryImpl implements AccountRepository {
    private Map<Long, BankAccount> bankAccountMap = new HashMap<>();
    private long accountsCount = 0;
    private static final AccountRepositoryImpl accountRepository; // we can instantiate here but if we have a logic we use static bloc or we initialize the variable in getInstance

    static {
        System.out.println("Singleton Instantiation");
        accountRepository = new AccountRepositoryImpl();
        //accountRepository.populateData();
    }

    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId;
        synchronized (this) {
            accountId = ++accountsCount; //Critical zone
        }
        bankAccount.setAccountId(accountId);
        synchronized (this) {
            bankAccountMap.put(accountId, bankAccount);
        }
        return bankAccount;
    }


    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account = bankAccountMap.get(id);
        if (account == null)
            return Optional.empty();
        else
            return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return bankAccountMap.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.getAccountId(), bankAccount);
        return bankAccount;
    }

    @Override
    public void deleteById(Long id) {
        bankAccountMap.remove(id);

    }

    private AccountRepositoryImpl() {
    }

    public void populateData() {
        for (int i = 0; i < 10; i++) {
            BankAccount account = Director.accountBuilder()
                    .balance(10000 + Math.random() * 10000)
                    .status(Math.random() > 0.5 ? AccountStatus.ACTIVATED : AccountStatus.BLOCKED)
                    .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                    .currency(Math.random() > 0.5 ? "MAD" : "USD")
                    .build();
            save(account);
        }
        System.out.println("************");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Account count = " + accountsCount);
        System.out.println("Size: " + bankAccountMap.values().size());
        System.out.println("*************");
    }

    public  static AccountRepositoryImpl getInstance() {
        /*  if we use this implementation the function must be synchronized
        if (accountRepository == null) {
            System.out.println("Singleton instantiation");
            accountRepository = new AccountRepositoryImpl();
            accountRepository.populateData();
        }
        */

        return accountRepository;
    }
}
