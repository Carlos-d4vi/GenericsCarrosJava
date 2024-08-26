package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe abstrata que representa um carro
abstract class Carro {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public abstract void exibirInfo();
}

// Classe Honda que herda de Carro
class Honda extends Carro {
    public Honda(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Honda: " + getModelo() + " - Ano: " + getAno());
    }
}

// Classe Civic que herda de Carro
class Civic extends Carro {
    public Civic(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Civic: " + getModelo() + " - Ano: " + getAno());
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de uma lista de carros que pode conter objetos Honda e Civic
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando carros à lista
        listaDeCarros.add(new Honda("Accord", 2020));
        listaDeCarros.add(new Civic("Civic Touring", 2022));
        listaDeCarros.add(new Honda("CR-V", 2021));
        listaDeCarros.add(new Civic("Civic Sport", 2019));

        // Exibindo informações dos carros na lista
        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
        }
    }
}
