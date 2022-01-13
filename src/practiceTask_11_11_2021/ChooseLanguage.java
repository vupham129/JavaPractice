package practiceTask_11_11_2021;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 5;
        String language = "";

        if(selection>=1 && selection<= 5){
            if(selection == 1){
                language = "Hello, thank for your call";
            }else if(selection == 2){
                language = "Hola, gracias para llamar";
            }else if(selection == 3){
                language = "Merhaba, aradiginiz icin tesekkurler";
            }else if(selection == 4){
                language = "Privet, spasibo za vash zvonok";
            }else{
                language = "Merci ,pour votre appel";
            }
        }else{
            language = "Invalid Language";
        }

        System.out.println("language = " + language);


    }
}
/*
3. Create a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */