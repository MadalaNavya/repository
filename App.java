package com.epam.New_year;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter maximum price");
        int mp=s.nextInt();
        ArrayList<String> Candies=new ArrayList<String>();
        ArrayList<String> Chocolates=new ArrayList<String>();
        Candies.add("Munch");
        Candies.add("Perk");
        Chocolates.add("MilkyBar");
        Chocolates.add("DairyMilk");
        
        System.out.println("calling of SweetPackage class\n");
        Sweet_pack.main(args);
        
        System.out.println("calling of CandiesPackage class\n");
        Candies_pack.main(args);
        
        System.out.println("calling of ChoclatesPackage class\n");
        Choco_pack.main(args);
        
        int total_weight=0;
        total_weight=Sweet_pack.s_weight+Candies_pack.c_weight+Choco_pack.tw_choco;
        System.out.println("Total weight of the New Year Gift is"+total_weight+"Gms");
        
        int total_price=0;
        total_price=Sweet_pack.s_price+Candies_pack.c_price+Choco_pack.tc_choco;
        if(mp<total_price) {
        	System.out.println("Gift price more than expected. Please get within range");
    }
        else {
        	System.out.println("Total price of the gift is"+total_price+"Rs.");
        }
        
        
        
        
        
        
    }
}
