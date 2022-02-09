package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.logging.Logger;

import com.microsoft.playwright.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest 
{
    Page page;

    @Before
    public void init()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        page = browser.newPage();
        page.navigate("https://h.hr.dmerej.info/");
      } 
    /**
     * Rigorous Test :-)
     */
    @Test
    public void boutonGoHome()
    {
 
        page.click("text='Home'");
        assertEquals("HR DB", page.title());
    }

    @Test
    public void boutonListEmployees()
    {  
        page.click("text='List Employees'");
        assertEquals("HR DB - Employees", page.title());
    }
    @Test
    public void boutonAddEmployee()
    {      
        page.click("text='Add new employee'");
        assertEquals("HR DB - Add Employee", page.title());
    }    
    @Test
    public void boutonListTeams()
    {    
        page.click("text='List teams'");
        assertEquals("HR DB - Teams", page.title());
    }
    @Test
    public void boutonCreateTeam()
    {      
        page.click("text='Create new team'");
        assertEquals("HR DB - Add Team", page.title());
    }
    @Test
    public void boutonReset()
    {
        page.click("text='Reset database'");
        assertEquals("HR DB - Reset database", page.title());
    }

    //with out Page Object Model
    @Test 
    public void AddEmployee() {
       
        page.click("text='Add new employee'");
        String name = "Eric Dupond";
        
        page.locator("input[name='name']").fill(name);
        page.locator("input[name='email']").fill(name);
        page.locator("input[name='address_line1']").fill(name);
        page.locator("input[name='address_line2']").fill(name);
        page.locator("input[name='city']").fill(name);
        page.locator("input[name='zip_code']").fill("    ");
        page.locator("input[name='hiring_date']").fill(name);
        page.locator("input[name='job_title']").fill(name);
        page.click("text='Add'");
        int a = page.querySelectorAll(".btn btn-danger").size();
        System.out.println(a);
        System.out.println(page.title());

    }
// FIN DES BOUTONS DE BASE


}
