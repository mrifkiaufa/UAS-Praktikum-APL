package Anime;

/**
 * Class DragonBallStrategy
 * Mengimplementasikan class AnimeStrategy
 * Berisi anime Dragon Ball
 */
public class DragonBallStrategy implements AnimeStrategy {
    /**
     * Menset nama anime
     */
    private String name = "Dragon Ball";

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
