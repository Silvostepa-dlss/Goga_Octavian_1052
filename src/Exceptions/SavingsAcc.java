package Exceptions;

public class SavingsAcc extends BankAcc {
    private float interestRate;

    public SavingsAcc() {
        this.interestRate = 0.0f;
    }

    public SavingsAcc(float amount, String owner, float interestRate) {
        super(amount, owner);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        float interest = getAmount() * interestRate;
        try {
            deposit((int) interest);
            System.out.println("Dobânda de " + interest + " a fost aplicată.");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}