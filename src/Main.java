import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Блок");
        Author author2 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Граф Монте-Кристо", author1, 1845);
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        book1.setPublishingYear(Year.now().getValue());
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
    }
}