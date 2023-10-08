package br.com.jozias.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// rapare que quando chamamos o arquivo "lorem.txt", o java vai para a raiz do projeto, seguindo desse ponto como caminho relativo
		
		// Fluxo de entrada com um arquivo
		FileInputStream fileInputStream = new FileInputStream("lorem.txt"); // criando o fluxo completo com arquivo, mas binário. // read() -> bits e bytes
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); // melhorando os dados binários para caracteres // read() -> caracteres(char)
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // esse cara vai pegar o reader e já devolver um linha inteira char -> linha. ou seja, vai pegar os chars e montar uma linha completa.
		
		String linha = bufferedReader.readLine();
		
		System.out.println(linha);
		
		bufferedReader.close();
		

	}

}
