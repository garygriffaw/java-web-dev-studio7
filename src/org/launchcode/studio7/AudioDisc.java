package org.launchcode.studio7;

public abstract class AudioDisc extends BaseDisc {
    private String artist;

    public AudioDisc(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    @Override
    public String displayName() {
        return artist + ": " + getTitle();
    }

    public String getArtist() {
        return artist;
    }
}
