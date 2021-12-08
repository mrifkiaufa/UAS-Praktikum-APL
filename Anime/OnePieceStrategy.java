package Anime;

/**
 * Class OnePieceStrategy
 * Mengimplementasikan class AnimeStrategy
 * Berisi anime One Piece
 */
public class OnePieceStrategy implements AnimeStrategy{
    /**
     * Menset nama anime
     */
    private String name = "One Piece";

    @Override
    public void watch(boolean start) {
        if(start) {
            System.out.println(">>>Memutar anime "+ this.name +"<<<");
        } else {
            System.out.println("<<<Anime "+ this.name +" selesai>>>");
        }
    }

    @Override
    public String getName() {
        // Mengembalikan atribut name
        return this.name;
    }
}
