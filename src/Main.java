import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String TEXT_PURPLE = "\u001B[35m";
        final String TEXT_RESET = "\u001B[0m";
        final String TEXT_CYAN = "\u001B[36m";
        final String redBG = "\u001B[41m";
        final String TEXT_BLACK = "\u001B[30m";
        final String whiteBG = "\u001B[47m";
        final String yellowBG = "\u001B[43m";


        File f = new File();
        Drone drone = new Drone();
        Scanner myInput = new Scanner(System.in);
        boolean n = true;
        while (n) {
            System.out.println(TEXT_CYAN + "-------------------------------------" + TEXT_RESET);
            System.out.println(whiteBG + TEXT_BLACK + " Enter a command: " + TEXT_RESET);
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
                    drone.takePicture();
                    f.writeData("data.txt","\n");
                    break;
            }

        }
    }
}