package com.example;

import com.microsoft.playwright.*;

public class ModelEmployee {
  private final Page page;

  public ModelEmployee(Page page) {
    this.page = page;
  }

  public void navigate(String text) {
    page.navigate(text);
  }

  public void AddEmployeeWithMod(String text) {
      page.fill("input[name='name']",text);
      page.fill("input[name='email']",text+"@");
      page.fill("input[name='address_line1']",text);
      page.fill("input[name='address_line2']",text);
      page.fill("input[name='city']",text);
      page.fill("input[name='zip_code']",""+29);
      page.fill("input[name='hiring_date']",text);
      page.fill("input[name='job_title']",text);
      page.click("text='Add'");
     
  }
}