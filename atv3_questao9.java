/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv3_questao7 
 * Descrição: 9. Faça um programa que preencha com zeros todas as posições de 
uma matriz com 10 linha e 10 coluna
 * Data: 22/04/2023
 */

public class atv3_questao9 {
    public static void main(String[] args) {
        int vetor [] [] = new int [10][10];
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
            vetor[i][j] = 0;
            System.out.println("vetor [" + i +"][" + j + "]= " + vetor[i][j]);
            }
        }
    }
}

