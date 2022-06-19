
import java.util.Collection;

public class Book implements Comparable<Book> {

    private String title;
    private int pageCount;
    private String author;
    private String publishDate;

    public Book(String title, int pageCount, String author, String publishDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book book) {
        return this.title.toLowerCase().compareTo(book.getTitle().toLowerCase());
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public static void printAll(Collection<Book> c) {
        for (Book b : c) {
            System.out.print("Book Title : " + b.getTitle());
            System.out.print(" || Page Count : " + b.getPageCount());
            System.out.println("");
        }
    }

}
