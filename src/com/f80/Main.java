package com.f80;

import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voices;

import java.io.*;
import java.util.Collections;

public class Main {

    
    public static void main(String[] args) {

        String s="Bonjour comment allez vous";
        IamOptions options = new IamOptions.Builder()
                .apiKey("Q80Er-EUKVmGwj6TtGBoQA-x9-Cn3-1aK6Ayt8CtoH6p")
                .build();

        TextToSpeech textToSpeech = new TextToSpeech(options);

        textToSpeech.setEndPoint("https://stream-fra.watsonplatform.net/text-to-speech/api");

        Voices voices = textToSpeech.listVoices().execute();
        System.out.println(voices);
    }
}
