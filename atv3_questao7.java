/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv3_questao7 
 * Descrição: . Escreva um programa que, dada a carga máxima de um elevador e 
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra 
no elevador até que a carga máxima seja atingida ou o número 
máximo de pessoas seja atingido (utilize do / while).
 * Data: 21/04/2023
 */
import java.util.Scanner;

public class atv3_questao7 {
    public static void main(String[] args) {
        //valores
        int QtdPessoas = 0;
        int pesoMax;
        int pesoUsuario;
        int maxPessoas;
        int pesoTotal = 0;
// processamento

        System.out.println("Insira a quantidade maxima de pessoas suportadas no elevador:");
        Scanner teclado = new Scanner(System.in);
        maxPessoas = teclado.nextInt();
        System.out.println("Insira o peso maximo suportado pelo elevador:");
        pesoMax = teclado.nextInt();
        
        do {
            System.out.println("insira o peso do usuário");
            pesoUsuario = teclado.nextInt();
            QtdPessoas = QtdPessoas +1;
            pesoTotal = pesoTotal + pesoUsuario;

            
        } while (QtdPessoas < maxPessoas && pesoTotal < pesoMax);
            teclado.close();

        if (QtdPessoas == maxPessoas){
            
        System.out.println("Número máximo de pessoas atingido!");
    } else {
        System.out.println("Peso máximo atingido!");
    }
    }
}
