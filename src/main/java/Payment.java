public class Payment {

    protected double amount;
    protected String currency;
    protected String status;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.status = "PENDING";
    }

    public void processPayment() {
        System.out.println("Processing generic payment...");
    }

    public void generateReceipt() {
        System.out.println("Receipt for amount " + amount + " currency " + currency);
    }

    public void markAsCompleted() {
        status = "COMPLETED";
        System.out.println("Payment completed");
    }
}
