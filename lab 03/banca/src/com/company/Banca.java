package com.company;

public class Banca {
    private String nume;
    private String adresa;
    private float capital;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public Banca(String nume, String adresa, float capital){
        setNume(nume);
        setAdresa(adresa);
        setCapital(capital);
    }
}
