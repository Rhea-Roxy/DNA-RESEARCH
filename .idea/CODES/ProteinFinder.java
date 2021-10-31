package com.company;

import java.util.Scanner;

public class ProteinFinder
{
    public static void main(String[] args) {
        ProteinFinder s = new ProteinFinder();
        System.out.println("Enter the DNA Sequence:  ");
        Scanner sc = new Scanner(System.in);
        String dna = sc.next();
        System.out.println(s.length(dna));
    }
    public int length(String dna) {

        boolean start = false;
        boolean end = false;
        int count = 0;
        for (int i = 0; i < dna.length() - 2; i++) {

            String codon = String.valueOf(dna.charAt(i)) + String.valueOf(dna.charAt(i + 1)) + String.valueOf(dna.charAt(i + 2));
            if (codon.equals("ATG")) {
                start = true;// once it hits the start codon it should be in sets of threes
                i+=2;

            } else if (codon.equals("TAG") || codon.equals("TGA") || codon.equals("TAA")) {
                end = true;
            }
            if (start && !end ) {
                count++;
            }
        }
        if (start && end )
            return count-1;
        else
            return -1;
    }
}
