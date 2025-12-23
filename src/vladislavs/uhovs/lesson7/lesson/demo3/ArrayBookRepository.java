package vladislavs.uhovs.lesson7.lesson.demo3;

public class ArrayBookRepository {

    private final BookRecord[] books;
    private int sequence = 0;

    public ArrayBookRepository() {
        this(100);
    }

    ArrayBookRepository(int capacity){
        this.books = new BookRecord[capacity];
    }

    void save(BookRecord record){
        books[sequence++] = record;
    }

    BookRecord[] index(){
        BookRecord[] buffer = new BookRecord[size()];
        int cursor = 0;

        for (BookRecord record : books) {
            if (record != null){
                buffer[cursor++] = record;
            }
        }


        return buffer;
    }

    BookRecord findByIsbn(String isbn){
        for (BookRecord record : books){
            if (record == null){
                continue;
            }

            if (record.getIsbn().equals(isbn)){
                return record;
            }
        }
        return null;
    }

    void delete (BookRecord record){
        for (int i = 0; i < books.length; i++) {
            BookRecord book = books[i];
            if (book == null){
                continue;
            }

            if (books[i].getIsbn().equals(record.getIsbn())){
                books[i] = null;
            }
        }
    }

    private int size(){
        int size = 0;

        for (BookRecord record : books){
            if(record != null) {
                size++;
            }
        }
        return size;
    }

}
