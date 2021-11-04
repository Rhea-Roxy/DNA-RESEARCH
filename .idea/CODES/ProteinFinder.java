package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProteinFinder {
    public static void main(String[] args) throws FileNotFoundException {
        ProteinFinder s = new ProteinFinder();
        String dna = "";
        Scanner sc = new Scanner(new File("C:\\Users\\nehar\\IdeaProjects\\com.company\\src\\com\\company\\M13mp18.txt"));

        while (sc.hasNextLine()) {
            dna += sc.nextLine();
        }
        System.out.println(s.length(dna));
    }


    public int length(String dna) {

        boolean start = false;
        boolean end = false;
        int count = 0;
        for (int i = 0; i < dna.length() - 2; i++) {

            String codon = String.valueOf(dna.charAt(i)) + String.valueOf(dna.charAt(i + 1)) + String.valueOf(dna.charAt(i + 2));
            if (codon.equals("ATG") || codon.equals("atg")) {
                start = true;// once it hits the start codon it should be in sets of threes
                i += 2;

            } else if (codon.equals("TAG") || codon.equals("TGA") || codon.equals("TAA") || codon.equals("tag") || codon.equals("tga") || codon.equals("taa")) {
                end = true;
            }
            if (start && !end) {
                count++;
            }
        }
        if (start && end)
            return count - 1;
        else
            return -1;
    }
}
