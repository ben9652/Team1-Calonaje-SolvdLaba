package com.hierarchy.app.Classes.Model.Builder;

public class Order {

    private int orderNumber;
    private int clientNumber;
    private int amount;

    private String expirationDate;
    private String emissionDate;
    private String location;


    private Order(orderBuilder builder) {
        this.orderNumber = builder.orderNumber;
        this.clientNumber = builder.clientNumber;
        this.amount = builder.amount;
        this.expirationDate = builder.expirationDate;
        this.emissionDate = builder.emissionDate;
        this.location = builder.location;
    }

    public static class orderBuilder{
        private int orderNumber;
        private int clientNumber;
        private int amount;

        private String expirationDate;
        private String emissionDate;
        private String location;


        public orderBuilder(int orderNumber, int clientNumber, int amount) {
            this.orderNumber = orderNumber;
            this.clientNumber = clientNumber;
            this.amount = amount;
        }

        public orderBuilder setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public orderBuilder setEmissionDate(String emissionDate) {
            this.emissionDate = emissionDate;
            return this;
        }

        public orderBuilder setLocation(String location) {
            this.location = location;
            return this;
        }
        public Order build() {
            return new Order(this);
        }
    }
    @Override
    public String toString() {
        return "Order {" +
                "Order Number:'" + orderNumber + '\'' +
                ", Client #:" + clientNumber +
                ", Total amount: $" + amount +
                ", Expiration Date:" + expirationDate +
                ", Date of emission:" + emissionDate +
                ", Location: '" + location + '\'' +
                '}';
    }
}
