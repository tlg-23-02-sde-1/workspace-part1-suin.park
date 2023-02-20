package net.flix;

public class Movie {
    // fields or instance variables , Movie has following things
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors
    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title,genre);                 // delegate to neighboring ctor above me for tile
        setReleaseYear(releaseYear); // handle releaseYea myself, by delegating to its setter
        setRevenue(revenue);
        setRating(rating);
    }
    // business - oriented methods - deliverately omitted
    // play(), pause(), stop(), rewind(), fastForward()

    // accessor methods (get/set methods)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //toString()
    public String toString() { //blue drive looking - override work
        return String.format("Movie:title=%s, releaseYear=%s, revenue=%,.2f, rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(),getRating(), getGenre());
//        return "Movie: title= " + getTitle() + ", release year = " + getReleaseYear() +
//                ", revenue = $" + getRevenue() + ", rating = " + getRating() + ", genre =" + getGenre();
    }

}