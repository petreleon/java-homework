package com.company;

import java.util.Vector;

public class OperatiiBanca {
    public static void main(String[] args) {
        ContBanca ba1 = new ContBanca(100.00);
        System.out.print("Inainte de tranzactie, ");
        ba1.afiseaza();
        ba1.depunere(74.35);
        ba1.retragere(20.00);
        System.out.print("Dupa tranzactie ");
        ba1.afiseaza();
        ClientCont c1 = new ClientCont(new Client("Petre", 24, "masculin"), new ContBanca(10));
        c1.getClient().setNume("Leonard");
        System.out.println(c1.getClient().getNume());
        ConturiBanca conturiBanca = new ConturiBanca(new Banca("brd", "necunoscuta", 100), new Vector<ClientCont>());
        conturiBanca.getClientContVector().add(c1);

    }
}