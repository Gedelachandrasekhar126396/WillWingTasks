package JavaTasksAtWork;

import java.util.HashMap;

public class CharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char []array = {'C','H','A','N','P','A','D','A','A','L'};
  
   HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
  
   
  for(int i=0;i<array.length;i++) {
         char p = array[i];
       //  System.out.println(p);
         boolean flag = false;
       //  if(charCount.size()==0) charCount.put(p, 1);
        // else {
        	 for(Character k: charCount.keySet()) {
        		 if(p==k) flag = true;
         }
        	 if(flag==true) charCount.put(p,charCount.get(p)+1);
        	 else charCount.put(p, 1);
      //   }
        
         
   }
  System.out.println(charCount);
	}

}
