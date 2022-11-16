/*
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
*/
public class DNA {

    //Render the DNA length
    public static void renderDNALength(String dna, int sample) {
        System.out.println("DNA" + sample + ": " + dna.length());
    }

    //find start codon and return its index
    public static int findStartCodon(String dna, int num) {
        int startCodon = dna.indexOf("ATG");
        System.out.println("DNA" + num + " Start with: " + startCodon);
        return startCodon;
    }

    //find stop codon and return its index
    public static int findStopCodon(String dna, int num) {
        int stopCodon = dna.indexOf("TGA");
        System.out.println("DNA" + num + " Stop: " + stopCodon);
        return stopCodon;
    }

    //Render if the protein is contained or not
    public static void renderProtein(String dna, int startCodon, int stopCodon, int num) {

        //If start codon and stop codon exist and the number of nucleotides in between the start codon and the stop condon is a multiple of 3 then, protein exists.
        if(startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
            String protein = dna.substring(startCodon, stopCodon + 3);
            System.out.println("dna" + num + ": " + "Contains a protein(" + protein + ")");
        }
        else {
            System.out.println("dna" + num + ": No protein");
        }

    }

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        //Create variables and store string.
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        //Render the length of DNA
        renderDNALength(dna1, 1);
        renderDNALength(dna2, 2);
        renderDNALength(dna3, 3);

        //Get the start codon index
        int startCodon1 = findStartCodon(dna1, 1);
        int startCodon2 = findStartCodon(dna2, 2);
        int startCodon3 = findStartCodon(dna3, 3);

        //Get the stop codon index
        int stopCodon1 = findStopCodon(dna1, 1);
        int stopCodon2 = findStopCodon(dna2, 2);
        int stopCodon3 = findStopCodon(dna3, 3);

        //Check if there is a protein
        renderProtein(dna1, startCodon1, stopCodon1, 1);
        renderProtein(dna2, startCodon2, stopCodon2, 2);
        renderProtein(dna3, startCodon3, stopCodon3, 3);
    }

}