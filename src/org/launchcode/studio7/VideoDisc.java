package org.launchcode.studio7;

public abstract class VideoDisc extends BaseDisc {

    private String genre;

    @Override
    public String displayName() {
        return getTitle();
    }

    public VideoDisc(String title, String genre) {
        super(title);
        this.genre = genre;
    }
}
