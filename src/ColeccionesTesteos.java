import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class ColeccionesTesteos {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		test.add("pepe");
		test.add("lolo");
		
		test.forEach(e ->System.out.println(e));
		
		test.remove("pepe");
		test.forEach(e ->System.out.println(e));
		/*
		 * 
		 * LINKED LIST*/
		LinkedList<Integer> test2 = new LinkedList<>();
		//USADA COMO QUEUE
		test2.offer(1);
		test2.offer(2);
		test2.offer(3);
		System.out.println("print comun");
		test2.forEach(e ->System.out.print(e));
		System.out.println("print 2");
		System.out.println(test2.poll());
		System.out.println(test2.poll());
		System.out.println(test2.poll());
		//USADA COMO PILA
		test2.push(1);
		test2.push(2);
		test2.push(3);
		System.out.println("print comun");
		System.out.println(Collections.max(test2));
		test2.stream().forEach(e-> System.out.println(e*2));
		test2.stream().anyMatch(e-> e>2);
		System.out.println("print 2");
		System.out.println(test2.pop());
		System.out.println(test2.pop());
		
		System.out.println(test2.pop());
		
	}
}
