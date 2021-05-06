/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolista;

import java.util.Arrays;

/**
 *
 * @author Fernando
 */
public class ListaCalc {

    private String nome[];
    private int contador, numele;
    public boolean fp_encontrou = false;

    public void ListaCalc(int elem) {
        this.numele = elem;
        numele = numele + 1;
        nome = new String[numele];
    }

    public void inicializa() {
        contador = 1;
        int i;
        for (i = 0; i < numele; i++) {
            nome[i] = "";
        }
    }

    public boolean cheia() {
        return contador == numele;		//faz uma decisão e retorna o valor lógico true ou false
    }

    public boolean vazia() {
        return contador == 1;		//faz uma decisão e retorna o valor lógico true ou false
    }

    public void insere(String nome) {
        if (!this.cheia()) {
            int verif = 0, cont2 = 1;
            //        this.numarray();
            while (cont2 <= numele && verif != 1) {
                if (this.nome[cont2] == "") {
                    this.nome[cont2] = nome;

                    verif = 1;
                }
                cont2++;
            }
            contador++;
            verif = 0;
            cont2 = 0;
            this.mostra();
        } else {
            System.out.println("Lista cheia");
        }

    }

    public void mostra() {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            System.out.println();
            System.out.printf("%10s", "Posição");
            System.out.printf("%10s", "Nome");
            System.out.println("");
            System.out.println("----------------------");
            for (i = 1; i < numele; i++) {
                System.out.printf("%10d", i);
                System.out.printf("%10s", nome[i]);
                System.out.println("");
            }
            System.out.println("----------------------");
        }
    }

    public boolean remove(String nome) {
        if (this.vazia()) {
            System.out.println("Lista vazia");
        } else {
            int i;
            int contp = 0;
            this.fp_encontrou = false;
            for (i = 1; i < numele; i++) {
                if (this.nome[i].toLowerCase().equals(nome.toLowerCase()) && (contp == 0)) {
                    this.fp_encontrou = true;
                    this.nome[i] = "";
                    contp++;
                    contador--;
                }

            }
            this.mostra();
        }
        return fp_encontrou;
    }

}
