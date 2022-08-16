package com.election;

public class VoterImpl {

    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setName("John");
        System.out.println("Name : " + voter.getName());

        voter.setAge(20);
        System.out.println(voter.getAge());

        System.out.println(voter.getAgeCriteria());
    }
}
