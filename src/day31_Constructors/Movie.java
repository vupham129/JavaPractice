package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;

    }

    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCasts(String[] castsList){
        casts.addAll(Arrays.asList(castsList));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts='" + casts.size() +
                '}';
    }
}
/*
3. Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

 */