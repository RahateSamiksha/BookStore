package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BookStore;

public class BookStoreTest extends TestBase{
	BookStore book;
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		book=new BookStore();
	}
	
	@Test
	public void verifyURLofApplicationTest() {
		String expUrl="https://book-store-manager.vercel.app/";
		String actUrl=book.verifyURLofApplication();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("URL of Application "+actUrl);
	}
	@Test
	public void verifyTitleOfApplicationTest() {
		String expTitle="Mirats | Book Store Test Project";
		String actTitle=book.verifyTitleOfApplication();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of Application "+actTitle);
	}
	@Test
	public void verifyBookStoreTextTest() {
		String exptxt="BookStore Manager";
		String acttxt=book.verifyBookStoreText();
		Assert.assertEquals(exptxt, acttxt);
		Reporter.log("Bookestrore Text "+acttxt);
	}
	@Test
	public void verifyBookListLableTest() {
		String expLable="Book List";
		String actLable=book.verifyBookListLable();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("BookList Lable "+actLable);
	}
	@Test
	public void verifyAddBookLableTest() {
		String expLable="Add Book";
		String actLable=book.verifyAddBookLable();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("Add Book Lable "+actLable);
	}
	@Test
	public void verifyTitleOfBookTest() throws InterruptedException {
		String exptxt="Ramayana";
		String acttxt=book.verifyTitleOfBook();
		Assert.assertEquals(exptxt, acttxt);
		Reporter.log("Title of Book Text "+acttxt); 
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
