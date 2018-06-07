package com.company.people;

public class Visitor extends People{
    private int groupSize;
    private String allergies;
    private boolean membership;
    private String address;

    public Visitor(int age, String name, char gender, String race, int groupSize, boolean membership, String address) {
        super(age, name, gender, race);
        this.groupSize = groupSize;
        this.membership = membership;
        this.address = address;
    }

    public int getGroupsize() {
        return groupSize;
    }

    public void setGroupsize(int groupSize) {
        this.groupSize = groupSize;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean hasMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
