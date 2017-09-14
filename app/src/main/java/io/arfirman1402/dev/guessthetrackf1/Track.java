package io.arfirman1402.dev.guessthetrackf1;

/**
 * Created by alodokter-it on 14/09/17 -- Track.
 */

public class Track {
    private long id;
    private String circuit;
    private int map;
    private String type;
    private String direction;
    private String location;
    private String lengthUsed;
    private String grandPrix;
    private String season;
    private int grandPrixHeld;

    public Track(long id, String circuit, int map, String type, String direction, String location, String lengthUsed, String grandPrix, String season, int grandPrixHeld) {
        this.id = id;
        this.circuit = circuit;
        this.map = map;
        this.type = type;
        this.direction = direction;
        this.location = location;
        this.lengthUsed = lengthUsed;
        this.grandPrix = grandPrix;
        this.season = season;
        this.grandPrixHeld = grandPrixHeld;
    }

    public long getId() {
        return id;
    }

    public String getCircuit() {
        return circuit;
    }

    public int getMap() {
        return map;
    }

    public String getType() {
        return type;
    }

    public String getDirection() {
        return direction;
    }

    public String getLocation() {
        return location;
    }

    public String getLengthUsed() {
        return lengthUsed;
    }

    public String getGrandPrix() {
        return grandPrix;
    }

    public String getSeason() {
        return season;
    }

    public int getGrandPrixHeld() {
        return grandPrixHeld;
    }
}