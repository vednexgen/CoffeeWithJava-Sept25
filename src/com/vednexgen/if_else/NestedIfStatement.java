package com.vednexgen.if_else;

public class NestedIfStatement {
    public static void main(String[] args) {
        verifyVoter(10, false);
        verifyVoter(21, false);
        verifyVoter(21, true);
    }

    private static void verifyVoter(int age, boolean hasVoterId) {

        if (age >= 18) {
            if (hasVoterId) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You need a voter ID to vote");
            }
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}