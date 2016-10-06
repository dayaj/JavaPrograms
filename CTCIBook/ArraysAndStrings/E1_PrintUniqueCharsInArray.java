package Chapter1;

import java.util.HashMap; 

public class Exercise1 {
	  public static void main(String[] args) {
		    Exercise1 obj = new Exercise1();
		    System.out.println(obj.uniqueCharactersUsingExtraSpace("abcccc"));
		    System.out.println(obj.uniqueCharactersUsingExtraSpace("abcdef"));
		    System.out.println(obj.uniqueCharactersWithoutUsingExtraSpace("abcccc"));
		    System.out.println(obj.uniqueCharactersWithoutUsingExtraSpace("abcdef")); 
		  }
		  public boolean uniqueCharactersUsingExtraSpace(String s) {
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		    char[] a = s.toCharArray();
		    for(char c: a) {
		      if(map.get(c) == null) {
		        map.put(c, 1);
		      }
		      else {
		        return false;
		      }
		    }
		    return true;
		  }
		  public boolean uniqueCharactersWithoutUsingExtraSpace(String s) {
		     char[] a = s.toCharArray();
		     for(int i=0; i<a.length; i++) {
		       for(int j=i+1; j<a.length; j++) {
		         if(a[i]==a[j]) {
		           return false;
		         }
		       }
		     }
		    return true;
		  }
}
