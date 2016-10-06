package Chapter1;
//https://coderpad.io/G42T2AY6
/*Write a method to replace all spaces in a string with '%20'. Assume the length of
 * of the string is its true length which includes the extra amount of space to 
 * accomodate '%20' in place of space
 */
public class Exercise4 {
	public static void main(String[] args) {
	    Exercise4 obj = new Exercise4();
	    System.out.println(obj.replaceSpace("Mr John Space    ")); //Mr%20John%20Space
	    System.out.println(obj.replaceSpace("Mr  John Space      ")); 
	                                                //Mr%20%20John%20Space
	    System.out.println(obj.replaceSpace(" Mr John Space      "));
	                                                //%20Mr%20John%20Space
	    System.out.println(obj.replaceSpace(""));
	    System.out.println(obj.replaceSpace(null));
	  }
	  
	  public String replaceSpace(String s) {
	    if((s == null) || (s.isEmpty())) {
	      return null;
	    }
	    char[] cArr = s.toCharArray();
	    boolean trueSpace = false;
	    int k = cArr.length-1;
	    for(int i = cArr.length-1; i >= 0; i--) {
	      if(cArr[i] == ' ' && !trueSpace) {
	        continue;
	      }
	      if(cArr[i] != ' ') {
	        cArr[k--] = cArr[i];
	        trueSpace = true;
	      }
	      else {
	        cArr[k--] = '0';
	        cArr[k--] = '2';
	        cArr[k--] = '%';
	      }
	    }
	    return String.valueOf(cArr);
	  }
}
