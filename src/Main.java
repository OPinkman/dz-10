public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        bankApplication.check("accountId000", 50, "USD");
        bankApplication.check("accountId003", 250, "HRV");
        bankApplication.check("accountId001", 50, "EUR");
        bankApplication.check("accountId001", 50, "USD");
        bankApplication.check("accountId001", 50, "USD");
    }
}