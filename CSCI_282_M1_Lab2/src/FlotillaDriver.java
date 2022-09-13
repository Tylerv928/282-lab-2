import javax.swing.*;
import java.util.*;
import java.io.*;



public class FlotillaDriver {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\tyler\\IdeaProjects\\CSCI_282_M1_Lab2\\src\\flotilla_data.csv");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        //Need help getting this to show the full array of info from the flotillla excel sheet in a Joption pane

        JOptionPane.showMessageDialog(null, sc.hasNext(), "flotilla data");

    }

}
