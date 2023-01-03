import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

//import java.io.File;
public class File {
//    public File(String path) {
//        try {
//            java.io.File f = new java.io.File(path);
//            if (!f.createNewFile()) {
//                System.out.println("file exists");
//            }
//        } catch (IOException e) {
//            System.out.println("something went wrong");
//        }
//    }

    public void writeData(String filePath, String content) {
        try {
            java.io.File file = new java.io.File(filePath);
            //if file doesn't exist, then create it
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New File Created Now");
            }

            //true = append file
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write(content);
            bufferWriter.close();
            fileWriter.close();

            System.out.println("Done");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readData() throws FileNotFoundException {
        java.io.File f = new java.io.File("data.txt");//this is our file
        Scanner file = new Scanner(f);
        LinkedList<String[]> data = new LinkedList<String[]>();
        String[][] myArray = new String[10][10];
        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] row = line.split(" ");
            data.add(row);
        }
        for(int i=0; i<data.size(); i++){
            String[] array=data.get(i);
            for (int j=0; j<array.length; j++){
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}