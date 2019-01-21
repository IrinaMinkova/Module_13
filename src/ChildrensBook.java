public class ChildrensBook extends Books {

    String rekommendedAgeInfo;


    public void Books(String title, String author, int price, String rekommendedAgeInfo) {
        super.Books();
        this.title = title;
        this.author = author;
        this.price = price;
        this.rekommendedAgeInfo = rekommendedAgeInfo;
    }

    public String getRekommendedAgeInfo() {
        return rekommendedAgeInfo;
    }

    public void setRekommendedAgeInfo(String rekommendedAgeInfo) {
        this.rekommendedAgeInfo = rekommendedAgeInfo;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public ChildrensBook(String title, String author, int price) {
        super(title, author, price);

    }

    @Override
    public void printBooksDetails(Books books) {//как сделать так, чтобы не было аргументов
        super.printBooksDetails(Books books);
        System.out.println("The recommended age is " + books.getRekommendedAgeInfo() + " age old");
        System.out.println();

    }
}


/*


Your task is to create a new class ChildrensBook that extends Book and has a private variable
recommendedAgeInfo of type String with public getters and setters.

If you have no default constructor in the Book class, you will notice that you either need to create
one in the Book class, or create a constructor in the ChildrensBook class that corresponds to one of
the constructors in the Book class. Create a constructor in the ChildrensBook class that takes title,
author, price and recommendedAgeInfo as arguments. From the first line in the constructor, call the
constructor in the superclass with the keyword super with the arguments title, author and price.
Assign the recommendedAgeInfo argument to the instance variable recommendedAgeInfo

Create a ChildrensBook in the main method with a title, author, price and a recommendedAgeInfo of for
example "from 4 years". Then add the ChildrensBook to the List of books. It is OK to add it to the list
since a ChildrensBook is also a Book.
