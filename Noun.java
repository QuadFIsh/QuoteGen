package QuoteGen;

public class Noun extends Word{
	
	public String singular, plural;
	
	public Noun(String singular, String plural){
		
		this.singular=singular;
		this.plural=plural;
	}
	
	
	public String getPartOfSpeech() {
		return "noun";
	}
	
}
