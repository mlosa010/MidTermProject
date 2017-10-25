/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.Comparator;

/**
 *
 * @author losad_000
 */
public class sortArtist implements Comparator<Album> {

    @Override
    public int compare(Album t, Album t1) {
        return t.getArtist().compareTo(t1.getArtist());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
