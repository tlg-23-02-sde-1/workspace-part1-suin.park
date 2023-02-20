package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Shrek"); // Must provide at least a title
        movie1.setReleaseYear(2005);
        movie1.setRevenue(491_800_000.03);
        movie1.setRating(Rating.PG);
        movie1.setGenre(Genre.COMEDY);
        System.out.println(movie1); //toString() automatically called

        Movie movie2 = new Movie("The Labyrinth", 1986, 20.0, Rating.PG, Genre.SCI_FI);
        System.out.println(movie2);

        Movie movie3 = new Movie("Vacation in Java",Genre.HORROR);
        System.out.println(movie3);

    }

}