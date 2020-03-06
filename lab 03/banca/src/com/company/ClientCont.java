package com.company;

public class ClientCont {
    private Client client;
    private ContBanca contBanca;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ContBanca getContBanca() {
        return contBanca;
    }

    public void setContBanca(ContBanca contBanca) {
        this.contBanca = contBanca;
    }

    public ClientCont(Client client, ContBanca contBanca) {
        setClient(client);
        setContBanca(contBanca);
    }



}
