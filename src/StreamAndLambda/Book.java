package StreamAndLambda;


import java.util.ArrayList;
import java.util.Objects;

public class Book  {

    private String title;
    private String author;
    private int pagesCount;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public Book(String title, String author, int pagesCount) {
        this.title = title;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }

    public ArrayList<Book> addBooks(Book...q){
        ArrayList<Book> arr = new ArrayList<>();

        for(int i = 0;i<q.length;i++){
            arr.add(q[i]);
        }

        return arr;
    }


    public boolean equals(String str,String str2) {
        if(str.equals(str2)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pagesCount);
    }
}
