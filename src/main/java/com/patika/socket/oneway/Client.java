package com.patika.socket.oneway;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
@Log4j2
public class Client {
    public static void main(String[] args) {
        String number;
        String ipAddress = "localhost";
        int port = 7777;
        try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, port).getOutputStream())) {
            number = JOptionPane.showInputDialog("Lütfen bir sayi giriniz: ");
            dataOutputStream.writeUTF(number);
        } catch (IOException e) {
            System.out.println("IOException meydana geldi");
            log.info("IOException meydana geldi");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
