package objectRepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_createNewProduct_Page {
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productTextFeild;

}
