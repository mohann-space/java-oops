public class ATM_Main {
    public static void main(String[] args) {
        ATM_Machine atm = new ATM_Machine(5000);
        System.out.println(atm.getCashBox());
        atm.setCashBox(100000);
        System.out.println(atm.getCashBox());
        atm.deposit(23000);
        System.out.println(atm.getCashBox());
    }
}
