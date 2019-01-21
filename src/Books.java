

public class Books {

    String title;
    String author;
    int price;


    public Books(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Books() {
    }


    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public int getPrice() {

        return price;
    }


    public void printBooksDetails(Books book) {//как сделать так, чтобы не было аргументов

        System.out.println("The title of the book: " + book.getTitle());
        System.out.println("The author of the book: " + book.getAuthor());
        System.out.println("The price:  " + book.getPrice() + "£");
        System.out.println();

    }

    @Override
    public String toString() {
        return super.toString();
    }


    protected void Books() {
    }


}


