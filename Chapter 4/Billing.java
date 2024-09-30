 public class Billing {

    public static void main(String[] args) {
        Billing billing = new Billing();
        
        billing.computeBill(23.2);
        billing.computeBill(15.5, 3);
        billing.computeBill(10.0, 2, 5);
    }

    public void computeBill(double price) {
        double total = price * 1.08; 
        System.out.println("Total bill: $" + total);
    }

    public void computeBill(double price, int quantity) {
        double total = (price * quantity) * 1.08;
        System.out.println("Total bill: $" + total);
    }

    public void computeBill(double price, int quantity, int couponDiscount) {
        double total = ((price * quantity) * (1 - (couponDiscount / 100.0))) * 1.08;
        System.out.println("Total bill: $" + total);
    }
}
