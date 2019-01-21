
public class Movie {

    private String title;
    private MovieGenre genre;
    private int price;


    private String director;

    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public Movie(String title, MovieGenre genre, int price, String director) {
        this.director = director;
        this.title = title;
        this.genre = genre;
        this.price = price;

    }


    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public String getDirector() {
        return director;
    }


    enum MovieGenre {
        DRAMA, COMEDY, ACTION, DOCUMENTARY;
    }

    public void printMovieDetails(Movie movie) {
        System.out.println("The title of the movie: " + movie.getTitle());
        System.out.println("The genre of the movie: " + movie.getGenre());
        System.out.println("The price:  " + movie.getPrice() + "£");
        if (director != null)
            System.out.println("The director:  " + movie.getDirector());
        System.out.println();
    }

}

