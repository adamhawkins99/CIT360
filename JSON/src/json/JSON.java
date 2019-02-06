
package json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author adam
 */
public class JSON {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Your Name: ");
		String name = input.nextLine();

		// Here you create the JSON object with a name-name value
		JSONObject root = new JSONObject();
		root.put("name", name);
		
		// Here you declare array and then add to loop
		JSONArray courses = new JSONArray();
		
		while (true) {
			
			// Ask user for courses they still need to take at BYU-I
			System.out.print("Please Enter the Course/Courses you still need to take at BYU-I:\nIf no other course/s, leave it blank, and hit enter. ");
			String course = input.nextLine();
			
			// Break loop if user leaves course field blank and hits enter
			if (course.length() == 0) {
				break;
			}
			
			// Ask user for grade they hope to achieve
			System.out.print("Enter Percent Grade You Hope to Achieve (example 83): ");
			int grade = input.nextInt();
			
			if (input.hasNextLine()) {
				input.nextLine();
			}
			
			// Here you create and store JSON object
			JSONObject courseObject = new JSONObject();
			courseObject.put("grade", grade);
			courseObject.put("name", course);
			
			// Add course to array
			courses.add(courseObject);
			
		}
		
		// Add the array to root object
		root.put("courses", courses);
		
		System.out.println(root.toJSONString());
		
		// Trying to create a text file	
		File file = new File("StudentInfo.txt");
		
		try (PrintWriter writer = new PrintWriter(file)){
			writer.print(root.toJSONString());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println("The File was created successfully.\n\nPress enter to finish.");
		input.nextLine();
		
		try {
			input = new Scanner(file);
			
			StringBuilder jsonIn = new StringBuilder();
			while (input.hasNextLine()) {
				jsonIn.append(input.nextLine());
			}
			System.out.println(jsonIn.toString());
			
			// Parse string
			JSONParser parser = new JSONParser();			
			JSONObject objRoot = (JSONObject) parser.parse(jsonIn.toString());
			
			System.out.printf("Students name is %s\n", objRoot.get("name").toString());
			
			// Add parsed contents back into array
			JSONArray coursesIn = (JSONArray) objRoot.get("courses");
			
			// Loop back through the array to display contents
			for (int i = 0; i < coursesIn.size(); i++) {
				JSONObject courseIn = (JSONObject) coursesIn.get(i);
				long gradeIn = (long) courseIn.get("grade");
				String nameIn = (String) courseIn.get("name");
					
				System.out.printf("Course %s; Percent grade %d\n", nameIn, gradeIn);
			}
		//Had to create a catch for the file not found exception.  	
		} catch (FileNotFoundException | ParseException ex) {
			System.out.println(ex.toString());
			
		}		
		
	}
}

