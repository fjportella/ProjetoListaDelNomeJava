/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolista;

import java.util.Scanner;

/**
 *
 * @author Fernando José Portella - RA: 5151105
 */
public class ProjetoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Variáveis
        String fp_nome;
        int fp_opcao, fp_elem;
        boolean fp_encontrou;

        fp_nome = "";
        fp_opcao = fp_elem = 0;

        Scanner teclado = new Scanner(System.in);

        ListaCalc listacalcObj;
        listacalcObj = new ListaCalc();

        System.out.println("Informe a quantidade de Elementos da Lista");
        fp_elem = teclado.nextInt();
        listacalcObj.ListaCalc(fp_elem);

        do {
            System.out.println("");
            System.out.println("0 – Finalizar");
            System.out.println("1 – Inicializa lista");
            System.out.println("2 – Mostra lista");
            System.out.println("3 – Insere elemento na lista");
            System.out.println("4 - Exclui por nome");
            System.out.print("Qual sua opção:");
            fp_opcao = teclado.nextInt();
            switch (fp_opcao) {
                case 1:
                    listacalcObj.inicializa();
                    break;
                case 2:
                    listacalcObj.mostra();
                    break;
                case 3:
                    teclado.nextLine();  						// limpar o buffer de teclado
                    if (!listacalcObj.cheia()) {
                        System.out.println("Informe o nome a ser inserido:");
                        fp_nome = teclado.nextLine();
                        listacalcObj.insere(fp_nome);
                    } else {
                        System.out.println("Lista cheia");
                    }
                    break;
                case 4:
                    teclado.nextLine();
                    fp_nome = "";
                    System.out.println("Informe o nome a ser deletado:");
                    fp_nome = teclado.nextLine();

                    listacalcObj.remove(fp_nome);

                    if (listacalcObj.fp_encontrou) {
                        System.out.println("A String foi encontrada");

                    } else {
                        System.out.println("A String não foi encontrada");
                    }
                    break;
                default:
                    System.out.println("Digite SOMENTE números entre 0 e 4");
                    break;
            }

        } while (fp_opcao != 0);

    }

}
