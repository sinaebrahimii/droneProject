import java.io.FileNotFoundException;
import java.util.LinkedList;

public class GroundStation extends Drone {
    Color color=new Color();
    public void takePicture() {
        int[][] data = new int[10][10];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int randomNum = rand.nextInt(256);
                data[i][j] = randomNum;
                this.writeData("data.txt", String.valueOf(data[i][j]) + " ");
                System.out.print(data[i][j] + " ");
            }
            this.writeData("data.txt", "\n");

        }
        this.writeData("data.txt", "\n");

    }

    public void findPicture() throws FileNotFoundException {
        LinkedList<String[]> data = this.readData();
        boolean isFound = false;
        for (int i = 0; i < data.size(); i++) {
            String[] array = data.get(i);
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals("117") & ((j + 1) < 10)) {
                    if (array[j + 1].equals("224") & i + 1 < data.size()) {
                        String[] array2 = data.get(i + 1);
                        if (array2[j].equals("147") & array2[j + 1].equals("63")) {
                            System.out.println(color.getTEXT_GREEN()+"found!! row number: " + i + "," + (i + 1) + " column number: " + j + "," + (j + 1)+color.getTEXT_RESET());
                            isFound = true;

                        }
                    }

                }
            }


        }
        if (!isFound) {
            System.out.println(color.getTEXT_RED()+"didn't find"+color.getTEXT_RESET());
        }
    }

    public void getLocation(double x,double y,double z) {

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        System.out.println("live location(x,y,z) : " + "(" + x + "," + y + "," + z + ")");
        System.out.println("distance from take off zone: " + distance + " cm");

    }
}
