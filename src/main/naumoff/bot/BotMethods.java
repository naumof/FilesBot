package main.naumoff.bot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BotMethods  {


    public void createFile(String fileName, String fileText) throws IOException {

        File file =  new File(fileName);
        if(!file.exists()){

            file.createNewFile();

            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(fileText);

            fileWriter.flush();

            fileWriter.close();

        }

    }


}
