package SingletonBuilderPrototype;

import SingletonBuilderPrototype.model.*;
import SingletonBuilderPrototype.repository.AccountRepositoryImpl;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                accountRepository.populateData();
            }).start();
        }

        System.out.println("Entrez un caractère ");
        System.in.read();
        List<BankAccount> bankAccounts = accountRepository.findAll();
        for (BankAccount account :
                bankAccounts) {
            System.out.println(account);

        }


        Director director = new Director();
        Customer customer = new Customer(1L, "customer 1");
        BankAccount account1 = director.accountBuilder()
                .balance(20)
                .type(AccountType.SAVING_ACCOUNT)
                .currency("MAD")
                .status(AccountStatus.ACTIVATED)
                .customer(customer)
                .build();
        BankAccount account2 = account1.clone();
        System.out.println(account1);
        System.out.println(account2);
        System.out.println("***************");
        customer.setName("update customer 1") ;
        System.out.println(account1);
        System.out.println(account2);


    }


}

