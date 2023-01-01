import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        File f = new File();
        Color color=new Color();
        Drone drone = new Drone();
        Scanner myInput = new Scanner(System.in);
        boolean n = true;
        while (n) {
            System.out.println(color.getTEXT_BLACK() + "-------------------------------------" + color.getTEXT_RESET());
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
                    drone.takePicture();
                    f.writeData("data.txt","\n");
                    break;
            }

        }
    }
}