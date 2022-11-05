package colections;

import java.util.Collections;
import java.util.LinkedList;

public class Colas {

    public static void main(String[] args) {
		LinkedList<Integer> test2 = new LinkedList<>();
		//USADA COMO QUEUE
		test2.offer(1);
		test2.offer(2);
		test2.offer(3);
        System.out.println("cantidad en la cola --<" +test2);
		System.out.println("print comun");
		test2.forEach(e ->System.out.print(e));
		System.out.println("print 2");
		System.out.println(test2.poll());
		System.out.println(test2.poll());
		System.out.println(test2.poll());
        System.out.println("cantidad en la cola --<" +test2);
    }
}
