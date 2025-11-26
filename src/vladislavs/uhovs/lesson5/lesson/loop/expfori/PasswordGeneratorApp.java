package vladislavs.uhovs.lesson5.lesson.loop.expfori;

public class PasswordGeneratorApp {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        int prompterLength = prompter.promptLength();
        boolean includeAlpha = prompter.promptAlpha();
        boolean includeAlphaBig = prompter.promptAlphaBig();
        boolean includeNumeric = prompter.promptNumeric();
        boolean includeSpecial = prompter.promptSpecial();

        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generate(prompterLength,includeAlpha,includeAlphaBig,includeNumeric,includeSpecial);

        System.out.println("Your password is: " + password);
    }
}
