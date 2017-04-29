import java.util.*;
public class Cypher {
	
	static char [] charTable = new char [26];
	static char [] charTableReg = new char [26];
	static Random rand = new Random();
	static String mixed = "";
	
	public Cypher(){
		
		int index = 0;
		for(int i=97; i<123; i++){
			charTableReg[index] = (char) i;
			charTable[index] = (char) i;
			index++;
		}
		
	}
	
	private static char[] randomKey(){
		
		int num1;
		int num2;
		char temp;
		
		for(int i=0; i<500; i++){
			
			num1 = rand.nextInt(26);
			num2 = rand.nextInt(26);
			
			temp = charTable[num1];
			charTable[num1] = charTable[num2]; 
			charTable[num2] = temp;
			
		}
		
		
		return charTable;
	}
	
	private  static void printRandomKey(){
		
		for(int i=0; i<26; i++){
			System.out.println(charTableReg[i] + ":" + charTable[i]);
		}
		
		System.out.println();
		System.out.println("Key to enter:");
		
		for(int i=0; i<26; i++)
			System.out.print(charTable[i]);
		
	}
	
	private static String convertWithRandomTable(String str){
		
		char [] table = randomKey();
		
		for(int i=0; i<str.length(); i++){
			
			if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
				mixed += table[(int)str.charAt(i)-97];
				
			}
			else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				
				mixed += Character.toUpperCase(table[(int) str.charAt(i)-65]);
				
			}
			else
				mixed += str.charAt(i);
			
		}
		
		return mixed;
	}
	
	private static String reverseRandom(String str, String key){
		
		if(key.length() != 26)
			return "Error. Key is invalid";
			
		String original = "";
		String capitalKey = key.toUpperCase();
		
		
		for(int i=0; i<str.length(); i++){
			
			if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
				original += (char)(key.indexOf((int)str.charAt(i)) + 97);
						
			}
			else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				original += (char)(Character.toUpperCase(capitalKey.indexOf((int)str.charAt(i)) + 97));
			}
			else
				original += str.charAt(i);
		}
		
		return original;
	}
	
	
	private String setIncrease(int num, String str){
		
		int input;
		
		if(num < 1)
			return "Error. Must be a positive number.";
		else{
			
			for(int i=0; i<str.length(); i++){
			
				if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
					input = (int)(str.charAt(i)+num);
					if (input > 122)
						mixed += (char)(input%123 + 97);
					else
						mixed += (char)(input);
				
				}
				else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				
					input = (int)(str.charAt(i)+num);
					if (input > 90)
						mixed += (char)(input%91 + 65);
					else
						mixed += (char)(input);
				
				
				}
					else
						mixed += str.charAt(i);
				
				}
		}
		return mixed;
	}
	
	private String setDecrease(int num, String str){
		
		int input;
		
		if(num < 1)
			return "Error. Must be a positive number.";
		else{
			
			for(int i=0; i<str.length(); i++){
			
				if('a' <= (str.charAt(i)) && (str.charAt(i)) <= 'z'){
				
					input = (int)(str.charAt(i)-num);
					if (input < 97)
						mixed += (char) (122-(96%input));
					else
						mixed += (char)(input);
				
				}
				else if('A' <= (str.charAt(i)) && (str.charAt(i)) <= 'Z'){
				
					input = (int)(str.charAt(i)-num);
					if (input < 65)
						mixed += (char)(90-(64%input));
					else
						mixed += (char)(input);
				
				
				}
					else
						mixed += str.charAt(i);
				
				}
		}
		return mixed;
	}
	
	public static void main(String[] args) {
		
		// test cases 
		
		Cypher cye = new Cypher();
		//System.out.println(cye.convertWithRandomTable("ABC"));
		//printRandomKey();
		
		//System.out.println(cye.setIncrease(-1,"XyZA!A A"));
		
		//System.out.println(cye.setDecrease(7,"abcdefg"));
		
		//System.out.println(reverseRandom("OLY!  AEae", "olyhqzutirkgmfnsjxvwcpbdea"));
		
		
		
	}
	
	

}
