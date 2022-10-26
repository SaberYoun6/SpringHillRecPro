package scanners;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class ScanClass implements Scans {

	public ArrayList<String> scanFile(String file) throws Exception {
		ArrayList<String> al = new ArrayList<String>();
		File files = new File(file);
		Scanner sc = new Scanner(files);
		String message = null;
		while (sc.hasNextLine()) {
			 message=sc.nextLine();
			 al.add(message);
		}
		sc.close();
		return al;
	}

	public Hashtable<String, Double> interruptedData(ArrayList<String> message) {
		Hashtable<String, Double> hts = new Hashtable<String, Double>();
		String date = null;
		String dateInStr = null;
		String dateOutStr = null;
		double dateInDouble = 0.0;
		double dateOutDouble = 0.0;
		
		String [] tempData = new String[2];
		String [] tempData1 = new String[2];
		for (String messages : message) {
			tempData = messages.split("St|Nd|Rd|th ");
			tempData1 = tempData[1].split(" - ");
			date =tempData[0];
			dateInDouble = Double.valueOf(tempData1[0]);
			dateOutDouble = Double.valueOf(tempData1[1]);
			
			dateInStr = date + " In";
			dateOutStr = date + " Out";
			
			hts.put(dateInStr, dateInDouble);
			hts.put(dateOutStr, dateOutDouble);
		}
		return hts;
	}

}
