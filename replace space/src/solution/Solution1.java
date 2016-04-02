package solution;

public class Solution1 {
	public String replaceSpace(StringBuffer str) {
    	String result = "";
    	int size = str.length();
    	for(int i = 0; i<size; i++){
    		if(str.charAt(i)==' '){
    			result = result+"%20";
    		}else{
    			result = result+str.charAt(i);
    		}
    	}
    	return result;
    }
}
