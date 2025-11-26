package vladislavs.uhovs.lesson5.lesson.loop.expfori.forEach;

public class ForEach {
    public static void main(String[] args) {

        char[] chars = "Hello World. Such a wonderful day today.".toCharArray();

        System.out.println("For i: ");
        for (int i = 0; i < chars.length; i++) {
            char symbol = chars[i];
            System.out.print(symbol);
        }

        System.out.println();
        System.out.println("For each: ");
        for (char symbol : chars){
            System.out.print(" - " + symbol);
        }
        System.out.println();



    }
}
