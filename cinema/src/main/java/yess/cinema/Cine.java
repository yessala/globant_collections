package yess.cinema;

import yess.cinema.servicio.MovieService;

public class Cine {

    public static void main(String[] args) {
    	
    	MovieService movServ = new MovieService();
    	
    	movServ.setMovie();
    	movServ.showMovieLong();
    
    }
}
