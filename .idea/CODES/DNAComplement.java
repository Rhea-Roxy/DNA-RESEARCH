package com.coding;

public class DNAComplement {
    public static void main(String[] args) {

        DNAComplement y = new DNAComplement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dna pattern: ");
        String dna_string = sc.next();
        System.out.println(y.complement(dna_string));
    }
    public String complement(String dna) {
        String new_dna="";
        for(int i = 0; i< dna.length(); i++)
        {
            switch(dna.charAt(i)){
                case 'g' : new_dna += 'c';
                    break;
                case 'c' : new_dna += 'g';
                    break;
                case 't' : new_dna += 'a';
                    break;
                case 'a' : new_dna += 't';
                    break;
                default :
                    System.out.println("The dna sequence is wrong"); System.exit(0);
            }
        }
        return new_dna;
    }
}