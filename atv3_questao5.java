/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao1 
 * Descrição: 5. Faça um programa que determine o fatorial de um número. Para 
este problema, tem-se como entrada o valor do número do qual 
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O 
fatorial de um número N (N!) é definido conforme a seguir 
(utilize for)
 * Data: 19/04/2023
 */
import java.util.Scanner;

public class atv3_questao5 {

        public static void main(String[] args) {
            int numeroInserido;
            int Fatorial = 1;
            int i; //contador
    
            System.out.println("Insira um numero que deseja saber o fatorial: ");
            Scanner teclado = new Scanner(System.in);
            numeroInserido = teclado.nextInt();
            teclado.close();
    
            for (i = 1; i <= numeroInserido; i = i + 1) {
               
                Fatorial = Fatorial * i;
                }
    
            System.out.printf("o fatorial de %d é igual a %d.", numeroInserido,Fatorial);  
    
            }   
        }
    