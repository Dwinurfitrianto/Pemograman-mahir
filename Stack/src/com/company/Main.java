package com.company;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Masukkan Rumus =");
        String Rumus = input.nextLine();

        for(int i=0;i<Rumus.length();i++){
            char a = Rumus.charAt(i);

            if(a == '(' ){
                stack.push(a);
            }else if(a == ')' ){
                stack.pop();
            }

        }
        if(stack.empty()){
            System.out.println("valid");
        }else{
            System.out.println("Tidak valid");
        }
    }
}
