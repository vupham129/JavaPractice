package day21_ForEachLoop;

public class Task6_P15_AppearancesOfJavaAndPython {
    /*
    	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

     */
    public static void main(String[] args) {

        String[] str = {"Java", "Java", "Python", "Python", "Java", "Python"};

        int countJava = 0;
        int countPython = 0;

        for (String each : str) {

            if(each.equalsIgnoreCase("java")){
                countJava++;
            }
            if(each.equalsIgnoreCase("python")){
                countPython++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
