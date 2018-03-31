package com.github.www;

import java.util.Scanner;

public class DeltaApp {
	
	public static void main (String[] args){
		
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite A: ");
           int a = scan.nextInt();
    
          System.out.println("Digite B: ");
            int b = scan.nextInt();
            
          System.out.println("Digite C: ");
            int c = scan.nextInt();
            
            Delta eq = new Delta();
            
            int d = eq.delta(a, b, c);
            
/** Condições **/
    if (d >=0){
    	
       double x1 = eq.x1(a, b, c);
        System.out.println("X1 = " +x1);
        
        double x2 = eq.x2(a, b, c);
        System.out.println("X2 = " +x2);
    }
    else { System.out.println("Delta negativo");    
}
    }
	
	
	
	

}
