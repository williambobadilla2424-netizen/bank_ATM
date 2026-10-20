/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.exceptions;

/**
 * exepcion que pasa cuando se intenta hacer una accion cuando el monto es igual o menor a 0
 * 
 * @author william
 * @version 25.0.3
 */
public class InvalidAmountException extends RuntimeException {

    /**
     * Crea una excepcion cuando el saldo no es valido, menor o igual a 0
     *
     * @param message mensaje sobre el error
     */
    public InvalidAmountException(String message) {
        super(message);
    }
    
}
