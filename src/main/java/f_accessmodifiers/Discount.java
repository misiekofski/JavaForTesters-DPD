package f_accessmodifiers;

public class Discount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount>1 || amount<0) {
            throw new IllegalArgumentException("Discount cannot be less than 0 or more than 1");
        } else {
            this.amount = amount;
        }
    }
}
