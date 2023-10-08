package br.com.jozias.java.io.teste;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
			
		OutputStream outputStream = new FileOutputStream("lorem2.txt", true); 
		Writer writer = new OutputStreamWriter(outputStream); 
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		bufferedWriter.write("Testando escrita de arquivo");
		bufferedWriter.newLine();
		bufferedWriter.write("últimas palavras");
		
		bufferedWriter.close();
	}

}
