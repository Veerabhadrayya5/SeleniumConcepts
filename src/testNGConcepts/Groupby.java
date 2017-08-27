package testNGConcepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupby {

	@Test(groups="user")
	public void m1() {
		Reporter.log("m1 method", true);
	}

	@Test(groups={"user","smoke"})
	public void m2() {
		Reporter.log("m2 method", true);
	}

	@Test(groups="us")
	public void m3() {
		Reporter.log("m3 method", true);
	}

	@Test
	public void m4() {
		Reporter.log("m4 method", true);
	}
}