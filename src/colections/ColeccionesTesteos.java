package colections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ColeccionesTesteos {
	public static void main(String[] args) {
//		ArrayList<String> test = new ArrayList<String>();
//		test.add("pepe");
//		test.add("lolo");
//
//		test.forEach(e ->System.out.println(e));
//
//		test.remove("pepe");
//		test.forEach(e ->System.out.println(e));
//		/*
//		 *
//		 * LINKED LIST*/



		double[] ints = {2.75,3.5};
		List<Double> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
		System.out.println(list.stream().mapToDouble(i -> i).average());
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

		//System.out.println(test2.pop());
		
	}
}
