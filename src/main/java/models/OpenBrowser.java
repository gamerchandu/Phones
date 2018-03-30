package models;
 

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public  class OpenBrowser
{
	  	static WebDriver driver;
	 
		/*public static void openFirefoxBrowser()
		{
			 
			//System.setProperty("webdriver.gecko.driver","D:\\MyFiles_Chanagonda\\UpdatedVersions\\geckodriver.exe");
			 
			System.setProperty("webdriver.firefox.bin","D:\\Firefox v46\\firefox.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			
		}*/
		 
		public   static void openChromeBrowser()
		{
			System.setProperty("webdriver.chrome.driver","D:\\MyFiles_Chanagonda\\UpdatedVersions\\chromeDriverVersions\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--test-type");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			/*DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
			driver=new ChromeDriver(options);
			 
		}
		protected static   void openInternetExplorerBrowser()
		{
			/*System.setProperty("webdriver.ie.driver","D:\\MyFiles_Chanagonda\\UpdatedVersions\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();*/
			
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			System.setProperty("webdriver.ie.driver","D:\\MyFiles_Chanagonda\\UpdatedVersions\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver(caps);
			driver.manage().window().maximize();
		}
		public static void openPhantomBrowser()
		{
				Capabilities caps = new DesiredCapabilities();
			((DesiredCapabilities) caps).setJavascriptEnabled(true);
			((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
			((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"D:\\MyFiles_Chanagonda\\UpdatedVersions\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
				
			 driver = new PhantomJSDriver(caps);
			 
		}
		

	}

