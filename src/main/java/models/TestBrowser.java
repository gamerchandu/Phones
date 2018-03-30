package models;

public class TestBrowser extends OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		openChromeBrowser();
		
		driver.get("http://www.google.com");
		
		System.out.println("first ");
		System.out.println(driver.getTitle());
		
		System.out.println("fourths");
		System.out.println("ne wlin e");
		driver.quit();
	}

}
