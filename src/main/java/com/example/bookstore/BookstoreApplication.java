package com.example.bookstore;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookRepository;
import com.example.bookstore.model.Category;
import com.example.bookstore.model.CategoryRepository;


	@SpringBootApplication
	public class BookstoreApplication {
	
		private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
		
		public static void main(String[] args) {
			SpringApplication.run(BookstoreApplication.class, args);
		}
		@Bean
		public CommandLineRunner bookDemo(BookRepository brepository, CategoryRepository crepository) {
			return (args) -> {
				
	
				log.info("save a couple of books");
				crepository.save(new Category("asd"));
				crepository.save(new Category("asdaddasdafaf"));
				brepository.save(new Book("The Capital", "Marx", 1890, "123-234", 99.90,crepository.findByName("asd").get(0)));
	
	
				
				log.info("fetch all books");
				for (Book book : brepository.findAll()) {
					log.info(book.toString());
				}
	
			};
		}
		
	}