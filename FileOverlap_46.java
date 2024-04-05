package com.web.java;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileOverlap_46 {

	public class FileOverlap {
	    public static void main(String[] args) {
	        String filePath1 = "file1.txt";
	        String filePath2 = "file2.txt";

	        try {
	            Set<String> file1Lines = readFile(filePath1);
	            Set<String> file2Lines = readFile(filePath2);

	            
	            Set<String> commonLines = new HashSet<>(file1Lines);
	            commonLines.retainAll(file2Lines);

	            
	            System.out.println("Common lines between " + filePath1 + " and " + filePath2 + ":");
	            for (String line : commonLines) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            System.err.println("An error occurred while reading files: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    private static Set<String> readFile(String filePath) throws IOException {
	        Set<String> lines = new HashSet<>();
	        BufferedReader reader = new BufferedReader(new FileReader(filePath));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            lines.add(line);
	        }
	        reader.close();
	        return lines;
	    }
	}
}


