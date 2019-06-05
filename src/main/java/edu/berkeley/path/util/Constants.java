package edu.berkeley.path.util;

import edu.berkeley.path.settings.Configuration;

import java.io.File;

public class Constants {

    public static final String SEND_ACTIVEMQ_W_QUEUE = "activemqHub:queue:%s";

    public static String Construct_A_File_Name(String subFolder, String name, String option){

        String folder ="file://"+new File("").getAbsolutePath()+subFolder;

        String fileName=folder+"?fileName="+name+".json&fileExist="+option;
        return fileName;
    }

    public static String Construct_A_File_Name_FullPath(String fullPath, String subFolder,String name, String option){

        String folder ="file://"+fullPath+subFolder;

        String fileName=folder+"?fileName="+name+".json&fileExist="+option;
        return fileName;
    }
}
