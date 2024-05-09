package com.monocept.if1;

import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		int Meter_charge=75;
		int charge=0;
		int Toatal_water_bill=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter No of units consumed");
		int units=scanner.nextInt();
		
		if(units<=100) {
		 charge=units*5;
			 Toatal_water_bill=charge+Meter_charge;
		}
		else if (units<=250){
			charge=units*10;
			Toatal_water_bill=charge+Meter_charge;
			
		}
		else {
			charge=units*20;
			Toatal_water_bill=charge+Meter_charge;
		}
		
		System.out.println("Net Payble "+Toatal_water_bill);

	}

}
