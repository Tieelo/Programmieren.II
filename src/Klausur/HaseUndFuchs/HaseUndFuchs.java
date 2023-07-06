package Klausur.HaseUndFuchs;

import designPatterns.observer.uebung.pinguin.Forscher;

public class HaseUndFuchs {
    public static void main(String[] args) {
        Hase hase = new Hase();

        Fuchs fuchs = new Fuchs(hase, "fuchs");

        hase.setAction("fressen");
        System.out.println("");
        hase.setAction("schlafen");
        System.out.println("");
        hase.setAction("bewegen");
    }
}
