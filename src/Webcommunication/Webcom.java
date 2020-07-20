package Webcommunication;

import Webcommunication.com.WebCommunicationFactory;

import java.io.IOException;

public class Webcom {

    public static void main(String[] args){
        WebCommunicationFactory factory = new WebCommunicationFactory();
        try {
            factory.createConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
