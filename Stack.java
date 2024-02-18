/* Valid Parantheses using Stack*/


import java.util.*;
public class Main {
  public static void main(String[] args) {
  String s = "({})";
    Stack<Character> rex = new Stack<Character>();
        char ch;
        for(int i=0; i<s.length(); i++){
            ch =  s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                rex.push(ch);
            }else{
                if(rex.isEmpty()){
                    System.out.println("false");
                }
                char top = rex.peek();
                if((ch == ')'  && top == '(') || (ch == ']'  && top == '[') || (ch == '}'  && top == '{')){
                    rex.pop();
                }else{
                    System.out.println("false");
                }
            }
        }
        System.out.print(rex.isEmpty());
        
    
  }
}
