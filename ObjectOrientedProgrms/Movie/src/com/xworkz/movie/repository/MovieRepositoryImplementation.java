package com.xworkz.movie.repository;

public class MovieRepositoryImplementation implements MovieRepository{
	String[] movieRepository = new String[5];
	int index=0;
	@Override
	public boolean onSave(String movieName) {
		if(index<movieName.length()) {
			movieRepository[index]=movieName;
			index++;
			return true;
		}
		return false;
	}
	@Override
	public String[] read() {
		return movieRepository;
	}
	@Override
	public boolean update(String oldMovieName, String newMovieName) {
		for(int i=0; i<movieRepository.length; i++) {
			if(movieRepository[i].equalsIgnoreCase(oldMovieName)) {
				movieRepository[i]=newMovieName;
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean delete(String movieName) {
		if(movieRepository!=null) {
			for(int i=0; i<movieRepository.length; i++) {
				if(movieRepository[i].equalsIgnoreCase(movieName)) {
//					for(int j=i; j<movieRepository.length-1; j++) {
//						movieRepository[j]=movieRepository[j+1];
//					}
//					movieRepository[movieRepository.length-1]=null;
//					index-=1;
					movieRepository[i]=null;
					return true;
				}
			}
			
		}
		return false;
	}

}


