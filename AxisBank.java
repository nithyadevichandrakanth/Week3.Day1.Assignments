package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("This is the special account for Axis bank");
	}
	
	public static void main(String[] args) {
		AxisBank axisBank = new AxisBank();
		axisBank.deposit();
		BankInfo bank = new BankInfo();
		bank.deposit();
	}

}
