package Test_ng_programms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable { 
	@Test     // it is acting as main method
	public void TC1() {
		Reporter.log("running tc1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("running tc2",true);
}
	@Test
	public void TC3() {
		Reporter.log("running tc2",true);
		Assert.fail();   //it is used to fail test cases intentionally
	}

}
