package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


@SpringBootApplication
public class DemoApplication {
    private static final String LEFT_ALIGN = "800";
    private static final String TOP_ALIGN = "400";

    public static void main(String[] args) {
        try {
            File myObj = new File("filename.svg");
            FileWriter fileWriter = new FileWriter(myObj);
            fileWriter.write("<svg width=\"340.28\"  height=\"209.96\"  viewBox=\"0 0 340.28 209.96\" fill=\"none\"  style=\"border: 1px solid #cccccc;\" xmlns=\"http://www.w3.org/2000/svg\">");
            fileWriter.write("<text transform=\"rotate(-90 134.64001 109.48001)\"  xml:space=\"preserve\" text-anchor=\"start\" font-family=\"sans-serif\" font-size=\"24\" y=\"109.48001\" x=\"134.64001\" fill=\"#000000\">thành</text>");
            fileWriter.write("</svg>");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
