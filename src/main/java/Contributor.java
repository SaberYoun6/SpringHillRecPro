
public class Contributor {
  private final String stringOgName ="Saberina Young";
  public String getStringOgName() {
	return stringOgName;
}

private String secondaryName = null;
  private String thirdName = null;

	String [] arrayOfContributors(String ... Names) {
		String [] contributors = new String [500];
		contributors[0] = getStringOgName();
		
		return contributors;
		
	  
  }

}
