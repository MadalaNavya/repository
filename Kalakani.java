package com.epam.New_year;

public class Kalakani extends Sweets {
	int weight=10;
	int price=15;
	public int display() {
		return total;
	}

	public int calculate_w(int kc) {
		return total=kc*weight;// TODO Auto-generated method stub
		
	}
	public int calculate(int n) {
		return total=n*price;
	}


	

}
