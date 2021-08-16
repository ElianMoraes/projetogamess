package vo;

import java.util.Objects;

public class Game {

	private String Jogo;
	private String Ano;
	private String Empresa;

	public Game() {
	}

	public Game(String Jogo, String Ano, String Empresa) {
		this.Jogo = Jogo;
		this.Ano = Ano;
		this.Empresa = Empresa;
	}

	public Game(String[] csv) {
		this.Jogo = csv[0];
		this.Ano = csv[1];
		this.Empresa = csv[2];
	}

	public String getJogo() {
		return Jogo;
	}

	public void setJogo(String Jogo) {
		this.Jogo = Jogo;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String Ano) {
		this.Ano = Ano;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String Empresa) {
		this.Empresa = Empresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Jogo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(Jogo, other.Jogo);
	}

	@Override
	public String toString() {
		return Jogo + "\t" + Ano + "\t" + Empresa + "\n";
	}

	public String toCSV() {
		return Jogo + ";" + Ano + ";" + Empresa + "\r\n";
	}

	public String toHTML() {
		return "<tr><td>" + Jogo + "</td><td>" + Ano + "</td><td>" + Empresa + "</td></tr>";
	}

}