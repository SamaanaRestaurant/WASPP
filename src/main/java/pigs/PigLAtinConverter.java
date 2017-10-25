package main.java.pigs;

public class PigLAtinConverter {
	
	public String convertWord(String word){
		word=word.toLowerCase();
		String _newWord=null;
		char initial=word.charAt(0);
		
		if(initial =='a'||initial =='u'||initial =='e'||initial=='o'||initial=='i') {
			_newWord=word.concat("way");
		}
		else {
		_newWord=word.substring(1)+word.charAt(0)+"ay";
		}
		return _newWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PigLAtinConverter().convertWord("donia"));
		System.out.println(new PigLAtinConverter().convertWord("onia"));

	}

}
