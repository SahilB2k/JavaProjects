package filemanager;

import java.io.File;

public class FileApp implements UIEventHandler {
    FileManager fm;

    public FileApp() {
        this.fm = new FileManager();
    }

    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();
        ui.subscribe(new FileApp());
        ui.start();
    }

    @Override
    public void onList(String directoryPath) {
        File dir = new File(directoryPath);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                System.out.println("Files in directory:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    @Override
    public void onCreate(String directoryPath) {
        this.fm.createDirectory(directoryPath);  // Ensure FileManager has createDirectory()
    }

    @Override
    public void onDelete(String directoryPath) {
        this.fm.deleteDirectory(directoryPath);  // Ensure FileManager has deleteDirectory()
    }
}
