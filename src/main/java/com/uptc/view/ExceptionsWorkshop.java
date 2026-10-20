/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uptc.view;

import com.uptc.exceptions.IncorrectKeyException;
import com.uptc.exceptions.InsufficientBalanceException;
import com.uptc.exceptions.InvalidAmountException;
import com.uptc.logic.ATM;
import com.uptc.models.BankAccount;

/**
 * @author USUARIO
 * @version 25.0.3
 */
public class ExceptionsWorkshop {

    public static void main(String[] args) {
        
        BankAccount bank = new BankAccount("001", "1234", 500);
        ATM atm = new ATM(bank);
        
        try {
           atm.withdraw(100, "0000");
        } catch (InsufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        try {
           atm.withdraw(1000, "1234");
        } catch (InsufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        try {
           atm.withdraw(-50, "1234");
        } catch (InsufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        try {
           atm.withdraw(200, "1234");
        } catch (InsufficientBalanceException | IncorrectKeyException | InvalidAmountException e) {
            System.out.println(e);
        }finally{
            System.out.println("Intento procesado");
        }
        
        System.out.println(atm.getAccount());
        
        
    }
}
