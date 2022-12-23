package main.java.com.nadee.numbers;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0, a, temp;
		int n = 153; // number which we need check this is a Armstrong or not
				
		temp = n;
		while(n > 0) {
			a = n%10;
			n = n/10;
			
			//we have to evaluate a 3-digit number then c should be assigned with c + (a*a*a)
			c = c + (a*a*a);
		}
		
		if(temp == c) {
			System.out.println("This is an Armstrong numebr");
		}else {
			System.out.println("This is not an Armstrong numebr");
		}
	}

}
