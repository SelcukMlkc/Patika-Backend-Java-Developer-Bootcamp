package week3.projects.FilmAndCollectionFiltering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {

    private String movieName;
    private int movieYear;
    private String movieType;
    private Double imdbScore;


    //Constructor oluşturdum

    public Movie(String movieName, int movieYear, String movieType, Double imdbScore) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieType = movieType;
        this.imdbScore = imdbScore;
    }

    // Getter metodu ekledik
    public Double getImdbScore() {
        return imdbScore;
    }

    public String getMovieType() {
        return movieType;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieYear=" + movieYear +
                ", movieType='" + movieType + '\'' +
                ", imdbScore=" + imdbScore +
                '}';
    }
}
