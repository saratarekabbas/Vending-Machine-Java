/*
A Java Class to get data from the file
 */
package VMPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class FileHandler {

//    Method to read file
    public static ArrayList<String> readFile(String filename) {
        
        ArrayList<String> fileList = new ArrayList<String>();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNext()) {
                fileList.add(myReader.next());
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            for (int i = 0; i < 15; i++) {
                fileList.add("0");
            }
        }
        return (fileList);
    }
    
     public static void reduce(String filename, String lineToModify, int reduceBy) {
         try {
                    File originalFile = new File(filename);
                    BufferedReader br = new BufferedReader(new FileReader(originalFile));

                    // Construct the new file that will later be renamed to the original
                    // filename.
                    File tempFile = new File("tempfile.txt");
                    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

                    String line = null;
                    // Read from the original file and write to the new
                    // unless content matches data to be removed
                    while ((line = br.readLine()) != null) {
                        if (line.contains(lineToModify)) {
                            String strCurrentStock = line.substring(line.lastIndexOf(" "), line.length());
                            if (strCurrentStock != null || !strCurrentStock.trim().isEmpty()) {
                                int newStock = Integer.parseInt(strCurrentStock.trim()) - reduceBy;
                                System.out.println("new stock : " + newStock);
                                line = line.substring(0, line.lastIndexOf(" ")) + " " + newStock;
                            }
                        }
                        pw.println(line);
                        pw.flush();
                    }
                    pw.close();
                    br.close();
                    // Delete the original file
                    if (!originalFile.delete()) {
                        System.out.println("Could not delete file");
                        return;
                    }
                    // Rename the new file to the filename the original file had.
                    if (!tempFile.renameTo(originalFile)) {
                        System.out.println("Could not rename file");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
    }
    
}
