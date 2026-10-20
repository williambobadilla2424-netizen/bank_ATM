/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uptc.exceptions;

/**
 * exepcion que pasa cuando se intenta hacer una accion cuando la contraseña ingresada es diferente a la que esta guardada en la cuenta
 * 
 * @author william
 * @version 25.0.3
 * 
 */
public class IncorrectKeyException extends Exception {

    /**
     * Crea una excepcion cuando la contraseña es diferente
     *
     * @param message mensaje sobre el error
     */
    public IncorrectKeyException(String message) {
        super(message);
    }
    
}
