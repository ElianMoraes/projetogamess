package ctr;

import java.util.ArrayList;

import vo.Game;
import vo.dao.GamesDAO;

public class GamesProcess {

	public static ArrayList<Game> games = new ArrayList<>();
	public static GamesDAO cd = new GamesDAO();

	public static void testes() {
		
		games = new ArrayList<>();
		games.add(new Game("Grand Theft Auto: V","2013","Rockstar Games"));
		games.add(new Game("Fortnite","2017","Epic Games"));
		games.add(new Game("FIFA 21","2020","EA Sports"));
		games.add(new Game("Mortal Kombat 11","2019","NetherRealm Studios"));
			
	}
	
		public static String salvar() {
			if (cd.salvar(games)) {
				return "<p>Dados registrados</p>";
			}
			return "<p>Erro ao registrar dados</p>";
		}

		public static void abrir() {
			games = cd.abrir();
		}

	}