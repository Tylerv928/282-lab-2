/*
 * This is the Yacht subclass of the class Ship
 * Lab 2 Jayden LaCombe and Tyler Vincent
 * 9-05-2022
 */

public class Yacht extends Ship {

    private int numStateRooms;
    private double poolSize;
    private int numDecks;
    private int power;

    public Yacht(int nsr, double pSiz, int numDec, int pow, String nam,
                 String nat, int yer, int len, int dra,
                 int bem)
    {

        super(nam, nat, yer, len, dra, bem);
        numStateRooms = nsr;
        poolSize = pSiz;
        numDecks = numDec;
        power = pow;

    }

    public int getNumStateRooms() {
        return numStateRooms;
    }

    public double getPoolSize() {
        return poolSize;
    }

    public int getNumDecks() {
        return numDecks;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {

        String yachtInfo = super.toString() +
                           "Number of State Rooms: " + numStateRooms +
                           ", Pool Size: " +
                           poolSize + ", Number of Decks: " + numDecks +
                           ", Size of Engine: " +
                           power;
        return yachtInfo;

    }

//    public static void main(String[] args) {
//
//        Yacht myYacht1 = new Yacht(23,2.1,392,94,"BigAssShip", "USA", 1982,
//                                   2000, 89, 46);
//        System.out.println(myYacht1);
//
//    }
}
