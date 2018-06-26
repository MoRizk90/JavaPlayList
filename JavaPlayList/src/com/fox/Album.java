package com.fox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    String albumName;
    LinkedList<Song> myAlbums = new LinkedList<Song> ();

    public Album(String albumName) {
        this.albumName = albumName;

    }

    public void addSong(Song theSong){
        myAlbums.add ( theSong );

    }

    public ArrayList<String> getSongDuration(){
        Iterator songIterator = myAlbums.iterator ();
        ArrayList<String> theListName = new ArrayList<String> (  );
        while (songIterator.hasNext()){
            Song item = (Song) songIterator.next ();
            theListName.add ( item.getTitle ());

        }

        return theListName;
    }

    public ArrayList<String> getSongDetails(){
        Iterator songIterator = myAlbums.iterator ();
        ArrayList<String> theListName = new ArrayList<String> (  );
        while (songIterator.hasNext()){
            Song item = (Song) songIterator.next ();
            theListName.add (item.getTitle ());
            theListName.add (item.songPeriod());

        }

        return theListName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void findSong(){


    }
}
