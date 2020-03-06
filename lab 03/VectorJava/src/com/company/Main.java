package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        int[] sir;
        sir = new int[100];
        int nrElemente = 0;
        int j;
        int Nrcautare;
        sir[0] = 77;
        sir[1] = 99;
        sir[2] = 44;
        sir[3] = 55;
        sir[4] = 22;
        sir[5] = 88;
        sir[6] = 11;
        sir[7] = 00;
        sir[8] = 66;
        sir[9] = 33;
        nrElemente = 10;
        for (j = 0; j < nrElemente; j++) System.out.print(sir[j] + " ");
        System.out.println("");
        Nrcautare = 66;
        for (j = 0; j < nrElemente; j++) if (sir[j] == Nrcautare) break;
        if (j == nrElemente) System.out.println("Nu am gasit nici un numar  " + Nrcautare);
        else System.out.println("Am gasi numarul " + Nrcautare);

        Nrcautare = 55;
        for (j = 0; j < nrElemente; j++) if (sir[j] == Nrcautare) break;
        for (int k = j; k < nrElemente; k++) sir[k] = sir[k + 1];
        nrElemente--;

        for (j = 0; j < nrElemente; j++) System.out.print(sir[j] + " ");
        System.out.println("");
    }
}
