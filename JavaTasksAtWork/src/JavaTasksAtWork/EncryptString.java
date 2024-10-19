package JavaTasksAtWork;

public class EncryptString {
                
static String encryptString(String str) {
	char [] charArray = str.toCharArray();
	StringBuilder encrypted = new StringBuilder("");
	for(int i=0;i<charArray.length;i++) {
		char p = charArray[i];
		int asciiValue = (int) p;
		
	//	System.out.println(asciiValue);
		if(asciiValue>=65 && asciiValue<=90) {
			   int encryptValue = asciiValue+9;
			   int finalAscii =0;
			   if(encryptValue>90) {
				   int diff = encryptValue-90;
				    finalAscii = 64+diff;
				  
			   } else  finalAscii = encryptValue;
			   
			   encrypted.append((char) finalAscii);
			//   System.out.println((char) finalAscii );
			   } 
		
		
		else	if(asciiValue>=97 && asciiValue<=122) {
			   int encryptValue = asciiValue+9;
			   int finalAscii =0;
			   if(encryptValue>122) {
				   int diff = encryptValue-122;
				    finalAscii = 96+diff;
				  
			   } else  finalAscii = encryptValue;
			   
			  // System.out.println((char) finalAscii );
			   encrypted.append((char) finalAscii); 
			   } 
		else return "The input string should contain only either UPPER CASE OR lOWER CASE ALPHABETS";
		
	} return encrypted.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String EncryptedString =	encryptString("LokesH");
	System.out.println(EncryptedString);
	}

}
