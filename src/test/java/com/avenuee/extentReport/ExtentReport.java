package com.avenuee.extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    public static ExtentReports getReportObject() {

        String path = System.getProperty("/Users/macbookpro/Desktop/javaPro/automationFramework/FrameworkTest/ExtentReports") + "/reports/index.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web automation results");
        reporter.config().setDocumentTitle("Test Results");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tesster", "Valdrin");
        return extent;


    }
}