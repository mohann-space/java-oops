public class ATM_Machine {
    private double cashBox;
    public ATM_Machine(double cashBox)
    {
        if (cashBox>0) {
            this.cashBox = cashBox;
        }
        else
            System.out.println(".........    Invalid Cash   .......");
    }

    public void deposit(int amount)
    {
        if (amount>0) {
            this.cashBox = this.cashBox + amount;
        }
        else
            System.out.println("........   Invalid amount   ........");
    }

    public double getCashBox()
    {
        return this.cashBox;
    }

    public void setCashBox(double cashBox)
    {
        if (cashBox>0) {
            this.cashBox = cashBox;
        }
        else
            System.out.println("............    Invalid  Cash    ..............");
    }
}
