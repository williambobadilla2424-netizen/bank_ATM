/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.models;

import com.uptc.logic.ATM;

/**
 * @author USUARIO
 * @version 25.0.3
 */
public class BankAccount {
    
    private final String accountNumber;
    private String password;
    private double balance;

    /**
     * Crea una cuenta con los datos necesarios
     *
     * @param accountNumber número que identifica la cuenta
     * @param password contraseña para acceder
     * @param balance saldo de la cuenta
     */
    public BankAccount(String accountNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    /**
     * Obtiene el número de la cuenta
     *
     * @return número de la cuenta
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Obtiene la contraseña de acceso
     *
     * @return contraseña de la cuenta
     */
    public String getPassword() {
        return password;
    }

    /**
     * Obtiene el saldo disponible en la cuenta
     *
     * @return saldo de la cuenta
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Actualiza la contraseña de la cuenta
     *
     * @param password nueva contraseña para la cuenta
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Actualiza el saldo de la cuenta
     *
     * @param balance nuevo saldo de la cuenta
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Cuenta \nNumero de cuenta: %s \nContraseña: %s \nSaldo: %.2f", accountNumber,password,balance);
    }
    
}
