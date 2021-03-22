package org.launchcode.studio7;

public class DVD extends VideoDisc implements OpticalDisc {

    public DVD(String title, String genre) {
        super(title, genre);
    }

    @Override
    public void loadDisc() {
        loaded = true;
        System.out.println("DVD " + displayName() + " loaded.");
    }

    @Override
    public void ejectDisc() {
        loaded = false;
        System.out.println("DVD " + displayName() + " ejected.");
    }

    @Override
    public void spinDisc() {
        if (isLoaded())
            System.out.println("DVD " + displayName() + " started spinning at a rate of 570 - 1600 rpm.");
        else
            System.out.println("DVD " + displayName() + " can not be spun because it is not loaded.");
    }

    @Override
    public void stopDisc() {
        if (isLoaded())
            System.out.println("DVD " + displayName() + " stopped spinning.");
        else
            System.out.println("DVD " + displayName() + " can not be ejected because it is not loaded.");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
