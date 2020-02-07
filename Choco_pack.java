package com.epam.New_year;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Choco_pack {
	public static int tw_choco = 0;
	public static int tc_choco = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Size of MilkyBar = Large\nSize of Dairy_Milk = Small");
    	MilkyBar b = new MilkyBar();
    	Dairy_Milk sn = new Dairy_Milk();
    	
    	System.out.println("Enter size of MilkyBar(1 to 10): ");
    	b.getsize(scan.nextInt());
    	
    	System.out.println("Enter size of Dairy_Milk (1 to 10): ");
    	sn.getsize(scan.nextInt());
    	
    	System.out.println("Enter quantity of MilkyBar: ");
    	int dq = scan.nextInt();
    	
    	System.out.println("Enter quantity of Dairy_Milk: ");
    	int sq = scan.nextInt();
    	
    	System.out.println("Enter price of MilkyBar: ");
    	b.price = scan.nextInt();
    	
    	System.out.println("Enter price of Dairy_Milk: ");
    	sn.price = scan.nextInt();
    	
    	
    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = b.display();
    	int ss = sn.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("MilkyBar");
        		ch.add("Dairy_Milk");
        	}
        	else{
        		ch.add("Dairy_Milk");
        		ch.add("MilkyBar");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("Dairy_Milk");
    		ch.add("MilkyBar");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input");
    		return;
    	}
    	
    	tw_choco = b.total_weight(dq) + sn.total_weight(sq);
    	System.out.println(tw_choco +" Grms");
    	
    	tc_choco = b.total_price(dq) + sn.total_price(sq);
    	System.out.println(tc_choco +" Rc.");
	}
	
}


