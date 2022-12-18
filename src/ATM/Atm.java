package ATM;

public class Atm {
    private double balance;
    private  double depositeAmounth;
    private  double WithdrawAmouth;


    public  Atm()
    {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositeAmounth() {
        return depositeAmounth;
    }

    public void setDepositeAmounth(double depositeAmounth) {
        this.depositeAmounth = depositeAmounth;
    }

    public double getWithdrawAmouth() {
        return WithdrawAmouth;
    }

    public void setWithdrawAmouth(double withdrawAmouth) {
        WithdrawAmouth = withdrawAmouth;
    }
}
