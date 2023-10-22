

package com.mycompany.days14_strukturdatastack;

import java.util.Stack;


public class Days14_StrukturDataStack {

    public static void main(String[] args) {
      Stack<Double>ifaStack = new Stack<>();
      ifaStack.push(2.37);
      System.out.println(" ifaStack");
        
        ifaStack.push(2.89);
        ifaStack.push(4.56);
        ifaStack.push(10.3);
        ifaStack.push(235.7);
        System.out.println("ifaStack");
        
        double value = ifaStack.pop();
        System.out.println("POP:" +value);
        System.out.println("ifaStack");
        
        value = ifaStack.peek();
        System.out.println("PEEK:" +value);
        System.out.println("ifaStack");
        
        ifaStack.push(439.6);
        ifaStack.push(3.54);
        System.out.println("ifaStack");
    }
}
