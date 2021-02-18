import java.util.*;

public class OrderHistory {
    private ArrayList<Order> orders;
    private String name;

    public OrderHistory(ArrayList<Order> orders, String name) {
        this.orders = orders;
        name = name;
    }

    public void printOwing() {

        double outstanding = 0.0;

        // calculate outstanding
        Iterator it = orders.iterator();
        while(it.hasNext()) {
            Order each  = (Order) it.next();
            //print order
            System.out.println("Order ID : " + each.ID + "Amount : " + each.amount + "Date : " + each.date);

            outstanding += each.getAmount();
        }

        // print banner
        System.out.println("***********************");
        System.out.println("**** Customer Owes ****");
        System.out.println("***********************");

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}

class Order {
     int ID;
     double amount;
     Date date;

    public Order(int ID, double amount, Date date) {
        this.ID = ID;
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }
}
