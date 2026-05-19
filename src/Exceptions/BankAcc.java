package Exceptions;

public class BankAcc {
    private float amount;
    private String owner;

    public BankAcc() {
        this.amount = 0.0f;
        this.owner = "N/A";
    }

    public BankAcc(float amount, String owner) {
        this.amount = amount;
        this.owner = owner;
    }

    public float getAmount() {
        return this.amount;
    }

    public String getOwner() {
        return this.owner;
    }

    public void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Eroare: Suma invalida");
        } else {
            this.amount += (float)amount;
        }
    }

    public void withdraw(int amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Eroare: Suma invalida");
        } else if (this.amount < (float)amount) {
            throw new InsufficientFundsException("Eroare: Fonduri insuficiente");
        } else {
            this.amount -= (float)amount;
        }
    }
}
