package com.cybertek.Pages;

import com.cybertek.Base.VytrackPageBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends VytrackPageBase {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
