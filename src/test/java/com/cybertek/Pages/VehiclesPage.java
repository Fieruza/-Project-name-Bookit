package com.cybertek.Pages;

import com.cybertek.Base.VytrackPageBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends VytrackPageBase {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
