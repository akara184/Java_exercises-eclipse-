package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		

		Set<String> set = new LinkedHashSet<>(); // Rapído que o TreeSet e ordena pela ordem que foram adicionados
		
//		Set<String> set = new HashSet<>(); ->  Rápido, porém ordem não importa.
		
//		Set<String> set = new TreeSet<>(); -> Lento que o HashSet e ordena os valores usando compareTO

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.charAt(0) == 'T' );
		
		for(String p : set) {
			System.out.println(p);
		}
		
	}

			
	
}
