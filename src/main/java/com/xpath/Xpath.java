package com.xpath;

public class Xpath {
private String textlocator = "//*[@test='%s']";
	
	public static String formatXpath(String xpath , String value) {
		return String.format(xpath, value);
		
	}
	
	public void username() {
		By emailornumb = By.xpath("//*[@text='Enter Email or mobile number']");
	}
	public void password() {
		By pswrd = By.xpath("//*[@text='Password']");
	}
	public void loginbtn() {
		By loginbtn = By.xpath("//*[@text='Login']");				
	}
	
	//forgot password
	public void forgotpswrd() {
		By fgtpwd = By.xpath("//*[@text='Forgot Password?']");
	}
	public void regmail() {
	By regdmail = By.xpath("//*[@text='Email or Mobile Number']");
	}
	public void send() { 
	By snd = By.xpath("//*[@text='Send']");
	}
	public void newpwrd() {
	By newpwrd = By.xpath("//*[@text='Your new password']");
	}
	public void cnfrmpwd() {
	By cnfrmpwd = By.xpath("//*[@text='Re-enter your password']");
	}
	public void otp() {
	By onetp = By.xpath("//*[@text='Enter Your otp']");
	}
	public void sbmt() {
	By sbmit = By.xpath("//*[@text='Submit']");
	}
	
	//register customer 
	
	public void fullname() {
	By flname = By.xpath("//*[@text='Full name']");
	}
	public void mobnumb() {
	By mobno = By.xpath("//*[@text='Mobile Number']");
	}
	public void pwd() {
	By pd =	By.xpath("//*[@text='Password']");	
	}
	public void cnfmpwd() {
	By cnfirmpwd =  By.xpath("//*[@text='Confirm password']");	
	}
    
	//start page
	
	public void nextbutton() {
    	By nxtbtn = By.xpath("//*[@text='Next']");
    }
	public void previousbutton() {
    	By prevbtn = By.xpath("//*[@text='Previous']");
    }
	
	//Home page 
	
	public void homepage_activities() {
		By hpactivs = By.xpath("//*[@text='gym']");
	}
	public void homepage_activities_1() {
		By hpactivs = By.xpath("//*[@text='Badminton Ball']");
	}
	public void homepage_activities_2() {
		By hpactivs = By.xpath("//*[@text='Cricket']");
	}
	public void homepage_activities_3() {
		By hpactivs = By.xpath("//*[@text='Salon']");
	}
	
	//Shop listing page 
	
	public void shplisting() {
		By shplstg = By.xpath("//*[@text='Testing gym centre']"); 
	}
	
//	sub-activities
	public void subactiv() {
		By subacs = By.xpath("//*[@text='Gym1']"); 
	}
//component click 
	
	public void booknow() {
		By bknw = By.xpath("//*[@text='Book Now']"); 
	}
	
// badminton select date and slot time 
	
	List<WebElement> services = driver.findElements(By.xpath("//android.widget.TextView[@text='Select Your Prefered Time'] following::'Select Court'&'Select Timings')")); 
	WebElement date= services.get(0);
	WebElement court= services.get(0);
	WebElement timings = services.get(0);	
			
			
//predefined select date and time 
	
	List<WebElement> predefined = driver.findElements(By.xpath("//android.widget.TextView[@text='Select Your Prefered Time'] following::'Select Slot Timing')")); 	
	WebElement date.predefined(0);
	WebElement time.predefined(0);

//netpractice
	
	List<WebElement> netpractice = driver.findElements(By.xpath("//android.widget.TextView[@text='Select Your Prefered Time'] following::'Select Bowling Type'&'Select Number of Overs'&'Select Slot Timing')")); 
	WebElement date= netpractice.get(0);
	WebElement bowltype= netpractice.get(0);
	WebElement timings = netpractice.get(0);	
	
	
	
	//component click 
	
	public void next() {
		By nxt = By.xpath("//*[@text='Next']"); 
	}
	
	//purchase summary page 
	public void Toapplycoup() {
	By appcoup = By.xpath("//*[@text='	Apply Coupon']"); 
	}		
	//in apply coupon page 
	public void selcouptype() {
	By couptype = By.xpath("//*[@text='FLAT_437832']"); 
	}	
	public void Forapplycoup() {
	By applyingcoup = By.xpath("//*[@text='Apply']"); 
	}		
	public void proceedtopay() {
	By topay = By.xpath("//*[@text='Proceed To Pay']"); 
	}		
			
//cash booking	
	public void cash() {
	By cash = By.xpath("//*[@text='Cash']"); 
	}
	
//component 
	
	public void cnfrmbkg() {
	By cnfrmbkg = By.xpath("//*[@text='Cash']"); 
	}
}
