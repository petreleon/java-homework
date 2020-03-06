package com.company;

import java.util.Vector;

public class ConturiBanca {
    private Banca banca;
    private Vector<ClientCont> clientContVector;

    public Banca getBanca() {
        return banca;
    }

    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    public Vector<ClientCont> getClientContVector() {
        return clientContVector;
    }

    public void setClientContVector(Vector<ClientCont> clientContVector) {
        this.clientContVector = clientContVector;
    }

    public ConturiBanca(Banca banca, Vector<ClientCont> clientContVector) {
        setBanca(banca);
        setClientContVector(clientContVector);
    }
}
