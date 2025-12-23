package vladislavs.uhovs.lesson7.lesson.demo3;

public class BookApplication {
    public static void main(String[] args) {

        BookRecord book1 = new BookRecord("22846438", "Sierra Kathy", "Head First Java");
        BookRecord book2 = new BookRecord("22458538", "Mycroft Alan", "Interesting Book");
        BookRecord book3 = new BookRecord("12342226", "Martin Robert", "Scary Face");

        ArrayBookRepository arrayBookRepository = new ArrayBookRepository();

        System.out.println("Index Books");
        for (BookRecord record : arrayBookRepository.index()){

            System.out.println(record.asString());
        }

        arrayBookRepository.save(book1);
        arrayBookRepository.save(book2);
        arrayBookRepository.save(book3);

        System.out.println("Index Books");
        for (BookRecord record : arrayBookRepository.index()){

            System.out.println(record.asString());
        }
        System.out.println();
        System.out.println("Find by isbn: 22458538");
        System.out.println(arrayBookRepository.findByIsbn("22458538").asString());

        System.out.println();
        System.out.println("Find by isbn: 22846438");
        System.out.println(arrayBookRepository.findByIsbn("22846438").asString());

        System.out.println();
        System.out.println("Find by isbn: 12342226");
        System.out.println(arrayBookRepository.findByIsbn("12342226").asString());

        System.out.println();
        System.out.println("Find by isbn: foo");
        System.out.println(arrayBookRepository.findByIsbn("foo"));

        arrayBookRepository.delete(book1);

        System.out.println();
        System.out.println("Deleted book nr. 1");
        System.out.println("Index Books");
        for (BookRecord record : arrayBookRepository.index()){
            System.out.println(record.asString());

        }
    }
}
