package com.epam.New_year;

import java.util.Scanner;

public class Candies_pack {

	public static int c_weight=2;
	public static int c_price=2;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximum number of Candy: " + Candy.range);
    	Munch mu = new Munch();
    	Perk pe = new Perk();
    	System.out.println("Enter Quantities of Munch and Perk:");
    	mu.quantity(scan.nextInt());
    	pe.quantity(scan.nextInt());
    	if(mu.quantity+pe.quantity<=Candy.range) {
    	System.out.println("Options:\n1.Quantity\n2.Total Candy");
    	int opc = scan.nextInt();
    	if(opc==1) {
    		System.out.println("Enter quantity of range within:");
    		int qun = scan.nextInt();
    		if(mu.display()<=qun) {
    			System.out.println("Munch are in range of "+qun);
    			System.out.println("No of Munchs are : "+mu.display());
    		}
    		else {
    			System.out.println("Perk are in range of "+qun);
    			System.out.println("No of Perk are : "+pe.display());
    		}
    	}
    	else if(opc==2) {
        	int total_range = mu.display()+pe.display();
        	if(total_range<Candy.range) {
        		System.out.println("Candy are with in range");
            	System.out.println("Total number of Candy in the present are : " + total_range);
        	}
        	else {
        		System.out.println("Candy are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	c_weight = pe.cal_weight(pe.quantity)+mu.cal_weight(mu.quantity);
    	System.out.println("Total weight of Candy: "+c_weight+" grms\n");
    	
    	c_price = pe.cal_price(pe.quantity) + mu.cal_price(mu.quantity);
    	System.out.println("Total price of Candy: "+c_price+" Rc.\n");
    	}
    	else {
    		System.out.println("Candy out of range");
    		return;
    	}
	}
}

