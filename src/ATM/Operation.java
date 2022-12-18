package ATM;

public interface Operation {
    public void ViewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount );
    public  void viewMiniStatement();

}
