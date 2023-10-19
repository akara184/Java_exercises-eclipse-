package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Items;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Criação de pasta
		String folderPath = "/home/akara/Documentos/";
		File path = new File(folderPath);		
		boolean sucess = new File(folderPath + "out").mkdir();
		System.out.println("Folder craeted: " + sucess);
		
		String fileCSV = "/home/akara/Documentos/out/summary.csv";		
		
		
		List<Items> list = new ArrayList<>();
		
		list.add(new Items("TV LED", 1290.99, 1));
		list.add(new Items("Video Game Chair", 350.50, 3));
		list.add(new Items("Iphone X", 900.00, 2));
		list.add(new Items("Samsung Galaxy ", 850.00, 2));
		
		
		
		
		for(Items item : list) {
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileCSV, true))){
				bw.write(item.getName() + "," +  String.format("%.2f", item.productPrice()));
				bw.newLine();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
			try(BufferedReader br = new BufferedReader(new FileReader(fileCSV))){
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
					
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		

		
		
		
		
		
		
		
		sc.close();
	}

}
