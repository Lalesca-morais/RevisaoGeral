import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int qtFuncionarios, i, totalSalario = 0;
        float salario, mediaSalario = 0;
        do {
            System.out.print("Quantos funcionários a empresa possui: ");
            qtFuncionarios = entrada.nextInt();
        }while (qtFuncionarios < 0);

        for (i = 1; i <= qtFuncionarios ; i++) {
            System.out.println("Salário: " +i);
            salario = entrada.nextFloat();
            totalSalario += salario;
            mediaSalario = salario / qtFuncionarios;
        }
        System.out.println("A média salarial é de:R$"+mediaSalario);
    }
}
