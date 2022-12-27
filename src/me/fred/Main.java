package me.fred;

import me.fred.encryptions.Caesar;
import me.fred.encryptions.Morse;
import me.fred.encryptions.Xor;

public class Main {

    public static void main(String[] args) {
        //Ceasar
        System.out.println("Ceasar (5): " + Caesar.caesarEncrypt("TheOrandeDev on Github", 5));;

        //Xor
        System.out.println("Xor (5 (25)): " + Xor.xorEncrypt("TheOrandeDev on Github", 5));

        //Morse
        System.out.println("Morse: " + Morse.morseEncrypt("TheOrandeDev on Github"));


    }
}

