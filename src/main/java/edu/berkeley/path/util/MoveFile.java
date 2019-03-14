package edu.berkeley.path.util;

import java.io.File;

public class MoveFile {

    public static boolean moveFileFromAToB(String fromFolder, String toFolder, String fileName){
        // This function is used to move file from fromFolder to toFolder


        File afileDir= new File(fromFolder);
        File afile = new File(afileDir,fileName);

        File bfileDir= new File(toFolder);
        File bfile = new File(bfileDir,fileName);

        if(afile.renameTo(bfile)){
            //System.out.println("File removed!");
            return true;
        }else{
            System.out.println("Fail to remove file:"+afile.getName());
            return false;
        }
    }
}
