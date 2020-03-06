package com.company;

public class Client {
    private String nume;
    private int varsta;
    private String sex;
    public Client(String nume, int varsta, String sex){
        setNume(nume);
        setVarsta(varsta);
        setSex(sex);
    }
    public String getNume(){
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
