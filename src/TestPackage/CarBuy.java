package TestPackage;

import org.testng.annotations.Test;

public class CarBuy {
	
	
	
	@Test(groups= {"sanity"})
	public void CarBuyWebloging()
	{
		System.out.println("CarBuy from Web");
		
	}
@Test(groups= {"regression"})
public void CarBuyAPPLoging()
{
	System.out.println("CarBuy from APP");
}
@Test(groups= {"faillure"})
public void CarBuyBranch()
{
System.out.println("CarBuy from Branch");
}




	
}
