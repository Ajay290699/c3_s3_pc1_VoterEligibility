package com.election;

public class Voter {

    final int VOTER_ELIGIBLE_AGE = 18;
    private String name;
    private int age;

    Voter() {
        name = "";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCriteria() {
        if (age >= VOTER_ELIGIBLE_AGE) {
            return name + " is eligible to vote";
        } else if (age < 18 && age == 0) {
            return name + " is not eligible to vote";
        } else if (age < 0) {
            return name + " age can't be negative";
        } else {
            return name;
        }

    }
}
