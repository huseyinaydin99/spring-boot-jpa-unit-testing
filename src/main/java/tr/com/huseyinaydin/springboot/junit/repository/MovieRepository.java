package tr.com.huseyinaydin.springboot.junit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.huseyinaydin.springboot.junit.model.Movie;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot canım
 * 
 */

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findByGenera(String genera);
}
