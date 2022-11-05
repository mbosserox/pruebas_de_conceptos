package colections;

import java.util.Collections;
import java.util.LinkedList;

public class Pilas {


    public static void main(String[] args) {
        LinkedList<Integer> test2 = new LinkedList<>();
        //USADA COMO PILA
        test2.push(1);
        test2.push(2);
        test2.push(3);
        System.out.println("cantidad en la pila --<" +test2.size());
        System.out.println("print comun");
        System.out.println(Collections.max(test2));
        test2.stream().forEach(e-> System.out.println(e));
        test2.stream().anyMatch(e-> e>2);
        System.out.println("Quito elementos de la pila");
        System.out.println(test2.pop());
        System.out.println(test2.pop());
        System.out.println("cantidad en la pila " +test2.size());
    }
}
