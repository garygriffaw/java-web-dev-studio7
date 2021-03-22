package org.launchcode.studio7;

public class CD extends AudioDisc implements OpticalDisc {

    public CD(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void loadDisc() {
        loaded = true;
        System.out.println("CD " + displayName() + " loaded.");
    }

    @Override
    public void ejectDisc() {
        loaded = false;
        System.out.println("CD " + displayName() + " ejected.");
    }

    @Override
    public void spinDisc() {
        if (isLoaded())
            System.out.println("CD " + displayName() + " started spinning at a rate of 200 - 500 rpm.");
        else
            System.out.println("CD " + displayName() + " can not be spun because it is not loaded.");
    }

    @Override
    public void stopDisc() {
        if (isLoaded())
            System.out.println("CD " + displayName() + " stopped spinning.");
        else
            System.out.println("CD " + displayName() + " can not be stopped because it is not loaded.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
