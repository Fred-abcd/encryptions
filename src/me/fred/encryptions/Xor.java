package me.fred.encryptions;

public class Xor {
    public static String xorEncrypt(String plainText, int key) {
        StringBuilder encryptedText = new StringBuilder();
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            encryptedText.append((char)(ch ^ key));
        }
        return encryptedText.toString();
    }
}
