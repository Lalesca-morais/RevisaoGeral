import java.util.Scanner;

public class ExercicioTRes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int palpiteUsuario;

        System.out.println("Digite um número: ");
        palpiteUsuario = entrada.nextInt();

        if (palpiteUsuario % 7 == 0) {
            System.out.println("O número digitado é múltiplo de 7!");
        }if else(palpiteUsuario % 5 == 0) {
            System.out.println("O número digitado é múltiplo de 5!");
        }else {
            System.out.println("O número não é múltiplo de 7 e 5");
        }
    }
}
