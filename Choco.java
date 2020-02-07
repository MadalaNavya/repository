package com.epam.New_year;

public class Choco {
	int size;
	int price;
}

class MilkyBar extends Choco{
	int dweight = 50;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_weight(int n) {
		return dweight*n;
	}
	public int total_price(int n) {
		return price*n;
	}
}

class Dairy_Milk extends Choco{
	int sweight = 30;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_weight(int n) {
		return sweight*n;
	}
	public int total_price(int n) {
		return price*n;
	}
}