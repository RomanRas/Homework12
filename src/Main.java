import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Блок");
        Author author2 = new Author("Фёдор", "Достоевский");
        Author author3 = new Author("Александр", "Блок");
        Book book1 = new Book("Граф Монте-Кристо", author1, 1845);
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        Book book3 = new Book("Преступление и наказание", author2, 2005);
        book1.setPublishingYear(Year.now().getValue());
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        System.out.println(author2);
        System.out.println(book2);
        System.out.println(author1.equals(author3));
        System.out.println(book2.equals(book3));
    }
}