<<<<<<< HEAD
import java.util.*;
public class cypherIterator {
    
    Random rand = new Random();
    int num = rand.nextInt(25) + 1;
    Cypher n = new Cypher();
    String input;
    
    public cypherIterator(String in){
        input = in;
    }
    
    public String convertWithRandomTable(){
        
        return Cypher.convertWithRandomTable(input);
    }
    
    public String setIncrease(){
        
        return Cypher.setIncrease(num, input);
    }
    
    public String setDecrease(){
        
        return Cypher.setDecrease(num, input);
    }
    
    public String completeRand(){
        
        return Cypher.completeRand(input);
    }
    
    public static void main(String[] args){
        
        cypherIterator n = new cypherIterator("Ab!C");
        
        //System.out.println(n.setIncrease());
        
        //System.out.println(n.setDecrease());
        
        //System.out.println(n.completeRand());
        
        System.out.println(n.convertWithRandomTable());
        
    }
    
    
    
    
}
=======
import java.util.*;
public class cypherIterator {
    
    Random rand = new Random();
    int num = rand.nextInt(25) + 1;
    Cypher n = new Cypher();
    String input;
    
    public cypherIterator(String in){
        input = in;
    }
    
    public String convertWithRandomTable(){
        
        return Cypher.convertWithRandomTable(input);
    }
    
    public String setIncrease(){
        
        return Cypher.setIncrease(num, input);
    }
    
    public String setDecrease(){
        
        return Cypher.setDecrease(num, input);
    }
    
    public String completeRand(){
        
        return Cypher.completeRand(input);
    }
    
    public static void main(String[] args){
        
        cypherIterator n = new cypherIterator("Ab!C");
        
        //System.out.println(n.setIncrease());
        
        //System.out.println(n.setDecrease());
        
        //System.out.println(n.completeRand());
        
        System.out.println(n.convertWithRandomTable());
        
    }
    
    
    
    
}
>>>>>>> 10e7f7ffab1ef5dc876a9d71b0d6b20d7b51f224
