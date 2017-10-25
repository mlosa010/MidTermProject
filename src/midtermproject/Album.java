/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.ArrayList;

/**
 *
 * @author losad_000
 */
public class Album implements Comparable<Album> {
    private String Artist;
    private String albumTitle;
    ArrayList<track>theTrack = new ArrayList<>();
    
    public Album(String Artist, String albumTitle, ArrayList<track>albumTrack){
        this.Artist=Artist;
        this.albumTitle=albumTitle;
        this.theTrack=albumTrack;
    }
    
    public Album(String Artist){
        this.Artist=Artist;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public ArrayList<track> getTheTrack() {
        return theTrack;
    }

    public void setTheTrack(ArrayList<track> theTrack) {
        this.theTrack = theTrack;
    }

    @Override
    public String toString() {
        return "Album{" + "Artist=" + Artist + ", albumTitle=" + albumTitle + ", theTrack=" + theTrack + '}';
    }

    @Override
    public int compareTo(Album o) {
       // Album o = (Album) t;
        return albumTitle.compareToIgnoreCase(o.getAlbumTitle());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
