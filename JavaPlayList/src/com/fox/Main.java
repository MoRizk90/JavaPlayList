package com.fox;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Song alibaba = new Song ( "Dary",0,5,23 );
        Song amrdiab = new Song ( "lilt nhary", 0, 3,27);
        Song hama2y = new Song ( "7ama2y", 0, 2,12);
        Song ehab2 = new Song ( "the white", 0, 5,12);
        Song lola = new Song ( "the mouse", 1, 2,12);
        Song zeko = new Song ( "keyboard", 0, 4,12);
        Song bobs = new Song ( "bobos", 0, 6,12);
        Song zenoa = new Song ( "zina", 0, 7,11);
        Song herculs = new Song ( "aaaa", 0, 2,12);

        Album foxAlbum = new Album ( "powerAlbum" );
        foxAlbum.addSong ( alibaba );
        foxAlbum.addSong ( amrdiab );
        foxAlbum.addSong ( hama2y );

        foxAlbum.printSongsAlbum ();
        Album MoAlbum = new Album ( "MoAlbum" );
        foxAlbum.addSong ( bobs );
        foxAlbum.addSong ( zenoa );
        foxAlbum.addSong ( herculs );

        Album zekoAlbum = new Album ( "zeko" );
        foxAlbum.addSong ( ehab2 );
        foxAlbum.addSong ( lola );
        foxAlbum.addSong ( zeko );

        ArrayList<Album> AlbumsList = new ArrayList<Album> (  );
        AlbumsList.add ( foxAlbum );
        AlbumsList.add ( MoAlbum );
        AlbumsList.add ( zekoAlbum );

        for (int i = 0 ; i < AlbumsList.size (); i++){
            System.out.println (AlbumsList.get ( i ).getAlbumName ());
        }

        findSong("Dary", AlbumsList);

    }


    public static void playList(ArrayList<Album> MyAlbums){
        Iterator<Album> albumIterator = MyAlbums.iterator ();
        LinkedList<Song> playList = new LinkedList<Song> (  );


    }
    public static void findSong(String songName, ArrayList<Album> theAlbumList){
        for(int songIndex = 0; songIndex < theAlbumList.size (); songIndex++){
            System.out.println ("find: " + theAlbumList.get ( songIndex ).printSongsAlbum ());
        }
    }


}

