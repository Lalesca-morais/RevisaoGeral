import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int [] inverso = new int [1];

        for ( int  i = 0 ; i < inverso . length ; i ++){
            System.out.print("Digite um numero: ");
            inverso [i] = entrada.nextInt();
        }
        for ( int  i = inverso.length - 1 ; i >= 0 ; i --){
            System.out.println("O número inverso é: " +i);
        }
    }
}


