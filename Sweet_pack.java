package com.epam.New_year;

import java.util.ArrayList;
import java.util.Scanner;

public class Sweet_pack {
	static public int s_weight;
	static public int s_price;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> Sweets=new ArrayList<String>();
		Sweets.add("Kalakani");
		Sweets.add("Kaju");
		
		//int weight[]=new int[Sweets.size()];
		int price[]=new int[Sweets.size()];
		Kalakani k=new Kalakani();
		Kaju l=new Kaju();
		
		System.out.println("Enter number of sweets\n");
		int kc=s.nextInt();
		int lc=s.nextInt();
		
		k.calculate(kc);
		l.calculate(lc);
		price[0]=k.display();
		price[1]=k.display();
		System.out.print("Total weight of sweets is: ");
		s_weight=l.calculate(l.weight)+k.calculate_w(k.weight);
		System.out.println(s_weight+" grams\n");
		
		System.out.print("Total price of sweets is: ");
		s_price=price[0]+price[1];
		System.out.println(s_price+" Rs\n");
		
		
		
	}

}
