package com.training.quest2;

public class ZipExtractor implements Extractor{
	
	public void extractFiles(String...filenames) {
		for (String fileName : filenames) {
			System.out.println("extracting from zip  => "+ fileName);
		}
	}
}
