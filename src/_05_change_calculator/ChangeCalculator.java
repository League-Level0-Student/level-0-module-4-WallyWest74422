package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 *///just do it!!! >:(
public class ChangeCalculator {

	public static void main(String[] args) {
		String pennies= JOptionPane.showInputDialog("How many pennies do you have?");
		int num1 = Integer.parseInt(pennies);
		// Ask the user how many nickels they have
String nickels= JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int num = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes= JOptionPane.showInputDialog("How many dimes do you have?");
int num2 = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters= JOptionPane.showInputDialog("How many quarters do you have?");
int num3 = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
int money=(num*5+num2*10+num3*25+num1);
		// Tell the user how much money they have
System.out.println(money);
	}
}

