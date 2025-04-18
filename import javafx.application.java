import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankingSystemFX extends Application {
    private Bank bank = new Bank();
    private Label balanceLabel = new Label("Balance: $0");

    @Override
    public void start(Stage primaryStage) {
        // UI Elements
        Label accountLabel = new Label("Enter Account Number:");
        TextField accountField = new TextField();
        Button loginButton = new Button("Login");

        Button checkBalance = new Button("Check Balance");
        Button depositButton = new Button("Deposit");
        Button withdrawButton = new Button("Withdraw");
        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount");

        VBox layout = new VBox(10, accountLabel, accountField, loginButton, balanceLabel, checkBalance, depositButton, withdrawButton, amountField);
        Scene scene = new Scene(layout, 300, 400);

        // Button Actions
        loginButton.setOnAction(e -> {
            try {
                int accountNumber = Integer.parseInt(accountField.getText());
                if (bank.login(accountNumber)) {
                    balanceLabel.setText("Balance: $" + bank.getBalance());
                } else {
                    balanceLabel.setText("Invalid Account!");
                }
            } catch (NumberFormatException ex) {
                balanceLabel.setText("Enter a valid number!");
            }
        });

        checkBalance.setOnAction(e -> balanceLabel.setText("Balance: $" + bank.getBalance()));

        depositButton.setOnAction(e -> {
            try {
                int amount = Integer.parseInt(amountField.getText());
                bank.deposit(amount);
                balanceLabel.setText("Balance: $" + bank.getBalance());
            } catch (NumberFormatException ex) {
                balanceLabel.setText("Enter a valid amount!");
            }
        });

        withdrawButton.setOnAction(e -> {
            try {
                int amount = Integer.parseInt(amountField.getText());
                bank.withdraw(amount);
                balanceLabel.setText("Balance: $" + bank.getBalance());
            } catch (NumberFormatException ex) {
                balanceLabel.setText("Enter a valid amount!");
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Banking System");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Updated Bank class
class Bank {
    private int balance = 0;
    private final int[] accounts = {13062006, 8012005, 28072006};
    private final int[] balances = {67000, 68000, 104530};

    public boolean login(int account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == account) {
                balance = balances[i];
                return true;
            }
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
