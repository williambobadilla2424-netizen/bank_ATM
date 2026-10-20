/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.uptc.bankAtm.test;

import com.uptc.exceptions.IncorrectKeyException;
import com.uptc.exceptions.InsufficientBalanceException;
import com.uptc.logic.ATM;
import com.uptc.models.BankAccount;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author USUARIO
 */
public class BankJUnitTest {
    
    BankAccount account;
    ATM atm;
    
    public BankJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        account = new BankAccount("001", "1234", 500);
        atm = new ATM(account);
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void validateUserAccount(){
        assertEquals("001", account.getAccountNumber());
        assertEquals(500.01, account.getBalance(),0.1);
    }
    
    @Test
    public void depositBankAccount(){
        atm.deposit(500);
        assertEquals(1000.0, account.getBalance(),0.1);
    }
    
    @Test
    public void withDrawAccount() throws InsufficientBalanceException, IncorrectKeyException{
        atm.withdraw(100, account.getPassword());
        assertEquals(900.0, account.getBalance());
    }
    
    @Test
    public void validateKeybankAccount(){
        assertThrows(IncorrectKeyException.class, ()->{
            atm.withdraw(200, "12359788");
        });
    }
    
    @Test
    public void validateInsuficientValueBankAcount(){
        assertThrows(InsufficientBalanceException.class, ()->{
            atm.withdraw(2000, account.getPassword());
        });
    }
    
    @ParameterizedTest
    @ValueSource(doubles={100,120,10})
    public void withDrawWithWrongKeyThrowsIncorrectKey(double amount){
        assertThrows(IncorrectKeyException.class, ()->
        atm.withdraw(amount, "0000"));
    }
    
    @ParameterizedTest
    @ValueSource(doubles={10000,14000,-1400,-1})
    public void withDrawMoreThanBalance(double amount){
        InsufficientBalanceException e = assertThrows(InsufficientBalanceException.class, ()->
        atm.withdraw(amount, account.getPassword()));
        assertNotNull(e.getMessage());
    }
    
    
}
