package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DNAMapping {
    public static void main(String[] args) throws FileNotFoundException {
        DNAMapping s =new DNAMapping();
        String dna = "";
        Scanner sc = new Scanner(new File("C:\\Users\\nehar\\IdeaProjects\\com.company\\src\\com\\company\\M13mp18.txt"));

        while (sc.hasNextLine()) {
            dna += sc.nextLine();
        }
        System.out.println(s.mapping(dna));
    }


    public String mapping(String dna) {
        String new_mappedDNA = "";
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
                // when it hits the start codon it begins the mapping

                if (codon.equals("TTT") || codon.equals("TTC")) {
                    new_mappedDNA += "Phe";
                } else if (codon.equals("TTA") || codon.equals("TTG") || codon.equals("CTT") || codon.equals("CTC") || codon.equals("CTA") || codon.equals("CTG")) {
                    new_mappedDNA += "Leu";
                } else if (codon.equals("TCT") || codon.equals("TCC") || codon.equals("TCA") || codon.equals("TCG")) {
                    new_mappedDNA += "Ser";
                } else if (codon.equals("TAT") || codon.equals("TAC")) {
                    new_mappedDNA += "Tyr";
                } else if (codon.equals("TGT") || codon.equals("TGC")) {
                    new_mappedDNA += "Cys";
                } else if (codon.equals("TGG")) {
                    new_mappedDNA += "Trp";
                } else if (codon.equals("CCT") || codon.equals("CCC") || codon.equals("CCA") || codon.equals("CCG")) {
                    new_mappedDNA += "Pro";
                } else if (codon.equals("CAT") || codon.equals("CAC")) {
                    new_mappedDNA += "His";
                } else if (codon.equals("CAA") || codon.equals("CAG")) {
                    new_mappedDNA += "Gln";
                } else if (codon.equals("CGT") || codon.equals("CGC") || codon.equals("CGA") || codon.equals("CGG")) {
                    new_mappedDNA += "Arg";
                } else if (codon.equals("ATT") || codon.equals("ATC") || codon.equals("ATA")) {
                    new_mappedDNA += "Ile";
                } else if (codon.equals("ATG")) {
                    new_mappedDNA += "Met";
                } else if (codon.equals("ACT") || codon.equals("ACC") || codon.equals("ACA") || codon.equals("ACG")) {
                    new_mappedDNA += "Thr";
                } else if (codon.equals("AAT") || codon.equals("AAC")) {
                    new_mappedDNA += "Asn";
                } else if (codon.equals("AAA") || codon.equals("AAG")) {
                    new_mappedDNA += "Lys";
                } else if (codon.equals("AGT") || codon.equals("AGC")) {
                    new_mappedDNA += "Ser";
                } else if (codon.equals("AGA") || codon.equals("AGG")) {
                    new_mappedDNA += "Arg";
                } else if (codon.equals("GTT") || codon.equals("GTC") || codon.equals("GTA") || codon.equals("GTG")) {
                    new_mappedDNA += "Val";
                } else if (codon.equals("GCT") || codon.equals("GCC") || codon.equals("GCA") || codon.equals("GCG")) {
                    new_mappedDNA += "Ala";
                } else if (codon.equals("GAT") || codon.equals("GAC")) {
                    new_mappedDNA += "Asp";
                } else if (codon.equals("GAA") || codon.equals("GAG")) {
                    new_mappedDNA += "Glu";
                } else if (codon.equals("GGT") || codon.equals("GGC") || codon.equals("GGA") || codon.equals("GGG")) {
                    new_mappedDNA += "Gly";
                }

            }
        }
        if (start && end)
            return new_mappedDNA;
        else
            return "The start and stop codons are not properly specified.";
    }
}

