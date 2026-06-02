class PaymentMode {

    public void pay() {
        System.out.println("Processing Payment");
    }
}

class UPI extends PaymentMode {

    @Override
    public void pay() {
        System.out.println("Payment via UPI");
    }
}
