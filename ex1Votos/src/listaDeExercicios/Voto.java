package listaDeExercicios;

/**
 * Classe que contem a base com os atributos necessarios para contabilizar todos
 * os votos
 * 
 * @author Bruno Reis
 * @version 01_2022
 */

public class Voto {

	private double totalEleitores;
	private double votosValidos;
	private double votosBrancos;
	private double votosNulos;
	private double percentualVotosValidos;
	private double percentualVotosBrancos;
	private double percentualVotosNulos;

	public Voto() {
	}

	public Voto(double totalEleitos, double votosValidos, double votosBrancos, double votosNulos) {

		this.totalEleitores = (int) totalEleitos;
		this.votosValidos = (int) votosValidos;
		this.votosBrancos = (int) votosBrancos;
		this.votosNulos = (int) votosNulos;
		this.percentualDeVotosValidos();
		this.percentualDeVotosBrancos();
		this.percentualDeVotosNulos();

	}

	/**
	 * Retorna com o valor da variavel totalEleitores
	 */

	public double getTotalEleitores() {
		return totalEleitores;
	}

	/**
	 * Atribui o parametro a variavel totalEleitores
	 */

	public void setTotalEleitores(double totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	/**
	 * Retorna com o valor da variavel votosValidos
	 */

	public double getVotosValidos() {
		return votosValidos;
	}

	/**
	 * Atribui o parametro a variavel totalVotosValidos
	 */

	public void setVotosValidos(double votosValidos) {
		this.votosValidos = votosValidos;
	}

	/**
	 * Retorna com o valor da variavel votosBrancos
	 */

	public double getVotosBrancos() {
		return votosBrancos;
	}

	/**
	 * Atribui o parametro a variavel totalVotosBrancos
	 */

	public void setVotosBrancos(double votosBrancos) {
		this.votosBrancos = votosBrancos;
	}

	/**
	 * Retorna com o valor da variavel votosNulos
	 */

	public double getVotosNulos() {
		return votosNulos;
	}

	/**
	 * Atribui o parametro a variavel totalVotosNulos
	 */

	public void setVotosNulos(double votosNulos) {
		this.votosNulos = votosNulos;
	}

	/**
	 * Retorna com o valor da variavel percentualVotosValidos
	 */

	public double getPercentualVotosValidos() {
		return percentualVotosValidos;
	}

	/**
	 * Retorna com o valor da variavel percentualVotosBrancos
	 */

	public double getPercentualVotosBrancos() {
		return percentualVotosBrancos;
	}

	/**
	 * Retorna com o valor da variavel percentualVotosNulos
	 */

	public double getPercentualVotosNulos() {
		return percentualVotosNulos;
	}

	/**
	 * Calcula o percentual de Votos Validos em comparação ao total de eleitores
	 */
	public void percentualDeVotosValidos() {

		this.percentualVotosValidos = (this.votosValidos / this.totalEleitores) * 100;
	}

	/**
	 * Calcula o percentual de Votos Brancos em comparação ao total de eleitores
	 */
	public void percentualDeVotosBrancos() {

		this.percentualVotosBrancos = (this.votosBrancos / this.totalEleitores) * 100;
	}

	/**
	 * Calcula o percentual de Votos Nulos em comparação ao total de eleitores
	 */
	public void percentualDeVotosNulos() {

		this.percentualVotosNulos = (this.votosNulos / this.totalEleitores) * 100;
	}

	/**
	 * Mostra na tela todos os percentuais calculados.
	 */

	@Override
	public String toString() {
		return  "Percentual de Votos: \n" +
				"\nVotos Validos: " + this.percentualVotosValidos + " %"+ 
				"\nVotos Brancos: " + this.percentualVotosBrancos + " %"+
				"\nVotor Nulos: " + this.percentualVotosNulos + " %";

	}

}
