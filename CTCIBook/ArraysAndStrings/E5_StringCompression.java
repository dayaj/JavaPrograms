package Chapter1;

/* Perform basic string compression using the counts of repeated characters.
 * For examplem the string, aabcccccaaa would become a2b1c5a3. 
 * If the compressed string would not become smaller than the original string,
 * methods returns the original string
 * 20 mins
 */

public class Exercise5 {
	public static void main(String[] args) {
	 	Exercise5 obj = new Exercise5();
	    System.out.println(obj.getCompressedStr("aabcccc2222aaa"));
	                                                       //a2b1c424a - replacing
	    System.out.println(obj.getCompressedStr("abc2Ee"));//abc2Ee - not replacing
	     System.out.println(obj.getCompressedStr(null));
	    System.out.println(obj.getCompressedStr(""));
	  }
	  
	  public String getCompressedStr(String s) {
	    if(s == null || s.isEmpty()) {
	      return null;  
	    }
	    int newSize = getCompressedCnt(s);
	    System.out.println("New size =" + newSize);
	    if(newSize >= s.length()) {
	      return s;
	    }
	    return compressIt(s, newSize);
	  }
	  public int getCompressedCnt(String s) {
	    char last = s.charAt(0);
	    int totalSize = 0;
	    for(int i = 1; i < s.length(); i++) {
	      char cur = s.charAt(i);
	      if(last != cur) {
	        last = cur;
	        totalSize += 2;
	      }
	    }
	    totalSize += 2;
	    return totalSize;
	  }
	  public String compressIt(String s, int newSize) {
	    char[] arr = new char[newSize];
	    char last = s.charAt(0);
	    int count = 1;
	    int k = 0;
	    for(int i = 1; i < s.length(); i++) {
	      char cur = s.charAt(i);
	      if(last == cur) {
	        count++;
	      }
	      else {
	        arr[k++] = last;
	        arr[k++] = (char)(count + '0');
	        last = cur;
	        count = 1;
	      }
	    }
	    arr[k++] = last;
	    arr[k++] = (char)(count + '0');
	    return String.valueOf(arr);
	  }
}
