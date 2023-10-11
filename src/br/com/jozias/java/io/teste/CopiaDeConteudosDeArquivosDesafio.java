package br.com.jozias.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CopiaDeConteudosDeArquivosDesafio {
	
	public static void main(String[] args) throws IOException {
		
		InputStream inputStream = new FileInputStream("lorem2.txt"); //System.in; //new FileInputStream("lorem.txt");
		// --> exemplo do que pode ser um fluxo de entrada

		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		OutputStream outputStream = new FileOutputStream("lorem.txt"); //System.out; //new FileOutputStream("lorem2.txt");
		// --> exemplo do que pode ser um fluxo de saída

		Writer outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String contentLorem2Txt;
		
		while((contentLorem2Txt = bufferedReader.readLine()) != null) {
			bufferedWriter.write(contentLorem2Txt);
			bufferedWriter.newLine();
		}
		
		bufferedReader.close();
		bufferedWriter.close();
		

	}

}
