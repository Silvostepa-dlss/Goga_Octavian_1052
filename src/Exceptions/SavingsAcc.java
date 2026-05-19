package Exceptions;

public class SavingsAcc extends BankAcc{
    private float interestRate;

    public SavingsAcc() {
        this.interestRate = 0.0f;
    }

    public SavingsAcc(float amount, String owner, float interestRate) {
        super(amount, owner);
        this.interestRate = interestRate;
    }
}
