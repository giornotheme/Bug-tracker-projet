package com.example;
import com.microsoft.playwright.*;

public class App {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch();
      Page page = browser.newPage();
      page.navigate("https://h.hr.dmerej.info/");
      /*page.click("text='List Employees'");
      page.click("text='Delete'");
      page.click("text='Proceed'");*/

      
        for(int i = 0; i< 3; i++)
        {
            page.click("text='Add new employee'");
            String name = "Jean Masturbin" + i;
            page.locator("input[name='name']").fill(name);
            page.locator("input[name='email']").fill(name);
            page.locator("input[name='address_line1']").fill(name);
            page.locator("input[name='address_line2']").fill(name);
            page.locator("input[name='city']").fill(name);
            page.locator("input[name='zip_code']").fill(""+i);
            page.locator("input[name='hiring_date']").fill(name);
            page.locator("input[name='job_title']").fill(name);
            page.click("text='Add'");
            page.click("text='Home'");


        }
      System.out.println(page.title());
    }
  }
}
