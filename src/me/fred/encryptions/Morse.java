package me.fred.encryptions;

public class Morse {
    public static String morseEncrypt(String plainText) {
        StringBuilder encryptedText = new StringBuilder();
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (ch == ' ') {
                encryptedText.append("/");
            } else if (Character.isDigit(ch)) {
                encryptedText.append(morseCode[ch - '0' + 26]).append(" ");
            } else if (Character.isLetter(ch)) {
                encryptedText.append(morseCode[Character.toUpperCase(ch) - 'A']).append(" ");
            }
        }
        return encryptedText.toString();
    }
}
