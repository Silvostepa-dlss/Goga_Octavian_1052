package Exceptions;

public class Main {
    public static void main(String[] args){
        BankAcc cont = new BankAcc(20.0F, "Marian");

        try {
            cont.deposit(10);
            cont.withdraw(10);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(((Exception)e).getMessage());
        }
    }
}
