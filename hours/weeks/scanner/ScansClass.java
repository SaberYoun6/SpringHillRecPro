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
	public static final String pattern = "([Mon|Tues|Wednes|Thurs|Fri|Satur|Sun]day) ([//d+][st|nd|rd|th]) ([//d+].[//d+]) - ([//d+].[//d+])$";
	public static final Pattern anydayOrTime = Pattern.compile(pattern);
	 public Hashtable<String,Double> interruptedData( ArrayList <String> message){
		 Hashtable<String,Double> hts = new Hashtable<>();
		 String date= null;
		 String dateIn=null;
		 String dateOut = null;
		 String inDate0= null;
		 String outDate0 =null;
		 double dateIn0 = 0.0;
		 double dateOut0 =0.0;
		 
		 for (String messages : message) 
		 {
		 
			 Matcher matchs = anydayOrTime.matcher(messages);
			 if(matchs.find()) {
				 date=matchs.group(0)+"  "+matchs.group(1);
				 inDate0=matchs.group(2);
				 outDate0=matchs.group(3);
			 }
			 dateIn0=Double.valueOf(inDate0);
			 dateOut0=Double.valueOf(outDate0);
			 
			 dateIn= date + " in";
			 dateOut= date + "out";
		 
			 hts.put(dateIn,dateIn0);
			 hts.put(dateOut,dateOut0);
		 }
		
		 
		return hts;
		 
		 
		 
	 }
}
