
public class MorseCodeIterator {
	morseEncryptor n = new morseEncryptor();
	String input;
	
	public MorseCodeIterator(String input){
		this.input = input;
	}
	
	public String encrypt1(){
		n.populateTable();
		return morseEncryptor.encrypt(input, 1);
	}
	
	public String encrypt2(){
		n.populateTable();
		return morseEncryptor.encrypt(input, 2);
	}
	
	public String encrypt3(){
		n.populateTable();
		return morseEncryptor.encrypt(input, 3);
	}
	
	public static void main(String args[]){
		MorseCodeIterator n = new MorseCodeIterator("Hello");
		System.out.println(n.encrypt1());
	}
}
