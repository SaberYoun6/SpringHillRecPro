package scanners;

import java.util.ArrayList;
import java.util.Hashtable;

public interface Scans {
	ArrayList<String> scanFile(String file) throws Exception;
	Hashtable<String,Double> interruptedData (ArrayList<String> message);
	
}
