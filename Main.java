import java.util.Scanner;

class Main {
    public static void main (String [] args) {
        Scanner kbd = new Scanner(System.in);  // keyboard input
        boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.println("----- CipherIT -----");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");

            System.out.print("Choice: ");
            int menu_input = kbd.nextInt();
            System.out.println();

            String text = "";  // original/encrypted text
            int key = 0;       // encryption/decryption key

            switch (menu_input) {
                case 1:
                    System.out.print("Text: ");
                    text = kbd.next();
                    
                    System.out.print("Key: ");
                    key = kbd.nextInt();

                    System.out.println("Cipher text: " + Cipher.encrypt(text, key));
                    break;
                
                case 2:
                    System.out.print("Text: ");
                    text = kbd.next();
                    
                    System.out.print("Key: ");
                    key = kbd.nextInt();

                    System.out.println("Original text: " + Cipher.decrypt(text, key));
                    break;
                
                case 3:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Unknown input: " + Integer.toString(menu_input));
            }
        }

        kbd.close();
    }
}
