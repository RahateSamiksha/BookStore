package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class BookStore extends TestBase{

	@FindBy(xpath="//h1[text()='BookStore Manager']")private WebElement bookstoremanagertxt;
    @FindBy(xpath="//h2[text()='Book List']")private WebElement booklistlable;
	@FindBy(xpath="//button[contains(text(),'Ad')]")private WebElement addbookbtn;
	@FindBy(xpath="//h2[contains(text(),'Ad')]")private WebElement addbookLable;
	@FindBy(xpath="//input[@id='title']")private WebElement titletext;
	@FindBy(xpath="//input[@id='author']")private WebElement author;
	
	@FindBy(xpath="//input[@id='price']")private WebElement price;
	
	@FindBy(xpath="//th[text()='Ramayana']")private WebElement booktitle;
	@FindBy(xpath="//button[text()='Download Data']")private WebElement downloadbook;
	
	public BookStore() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURLofApplication(){
		return driver.getCurrentUrl();
	}
	
	public String verifyTitleOfApplication() {
		return driver.getTitle();
	}
	
	public String verifyBookStoreText() {
		return bookstoremanagertxt.getText();
	}
	
	public String verifyBookListLable() {
		return booklistlable.getText();
	}
	
	public String verifyAddBookLable() {
		addbookbtn.click();
		return addbookLable.getText();
	}
	
	public String verifyTitleOfBook() throws InterruptedException {
		titletext.sendKeys("Ramayana");
		author.sendKeys("GirishKumar");
		price.sendKeys("10");
		Thread.sleep(2000);
		return booktitle.getText();
	}
}
