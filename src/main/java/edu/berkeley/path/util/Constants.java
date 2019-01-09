package edu.berkeley.path.util;

public class Constants {

    public static final String SEND_ACTIVEMQ_W_QUEUE = "activemqHub:queue:%s";

    public static String Construct_A_File_Name(String folder, String name, String option){

        String fileName=folder+"?fileName="+name+".json&fileExist="+option;
        return fileName;
    }

}
