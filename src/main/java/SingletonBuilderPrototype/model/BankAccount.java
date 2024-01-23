package SingletonBuilderPrototype.model;

public class BankAccount implements Cloneable{
    private Long accountId ;
    private double balance ;
    private String currency ;
    private AccountType type ;
    private AccountStatus status ;

    private Customer customer;

    public Long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountType getType() {
        return type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public BankAccount(Long accountId, double balance, String currency, AccountType type, AccountStatus status) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }

    @Override
    public BankAccount clone() {
        try {
            BankAccount clone = (BankAccount) super.clone();
            setCustomer(this.customer.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static class AccountBuilder {
        private BankAccount bankAccount = new BankAccount();
        public AccountBuilder accountId(Long id){
            bankAccount.setAccountId(id);
            return this ;
        }
        public AccountBuilder currency(String currency){
            bankAccount.setCurrency(currency);
            return this ;
        }
        public AccountBuilder balance(double balance){
            bankAccount.setBalance(balance);
            return this ;
        }
        public AccountBuilder type(AccountType type){
            bankAccount.setType(type);
            return this ;
        }
        public AccountBuilder status(AccountStatus status){
            bankAccount.setStatus(status);
            return this ;
        }
        public AccountBuilder customer(Customer customer){
            bankAccount.setCustomer(customer);
            return this ;
        }
        public BankAccount build(){
            return this.bankAccount ;
        }

    }
}
