package com.company;

import java.util.Scanner;

public class DNAComplement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dna sequence : ");
        String dna = sc.next();
        DNAComplement y = new DNAComplement();
        System.out.println(y.complement(dna));
    }

    public String complement(String dna) {
        String new_dna = "";
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'g':
                    new_dna += 'c';
                    break;
                case 'c':
                    new_dna += 'g';
                    break;
                case 't':
                    new_dna += 'a';
                    break;
                case 'a':
                    new_dna += 't';
                    break;
                case 'G':
                    new_dna += 'C';
                    break;
                case 'C':
                    new_dna += 'g';
                    break;
                case 'T':
                    new_dna += 'A';
                    break;
                case 'A':
                    new_dna += 'T';
                    break;
                default:
                    System.out.println("The dna sequence is wrong");
                    System.exit(0);
            }
        }
        return new_dna;
    }
}
