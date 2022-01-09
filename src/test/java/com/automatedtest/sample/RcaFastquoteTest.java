package com.automatedtest.sample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/sample/web_rca_fastquote_step1_levelDriving.feature",
        "src/test/resources/com/automatedtest/sample/web_rca_fastquote_step2_birthDate.feature",
        "src/test/resources/com/automatedtest/sample/web_rca_fastquote_step3_packs.feature",
        "src/test/resources/com/automatedtest/sample/web_rca_fastquote_step4_guarantees.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/search.json",
        "html:target/search-html"},
        glue = {"com.automatedtest.sample.infrastructure.driver",
                "com.automatedtest.sample.homepage",
                "com.automatedtest.sample.rcaLoginPage", "com.automatedtest.sample.rcaFastquotePage"})
public class RcaFastquoteTest {
}
