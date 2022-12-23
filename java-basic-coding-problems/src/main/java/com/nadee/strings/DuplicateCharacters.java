package main.java.com.nadee.strings;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count = 0;
     
		String str = new String("skkettk");
		char[] charArr = str.toCharArray();
		
		System.out.println("Duplicate Characters are:-");
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(charArr[i] == charArr[j]) {
					System.out.println(charArr[j]);
					count++;
					break;
				}
			}
			
		}
		
	}

}
