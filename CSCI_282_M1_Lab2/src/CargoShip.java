/*
 * This is the CargoShip subclass of the class Ship
 * Lab 2 Jayden LaCombe and Tyler Vincent
 * 9-05-2022
 */

public class CargoShip extends Ship {

    private int maxCargoTonnage;
    private int refrigeratedStorage;

    public CargoShip(int mct, int rs, String nam, String nat,
                     int yer, int len, int dra, int bem)
    {

        super(nam, nat, yer, len, dra, bem);
        maxCargoTonnage = mct;
        refrigeratedStorage = rs;

    }

    public int getMaxCargoTonnage() {
        return maxCargoTonnage;
    }

    public int getRefrigeratedStorage() {
        return refrigeratedStorage;
    }

    public String toString() {

        String cargoInfo = super.toString() +
                "Max Cargo in Tonnage: " + maxCargoTonnage + " Tons" +
                ", Refrigerated Storage: " +
                refrigeratedStorage + " Cubic Feet";

        return cargoInfo;

    }
    //public static void main(String[] args) {
    //
    //    CargoShip myCargo1 = new CargoShip(202, 200, "free", "china", 2002, 150, 130, 270);
    //
    //    System.out.println(myCargo1);

   // }
}
