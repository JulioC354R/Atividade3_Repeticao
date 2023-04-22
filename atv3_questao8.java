/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv3_questao7 
 * Descrição: 8. Faça um programa que preencha com zeros todas as posições de 
um vetor de tamanho 50.
 * Data: 22/04/2023
 */


public class atv3_questao8 {
    public static void main(String[] args) {
     
        int [] vetor = new int [50];

        int i;

        for ( i = 0 ; i < vetor.length; i++ ) {
            vetor[i] = 0;
            System.out.println("Vetor" + i + " = " + vetor[i]);
        }

    }   
}
