package org.example;

public class Customer implements Comparable<Customer>{
    private Integer orderId;
    private double amount;
    private String customerName;

    public Customer(Integer orderId, double amount, String customerName) {
        this.orderId = orderId;
        this.amount = amount;
        this.customerName = customerName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return o.orderId > this.orderId ? 1 : -1; // this will check based on the orderId
    }
}
