package Practice20_12_12;

public class FrequencyOfWord {
    /*
    1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3


     */
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";
       int count = frequencyOfWord(sentence,word);
        System.out.println(count);

    }





    public static int frequencyOfWord(String sentence, String word){

        String[] arr = sentence.split(" ");
        int count = 0;
        for (String each : arr) {
            if(each.equalsIgnoreCase(word)){
                count++;
            }
        }

        return count;




    }







}
