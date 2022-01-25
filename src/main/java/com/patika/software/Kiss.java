package com.patika.software;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.io.*;


@Log4j2
public class Kiss { // olabildigince basit yap
    String path = "C:\\bootcamp\\innova\\patika.txt";

    public void utilWriter() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            String value = JOptionPane.showInputDialog("Lütfen birşeyler giriniz");
            bufferedWriter.write(value);
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void utilReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String numberRow = "", sumRow = "";
            while ((numberRow = bufferedReader.readLine()) != null) {
                sumRow += numberRow;
            }
            log.info(sumRow);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Kiss kiss = new Kiss();
        kiss.utilWriter();
        //kiss.utilReader();
    }
}
