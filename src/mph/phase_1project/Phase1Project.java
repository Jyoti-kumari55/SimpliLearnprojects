package mph.phase_1project;
//Simplilearn project of Phase 1:


	import java.io.File;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
	public class Phase1Project {
	
	
		public static void main(String[] args) throws IOException  {
			System.out.println("********WELCOME TO LOCKEDME PROJECT********");
			System.out.println("************JYOTI KUMARI**********");
			int Operation = 0;
			Scanner sc = new Scanner(System.in);
			 String path="C:\\ProjectFile\\";
			while (true) {
				
				System.out.println("Select the below options:-\n"+"1. To display all the files in the folder \n"
				+"2. Create and add new file to the folder\n"+ "3. Delete file from the folder\n"+"4. Search file in the folder\n"
						+"5. Go to main menu\n"+"6. Exit from the app");
				 Operation = sc.nextInt();
				
				 switch(Operation) {
				case 1:
				     File f=new File(path);
				      File filename[]=f.listFiles();
				       for(File ff:filename) { 
					   System.out.println(ff.getName());
					
				}
				       break;
				
			 case 2:
	         Scanner s1 = new Scanner(System.in);
	     	
				ArrayList<String> al=new ArrayList<>();
				while(true) {
				System.out.println("Enter the filename to create into the Folder:");
				String File=s1.next();
				String finalname=path+File;
				System.out.println(finalname);
				
				File f1=new File(finalname);
			boolean b=f1.createNewFile();
			if(b!=true) {
				System.out.println(" File is not created");
			}
			else {
				al.add(File);
				System.out.println("File created ->"+File);
				break;
			}

			System.out.println("Collection of files is "+ al);
			
			}
				break;
				case 3:
				{
					Scanner s2=new Scanner(System.in);
					System.out.println("Enter the file name to be deleted from the Folder:");
					String filname=sc.next();
					String finalfile=path+filname;
				try {

					File file=new File(finalfile);
					
					if(file.delete())
					{System.out.println("File deleted ->"+filname);
					
					}
					else {
						System.out.println("Deletion failed:");
					}
				}  
				catch(Exception e)  
				{  
				e.printStackTrace();  
				}  
				
					break;}
			
				 case 4 :{
					  
						File f1=new File(path);
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter the filename to search:");
						String filsearchname=sc3.next();
						File SearchFile[]=f1.listFiles();
						int flag=0;
						for(File ff:SearchFile) {
							if(ff.getName().equals(filsearchname)) {
								flag=1;
								break;
							}
							else {
								flag=0;
							}
						}

						if(flag==1) {
							System.out.println("Found the file ->"+filsearchname);
						}
						else {
							System.out.println("File is not found:");
						}
						break;
				 }
				 case 5:
					 System.out.println("Go to the main Menu ->" +Operation);
					 break;
					 
				 case 6:
					 System.exit(0);
					 System.out.println("Exit from the app");
					 break;
					 
					default:
						System.out.println("Oops! please enter a valid key\n"
								+ "Thanks!");
		     }
	      }
	   }
	}



