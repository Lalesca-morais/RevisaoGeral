import java.util.ArrayList;
import java.util.List;
public class ExercicioCinco {
    public static void main(String[] args) {

        List<Integer> somaLista = new ArrayList<Integer>();
        somaLista.add(1);
        somaLista.add(2);
        somaLista.add(3);
        somaLista.add(4);
        somaLista.add(5);
        somaLista.add(6);
        int soma = 0;
        for(int i = 0; i < somaLista.size(); i++) {
            soma += somaLista.get(i);
        }
        System.out.println("A soma dos elementos da somaLista é: " + soma);
    }
}