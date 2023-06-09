package com.gits.internetherokuapp.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) > a")
    public WebElement ABTesting;
    public WebElement getABTesting(){
        return ABTesting;
    }

    @FindBy(css = "li:nth-of-type(2) > a")
    public WebElement addRemoveElement;
    public WebElement getAddRemoveElement(){
        return addRemoveElement;
    }

    @FindBy(css = "ul > li:nth-of-type(3)")
    public WebElement basicAuth;
    public WebElement getBasicAuth(){
        return basicAuth;
    }

    @FindBy(css = "li:nth-of-type(4) > a")
    public WebElement brokenImages;
    public WebElement getBrokenImages(){
        return brokenImages;
    }

    @FindBy(css = "ul > li:nth-of-type(6)")
    public WebElement checkBoxes;
    public WebElement getCheckBoxes(){
        return checkBoxes;
    }

    @FindBy(css = "#content > ul > li:nth-child(7) > a")
    public WebElement contextMenu;
    public WebElement getContextMenu(){
        return contextMenu;
    }

    @FindBy(css = "li:nth-of-type(9) > a")
    public WebElement disappearingElements;
    public WebElement getDisappearingElements(){
        return disappearingElements;
    }

    @FindBy(css = "li:nth-of-type(10) > a")
    public WebElement dragAndDrop;
    public WebElement getDragAndDrop(){
        return dragAndDrop;
    }

    @FindBy(css = "li:nth-of-type(11) > a")
    public WebElement dropDown;
    public WebElement getDropDown(){
        return dropDown;
    }

    @FindBy(css = "ul > li:nth-of-type(15)")
    public WebElement entryAd;
    public WebElement getEntryAd(){
        return entryAd;
    }

    @FindBy(css = "ul > li:nth-of-type(16)")
    public WebElement exitIntent;
    public WebElement getExitIntent(){
        return exitIntent;
    }

    @FindBy(css = "ul > li:nth-of-type(17)")
    public WebElement fileDownload;
    public WebElement getFileDownload(){
        return fileDownload;
    }

    @FindBy(css = "li:nth-of-type(18) > a")
    public WebElement fileUpload;
    public WebElement getFileUpload(){
        return fileUpload;
    }

    @FindBy(css = "ul > li:nth-of-type(19)")
    public WebElement floatingMenu;
    public WebElement getFloatingMenu(){
        return floatingMenu;
    }

    @FindBy(css = "ul > li:nth-of-type(20)")
    public WebElement forgetPassword;
    public WebElement getForgetPassword(){
        return forgetPassword;
    }

    @FindBy(css = "li:nth-of-type(21) > a")
    public WebElement formAuthentication;
    public WebElement getFormAuthentication(){
        return formAuthentication;
    }

    @FindBy(css = "ul > li:nth-of-type(22)")
    public WebElement frames;
    public WebElement getFrames(){
        return frames;
    }

    @FindBy(css = "li:nth-of-type(23) > a")
    public WebElement geoLocation;
    public WebElement getGeoLocation(){
        return geoLocation;
    }

    @FindBy(css = "ul > li:nth-of-type(24)")
    public WebElement horizontalSlider;
    public WebElement getHorizontalSlider(){
        return horizontalSlider;
    }

    @FindBy(css = "ul > li:nth-of-type(25)")
    public WebElement hovers;
    public WebElement getHovers(){
        return hovers;
    }

    @FindBy(css = "li:nth-of-type(26) > a")
    public WebElement infiniteScroll;
    public WebElement getInfiniteScroll(){
        return infiniteScroll;
    }

    @FindBy(css = "ul > li:nth-of-type(27)")
    public WebElement inputs;
    public WebElement getInputs(){
        return inputs;
    }

    @FindBy(css = "li:nth-of-type(28) > a")
    public WebElement jqueryUiMenus;
    public WebElement getJqueryUiMenus(){
        return jqueryUiMenus;
    }

    @FindBy(css = "li:nth-of-type(29) > a")
    public WebElement javaScriptAlerts;
    public WebElement getJavaScriptAlerts(){
        return javaScriptAlerts;
    }

    @FindBy(css = "li:nth-of-type(30) > a")
    public WebElement javaScriptError;
    public WebElement getJavaScriptError(){
        return javaScriptError;
    }

    @FindBy(css = "ul > li:nth-of-type(31)")
    public WebElement keyPresses;
    public WebElement getKeyPresses(){
        return keyPresses;
    }

    @FindBy(css = "ul > li:nth-of-type(32)")
    public WebElement largeAndDeepDom;
    public WebElement getLargeAndDeepDom(){
        return largeAndDeepDom;
    }

    @FindBy(css = "li:nth-of-type(33) > a")
    public WebElement multipleWindows;
    public WebElement getMultipleWindows(){
        return multipleWindows;
    }

    @FindBy(css = "li:nth-of-type(34) > a")
    public WebElement nestedFrames;
    public WebElement getNestedFrames(){
        return nestedFrames;
    }

    @FindBy(css = "li:nth-of-type(35) > a")
    public WebElement notificationMessages;
    public WebElement getNotificationMessages(){
        return notificationMessages;
    }

    @FindBy(css = "ul > li:nth-of-type(36)")
    public WebElement redirectLink;
    public WebElement getRedirectLink(){
        return redirectLink;
    }

    @FindBy(css = "li:nth-of-type(37) > a")
    public WebElement secureFileDownload;
    public WebElement getSecureFileDownload(){
        return secureFileDownload;
    }

    @FindBy(css = "ul > li:nth-of-type(38)")
    public WebElement shadowDom;
    public WebElement getShadowDom(){
        return shadowDom;
    }

    @FindBy(css = "ul > li:nth-of-type(39)")
    public WebElement shiftingContent;
    public WebElement getShiftingContent(){
        return shiftingContent;
    }

    @FindBy(css = "ul > li:nth-of-type(40)")
    public WebElement slowResources;
    public WebElement getSlowResources(){
        return slowResources;
    }

    @FindBy(css = "li:nth-of-type(41) > a")
    public WebElement sortableDataTable;
    public WebElement getSortableDataTable(){
        return sortableDataTable;
    }

    @FindBy(css = "li:nth-of-type(42) > a")
    public WebElement statusCodes;
    public WebElement getStatusCodes(){
        return statusCodes;
    }

    @FindBy(css = "ul > li:nth-of-type(43)")
    public WebElement typos;
    public WebElement getTypos(){
        return typos;
    }

    @FindBy(css = "li:nth-of-type(44) > a")
    public WebElement wysiwygEditor;
    public WebElement getWysiwygEditor(){
        return wysiwygEditor;
    }
}
