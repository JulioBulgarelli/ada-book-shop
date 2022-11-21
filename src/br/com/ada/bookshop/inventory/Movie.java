package br.com.ada.bookshop.inventory;

import java.util.List;

public class Movie extends Product {

	private String studio;
	private List<String> directors;
	private List<String> genres;
	private List<String> producers;

	public Movie() {
		super();
	}

	public Movie(Long id, String name, Double price, String studio, List<String> directors, List<String> genres, List<String> producers) {
		super("movie", id, name, price);
		this.studio = studio;
		this.directors = directors;
		this.genres = genres;
		this.producers = producers;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public List<String> getDirectors() {
		return directors;
	}

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getProducers() {
		return producers;
	}

	public void setProducers(List<String> producers) {
		this.producers = producers;
	}
}
