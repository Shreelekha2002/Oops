package com.xworkz.movie.service;

import com.xworkz.movie.repository.MovieRepository;

public class MovieServiceImplementation implements MovieService {
	private MovieRepository movieRepository;

	public MovieServiceImplementation(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public boolean validatAndSave(String movieName) {
		if (movieName != null) {
			if (movieName.isEmpty() || movieName.isBlank() || movieName.length() < 2 && movieName.length() > 30) {
				System.out.println("check the movieName and give proper name");
			} else {
				System.out.println("validate movie name");
			}
			boolean exist = isExists(movieName);
			if (exist != true) {
				boolean save = movieRepository.onSave(movieName);
				if (save == true) {
					System.out.println("saved successfully");
				} else {
					System.out.println("not saved succefully");
				}
			} else {
				System.out.println("name already exists");
			}

		}
		return false;
	}

	@Override
	public boolean isExists(String movieName) {
		String[] movieList = movieRepository.read();
		if (movieList != null && movieName != null) {
			for (String name : movieList) {
				if (name != null) {
					if (name.equals(movieName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldMovieName, String newMovieName) {
		if (oldMovieName != null && newMovieName != null) {
			boolean exit = isExists(oldMovieName);
			if (exit) {
				if (newMovieName.isEmpty()) {
					System.out.println("empty");
					return false;
				} else if (newMovieName.isBlank()) {
					System.out.println("blank");
					return false;
				} else if (!newMovieName.contains("a")) {
					System.out.println(" its not contain a lettter");
					return false;
				} else if (!(newMovieName.length() > 2 && 20 > newMovieName.length())) {
					System.out.println(" length is lies between 2 to 20");
					return false;
				}
				boolean exit1 = isExists(newMovieName);
				if (exit1) {
					System.out.println(" newMovieName already present in data");
				   } 
				else {
					boolean update = movieRepository.update(oldMovieName, newMovieName);
					if (update) {
						System.out.println("updatedd");
						return true;
					} else {
						System.out.println("not updated");
					}
				}
			}
		}
		return false;

	}

	@Override
	public void read() {
		String[] name = movieRepository.read();
		for (String string : name) {
			System.out.println(string);

		}
	}

	@Override
	public boolean delete(String movieName) {
		if(movieName!=null) {
			boolean delete=movieRepository.delete(movieName);
			if(delete) {
				System.out.println("data deleted");
			}
			else {
				System.out.println("not deleted");
			}
		}
		else {
			System.out.println("name not present in data");
		}
		return false;
	}

}
