package com.training.quest3;

import java.util.Scanner;

import com.training.quest2.Extractor;
import com.training.quest2.JarExtractor;
import com.training.quest2.RarExtractor;
import com.training.quest2.ZipExtractor;

public class Customer {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter basic or touch screen phone");
		String type = s.next();
		FeaturePhone phone = null;
		switch (type) {

		case "basic":
			phone = new BasicMobile();
			phone.call();
			phone.messaging();
			break;
		case "touch":
			SmartPhone sphone = new TouchScreenMobile();
			sphone.showApps();
			sphone.cameraTypes();
			
			break;
		
			
		}
		
	}

}
