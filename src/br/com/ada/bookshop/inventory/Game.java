package br.com.ada.bookshop.inventory;

public class Game extends Product {

	private String distributor;
	private String genre;
	private String studio;

	public Game() {
		super();
	}

	public Game(Long id, String name, Double price, String distributor, String genre, String studio) {
		super("game", id, name, price);
		this.distributor = distributor;
		this.genre = genre;
		this.studio = studio;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
}
