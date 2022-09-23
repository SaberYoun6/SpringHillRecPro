package hours.weeks.scanner;


import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Hashtable;

public class ScansClass {

	public ArrayList<String> ScanFile(String files )throws Exception {
		File file0 = new File(files);
		Scanner sc = new Scanner(file0);
		ArrayList<String>al = new ArrayList<>();  
		String message = null;
		while(sc.hasNextLine()) {
			message= sc.nextLine();
			al.add(message);
		}
		sc.close();
		return al;
		
	}
	public void close() {
		
	}
	
	 public Hashtable<String,Double> interruptedData( ArrayList <String> message){
		 Hashtable<String,Double> hts = new Hashtable<>();
		 String date= null;
		 String dateInStr=null;
		 String dateOutStr = null;
		 double dateInDouble = 0.0;
		 double dateOutDouble =0.0;
		 String [] tempdata = new String[2];
		 Stirng [] tempdata = new String[2];
		 
		 for (String messages : message) 
		 {
		 
			 tempdata = messages.split("St|Nd|Rd|Th}")
			 tempdata1 = tempdata[1].split(" - ");
			 date= tempdata[0];
			 
			 dateInDouble = Double.valueOf(tempdata1[0]);
			 dateOutDouble = Double.valueOf(tempdata1[1]);
			 
			 dateInStr= date + " in";
			 dateOutStr= date + "out";
		 
			 hts.put(dateIn,dateIn0);
			 hts.put(dateOut,dateOut0);
		 }
		
		 
		return hts;
		 
		 
		 
	 }
}
