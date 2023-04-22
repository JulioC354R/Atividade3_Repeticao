/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao1 
 * Descrição: 4. Faça um programa que solicite ao usuário que digite um número 
até que ele digite um número menor que 0 (utilize while).
 * Data: 19/04/2023
 */


import java.util.Scanner;

public class atv3_questao4 {
    public static void main(String[] args) {
        int numeroInserido;
        System.out.println("insira o Numero");
        Scanner teclado = new Scanner(System.in);
        numeroInserido = teclado.nextInt();
        teclado.close();
        while (numeroInserido >= 0) {
            System.out.println("insira o Numero");
            numeroInserido = teclado.nextInt();
        }

    }
}
