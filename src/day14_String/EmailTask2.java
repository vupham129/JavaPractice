package day14_String;


import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an email");
        String email = scan.next();

        String firstName = email.substring(1, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+2, email.indexOf("@"));
        String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
        String upperFirstName = email.substring(0,1).toUpperCase();
        String upperLastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase();

        System.out.println("First name: "+ upperFirstName+firstName);
        System.out.println("Last name: "+upperLastName+lastName);
        System.out.println("Domain = " + domain);

        scan.close();

    }
}
/*

    8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple



 */