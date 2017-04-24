package controller;

import javax.swing.JFrame;

import model.Model;

public class Controller {

	private Model model;

	public Controller() {
		model = new Model();
	}

	public static void login(String username, String password) {
		/*
		 * Account[] accounts = model.getAccount(username, password); if
		 * (accounts.length != 1) { return;// Username is wrong } else { // One
		 * user found if (accounts[0].password == password) { return; //
		 * Verified username, password } }
		 */
	}

	public void close() {
		System.exit(0);
	}

}
