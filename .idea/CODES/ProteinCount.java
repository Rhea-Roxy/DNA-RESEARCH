package com.company;

import java.util.Scanner;

public class ProteinCount {
    int total_count = 0;
    int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] prots = new String[n];
        System.out.println("Enter the " + n + " string of amino acids : ");
        for (int i = 0; i < n; i++) {
            prots[i] = sc.next();
        }
        System.out.println("Enter the protein to be searched : ");
        String amino = sc.next();
        ProteinCount am = new ProteinCount();
        System.out.println(am.aminoCount(prots, amino, n));
    }

    public int aminoCount(String[] prots, String amino, int n) {

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < prots[i].length(); j++) {
                if (amino.charAt(0) == prots[i].charAt(j)) {
                    count++;
                }
                if (count == 3) {
                    total_count++;
                    break;
                }
            }
        }
        return total_count;
    }
}
