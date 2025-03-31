package filemanager;
import java.io.File;

import com.sun.security.jgss.GSSUtil;

public class FileManager {
    public void listFiles(String directoryPath){
        File directory = new File(directoryPath);
        if(directory.exists() && directory.isDirectory()){
            File[] contents=directory.listFiles();

            if(contents!=null){
                for(File file:contents){
                    if(file.isDirectory()){
                        System.out.println("[DIR:"+file.getName());
                    }else{
                        System.out.println("[FILE]:"+file.getName());
                    }
                }

            }else{
                System.out.println("Directory is empty.");
            }



        }else {
            System.out.println("Invalid directory!");
        }

    }

    public void createDirectory(String directoryPath){
        File directory=new File(directoryPath);
        if(directory.mkdir()){
            System.out.println("Succesfully created directory");
        }else{
            System.out.println("Failed to create directory");
        }

    }

    public void deleteDirectory(String directoryPath){
        File file=new File(directoryPath);
        if(file.delete()){
            System.out.println("Successfully deleted the File");
        }else{
            System.out.println("Failed to Delete");
        }
    }
}
