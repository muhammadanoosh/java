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
class Account {
    private int balance = 6000;

	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
        }
}
