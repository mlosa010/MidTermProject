/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

/**
 *
 * @author losad_000
 */
public class track implements Comparable <track>{
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public track(String song) {
        this.song = song;
    }
    public track()
    {
    
    }

    @Override
    public String toString() {
        return "track{" + "song=" + song + '}';
    }

    @Override
    public int compareTo(track t) {
    return song.compareToIgnoreCase(t.getSong());
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
