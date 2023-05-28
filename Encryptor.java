package encryptdecrypt;

import java.util.Scanner;

public class Encryptor {
   private Scanner scanner;

   public Encryptor() {
      this.scanner = new Scanner(System.in);
   }

   public void encrypt() {
       String possibleCharacters = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";

       String userInput = scanner.nextLine();
       int num = Integer.parseInt(scanner.nextLine());

       char[] userInputChar = userInput.toCharArray();
       char[] charAlphabet = possibleCharacters.toCharArray();
       StringBuilder sb = new StringBuilder();

       for (int i = 0; i < userInputChar.length; i++) {
           for (int j = 0; j < charAlphabet.length; j++) {
               if (userInputChar[i] == ' ') {
                   sb.append("%");
                   break;
               } else if (charAlphabet[j] == userInputChar[i]) {
                   int counter = j + num;
                   if (counter > 94) {
                       counter -= 95;
                       sb.append(charAlphabet[counter]);
                   } else {
                       sb.append(charAlphabet[counter]);
                   }
               }
           }
       }

       System.out.println(sb.toString());
   }

   public void decrypt() {
       String possibleCharacters = "~}|{zyxwvutsrqponmlkjihgfedcba`_^]\\[ZYXWVUTSRQPONMLKJIHGFEDCBA@?>=<;:9876543210/.-,+*)('&%$#\"! ";

       String userInput = scanner.nextLine();
       int num = Integer.parseInt(scanner.nextLine());

       char[] userInputChar = userInput.toCharArray();
       char[] charAlphabet = possibleCharacters.toCharArray();
       StringBuilder sb = new StringBuilder();

       for (int i = 0; i < userInputChar.length; i++) {
           for (int j = 0; j < charAlphabet.length; j++) {
               if (userInputChar[i] == '%') {
                   sb.append(" ");
                   break;
               } else if (charAlphabet[j] == userInputChar[i]) {
                   int counter = j + num;
                   if (counter > 94) {
                       counter -= 95;
                       sb.append(charAlphabet[counter]);
                   } else {
                       sb.append(charAlphabet[counter]);
                   }
               }
           }
       }

       System.out.println(sb.toString());
   }

}
