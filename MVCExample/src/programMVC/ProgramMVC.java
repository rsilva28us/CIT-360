/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programMVC;

/**
 *
 * @author ronsilva
 */
import model.*;
import view.*;
import control.*;

public class ProgramMVC {

    public static void main(String[] args) {

        ListItem model = showMovie();

        ListView view = new ListView();

        MoviesControl control = new MoviesControl(model, view);

        control.updateView();

        control.setMovieName("Iron Man");
        
        control.setMoviesYear("2008");

        control.updateView();
    }

    private static ListItem showMovie() {
        ListItem listItem = new ListItem();
        listItem.setName("Iron Man 2");
        listItem.setYear("2010");
        return listItem;

    }
}
