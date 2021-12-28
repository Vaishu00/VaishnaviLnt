package com.MyRunner;



import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(

dryRun = true,

monochrome = true,

features = "./src/test/java/Features",

glue = "StepDefinition",

plugin = {"pretty", "html: Reports/HTMLReport.html",

"json:Reports/CucumberJSONReport.json",

"junit:Reports/JunitReport.xml"}

)



public class TestRunner {



}
