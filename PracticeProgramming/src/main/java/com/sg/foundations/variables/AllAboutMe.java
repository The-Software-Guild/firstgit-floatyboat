/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author spenc
 */
public class AllAboutMe {
    public static void main(String[] args) {
        String name, food, home;
        int pets;
        boolean whistle;
        
        name = "Spencer";
        food = "Burrito";
        home = "apartment";
        pets = 2;
        whistle = false;
        
        System.out.println("My name is " + name + ".");
        System.out.println("My favorite food is " + food + ".");
        System.out.println("I have " + pets + " pets.");
        System.out.println("I live in a(n) " + home + ", and I love it here.");
        System.out.print("It is true; I");
        if(!whistle) {
            System.out.print(" don't");
        }
        System.out.println(" know how to whistle.");
    }
}
