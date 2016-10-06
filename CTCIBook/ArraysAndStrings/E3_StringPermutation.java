package Chapter1;

/*Given 2 strings find if one is a permutation of another*/

public class Exercise3 {
	  public static void main(String[] args) {
		    Exercise3 obj = new Exercise3();
		    System.out.println(obj.findPermutation("ABC", "ABC"));
		    System.out.println(obj.findPermutation("acd", "def")); //false
		    System.out.println(obj.findPermutation("abc", "adcb")); //false
		    System.out.println(obj.findPermutation("abc", "bca"));//true
		    System.out.println(obj.findPermutation("abc", ""));//false
		    System.out.println(obj.findPermutation("", ""));//false
		    System.out.println(obj.findPermutation(null, null));
		  }
		  /*Assumption - all are ascii characters*/
		  public boolean findPermutation(String s1, String s2) {
		    if(s1==null || s2==null || s1.isEmpty() || s2.isEmpty() 
		    		|| s1.length()!=s2.length()) {
		      return false;
		    }
		    int[] cArr = new int[256];
		    for(int i=0; i<cArr.length; i++) {
		      cArr[i] = 0;
		    }
		    char[] a1 = s1.toCharArray();
		    char[] a2 = s2.toCharArray();

		    for(int i=0; i<a1.length; i++) {
		      int idx=a1[i]-'a';
		      cArr[idx]++;
		    }
		    for(int i=0; i<a2.length; i++) {
		      int idx=a2[i]-'a';
		      if(cArr[idx]==0) {
		        return false;
		      }
		      cArr[idx]--;
		    }
		    for(int i=0; i<cArr.length; i++) {
		      if(cArr[i]!=0) {
		        return false;
		      }
		    }
		    return true;
		  }
}
