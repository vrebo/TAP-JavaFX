/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code6;

/**
 *
 * @author vrebo
 */
public class Main {
    
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("Valor padre = " + son.getFatherValue());
        System.out.println("Valor hijo = " + son.getSonValue());
    }
}
