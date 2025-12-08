package vladislavs.uhovs.lesson5.lesson.loop.expfori;

import java.util.Random;

public class PasswordGenerator {

    Random random;

    char[] symbols = {
      '1','2','3','4','5','6','7','8','9',
      '$','%','^','&','(','!','@','#','+',

      'a','s','d','f','g','h','j','k','l',
      'w','q','z','x','c','v','b','n','m',
      '[','p','o','i','u','y','t','r','e',

      'A','S','D','F','G','H','J','K','L',
      'W','Q','Z','X','C','V','B','N','M',
      '}','P','O','I','U','Y','T','R','E',
    };




    char[] alpha    = {'a','s','d','f','g','h','j','k','l',
                       'w','q','z','x','c','v','b','n','m',
                       '[','p','o','i','u','y','t','r','e'};

    char[] alphaBig = {'A','S','D','F','G','H','J','K','L',
                       'W','Q','Z','X','C','V','B','N','M',
                       '}','P','O','I','U','Y','T','R','E'};

    char[] numeric  = {'1','2','3','4','5','6','7','8','9',};

    char[] special  = {'$','%','^','&','(','!','@','#','+'};

    PasswordGenerator(){
        this.random = new Random();
    }

  /*  String generate(int length){
        char[] password = new char[length];
        for (int i = 0; i < password.length; i++) {
            password[i] = symbols[random.nextInt(symbols.length)];
        }
        return new String(password);
    }

   */

    String generate(int length, boolean includeAlpha, boolean includeAlphaBig, boolean includeNumeric, boolean includeSpecial){
        char[] password = new char[length];
        char[] symbols  = createSymbolArray(includeAlpha,includeAlphaBig,includeNumeric,includeSpecial);

        for (int i = 0; i < password.length; i++) {
            password[i] = symbols[random.nextInt(symbols.length)];
        }

        return new String(password);

    }
    char[] createSymbolArray(boolean includeAlpha, boolean includeAlphaBig, boolean includeNumeric, boolean includeSpecial){
        int lengthChar = 0;

        if (includeAlpha){
            lengthChar += alpha.length;
        }
        if (includeAlphaBig){
            lengthChar += alphaBig.length;
        }
        if (includeNumeric){
            lengthChar += numeric.length;
        }
        if (includeSpecial){
            lengthChar += special.length;
        }
        if (lengthChar == 0){
            return new char[1];
        }

        char [] buffer = new char[lengthChar];
        int cursor = 0;

        if (includeAlpha){
            for(char c : alpha){
                buffer [cursor] = c;
                cursor++;
            }
        }
        if (includeAlphaBig){
            for(char c : alphaBig){
                buffer [cursor] = c;
                cursor++;
            }
        }
        if (includeNumeric){
            for(char c : numeric){
                buffer [cursor] = c;
                cursor++;
            }
        }
        if (includeSpecial){
            for(char c : special){
                buffer [cursor] = c;
                cursor++;
            }
        }

        return buffer;

    }
    /* char[] numeric = {'1', '2', '3', '4', '5', '6', '7', '8', '9',};

    String generate(int length) {
        char[] numbers = new char[length];
        char[] symbols = numeric;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = symbols[random.nextInt(symbols.length)];
        }
        return new String(numbers);
    }
     char[] createSymbolArray(boolean includeNumeric){
        int lengthChar = 0;

        if (includeNumeric){
            lengthChar += numeric.length;
        }
        if (lengthChar == 0){
            return new char[1];
        }
        char [] buffer = new char[lengthChar];
        int cursor = 0;
        if (includeNumeric){
            for(char c : numeric){
                buffer [cursor] = c;
                cursor++;
            }
        }
        return buffer;
    }

     */
}
