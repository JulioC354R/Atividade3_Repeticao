/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv3_questao6 
 * Descrição: . Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que 
esse volume se torne maior que 1000 centímetros cúbicos. 
(utilize while)
 * Data: 20/04/2023
 */
import java.util.Scanner;

public class atv3_questao6 {
    public static void main(String[] args) {
        //valores
        int cm3;
        int limite = 1000;
        int segundos = 0;


        //entrada
        System.out.println("Insira o valor em cm cúbicos.");
        Scanner teclado = new Scanner(System.in);
        cm3 = teclado.nextInt();
        teclado.close();
        //processamento
        while (cm3 < limite){
            cm3 = cm3 * 2;
            segundos = segundos + 1;
        }
        System.out.printf("Em %d segundos o volume do gás terá ultrapassado 1000 cm cúbicos." , segundos);


    }
}
