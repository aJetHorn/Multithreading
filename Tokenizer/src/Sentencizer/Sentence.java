package Sentencizer;

import java.util.ArrayList;

public class Sentence implements Runnable{
    public enum SentenceType {IMPERATIVE_DECLARATIVE, EXCLAMATORY, INTERROGATIVE, UNKNOWN};
    
    private ArrayList<Token> tokens = new ArrayList<>();
    private SentenceType category; //category
    private String raw;
    
    public Sentence(){
       
    }
    public Sentence(String raw, boolean parallel){
        this.rawTemp = raw;
    }
    
    public Sentence(String raw){
        this.raw = raw;
        setType(getRawType(raw));
        //do other things.. run method, basically
    }
    
    public Sentence(Runnable s){
         Sentence(s.rawTemp);
    }
    
    public void run(){
        this(raw);
    }
    
    public String getRawType(String raw){
        if (raw.contains(".")){ //switch this up
            return "IMPERATIVE_DECLARATIVE";
        }
        else if (raw.contains("!")){
            return "EXCLAMATORY";
         }
        else if (raw.contains("?")){
            return "INTERROGATIVE";
        }
        else {
            return "UNKNOWN";
        }
    }
    
    public SentenceType getType(){
	return category;
    }
    
    public void setType(SentenceType type){
	this.category = type;
    }
}
