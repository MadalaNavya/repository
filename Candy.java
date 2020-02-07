package com.epam.New_year;

public class Candy {
	int quantity;
	static int range=50;
}

class Munch extends Candy{
	int mweight = 2;
	int price = 2;
	public int display() {
		return quantity;
	}
	public void quantity(int n) {
		quantity=n;
	}
	public int cal_weight(int n) {
		return mweight*n;
	}
	public int cal_price(int n) {
		return price*n;
	}
}

class Perk extends Candy{
	int pweight = 10;
	int price = 5;
	public int display() {
		return quantity;
	}
	public void quantity(int n) {
		quantity=n;	
	}
	public int cal_weight(int n) {
		return pweight*n;
	}
	public int cal_price(int n) {
		
	
		return price*n;
	}
}