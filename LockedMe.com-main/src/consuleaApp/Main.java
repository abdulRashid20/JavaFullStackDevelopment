package consuleaApp;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
				while(true) {
					Scanner sc;
					try {
						sc = new Scanner(System.in);
						Navigation n = new Navigation();
						n.WelcomeMsg();
						n.displayMainMenu();
						System.out.print("Please chose an option to navigate the application: ");
						Byte num = sc.nextByte();  //Byte reserves smaller memory for variable
						if (num == 1) {
							System.out.println("");
							 if (n.numOfFiles > 0) {
								System.out.println("There are "+n.numOfFiles+" files in the directory");
								System.out.println("------------------------------------------------------");
								System.out.println("Find files listed below in ascending order");
								System.out.println("------------------------------------------------------");
								System.out.println("");
								n.displayFiles();
								
							 }
							 else {
								    System.out.println("");
								 	System.out.println("There are no files in the directory");
									System.out.println("------------------------------------");
									System.out.println("");
							 }
						}
						else if (num == 2) {
							byte tab = 0;
							while(true) {
								n.displayBusinessOpsMenu();
								System.out.println("Please enter number that corresponds to option of choice ");
								System.out.println("or enter 9 to return to previous prompt: ");
								byte input = sc.nextByte();
								if (input == 1) {
									byte count = 0;
									while(true) {
										if (count == 0) {
											System.out.println("");
											System.out.println("To add a file, enter file name with it's extension ");
											System.out.println("or enter 9 to return to previous prompt: ");
										}else {
											System.out.print("Add another file: ");
										}
									String addFile = sc.next().trim();
									if (!addFile.equals("9") && n.addFile(addFile) == 1){
										count++;
									}
									else{
										break;
									}
								  }
								}
								else if(input == 2) {
									byte searchCount = 0;
									while(true) {
										if (searchCount == 0) {
										System.out.println("Enter filename to search ");
										System.out.println("or enter 9 to return to previous prompt: ");
										}else {
										System.out.println("\nSearch for another file ");
										System.out.println("or enter 9 to return to previous prompt: ");
										}
										String fileSearch = sc.next().trim();  //remove leading and trailing spaces
										if (!fileSearch.equals("9") && n.searchFile(fileSearch) == 1){
											searchCount++;
										}else{
											break;
										}
									}
								}
								else if(input == 3) {
									if (tab == 0) {
										System.out.println("");
										System.out.println("To delete a file, enter name ");
										System.out.println("or enter 9 to return to previous prompt: ");
									}else {
										System.out.println("Delete another file: ");
										System.out.println("or enter 9 to return to previous prompt: ");
									}
									String delFile = sc.next().trim();
									if(n.deleteFile(delFile) == 1) {
										tab++;
									}else if(delFile.equals("9")) {
										break;
									}
								      }
								else if(input == 9) {
									break;
									}
								}
							}
								
						else if(num == 3) {
							System.out.println("");
							System.out.println("-----------");
							System.out.print("Closing app");
							for (byte i=0; i<7; i++) {
								System.out.print(".");
								Thread.sleep(50);
							}
							System.out.print("OK!");
							System.exit(0);
						}
				
				
			}catch(Exception e) {
				System.out.println("Please put in a valid integer");
				continue;
			}
				}
		}	
}

