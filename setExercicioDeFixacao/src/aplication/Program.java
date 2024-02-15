package aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A? ");
		int an = sc.nextInt();

		for (int i = 0; i < an; i++) {
			int cod = sc.nextInt();
			a.add(cod);
		}

		System.out.print("How many students for course B? ");
		int bn = sc.nextInt();

		for (int i = 0; i < bn; i++) {
			int cod = sc.nextInt();
			b.add(cod);

		}
		System.out.print("How many students for course C? ");
		int cn = sc.nextInt();

		for (int i = 0; i < cn; i++) {
			int cod = sc.nextInt();
			c.add(cod);
		}

		Set<Integer> all = new HashSet<>(a);
		all.addAll(b);
		all.addAll(c);

		System.out.println("Total students: " + all.size());

		sc.close();
	}
}
