package Chapter12.Opg12_15;

/*
Program: Creates a textfile then write 120 random numbers to it and read the numbers again and sorting them then printing them.
Org.: Easj Næstved
Author: Johan Stenbøg
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class WriteReadData {
    public static void main(String[] args) throws IOException {
        //Making a new file
        File file = new File("Exercise12_15.txt");
        PrintWriter printWriter = null;
        //Making a new array on 120.
        int[] numbers = new int[120];
        //If file exists, delete the file and create a new 1.
        if (file.exists()) {
            file.delete();
            File file1 = new File("Exercise12_15.txt");
        }
        //Try to write data from for loop to the file.
        try {
            printWriter = new PrintWriter(new FileOutputStream(file));
            for (int i = 0; i < numbers.length; i++) {
                //Printing numbers from 0-10.
                numbers[i] = (int) (Math.random() * 10);
                printWriter.print(numbers[i] + " ");
            }
            //Catching IOExceptions if any occur.
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //Closes the file.
            if (printWriter != null) {
                printWriter.close();
            }
        }
        BufferedReader reader;

        //Creates a new arrayList to write the data from the file to.

        ArrayList<String> lines = new ArrayList<String>();

            reader = new BufferedReader(new FileReader("Exercise12_15.txt"));

            //Reading the numbers from the file and adding them to the newly created arraylist.

            String currentLine = reader.readLine();
            //As long as there is more lines in the array, keep adding them.
            while (currentLine != null) {
                lines.add(currentLine);

                currentLine = reader.readLine();
            }
            //Sorting the array.

            Collections.sort(lines);
            //Printing out the array.
            System.out.println(lines);







        }
    }

