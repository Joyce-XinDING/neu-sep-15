import java.util.LinkedList;

/*
 * Given a string containing the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid. If the string contains any other characters, 
 * please throw suitable exception.
   The brackets must close in the correct order, 
   "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidString {
	
	boolean couple(Character l, Character r){
		
    if(l == null) return false;
    	return (l == '[' && r == ']') || (l == '(' && r == ')') || (l == '{' && r == '}');
	}

	public boolean isValid(String s) {
		
		if(s == null) 
			return false;
		char[] chars = s.toCharArray();
		if(chars.length == 0 || chars.length % 2 == 1) 
			return false;
		LinkedList<Character> stack = new LinkedList<Character>();
    
    for(char c: chars){
        Character peek = stack.peek();

        if(couple(peek, c)){
            stack.pop();
        }else{
            stack.push(c);
        }
    }
    
    	return stack.size() == 0;
}
}