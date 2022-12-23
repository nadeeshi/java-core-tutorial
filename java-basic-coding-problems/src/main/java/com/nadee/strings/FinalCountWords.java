package main.java.com.nadee.strings;
import java.util.HashMap;

//Count the number of words in a string using HashMap
public class FinalCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "This is is the sentence we need to count words";
        String[] split = str.split(" ");
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i< split.length; i++) {
        	if(map.containsKey(split[i])) {
        		int count = map.get(split[i]);
        		map.put(split[i], count+1);
        	}else {
        		map.put(split[i], 1);
        	}
        	
        }
        System.out.println(map);
	}
}
