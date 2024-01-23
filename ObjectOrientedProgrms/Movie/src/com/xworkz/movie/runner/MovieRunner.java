package com.xworkz.movie.runner;

import com.xworkz.movie.repository.MovieRepository;
import com.xworkz.movie.repository.MovieRepositoryImplementation;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImplementation;

public class MovieRunner {
	public static void main(String[] args) {
		MovieRepository movieRepository = new MovieRepositoryImplementation();
//	
//		movieRepository.onSave("bengaluru");
//		System.out.println("===============");
//		movieRepository.read();
//		movieRepository.update("bengaluru", "mysore");
		MovieService movieService = new MovieServiceImplementation(movieRepository);
		movieService.validatAndSave("bengaluru");
		movieService.validatAndSave("belagum");
//		movieService.validatAndSave("karantaka");
//		System.out.println("============");
		movieService.read();
		System.out.println("===========");
		movieService.update("bengaluru", "kolar");
		movieService.read();
//		System.out.println("=================");
		movieService.delete("belagum");
		movieService.read();
	}
}
