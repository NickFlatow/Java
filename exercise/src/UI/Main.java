package UI;

import Model.Customer;
import Model.PreferredCustomer;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Art Barfunkle","3737 Barfunkle drvie",26247156,8,false);
        System.out.println(c.getAddress() + c.getCustomerNumber() + c.getAddress() + c.getName());
        PreferredCustomer pc = new PreferredCustomer("Art Barfunkle","3",2,1,true,
                625);

        System.out.println(pc.realPrice());
    }
}
