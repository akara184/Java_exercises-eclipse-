package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter file full path: ");// /home/akara/Documentos/in.txt
		String path = sc.nextLine();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			Map<String, Integer> votes = new LinkedHashMap<>();

			
			String line = br.readLine();

			while(line != null) {
				
				String[] fields = line.split(",");
				
				String name = fields[0];
				Integer count = Integer.parseInt(fields[1]);
				
				
				//Verifico se contem os dados x
				if(votes.containsKey(name)) {
					//pegando os dados x atual
					int votesSoFar = votes.get(name);
					
					//adicionando o atual pelo novo
					votes.put(name, count + votesSoFar);
					
				}else {
					votes.put(name, count);
				}
				
				line = br.readLine();

			}
			
			for(String entry : votes.keySet()) {
				System.out.println(entry + ": " +  votes.get(entry));
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
