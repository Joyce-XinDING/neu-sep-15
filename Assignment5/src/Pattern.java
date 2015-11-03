import java.util.HashMap;

import javax.swing.SpringLayout.Constraints;
/*
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection（双向单射）
 between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains 
lowercase letters separated by a single space.
 */
public class Pattern {
	public boolean wordPattern(String pattern, String str) throws ArrayIndexOutOfBoundsException, NullPointerException {
		HashMap<Character, String> map= new HashMap<>();
		if(pattern == null || str == null)
			throw new NullPointerException();
		
		String[] newstr=str.split(" ");
		if(pattern.length() != newstr.length)
			throw new ArrayIndexOutOfBoundsException();
		else{
		int i=0;
		for(i=0;i<pattern.length();i++){
			if(!map.containsKey(pattern.charAt(i))){
				if(!map.containsValue(newstr[i])){
				map.put(pattern.charAt(i), newstr[i]);
				}
				else break;
				
			}
			else{
				if(!map.get(pattern.charAt(i)).equals(newstr[i])){
					break;
				}
			}
		}
		if(pattern.length()==i){
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
		}return false;
		
		}
}

}

		
		
		
		
		
		
		