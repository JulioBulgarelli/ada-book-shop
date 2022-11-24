package br.com.ada.bookshop.model;

public class Book extends Product {

	private String genre;
	private String writer;
	private String publisher;

	public Book() {
		super();
	}

	public Book(Long id, String name, Double price, Boolean adultsOnly, String genre, String writer, String publisher) {
		super("book", id, name, price, adultsOnly);
		this.genre = genre;
		this.writer = writer;
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
