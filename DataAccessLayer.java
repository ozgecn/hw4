package dataHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataAccessLayer {

	public static void main(String args[]) {

		File f = new File("C:\\Users\\ozgeaydin\\eclipse-workspace\\HW4\\src\\dataHandler\\nutrition.dat");
		
		try  {
			ArrayList<String> lines = get_arraylist_from_file(f);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
	public static ArrayList<String> get_arraylist_from_file(File f) 
	throws FileNotFoundException {
        Scanner s;
        ArrayList<String> list = new ArrayList<String>();
        s = new Scanner(f);
        while (s.hasNext()) {
            list.add(s.next());
        }
        System.out.println(list);
        s.close();
        return list;
    
}
	}
