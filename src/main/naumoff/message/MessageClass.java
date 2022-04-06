package main.naumoff.message;

import main.naumoff.bot.BotMethods;

import java.util.Scanner;

public class MessageClass extends MessageConstants{

    BotMethods botMethods = new BotMethods();


    Scanner scanner = new Scanner(System.in);
    public void getMessageForStart(){
        System.out.println(MESSAGE_START);
    }




    public boolean printUserMessage(){

        String userMessage = scanner.nextLine();
        boolean resultMessage  = userMessage.equals(MESSAGE_FOR_START);
        return resultMessage;
    }

    public void resultMessageForPersone(){
        if(printUserMessage()){
            System.out.println(MESSAGE_OK);
            try{


                Thread.sleep(1000);
                System.out.println(MESSAGE_FILE_NAME);
                String fileName = scanner.nextLine();
                System.out.println(MESSAGE_FILE_TEXT);
                String filetext = scanner.nextLine();

                botMethods.createFile(fileName, filetext);



            }catch (Exception e){
                System.out.println(e);
            }

        }
        else{
            System.out.println(MESSAGE_ERROR);
        }

    }




}
