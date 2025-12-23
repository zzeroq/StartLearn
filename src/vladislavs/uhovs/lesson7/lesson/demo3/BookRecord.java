package vladislavs.uhovs.lesson7.lesson.demo3;

public class BookRecord {

    private final String isbn;
    private final String author;
    private final String title;

    public BookRecord(String isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    String asString(){
        return "BookRecord(isbn = " + isbn + " , author = " + author + ", title = " + title + ")";
    }


}
