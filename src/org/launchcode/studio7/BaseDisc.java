package org.launchcode.studio7;

public abstract class BaseDisc {
    private String title;
    protected boolean loaded;

    public BaseDisc(String title) {
        this.title = title;
        this.loaded = false;
    }

    public abstract void spinDisc();
    public abstract void stopDisc();
    public abstract String displayName();

    public String getTitle() {
        return title;
    }

    public boolean isLoaded() {
        return loaded;
    }
}
