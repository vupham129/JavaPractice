package practiceTask_11_11_2021;
// can use nested if too
public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber = 8;
        String location = "",
                teacherInCharge = "",
                numberOfGroups = "",
                fieldTrip = "";

        switch (gradeNumber){
            case 1: // if grade number == 1
                location = "Apple orchard";
                numberOfGroups = "3";
                teacherInCharge = "Ms.Smith";
                fieldTrip = "grade - " +gradeNumber+ "\nlocation - "+location+
                        "\nnumber of groups - "+numberOfGroups+
                        "\nteacher in charge - "+teacherInCharge;
                break;
            case 2: // if grade number == 2
                location = "Zoo";
                numberOfGroups = "7";
                teacherInCharge = "Mr.Lee";
                fieldTrip = "grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;
                break;
            case 3: // if grade number == 3
                location = "Aquarium";
                numberOfGroups = "5";
                teacherInCharge = "Ms.Wilson";
                fieldTrip = "grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;
                break;
            case 4: // if grade number == 4
                location = "Movie theater";
                numberOfGroups = "2";
                teacherInCharge = "Ms.Reyes";
                fieldTrip = "grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;
                break;
            case 5: // if grade number == 5
                location = "Museum";
                numberOfGroups = "5";
                teacherInCharge = "Ms.Lela";
                fieldTrip = "grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;
                break;
            case 6: // if grade number == 6
                location = "Six Flags";
                numberOfGroups = "8";
                teacherInCharge = "Mr.Watt";
                fieldTrip = "grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;
                break;
            default: // if grade number is 7 or more
                fieldTrip = "Invalid grade number!!!";

        }

        System.out.println("fieldTrip = " + fieldTrip);

        System.out.println("--------------------------------");

        if(gradeNumber == 1){
            location = "Apple orchard";
            numberOfGroups = "3";
            teacherInCharge = "Ms.Smith";
            fieldTrip = "grade - " +gradeNumber+"\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;

        }else if(gradeNumber == 2){
            location = "Zoo";
            numberOfGroups = "7";
            teacherInCharge = "Mr.Lee";
            fieldTrip ="grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;

        }else if(gradeNumber == 3){
            location = "Aquarium";
            numberOfGroups = "5";
            teacherInCharge = "Ms.Wilson";
            fieldTrip ="grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;

        }else if(gradeNumber == 4){
            location = "Movie theater";
            numberOfGroups = "2";
            teacherInCharge = "Ms.Reyes";
            fieldTrip ="grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;

        }else if(gradeNumber == 5){
            location = "Museum";
            numberOfGroups = "5";
            teacherInCharge = "Ms.Lela";
            fieldTrip ="grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;

        }else if(gradeNumber == 6){
            location = "Six Flags";
            numberOfGroups = "8";
            teacherInCharge = "Mr.Watt";
            fieldTrip ="grade - " +gradeNumber+ "\nlocation - "+location+ "\nnumber of groups - "+numberOfGroups+ "\nteacher in charge - "+teacherInCharge;

        }else {
            fieldTrip = "Invalid grade number!!!";
        }

        System.out.println("fieldTrip = " + fieldTrip);















    }
}
/*
8. Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your gradeNumber. Given a variable gradeNumberNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on gradeNumber:

        gradeNumber - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        gradeNumber - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        gradeNumber - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        gradeNumber - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        gradeNumber - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        gradeNumber - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */