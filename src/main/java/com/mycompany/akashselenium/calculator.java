/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akashselenium;

/**
 *
 * @author JAVA
 */
public class calculator {
    int add(int a, int b){
    return a+b;
    }
    public static void main(String[] args){
        calculator obj1=new calculator();
        int result=obj1.add(2,4);
        System.out.println("result is "+result);
    }
}
