package com.company;

import java.util.Scanner;

public class DNAReverse {
    public static void main(String[] args) {
        DNAReverse y = new DNAReverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dna pattern: ");
        String string = sc.next();
        System.out.println(y.reverse(string));
    }

    public String reverse(String dna) {
        String new_dna = "";
        for (int i = dna.length() - 1; i >= 0; i--) {
            if (dna.charAt(i) == 't' || dna.charAt(i) == 'a' || dna.charAt(i) == 'g' || dna.charAt(i) == 'c' || dna.charAt(i) == 'A' || dna.charAt(i) == 'C' || dna.charAt(i) == 'G' || dna.charAt(i) == 'T')
                new_dna += dna.charAt(i);
            else {
                System.out.println("The dna sequence is wrong");
                System.exit(0);
            }
        }
        return new_dna;
    }
}
