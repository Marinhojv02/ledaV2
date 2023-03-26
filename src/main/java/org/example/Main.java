package org.example;

import ListaEncadeada.LinkedList;
import ListaEncadeada.Node;

public class Main {
    public static void main(String[] args) {
        LinkedList teste = new LinkedList();

        teste.add(new Node(3));
        teste.add(new Node(0));
        teste.add(new Node(1));
        teste.add(new Node(2));
        teste.add(new Node(3));
        teste.add(new Node(4));
        teste.add(new Node(5));
        teste.add(new Node(6));

        teste.print();
    }
}