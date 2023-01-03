import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


// file object: reading and writing data
        File f = new File();
// color object: makes the terminal beautiful
        Color color = new Color();
//drone class:drone control simulation
        Drone drone = new Drone();
// Ground station takes picture and finds data
        GroundStation groundStation = new GroundStation();
//reading inputs from user
        Scanner myInput = new Scanner(System.in);
        boolean n = true;
        while (n) {
            System.out.println(color.getTEXT_CYAN() + "-------------------------------------" + color.getTEXT_RESET());
            System.out.println(color.getBg_white() + color.getTEXT_BLACK() + " Enter a command: " + color.TEXT_RESET);
            String command = myInput.next().toLowerCase();

            switch (command) {
                case "t":
                    drone.takeOf();
                    break;
                case "i":
                    drone.moveUp();
                    break;
                case "m":
                    drone.moveDown();
                    break;
                case "f":
                    drone.moveRight();
                    break;
                case "s":
                    drone.moveLeft();
                    break;
                case "e":
                    drone.moveForward();
                    break;
                case "c":
                    drone.moveBackward();
                    break;
                case "l":
                    drone.rotateRight();
                    break;
                case "j":
                    drone.rotateLeft();
                    break;
                case "q":
                    drone.land();
                    break;
                case "0":
                    drone.showData();
                    n = false;
                    break;
                case "1":
                    drone.showData();
                    break;

                case "2":

//                    drone.takePicture();
                    f.readData();
                    break;
                case "3":
                    groundStation.takePicture();
                    break;
                case "4":
                    groundStation.findPicture();
                    break;
                default:
                    System.out.println(color.getTEXT_RED() + "Wring command! Enter your command again." + color.getTEXT_RESET());
            }

        }
    }
}