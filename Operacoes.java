package org.example;

import java.util.ArrayList;
import java.util.List;

public class Operacoes {

    private double n1;
    private double n2;

    public void setNumeros(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double soma(){
        return n1+n2;
    }
    public double subtracao(){
        return n1-n2;
    }
    public double multiplicacao(){
        return n1*n2;
    }
    public double divisao(){
        return n1/n2;
    }

}
