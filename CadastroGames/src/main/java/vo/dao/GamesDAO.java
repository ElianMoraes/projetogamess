package vo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import vo.Game;

public class GamesDAO {

	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo = "c:\\dbs\\games.csv";
	private ArrayList<Game> games;
	private Game game;

	public boolean salvar(ArrayList<Game> games) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo, false));
			for (Game c : games) {
				bw.write(c.toCSV());
			}
			bw.close();
			return true;
		} catch (IOException e) {
			System.out.println("Erro ao gravar arquivo " + e);
			return false;
		}
	}

	public ArrayList<Game> abrir() {
		games = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = null;
			while ((linha = br.readLine()) != null) {
				game = new Game(linha.split(";"));
				games.add(game);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo " + e);
		}
		return games;
	}

}
