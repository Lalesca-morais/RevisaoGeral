import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float altura, somaAlturas = 0, mediaHomens = 0, maior=0, menor=0;
        int sexo, qtMulheres = 0, qtHomens = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite seu sexo (1 - Feminino, 2 - Masculino): ");
            sexo = entrada.nextInt();

            System.out.print("Informe a altura: ");
            altura = entrada.nextFloat();

            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo ==2) {
                qtHomens++;
                somaAlturas = somaAlturas + altura;
            }else {
                System.out.println("Número inválido!");
            }
            if (altura > maior) {
                maior = altura;
            }else if (altura < menor) {
                menor = altura;
            }
            mediaHomens = somaAlturas / qtHomens;
        }
        System.out.println("Maior altura: " +maior);
        System.out.println("Média Homens: "+mediaHomens);
        System.out.println("Quantidade de mulheres: "+qtMulheres);
    }
}
