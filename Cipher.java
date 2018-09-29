class Cipher {
    public static String encrypt(String text, int key) {
        String encryptedText = "";

        for (int i = 0; i < key; i++) {
            encryptedText += text;
        }

        return encryptedText;
    }

    public static String decrypt(String text, int key) {
        return text.substring(0, text.length() / key);
    }
}