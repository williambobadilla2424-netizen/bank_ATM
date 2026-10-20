/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.exceptions;

/**
 * exepcion que pasa cuando se intenta hacer una accion cuando se intenta retirar un monto mayor al saldo que esta en la cuenta
 * 
 * @author william
 * @version 25.0.3
 */
public class InsufficientBalanceException extends Exception {
    
    /**
     * Crea una excepcin cuando el saldo es insuficiente
     *
     * @param message mensaje sobre el error
     */
    public InsufficientBalanceException(String message) {
        super(message);
    }
    
}
