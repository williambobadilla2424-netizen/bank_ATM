/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.logic;

import com.uptc.exceptions.IncorrectKeyException;
import com.uptc.exceptions.InsufficientBalanceException;
import com.uptc.exceptions.InvalidAmountException;
import com.uptc.models.BankAccount;

/**
 * @author william
 * @version 25.0.3
 */
public class ATM {
    
    private BankAccount account;

    /**
     * Crea un clase ATM con una cuenta
     *
     * @param account cuenta que se va a utilizar
     */
    public ATM(BankAccount account) {
        this.account = account;
    }

    /**
     * Obtiene la cuenta (objeto)
     *
     * @return cuenta guardada
     */
    public BankAccount getAccount() {
        return account;
    }
    
    
    /**
     * deposita dinero en la cuenta
     *
     * @param amount cantidad de dinero a depositar
     * @throws InvalidAmountException para monto si es menor o igual a cero
     */
    public void deposit(double amount){
        if (amount<=0) {
            throw new InvalidAmountException("El monto no puede ser 0 o menor a 0");
        }
        
        account.setBalance(account.getBalance()+amount);
    }
    
    /**
     * Retira dinero validando el monto, la contraseña y el saldo en la cuenta
     *
     * @param amount cantidad de dinero a retirar
     * @param passwordEntered contraseña para poder retirar
     * @throws InsufficientBalanceException si el saldo es insuficiente
     * @throws IncorrectKeyException si la contraseña es incorrecta
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void withdraw(double amount, String passwordEntered) throws InsufficientBalanceException,IncorrectKeyException{
        
        if (amount<=0) {
            throw new InvalidAmountException("El monto no pueder ser 0 o menor a 0");
        }
        
        if (amount>account.getBalance()) {
            throw new InsufficientBalanceException("Saldo insuficiente");
        }
        
        if (!passwordEntered.equalsIgnoreCase(account.getPassword())) {
            throw new IncorrectKeyException("!Contraseña incorrecta¡");
        }
        
        account.setBalance(account.getBalance()-amount);
    }
}
