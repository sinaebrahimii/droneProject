import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
}