
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Balikci ve Oglu", 140, "Zulfu Livaneli", "2021");
        Book b2 = new Book("Anna Karenina", 864, "Leo Tolstoy", "1877");
        Book b3 = new Book("Savas ve Baris", 1225, "Leo Tolstoy", "1867");
        Book b4 = new Book("Ucurtma Avcisi", 400, "Khaled Hosseini", "2003");
        Book b5 = new Book("Ve Dağlar Yankilandi", 420, "Khaled Hosseini", "2013");

        Set<Book> set = new TreeSet<>();

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);

        System.out.println("Sorted By Book Title : ");
        Book.printAll(set);
        System.out.println("----------------------------- \n");

        set = new TreeSet<>((Book b6, Book b7) -> b6.getPageCount() - b7.getPageCount());

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);

        System.out.println("Sorted By Page Count : ");
        Book.printAll(set);
    }

}
