package comcompany;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Anton Losev");
        book.setPages(122);
        book.setReading(false);
        book.setTitle("In the dark for milk");
        book.setYear(2010);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("title: " + book.getTitle());
        System.out.println("year: " + book.getYear());
        System.out.println("pages: " + book.getPages());
        System.out.println("is reading: " + book.isReading());

        book.setYear(1022);
        book.setReading(false);
        book.setAuthor("Lev Tolstoy");

        System.out.println("\nAuthor: " + book.getAuthor());
        System.out.println("title: " + book.getTitle());
        System.out.println("year: " + book.getYear());
        System.out.println("pages: " + book.getPages());
        System.out.println("is reading: " + book.isReading());
    }
}
