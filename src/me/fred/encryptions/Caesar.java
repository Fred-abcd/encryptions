package me.fred.encryptions;

public class Caesar {
    public static String caesarEncrypt(String plainText, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        encryptedText.append((char) (ch - (26 - shift)));
                    } else {
                        encryptedText.append(c);
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'Z') {
                        encryptedText.append((char) (ch - (26 - shift)));
                    } else {
                        encryptedText.append(c);
                    }
                }
            } else {
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }
}
