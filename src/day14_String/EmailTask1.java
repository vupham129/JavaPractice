package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an email");
        String email = scan.next();

        if(email.contains("_")) {
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf('@')) + email.substring(0, email.indexOf("_")) +
                    "_"+ email.substring(email.indexOf('@')));
        }else{
            System.out.println(email);
        }


        scan.close();








    }
}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */