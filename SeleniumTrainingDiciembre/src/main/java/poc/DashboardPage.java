package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class DashboardPage extends Base {
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	
	//Objetos
	By btnDropdowndashboard=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span");
	By btnLogout=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a");
	By btnAdminPage=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");
	By imgDashboardPage=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img");
	
	
	//Custom Methods
	public boolean isConfirmedLogin() {
		return objIsDisplayed(imgDashboardPage);

	}
	
	public void clickAdmin() {
		clickOrange(btnAdminPage);
		hardWait(3000);
	}
	
	public void Logout() {
		clickOrange(btnDropdowndashboard);
		clickOrange(btnLogout);
		hardWait(3000);
	}
}
