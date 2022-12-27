package me.fred;

import me.fred.encryptions.Caesar;
import me.fred.encryptions.Xor;

public class Main {

    public static void main(String[] args) {
        //Ceasar
        System.out.println("Ceasar (5): " + Caesar.caesarEncrypt("Fred", 5));;

        //Xor
        System.out.println("Xor (5 / 25): " + Xor.xorEncrypt("fRED", 5));

    }
}

