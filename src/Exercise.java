import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {

        Books prose = new Books("Anna Karenina", "Lev Tolstoy", 15);
        Books roman = new Books("The novel David Copperfield", "Charles Dickens", 23);
        ChildrensBook kidsbook = new ChildrensBook("Den otroliga historien om det jättestora päronet";"Jakob Martin Strid"; 48);


        Books BooksArray[] = new Books[2];
        BooksArray[0] = roman;
        BooksArray[1] = prose;

        Movie movie2 = new Movie("Marshall", Movie.MovieGenre.DRAMA, 23, "Garry Kent Marshall");
        Movie movie = new Movie("Inside out", Movie.MovieGenre.COMEDY, 23, "Pete Docter");

        Movie MovieArray[] = new Movie[2];
        MovieArray[0] = movie;
        MovieArray[1] = movie2;

        prose.printBooksDetails(prose);
        movie.printMovieDetails(movie);

        int i;

        for (i = 0; i < BooksArray.length; i++) {

            roman.printBooksDetails(BooksArray[i]);
        }

        i = 0;

        while (i < MovieArray.length) {

            movie.printMovieDetails(MovieArray[i]);
            i++;
        }
        System.out.println();
        System.out.println(roman.toString());
    }



}

