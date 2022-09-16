package hours.weeks.scanner;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Hashtable;

public class ScansClass {

	public String ScanFile(String files )throws Exception {
		File file0 = new File(files);
		Scanner sc = new Scanner(file0);
		String message = null;
		while(sc.hasNextLine()) {
			message= sc.nextLine();
		}
		return message;
	
	}
	public static final Pattern anydayOrTime = Pattern.compile("[Mon|Tues|Wednes|Thurs|Fri|Satur|Sun]day [d+].[d+] - [d+].[d+]$");
	 public Hashtable<String,Double> interruptedData(String message){
		 Hashtable<String,Double> hts = new Hashtable<>();
		 String date= null;
		 String inSaturday0= null;
		 String inSaturday0_1=null;
		 String outSaturday0 =null;
		 String outSaturday0_1=null;
		 String inSaturday0_0_1=null;
		 String outSaturday0_0_1=null;
		 double saturdayIn0_0_1 = 0.0;
		 double saturdayOut0_0_1 =0.0;
			 Matcher m = anydayOrTime.matcher(message);
			 if(m.find()) {
				 date=m.group(0);
				 inSaturday0=m.group(1);
				 inSaturday0_1=m.group(2);
				 outSaturday0=m.group(3);
				 outSaturday0_1= m.group(4);
			 }
			 inSaturday0_0_1=inSaturday0+"."+inSaturday0_1;
			 saturdayIn0_0_1=Double.valueOf(inSaturday0_0_1);
			 outSaturday0_0_1=outSaturday0+"."+outSaturday0_1;
			 saturdayOut0_0_1=Double.valueOf(outSaturday0_0_1);
			 
		 hts.put(date,saturdayIn0_0_1);
		 hts.put(date,saturdayOut0_0_1);
		 
		
		 
		return hts;
		 
		 
		 
	 }
}
