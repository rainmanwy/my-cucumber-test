package com.wy.cucumber;

/**
 * Created by y136wang on 2016/7/21.
 */

import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources"},
        glue = "com.wy.cucumber",
        format = {
//                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json"}
)

public class CukesRunner {
}
