package me.cizezsy.web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldServletTest {

  @Test
  public void testDoGet() {
    WebDriver driver = new HtmlUnitDriver();
    driver.get("http://localhost:8080/test/hello");
    WebElement element = driver.findElement(By.tagName("p"));

    assertThat(element.getText(), is("hello world"));
  }

}
