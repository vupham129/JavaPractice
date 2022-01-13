package day20_Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[] fullName = {"Aini Halimila", "Adrian Rezk", "Ali Alim", "Beyav Muhsen", "Betul Komurcu",
                             "Dilek Gungor", "Enes Uzun", "Eugene Demianiv", "Fadime Komurcu", "Emre Kelleci"};
        String initials = "";

        for (int i = 0; i < fullName.length; i++) {
            initials = fullName[i].substring(0,1)+"."+fullName[i].substring(fullName[i].indexOf(" ")+1,fullName[i].indexOf(" ")+2);
            System.out.println(initials);
        }





    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */