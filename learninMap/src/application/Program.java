package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String,String> cookies = new TreeMap<>();
		
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "99771133");
		
		System.out.println("Contais 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		
		System.out.println("SIze: " + cookies.size());
		
		
		System.out.println("ALL COOKIES");
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}

}
