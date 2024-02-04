package com.training.quest2;

public class JarExtractor implements Extractor{

	@Override
	public void extractFiles(String...filenames) {
		for (String fileName : filenames) {
			System.out.println("extracting from Jar  => "+ fileName);
		}
	}

}
