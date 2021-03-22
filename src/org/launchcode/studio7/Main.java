package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Abbey Road", "The Beatles");

        DVD myDvd = new DVD("Survivor Season 1", "Reality");

        LP myLp = new LP("Dark Side of the Moon", "Pink Floyd");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.loadDisc();
        myCd.spinDisc();
        myCd.stopDisc();
        myCd.ejectDisc();

        myDvd.loadDisc();
        myDvd.spinDisc();
        myDvd.stopDisc();
        myDvd.ejectDisc();

        myLp.putOnTurntable();
        myLp.spinDisc();
        myLp.stopDisc();
        myLp.removeFromTurntable();
    }
}
