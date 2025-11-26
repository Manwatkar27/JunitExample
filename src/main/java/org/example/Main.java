package org.example;

import org.example.StringUtility;

public class Main {
    public static void main(String[] args) {
        StringUtility stringUtility = new StringUtility();

        System.out.println("Reversed: " + stringUtility.reverse("example"));
        System.out.println("Uppercase: " + stringUtility.toUpperCase("example"));
        System.out.println("Vowel count: " + stringUtility.countVowels("example"));
    }
}