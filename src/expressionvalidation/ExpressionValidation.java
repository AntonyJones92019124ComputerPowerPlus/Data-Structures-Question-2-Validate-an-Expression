/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionvalidation;

import java.util.Scanner;//import Scanner
import java.util.Stack;//import Stack
/**
 *
 * @author tony
 */
public class ExpressionValidation {

    public static void main(String[] args) {
        
        boolean isValid =false;
        Stack<Character> input = new Stack<>();
        System.out.println("Enter your expression:");
        
        try (Scanner scanner = new Scanner(System.in)) {//input Scanner
            String usersInput = scanner.nextLine();//String set to next line
            char[] character = new char[15];// char set to variable ch
            character = usersInput.toCharArray();
            
            OUTER:
            for (int i = 0; i < character.length; i++) {
                switch (character[i]) {//use of switch statement
                    case '{':
                    case '(':
                    case '[':
                        input.push(character[i]);
                        break;
                    case ']':
                        if (input.pop() == '[') {
                            isValid = true;
                        } else {
                            isValid = false;
                            break OUTER;
                        }//end of else
                        break;
                    case ')':
                        if (input.pop() == '(') {
                            isValid = true;
                        } else {
                            isValid = false;
                            break OUTER;
                        }//end of else
                        break;
                    case '}':
                        if (input.pop() == '{') {
                            isValid = true;
                        } else {
                            isValid = false;
                            break OUTER;
                        }//end of else
                        break;
                    default:
                        break;
                }//end of switch statement
            }//end of for loop
            if (isValid == true)
              
                System.out.println("The expression is validated: \n" 
                        + "Valid String");//output Valid String
            else
                System.out.println("The expression is validated: \n" + 
                        "Invalid String");//output Invalid String
        }// end of try statment

    }//end of public static main

}//end of Class ExpressionValidation