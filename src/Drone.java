import java.util.Random;

public class Drone extends File {
    private int forward, backward, right, left, top, bottom, lRotate, rRotate = 0;
    private int x, y, z, degree = 0;
    private boolean isTakeOf = false;
    private int counter = 0;


    Random rand = new Random();
    Color color=new Color();


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
            System.out.println(color.getTEXT_GREEN()+ "Take Of successful" + color.getTEXT_RESET());
        } else {
            this.counter += 1;
            if (counter <= 3) {
                System.out.println(color.getTEXT_RED()+ "you are already in the air!" + color.getTEXT_RESET());
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
            System.out.println(color.getTEXT_GREEN()+ "Drone landed!" + color.getTEXT_RESET());


        } else {
            System.out.println(color.getTEXT_RED()+ "you are on the ground!" + color.getTEXT_RESET());
        }
    }

    public void moveForward() {
        if (this.getTakeOf()) {
            this.forward += 50;
            this.x += 50;
        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }


    public void moveBackward() {
        if (this.getTakeOf()) {
            this.backward += 50;
            this.x -= 50;
        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void moveRight() {
        if (this.getTakeOf()) {
            this.right += 50;
            this.y += 50;
        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void moveLeft() {
        if (this.getTakeOf()) {
            this.left += 50;
            this.y -= 50;
        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void moveUp() {
        if (this.getTakeOf()) {
            this.top += 50;
            this.y += 50;
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

            }

        } else {
            System.out.println(color.getTEXT_GREEN() + "you are on the ground" + color.getTEXT_RESET());
        }

    }

    public void rotateRight() {

        if (this.getTakeOf()) {
            this.rRotate += 50;
            this.degree += 50;
        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void rotateLeft() {
        if (this.getTakeOf()) {
            this.lRotate += 50;
            this.degree -= 50;
        } else {
            System.out.println(color.getTEXT_RED() + "You need to take of first." + color.getTEXT_RESET());
        }
    }

    public void showData() {
        System.out.println(color.getTEXT_BLUE() + "top:" + top + "cm  " + "right:" + right + "cm  " + "forward:" + forward + "cm  " + "right rotate:" + rRotate + "cm  " + "\n" + "bottom:" + bottom + "cm  " + "left:" + left + "cm  " + "backward:" + backward + "cm  " + "left rotate:" + lRotate + "cm  " + "\n" + color.getTEXT_RESET());
    }
    public  void takePicture(){
        int[][] data=new int[10][10];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length;j++){
                int randomNum = rand.nextInt(256);
                data[i][j]=randomNum;
                this.writeData("data.txt", String.valueOf(data[i][j])+" ");
                System.out.print(data[i][j]+" ");
            }
            this.writeData("data.txt","\n");
        }

    }
}
