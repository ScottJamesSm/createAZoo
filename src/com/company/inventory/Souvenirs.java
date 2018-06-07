package com.company.inventory;

public class Souvenirs extends Items{
    private String type;
    private int iDNumber;

    public Souvenirs(double price, String itemName, int quantity, String dateReceived, String type, int iDNumber) {
        super(price, itemName, quantity, dateReceived);
        this.type = type;
        this.iDNumber = iDNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
}