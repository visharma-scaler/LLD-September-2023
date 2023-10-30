package scaler.lld2.observer;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        EmailSender emailSender = new EmailSender();
        AnalyticsSender analyticsSender = new AnalyticsSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        amazon.orderPlaced();
    }
}
