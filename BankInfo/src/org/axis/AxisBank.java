package org.axis;

import org.bank.BankDetails;

public class AxisBank extends BankDetails {

	public void carLoan() {
		System.out.println("Car loan is at 9%");

	}

	public static void main(String[] args) {

		AxisBank a = new AxisBank();
		a.carLoan();
		a.savings();
		a.carLoan();
		a.current();
	}
}
