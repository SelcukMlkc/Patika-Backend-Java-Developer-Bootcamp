package week3.projects.FilmAndCollectionFiltering;

import java.util.*;
import java.util.stream.Collectors;

public class MovieList {

    public static void main(String[] args) {

        ArrayList<Movie> movieList= new ArrayList<>(5);

        movieList.add(new Movie("Apocalypto", 2006, "Action", 7.8));
        movieList.add(new Movie("Avatar", 2009, "Action", 7.9));
        movieList.add(new Movie("Dune: Part One", 2021, "Action", 8.0));
        movieList.add(new Movie("Children of Men", 2006, "Drama", 7.9));
        movieList.add(new Movie("Parasite", 2019, "Thriller", 8.5));

        // **IMDB Puanına Göre Büyükten Küçüğe Sıralama**
        Collections.sort(movieList, Comparator.comparingDouble(Movie::getImdbScore).reversed());

        System.out.println("IMDB Puanına Göre Büyükten Küçüğe Sıralanmış Liste:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Filtrelemek istediğiniz film türünü giriniz: ");
        String movieType = scanner.nextLine();

        List<Movie> filteredMovies = filterMoviesByType(movieList, movieType);

        if (filteredMovies.isEmpty()) {
            System.out.println("Bu türe ait film bulunamadı!");
        } else {
            System.out.println("\n" + movieType.toUpperCase() + " türündeki filmler:");
            for (Movie movie : filteredMovies) {
                System.out.println(movie);
            }
        }
    }

    public static List<Movie> filterMoviesByType(List<Movie> movies, String type) {
        return movies.stream()
                .filter(movie -> movie.getMovieType().equalsIgnoreCase(type))  //equalsIgnoreCase() metodu, iki string'in büyük/küçük harf duyarlılığını göz ardı ederek karşılaştırma yapmasını sağlar.
                .collect(Collectors.toList());

    }
}
