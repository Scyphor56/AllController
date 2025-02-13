package com.objects;

public class Blanquetas {

    private String position;
    private String machine;
    private String faca;
    private int expositions;

    Blanquetas() {
        String position = "A1"; // position ex: A1, E3
        String machine = "";    //CD / KBA / XL
        String faca = "";       // ex: faca 172, 173
        int expositions = 6;    //number of expositions 3,4,6++

    }

    // getters and setters

    public String getPosition() {
        return this.position;
    }

    public String getMachine() {
        return this.machine;
    }

    public String getFaca() {
        return this.faca;
    }

    public int getExpositions() {
        return this.expositions;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setExpositions(int expositions) {
        this.expositions = expositions;
    }

    public void setFaca(String faca) {
        this.faca = faca;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }


}


