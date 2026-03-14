public class PaymentTest {

    public static void main(String[] args) {

        Payment cod = new CashOnDelivery(1000, "LKR", "Colombo");
        Payment bank = new BankTransfer(2000, "LKR", "HNB", "123456", "REF123");
        Payment credit = new CreditCardPayment(5000, "LKR", "1111-2222", "John", "12/27", 10000);
        Payment debit = new DebitCardPayment(1500, "LKR", "3333-4444", "Jane", "10/26", 8000);

        cod.processPayment();
        cod.generateReceipt();

        bank.processPayment();
        bank.generateReceipt();

        credit.processPayment();
        credit.generateReceipt();

        debit.processPayment();
        debit.generateReceipt();
    }
}
