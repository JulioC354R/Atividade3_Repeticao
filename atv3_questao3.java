/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv3_questao3
 * Descrição: 3. Faça um programa que some os números de 1 a 100 e imprima 
somente o valor total da soma.
 * Data: 19/04/2023
 */



public class atv3_questao3 {
 public static void main(String[] args) {
    int valortotal = 0;

    for (int i = 1; i <=100; i = i+1){
    valortotal = valortotal + i;
    }
    System.out.println(valortotal);
 }   
}
