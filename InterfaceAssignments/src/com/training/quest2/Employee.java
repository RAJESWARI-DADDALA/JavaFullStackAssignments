package com.training.quest2;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter z for zip, j for jar, r for r");
		String type = s.next();
		Extractor extractor = null;
		switch (type) {

		case "z":
			extractor = new ZipExtractor();
			extractor.extractFiles("a.txt", "b.txt", "c.txt");
			break;
		case "j":
			extractor = new JarExtractor();
			extractor.extractFiles("a.jar", "b.jar", "c.jar");
			break;
		case "r":
			extractor = new RarExtractor();
			extractor.extractFiles("a.rar", "b.rar", "c.rar");
			break;
			
		}
	}

}
