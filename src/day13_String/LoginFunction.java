package day13_String;

import java.util.Scanner;

public class LoginFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = scan.next();
        String passWord = scan.next();

        String userName1 = "Cydeo";
        String passWord1 = "WoodenSpoon";

         if(userName.equals(userName1) && passWord.equals(passWord1)){
             System.out.println("Logged in.");
        }else{
             System.err.println("Incorrect username or password");
         }

         scan.close();

    }
}
/*
6. You are writing a code for the log-in function of the Cybertek Application,
 assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

Ask the user to enter their credentials. If credentials are matched,
your program should print "Logged in."
otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method


 */