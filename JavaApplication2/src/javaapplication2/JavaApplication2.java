/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author user 1
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		t1.setName("Jack");
		t2.setName("Joya");
		
		t1.start();
		t2.start();
	
    }
    
}
