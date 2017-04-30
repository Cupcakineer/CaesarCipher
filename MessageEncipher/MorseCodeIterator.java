
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
	
	//key generated?
}
