package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {

        String[] casts = {"Asiya", "Adam", "Muhtar", "Cassandra", "Hulya", "Peri", "Ahmet"};
        String cast = "Dylan";

        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 23", "Adventure, Comedy, Thriller", "10/25/2021", "Kuzzat Altay");
        movie1.addCasts(casts);
        movie1.addCast(cast);
        System.out.println(movie1);



    }
}
/*
 3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */