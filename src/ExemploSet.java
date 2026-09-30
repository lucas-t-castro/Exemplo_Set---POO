import java.util.*;

public class ExemploSet{
    public static void main(String[] args) {
        //**//
        //* Montando as notas com HashSet *//
        Set<Double>notas = new HashSet<>(Arrays.asList(3.31,9.34,0.29,7.34,5.40));
        System.out.println(notas);

        //*O metodo Set não permite alterar posições *//
        //*System.out.println("Exiba a posição da nota 5.40") *//
        //*System.out.println("Adicione a nota 3.31 na posição 5") *//

        //*testando contains*//
        System.out.println("Confira se a nota 0.29 está no conjuto: " + notas.contains(0.29));

        //* testando collections *//
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //*Utilizando iterator*//
        Iterator<Double> iterator = notas.iterator();
        Double soma =0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //*Utilizando size*//
        System.out.println("Exiba a média das notas: " + soma/ notas.size());

        //*Utilizando remove*//
        System.out.println("Remova a nota 0: ");
        notas.remove(0.29);
        System.out.println(notas);

        System.out.println("Remova notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double nest = iterator1.next();
            if ( nest< 7) iterator1.remove();
        }
        System.out.println(notas);

        //*Usando linkedHashSet*//

        System.out.println("Exiba as notas na ordem em que foram exibidas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(6.5);
        notas2.add(1.5);
        notas2.add(9.9);
        notas2.add(10d);
        notas2.add(7.1);
        System.out.println(notas2);
    }
}