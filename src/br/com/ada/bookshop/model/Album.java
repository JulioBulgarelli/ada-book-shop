package br.com.ada.bookshop.model;

import java.util.List;

public class Album extends Product {

	private List<String> artists;
	private List<String> genres;
	private List<String> seals;

	public Album() {
		super();
	}

	public Album(Long id, String name, Double price, Boolean adultsOnly, List<String> artists, List<String> genres, List<String> seals) {
		super("album", id, name, price, adultsOnly);
		this.artists = artists;
		this.genres = genres;
		this.seals = seals;
	}

	public List<String> getArtists() {
		return artists;
	}

	public void setArtists(List<String> artists) {
		this.artists = artists;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getSeals() {
		return seals;
	}

	public void setSeals(List<String> seals) {
		this.seals = seals;
	}
}
