package Tasks_to_improve_skills;

public class Book {

    private String bookName;

    private String bookAuthor;

    Book(String bookName,String bookAuthor){
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return bookName +","+ '\'' +
                 bookAuthor + '\'';
    }

    Book(){};

    public String getBookName(){
        return this.bookName;
    }

    public String getBookAuthor(){
        return this.bookAuthor;
    }


}
