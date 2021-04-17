package landingpage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {

    @Test
    public void home(){
        System.out.println(driver.getTitle());
    }
}
