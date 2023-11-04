package au.com.project.setup.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFiles {

    public String createFile(String fileName, String fileType) throws IOException {
        try {
            File myFile = new File("C:\\Users\\Hayden\\IdeaProjects\\setting-up-projects-easily\\src\\main\\java\\au\\com\\project\\setup\\models\\" + fileName + "." + fileType);
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());

                FileWriter write = new FileWriter(fileName + "." + fileType);


            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Error has occurred");
            e.printStackTrace();
        }
        return fileName;
    }
}