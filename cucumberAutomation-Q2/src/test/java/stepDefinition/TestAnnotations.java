package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class TestAnnotations {

    public WebDriver driver;
    private int count;

    //open firefox and open ikman.lk url
    @Given("^Open the firefox with ikman.lk url$")
    public void open_the_firefox_with_ikman_lk_url(){
        System.setProperty("webdriver.gecko.driver", "F:/UCSC/3rd year/SCS 3107/assignment/3/geckodriver.exe");

        //open firefox
        driver = new FirefoxDriver();
        driver.get("https://ikman.lk/");

    }

    @When("^Maximize the window$")
    public void maximize_the_window() throws Throwable{
        driver.manage().window().maximize();

    }

    //click the property link
    @When("^Go to property$")
    public void go_to_property() throws Throwable{
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/a/span[2]")).click();

    }

    //click the house link
    @When("^Go to houses$")
    public void go_to_houses() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[3]/div/ul/li/ul[1]/li/ul/li[2]/a/span")).click();
    }

    //click colombo link
    @When("^Sort houses in Colombo$")
    public void sort_houses_in_Colombo() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[4]/div/ul/li/ul/li[1]/a/span")).click();
    }

    //click price
    @When("^Click price link$")
    public void click_price_link() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[6]/a/span")).click();
    }

    //apply min and max prices
    @When("^Apply min as \"([^\"]*)\" and max as \"([^\"]*)\"$")
    public void i_can_Select_min_as_and_max_as(String min, String max) throws Throwable {
        //apply min price
        driver.findElement(By.xpath("//*[@id=\"filters[0][minimum]\"]")).sendKeys("5000000");

        //apply max price
        driver.findElement(By.xpath("//*[@id=\"filters[0][maximum]\"]")).sendKeys("7500000");

    }

    //click apply
    @When("^Click apply button$")
    public void click_apply_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[6]/div/div[2]/div/div/button")).click();
    }

    //click beds
    @When("^Click beds link$")
    public void click_beds_link() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[8]/a")).click();
    }

    //select 3
    @When("^Select bed count as three$")
    public void select_bed_count_as_three() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"filters2values-3\"]")).click();

    }

    //print add count
    @Then("^Print the sorted add count$")
    public void print_the_sorted_add_count() throws Throwable {
        int count = Integer.parseInt(driver.findElement(By.cssSelector("body > div.app-content > div > div.serp-listing > div.ui-panel.is-rounded.serp-panel > div.ui-panel-content.ui-panel-block > div:nth-child(1) > div.col-12.lg-9 > div > div > div:nth-child(1) > div > div > div > span"))
                .getText().substring(driver.findElement(By.cssSelector("body > div.app-content > div > div.serp-listing > div.ui-panel.is-rounded.serp-panel > div.ui-panel-content.ui-panel-block > div:nth-child(1) > div.col-12.lg-9 > div > div > div:nth-child(1) > div > div > div > span"))
                        .getText().indexOf("of")+3,driver.findElement(By.cssSelector("body > div.app-content > div > div.serp-listing > div.ui-panel.is-rounded.serp-panel > div.ui-panel-content.ui-panel-block > div:nth-child(1) > div.col-12.lg-9 > div > div > div:nth-child(1) > div > div > div > span"))
                        .getText().indexOf("ads")-1));

        System.out.println("No of Ads founds : "+count);

    }

    //print the prices
    @Then("^Print prices of the found adds$")
    public void print_prices_of_the_found_adds() throws Throwable {

        //list to store the prices
        List<String> price = new ArrayList<String>();

        //list to store the beds count
        List<String> bedscount = new ArrayList<String>();

        //iterate through all the pages
        for (int i=0; i<count/25 + 1; i++){

            //put the results to an array
            WebElement serpItems = driver.findElement(By.cssSelector("body > div.app-content > div > div.serp-listing > div.ui-panel.is-rounded.serp-panel > div.ui-panel-content.ui-panel-block > div:nth-child(1) > div.col-12.lg-9 > div > div > div.row.lg-g > div.col-12.lg-9 > div"));
            List<WebElement> listItems = serpItems.findElements(By.className("ui-item"));

            for (WebElement item : listItems) {
                price.add(item.findElement(By.className("item-info")).getText());
            }

            for (WebElement item : listItems) {
                bedscount.add(item.findElement(By.className("item-meta")).getText());
            }

            if(i!=count/25){
                driver.findElement(By.cssSelector("body > div.app-content > div > div.serp-listing > div.ui-panel.is-rounded.serp-panel > div.ui-panel-content.ui-panel-block > div.row.lg-g > div > div > div > div > div > a.col-6.lg-3.pag-next")).click();
            }

        }

        for (int i = 0; i < price.size()+1; i++) {

            //string array item get as integer
            int vprice = Integer.parseInt(price.get(i).replace("Rs ", "").replace(",", ""));
            int bcount = Integer.parseInt(bedscount.get(i).replace("Beds: ", "").replace(", Baths: 2", "").replace(", Baths: 1", "").replace(", Baths: 3", "").replace(", Baths: 4", "").replace(", Baths: 5", ""));

            //ads price are between applied filters price range
            if(5000000<=vprice && vprice<=7500000) {

                //beds room count equal to 3
                if(bcount == 3) {
                    System.out.print("Ad Number "+i);
                    System.out.println(" Price is : "+price.get(i)+" - Valid");
                }
                else {
                    System.out.print("Ad Number "+i);
                    System.out.println(" Price is : "+price.get(i)+ " - Bed rooms count not equal to 3");
                }


            }
            //ads price are not at applied filters price range
            else {
                System.out.print("Ad Number "+i);
                System.out.println(" Price is : "+price.get(i)+ " - Not match with applied filters price range");
            }
        }
    }
}

