package Model;

public class PreferredCustomer extends Customer {
    private double purchaseTotal;
    private double discountlevel;
    public PreferredCustomer(String name, String address, int phoneNumber, int customerNumber, boolean mailingList,double purchaseTotal) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.purchaseTotal = purchaseTotal;

        if (purchaseTotal >= 500 && purchaseTotal < 1000){
            this.discountlevel = .05;
        }
        else if (purchaseTotal >= 1000 && purchaseTotal < 1500){
            this.discountlevel = .06;
        }
        else if (purchaseTotal >= 1500 && purchaseTotal < 2000){
            this.discountlevel = .07;
        }
        else if (purchaseTotal >= 2000){
            this.discountlevel = .1;
        }
    }
    public double realPrice(){
        return purchaseTotal - (purchaseTotal * discountlevel);
    }
}
