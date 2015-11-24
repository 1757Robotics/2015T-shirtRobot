package org.usfirst.frc.team1757.robot;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Commons {
	
	//void function designed to read all lines from a .txt file and return them to a string array
	public static String[] readLines(String path)
	{
		try {
    		Scanner filescan = new Scanner(path);
    		 List<String> outList = Arrays.asList(); //Safe empty declaration
    		while (filescan.hasNextLine())
    		{
    			outList.add(filescan.nextLine());
    		}
    		filescan.close();
    		return (String[]) outList.toArray(); // Possibly dangerous type casting
    	}
    	catch (Exception e)
    	{
    		System.out.println("Error opening button layout file, will use defaults\n" + e.toString());
    		return new String[] {};
    	}
	}

	
}