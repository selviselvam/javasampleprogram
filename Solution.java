package com.interview.pgms;
import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();          
                 System.out.println(isBalancedString(input));
                  
		}
		
	}
    static boolean isBalancedString(String input){
        Deque<Character> stack = new ArrayDeque<Character>();
            for(int i =0; i < input.length(); i++ ){
                char c = input.charAt(i);
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                    continue;
                }
            System.out.println("stack size:"+stack.size());
            if(stack.isEmpty())
                return false;
            
            char check;
                switch(c){
               
                    case ')' :
                        check = stack.pop();
                        System.out.println(check);
                        if(check == '}' || check == ']')
                            return false;
                        break;
                        
                    case '}' :
                        check = stack.pop();
                        System.out.println(check);
                        if(check == ')' || check == ']')
                            return false;
                        break;
                         
                    case ']' :
                        check = stack.pop();
                        System.out.println(check);
                        if(check == ')' || check == '}')
                           return false;
                        break; 
                        
                }
            
            //Complete the code    
    }
        return stack.isEmpty();
}
}
