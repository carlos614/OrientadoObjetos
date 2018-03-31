package com.github.www;

public class Delta {
	
        public double x1 (int a, int b, int c){
            
            int d = delta (a, b, c);
            
            return ((-b +Math.sqrt(d))/2*a);
        }
        

		/** X2  **/
        public double x2 (int a, int b, int c){
            
            int d;
            d = delta (a, b, c);
            
            return ((-b -Math.sqrt(delta(a, b, c)))/2*a);
        }


		public int delta(int a, int b, int c) {
			// TODO Auto-generated method stub
			return 0;
		}      
	
	
	
	
	
	
	

}
