package com.soham.PracticeSet.Q1;

public class AppConfig {
    private final String dataBaseUrl;
    private final int portNumber;

    AppConfig(String dataBaseUrl, int portNumber){
        this.dataBaseUrl=dataBaseUrl;
        this.portNumber=portNumber;
    }

    public String getDataBaseUrl(){
        return dataBaseUrl;
    }

    public int getPortNumber(){
        return portNumber;
    }

}
