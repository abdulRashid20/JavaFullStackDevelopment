package consuleaApp;

import java.io.File;
import java.io.IOException;

public class FileHandler {
	public FileHandler() {
		
	}
	
	public String[] listFiles() {
	      //Creating a File object for directory
	      File dirPath = new File("files");
	      //List of all files and directories
	      String dirContents[] = dirPath.list();
	      return dirContents;
	   }
	
	public short numOfFiles = (short) listFiles().length;
	
	
	public byte deleteFile(String fileToDelete) {
	    byte status = 0;
		try {
			String fullFilePath = "files\\"+fileToDelete;
			File deleteFile = new File(fullFilePath);
			if (deleteFile.exists()) {
				System.out.print("Deleting "+deleteFile.getName());
				for (byte i=0; i<5; i++) {
					System.out.print(".");
					Thread.sleep(200);	
				}
				System.out.print("OK!");
				deleteFile.delete();
				status = 1;
			}else {
				System.out.println("File not found");
				status=0;
			}
		}
		catch(Exception e) {
			System.out.println("Please check your file name again. Thank you");
			status = 0;	
			e.printStackTrace();
		}
		return status;
	}
	
	
	public byte addFile(String fileToAdd) throws IOException {
		byte status = 0;
		String fullFilePath = "files\\"+fileToAdd;
		File newfile = new File(fullFilePath);
		if (newfile.exists()) {
			System.out.println("A file with this name exists");
		}else {
			System.out.print("Adding file");
			if (newfile.createNewFile()) {
				for (byte i=0; i<5; i++) {
					System.out.print(".");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
				System.out.print("OK!");
				System.out.println("\nFile added successfully\n");
				status = 1;
			}else {
				System.out.println("File could not be added to directory");
			}
		}
		return status;
		
	}
	
	public byte searchFile(String fileToSearch) throws IOException {
		byte status = 0;
		String fullFilePath = "files\\"+fileToSearch;
		File newfile = new File(fullFilePath);
		if (newfile.exists()) {
			System.out.println("File found");
			System.out.println("File Name: "+newfile.getName());
			System.out.println("File Path: "+newfile.getAbsolutePath());
			status = 1;
		}else {
			System.out.println("File Not Found");
		}
			return status;
		}

		
}

