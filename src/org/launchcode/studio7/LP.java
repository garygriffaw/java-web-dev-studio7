package org.launchcode.studio7;

public class LP extends AudioDisc implements VinylDisc{

    public LP(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void putOnTurntable() {
        loaded = true;
        System.out.println("LP " + displayName() + " placed on turntable.");
    }

    @Override
    public void removeFromTurntable() {
        loaded = false;
        System.out.println("LP " + displayName() + " removed from turntable.");
    }

    @Override
    public void spinDisc() {
        if (isLoaded())
            System.out.println("LP " + displayName() + " started spinning at a rate of 33 1/3 rpm.");
        else
            System.out.println("LP " + displayName() + " can not be spun because it is not on the turntable.");
    }

    @Override
    public void stopDisc() {
        if (isLoaded())
            System.out.println("LP " + displayName() + " stopped spinning.");
        else
            System.out.println("LP " + displayName() + " can not be stopped because it is not on the turntable.");
    }
}
