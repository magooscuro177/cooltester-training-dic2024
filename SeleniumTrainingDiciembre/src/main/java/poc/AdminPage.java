package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class AdminPage extends Base {
	
	public AdminPage (WebDriver driver) {
		super(driver);
	}

	//Objetos
	By txtUsername=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	By btnSearchUsername=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	By searchUsername=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div");
	By addNewUser=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	By enterRole=By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div");
	By enterRoleOption=By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]");
	By employeName=By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
	By employeNameOption=By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]");
	
	
	//Custome Methods
	
	public void searchUsername(String username) {
		sendKeys(txtUsername, username);
	}
	
	public void clickSearch() {
		clickOrange(btnSearchUsername);
		hardWait(3000);
	}
	
	public void isConfirmedSearchUser(String username) {
		objgetText(searchUsername, username, username);
	}
	
	public void addNewUsername(String newUserName) {
		clickOrange(addNewUser);
		clickOrange(enterRole);
		hardWait(2000);
		clickOrange(enterRoleOption);
		hardWait(2000);
		sendKeys(employeName, newUserName);
		hardWait(3000);
		clickOrange(employeNameOption);
		
	}
	
	
	
	
	
	
}
