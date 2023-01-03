import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Drone extends File {
    private int forward, backward, right, left, top, bottom, lRotate, rRotate = 0;
    private int x, y, z, degree = 0;
    private boolean isTakeOf = false;
    private int counter = 0;

    //creating random number
    Random rand = new Random();
    //this class colorizes the terminal

    Color color = new Color();


    public void printRed() {
        System.out.println(color.getTEXT_RED() + "this text is going to be RED" + color.getTEXT_RESET());
    }

    public void setTakeOf(boolean takeOf) {
        isTakeOf = takeOf;
    }

    public boolean getTakeOf() {
        return isTakeOf;
    }


    //x:backward-forward y:left-right z:top-bottom
    public void takeOf() {
// checks for take of:if we are already in the air notify us.
        if (!this.getTakeOf()) {
            this.top += 150;
            this.z += 150;
            setTakeOf(true);
            this.counter = 0;
            System.out.println(color.getTEXT_GREEN() + "Take Of successful" + color.getTEXT_RESET());
        } else {
            this.counter += 1;
            if (counter <= 3) {
                System.out.println(color.getTEXT_RED() + "you are already in the air!" + color.getTEXT_RESET());
            } else {
                System.out.println("oskoli?");
            }
        }
    }

    public void land() {
//  iff take of is true,then the drone can land
        if (this.getTakeOf()) {
            this.bottom += this.z;
            this.z = 0;
            this.isTakeOf = false;
            System.out.println(color.getTEXT_GREEN() + "Drone landed!" + color.getTEXT_RESET());


        } else {
            System.out.println(color.getTEXT_RED() + "you are on the ground!" + color.getTEXT_RESET());
        }
    }

    public void moveForward() {
        if (this.getTakeOf()) {
            this.forward += 50;
            this.x += 50;
            System.out.println(color.getTEXT_GREEN() + "moved forward " + color.getTEXT_RESET());
        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }


    public void moveBackward() {
        if (this.getTakeOf()) {
            this.backward += 50;
            this.x -= 50;
            System.out.println(color.getTEXT_GREEN() + "moved backward " + color.getTEXT_RESET());

        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void moveRight() {
        if (this.getTakeOf()) {
            this.right += 50;
            this.y += 50;
            System.out.println(color.getTEXT_GREEN() + "moved right " + color.getTEXT_RESET());

        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void moveLeft() {
        if (this.getTakeOf()) {
            this.left += 50;
            this.y -= 50;
            System.out.println(color.getTEXT_GREEN() + "moved left " + color.getTEXT_RESET());

        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void moveUp() {
        if (this.getTakeOf()) {
            this.top += 50;
            this.z += 50;
            System.out.println(color.getTEXT_GREEN() + "moved up " + color.getTEXT_RESET());

        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void moveDown() {

        if (this.getTakeOf()) {
            if (z == 50) {
                this.bottom += 50;
                this.z -= 50;
                this.setTakeOf(false);
                System.out.println(color.getTEXT_RED() + "You are too close to the ground.\nThe drone has landed please take of again" + color.getTEXT_RESET());


            } else if (z > 50) {
                this.bottom += 50;
                this.z -= 50;
                System.out.println(color.getTEXT_GREEN() + "moved down" + color.getTEXT_RESET());


            }

        } else {
            System.out.println(color.getTEXT_GREEN() + "you are on the ground" + color.getTEXT_RESET());
        }

    }

    public void rotateRight() {

        if (this.getTakeOf()) {
            this.rRotate += 50;
            this.degree += 50;
            System.out.println(color.getTEXT_GREEN() + "rotated right " + color.getTEXT_RESET());

        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void rotateLeft() {
        if (this.getTakeOf()) {
            this.lRotate += 50;
            this.degree -= 50;
            System.out.println(color.getTEXT_GREEN() + "rotated left " + color.getTEXT_RESET());

        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void showData() {
        System.out.println(color.getTEXT_BLUE() + "top:" + top + "cm  " + "right:" + right + "cm  " + "forward:" + forward + "cm  " + "right rotate:" + rRotate + "cm  " + "\n" + "bottom:" + bottom + "cm  " + "left:" + left + "cm  " + "backward:" + backward + "cm  " + "left rotate:" + lRotate + "cm  " + "\n" + color.getTEXT_RESET());
    }




}
