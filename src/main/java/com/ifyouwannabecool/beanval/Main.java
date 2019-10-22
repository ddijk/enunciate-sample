package com.ifyouwannabecool.beanval;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** Calll");
        try {
            Class.forName("com.ifyouwannabecool.beanval.DataAPI");
            System.out.println("**** Class loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("**** FAILED");
        }
    }
}
