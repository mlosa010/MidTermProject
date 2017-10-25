package midtermproject;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author losad_000
 */
public class MidTermProject {  

    public ArrayList<track> hold = new ArrayList<>();
    public ArrayList<Album> allAlbums = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        MidTermProject thisProject = new MidTermProject();
        thisProject.searchFile();
        thisProject.sortByAlbumTitle();
    }

    public void searchFile() throws IOException {

        File text = new File("C:/Users/losad_000/Desktop/text.txt");
        Scanner inFile = new Scanner(text);
        String[] albumArray;
        do {
            String currentLine = inFile.nextLine();
            albumArray = currentLine.split(" ");
            for (int i = 2; i < albumArray.length; i++) {
                hold.add(new track(albumArray[i]));
            }
            Collections.sort(hold);
            Album currentAlbum = new Album(albumArray[0], albumArray[1], hold);
            allAlbums.add(currentAlbum);

            hold = new ArrayList<>();

        } while (inFile.hasNextLine());

    }

    public void sortByAlbumTitle() {
        Collections.sort(allAlbums);
        for (Album o : allAlbums) {
            System.out.println(o);
        }
    }
    public void display(){
        System.out.print("1-Search By Album Title");
        System.out.print("2-Search By Artist");
        System.out.print("3-add Catalog to list");
        System.out.print("4-Quit");
        
        int input =keyboard.nextInt();
        
        switch (input){
            case 1:
                sortByAlbumTitle();
                break;
            case 2:
                ArrayList<Album>caseTwoPrint = new ArrayList<>();
                System.out.print("what artist would you like to search for");
                String artistName = keyboard.next();
                Collections.sort(allAlbums, new sortArtist());
                int indexFound =Collections.binarySearch(allAlbums,new Album(artistName),new sortArtist());
                System.out.print(indexFound);
                
                /*
                So because we have already sorted the array list of albums alphabetically by artists once we find an 
                index that matches with the user input for the artist being looked for all we have to do is look
                to the right and left of that index and see if the objects next to that position also match the artists name
                
                */
                for(int i=0;i<allAlbums.size()-1;i++){
                    boolean artistForwardMatch = allAlbums.get(indexFound).equals(allAlbums.get(indexFound+i));
                    if(artistForwardMatch){
                        caseTwoPrint.add(allAlbums.get(indexFound+i));
                    }else
                        break;
                }
                for(int i=0;i<allAlbums.size()-1;i++){
                    boolean artistMatch = allAlbums.get(indexFound).equals(allAlbums.get(indexFound+i));
                    if(artistMatch){
                        caseTwoPrint.add(allAlbums.get(indexFound+i));
                    }else
                        break;
                }
        }
        
         
    }
}
