package Exceptions;

public class Main {
    public static void main(String[] args) {
        BankAcc cont = new BankAcc(20.0F, "Marian");
        System.out.println("Cont creat pentru " + cont.getOwner() + " cu suma: " + cont.getAmount());

        try {
            cont.deposit(10);
            System.out.println("După depunere: " + cont.getAmount());

            System.out.println("Se încearcă retragerea sumei de 50...");
            cont.withdraw(50);

        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Excepție prinsă: " + e.getMessage());
        }

        System.out.println();

        SavingsAcc contEconomii = new SavingsAcc(100.0f, "Andrei", 0.10f);
        System.out.println("Cont economii creat pentru " + contEconomii.getOwner() + " cu suma: " + contEconomii.getAmount());

        contEconomii.applyInterest();
        System.out.println("Sold după aplicare dobândă: " + contEconomii.getAmount());

        try {
            System.out.println("Se încearcă depunerea sumei de -5...");
            contEconomii.deposit(-5);
        } catch (InvalidAmountException e) {
            System.out.println("Excepție prinsă: " + e.getMessage());
        }
    }
}