package Anime;

/**
 * Class NarutoStrategy
 * Mengimplementasikan class AnimeStrategy
 * Berisi anime Naruto
 */
public class NarutoStrategy implements AnimeStrategy {
    /**
     * Menset nama anime
     */
    private String name = "Naruto";

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
