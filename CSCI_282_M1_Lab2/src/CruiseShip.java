/*
 * This is the CruiseShip subclass of the class Ship
 * Lab 2 Jayden LaCombe and Tyler Vincent
 * 9-05-2022
 */

public class CruiseShip extends Ship {

    private int numExecRooms;
    private int numDoubleBunks;
    private int numQuadBunks;

    public CruiseShip(int ner, int ndb, int nqb, String nam, String nat,
                      int yer, int len, int dra, int bem)
    {

        super(nam, nat, yer, len, dra, bem);
        numExecRooms = ner;
        numDoubleBunks = ndb;
        numQuadBunks = nqb;

    }

    public int getNumExecRooms() {
        return numExecRooms;
    }

    public int getNumDoubleBunks() {
        return numDoubleBunks;
    }

    public int getNumQuadBunks() {
        return numQuadBunks;
    }

    String cruiseShipInfo = super.toString() + ", Number of Executive Rooms: " + numExecRooms + ", Number of";

}
