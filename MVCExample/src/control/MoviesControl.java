/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.*;
import view.*;

/**
 *      
 * @author ronsilva
 */

public class MoviesControl {
    private ListItem model;
    private ListView view;
    
    public MoviesControl (ListItem model, ListView view){
    
        this.model = model;
        this.view = view;
    }

    public void setMovieName(String name){
        model.setName(name);
    }
    
    public String getMovieName(){
        return model.getName();
    }
    
    public void setMoviesYear(String year){
        model.setYear(year);
    }
            
    public String getMovieYear(){
        return model.getYear();
    }
    
    public void updateView(){
        view.printMarvelMovies (model.getName(), model.getYear());
    
}
}
