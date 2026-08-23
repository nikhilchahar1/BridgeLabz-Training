import java.util.*;

class PaymentFailedException extends Exception {
    PaymentFailedException(String msg) {
        super(msg);
    }
}

interface Payment {
    void pay(double amount) throws PaymentFailedException;
}

class Card implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class UPI implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class Wallet implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Customer {
    String name;
    Customer(String name) {
        this.name = name;
    }
}

class Order {
    Product product;
    Customer customer;
    String status = "Placed";

    Order(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }

    void cancel() {
        status = "Cancelled";
        System.out.println("Order Cancelled");
    }

    void track() {
        System.out.println("Order Status: " + status);
    }
}

public class ECommerce {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Nikhil");
        Order order = new Order(p, c);
        Payment payment = new UPI();

        try {
            payment.pay(p.price);
            order.track();
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }

        order.cancel();
        order.track();
    }
}