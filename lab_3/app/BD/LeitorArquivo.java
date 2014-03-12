package BD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {

	
	public List<String[]> getAllDisciplinesForFile(){
		List<String[]> retorno = new ArrayList<String[]>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("files//disciplines.txt"));
			while(br.ready()){  
				   String linha = br.readLine();  
				   System.out.println(linha); 
				   retorno.add(linha.split(" - "));
				}  
			br.close(); 
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  
		
		return retorno;
	}
	
	public List<String[]> read(String fileName){
		List<String[]> retorno = new ArrayList<String[]>();
		
		//primeiro periodo
		retorno.add(new String[]{"LPT","4"});
		retorno.add("Calculo 1 - 4 - ".split(" - "));
		retorno.add("IC - 4 - ".split(" - "));
		retorno.add("Lab Prog 1 - 4 - ".split(" - "));
		retorno.add("Prog 1 - 4 - ".split(" - "));
		retorno.add("Vetorial - 4 - ".split(" - "));
		//segundo periodo
		retorno.add("Calculo 2 - 4 - Calculo 1".split(" - "));
		retorno.add("Discreta - 4 - ".split(" - "));
		retorno.add("Metodologia - 4 - ".split(" - "));
		retorno.add("Prog 2 - 4 - Prog 1#Lab Prog 1#IC".split(" - "));
		retorno.add("Grafos - 2 - Prog 1#Lab Prog 1".split(" - "));
		retorno.add("Fisica classica - 4 - Calculo 1#Vetorial".split(" - "));
		retorno.add("Lab Prog 2 - 4 - Prog 1#Lab Prog 1#IC".split(" - "));
		//terceiro periodo
		retorno.add("Probabilidade - 4 - Calculo 2".split(" - "));
		retorno.add("TC - 4 - IC#Grafos#Discreta".split(" - "));
		retorno.add("linear - 4 - Vetorial".split(" - "));
		retorno.add("EDA - 4 - Grafos#Prog 2#Lab Prog 2".split(" - "));
		retorno.add("Fisica moderna - 4 - Calculo 2#Fisica classica".split(" - "));
		retorno.add("GI - 4 - ".split(" - "));
		retorno.add("LEDA - 4 - Grafos#Prog 2#Lab Prog 2".split(" - "));
		//quarto periodo
		retorno.add("Metodos estatisticos - 4 - linear#Probabilidade".split(" - "));
		retorno.add("OAC - 4 - EDA#LEDA#Fisica moderna".split(" - "));
		retorno.add("PLP - 2 - EDA#LEDA#TC".split(" - "));
		retorno.add("Logica - 4 - TC".split(" - "));
		retorno.add("ES 1 - 4 - Probabilidade#Prog 2#Lab Prog 2".split(" - "));
		retorno.add("SI 1 - 4 - GI".split(" - "));
		retorno.add("LOAC - 4 - EDA#LEDA#Fisica moderna".split(" - "));
		//quinto periodo
		retorno.add("Infosoc - 2 - ".split(" - "));
		retorno.add("ATAL - 4 - EDA#LEDA#Calculo 2#Logica".split(" - "));
		retorno.add("Compiladores - 4 - OAC#LOAC#PLP".split(" - "));
		retorno.add("Rede de computadores - 4 - OAC#LOAC".split(" - "));
		retorno.add("BD 1 - 4 - SI 1".split(" - "));
		retorno.add("SI 2 - 4 - SI 1".split(" - "));
		retorno.add("LES - 2 - ES 1".split(" - "));
		//sexto periodo
		retorno.add("Direito e cidadania - 4 - ".split(" - "));
		retorno.add("SO - 4 - ".split(" - "));
		retorno.add("Interconecao de redes de computadores - 2 - ".split(" - "));
		retorno.add("Optativa 1 - 4 - ".split(" - "));
		retorno.add("Laboratorio de interconecao de redes de computadores - 2 - ".split(" - "));
		retorno.add("Optativa 2 - 4 - ".split(" - "));
		retorno.add("Metodos de software numericos - 4 - ".split(" - "));
		retorno.add("Avaliacao de desempenho de de sistemas discretos - 4 - ".split(" - "));
		retorno.add("BD 2 - 4 - ".split(" - "));
		retorno.add("IA - 4 - ".split(" - "));
		retorno.add("Projeto em computacao 1 - 4 - ".split(" - "));
		retorno.add("Optativa 3 - 4 - ".split(" - "));
		retorno.add("Optativa 4 - 4 - ".split(" - "));
		retorno.add("Optativa 5 - 4 - ".split(" - "));
		retorno.add("Optativa 6 - 4 - ".split(" - "));
		retorno.add("Projeto em computacao 2 - 6 - ".split(" - "));
		retorno.add("Optativa 7 - 4 - ".split(" - "));
		retorno.add("Jogos Digitais - 4 - ".split(" - "));
		retorno.add("Didatica 1 - 2 - ".split(" - "));
		retorno.add("Didatica 2 - 2 - ".split(" - "));
		retorno.add("Sociologia industrial - 3 - ".split(" - "));
		
		return retorno;
	}
}
