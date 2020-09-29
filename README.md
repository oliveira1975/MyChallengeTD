# MyChallengeTD
-----------------------------------------------------------------------
QA Challenge 2020 - TD
-----------------------------------------------------------------------

Main objective: Analyse of two components for QA automation: API & UI

QA Engineer: R. Oliveira

Data: 28.09.2020

-----------------------------------------------------------------------

This challenge contains:

-Analyse Report: ChallengeTD_Oliveira.pdf (delivered per email!)

-Automation files: Selenium WebDriver/IDE

Please execute the following steps, to test the automation:

-----------------------------------------------------------------------
-Scenario 1 - Automation Selenium with Eclipse IDE
-----------------------------------------------------------------------


--> Execute in Eclipse the java files:

    src/test/java/AddListchrome.java
    
    src/test/java/AddListedge.java
    
    src/test/java/AddListfirefox.java
    
    
--> Check the result files for the compilation into the folder: /TestResults

-----------------------------------------------------------------------
-Scenario 2 - Automation Selenium with Eclipse IDE & Cucumber
-----------------------------------------------------------------------

--> Execute in Eclipse the following combination of files:

    CHROME
    
    src/test/java/challengetdcc/AddListchromecc.java
    
    src/test/resources/AddListchromecc.feature
    
    EDGE
    
    src/test/java/challengetdcc/AddListedgecc.java
    
    src/test/resources/AddListedgecc.feature
    
    FIREFOX
    
    src/test/java/challengetdcc/AddListfirefoxcc.java
    
    src/test/resources/AddListfirefoxcc.feature
    
    Comment: all files you can find into the folder: More_cc_files
    
--> Check the result files for the compilation into the folder: /TestResults

-----------------------------------------------------------------------

Another information:
-----------------------------------------------------------------------

-Don't forget to adapt the script, to set the folder where you will save the browser driver, e.g.:

    System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\myProject\\challengetdcc\\drivers\\firefox\\geckodriver.exe");
    
    Comment: all browser drives are into the folder DRIVERS.

-Copy the content from POM.xlm file and past in into your POM file, in order to Cucumber recognize all .feature files.






