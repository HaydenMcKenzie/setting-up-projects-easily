package au.com.project.setup;

import au.com.project.setup.models.MakeFiles;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println( "Enter Name" );
        String fileName = s.nextLine();
        System.out.println( "Enter type" );
        String fileType = s.nextLine();

        MakeFiles makeFiles = new MakeFiles();
        String result = makeFiles.createFile(fileName, fileType);
    }
}
