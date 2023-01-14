// AccountHistory.java
import java.util.ArrayList;
import java.util.List;

public class AccountHistory {
    private List<Transaction> transactions;

    public AccountHistory() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public class Transaction {
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public String getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }
    }
}