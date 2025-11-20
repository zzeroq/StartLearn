package vladislavs.uhovs.lesson3.lesson.string;

public class StringDemo {

    public static void main(String[] args) {

        String text = "Hello World";
        System.out.println(text);

        System.out.println("text.length = " + text.length());
        System.out.println("text.toLowerCase = " + text.toLowerCase());
        System.out.println("text.toUpperCase = " + text.toUpperCase());
        System.out.println("text.isEmpty() = " + text.isEmpty());
        System.out.println("text.startWith(\"Hello\") = " + text.startsWith("Hello"));
        System.out.println("text.startWith(\"Foo\") = " + text.startsWith("Foo"));
        System.out.println("text.replaceAll()\"Hell\",\"****\")= " + text.replaceAll("Hell", "****") );




    }

}
