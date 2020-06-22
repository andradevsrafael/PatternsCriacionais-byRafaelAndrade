package exercicio2_1;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) 
	{
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Mauricio Moreira");
		nomes.add("Zardi, Helena");
		nomes.add("Matos, Alexandre");
		nomes.add("Rafael Andrade");

		NameParserCreator parser;
		
		for(String nome: nomes) 
		{
			if(nome.contains(",")) {
				parser = new NomeInversoParser();
			} else {
				parser = new NomeDiretoParser();
			}
			parser.gravar(nome);
		}
		
	}

}
