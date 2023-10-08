package br.com.jozias.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// rapare que quando chamamos o arquivo "lorem.txt", o java vai para a raiz do projeto, seguindo desse ponto como caminho relativo
		
		// Fluxo de entrada com um arquivo
		InputStream fileInputStream = new FileInputStream("lorem.txt"); // criando o fluxo completo com arquivo, mas binário. // read() -> bits e bytes
		Reader inputStreamReader = new InputStreamReader(fileInputStream); // melhorando os dados binários para caracteres // read() -> caracteres(char)

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // esse cara vai pegar o reader e já devolver um linha inteira char -> linha. ou seja, vai pegar os chars e montar uma linha completa.
		
		String linha;
		int rowNumber = 1;
		while((linha = bufferedReader.readLine()) != null) {
			System.out.println(rowNumber + " " + linha);
			rowNumber++;
		}
		bufferedReader.close();
		
		/*  this comment is other way of print all lines		
		char[] charet = new char[1024];
		
		inputStreamReader.read(charet);
		
		System.out.println("charret: " + new String(charet));
*/
	}

}
