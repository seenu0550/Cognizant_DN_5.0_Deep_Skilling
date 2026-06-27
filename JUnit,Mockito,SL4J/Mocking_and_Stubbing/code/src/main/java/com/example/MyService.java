package com.example;

public class MyService {

    private ExternalApi externalApi;

    // constructor injection (VERY IMPORTANT for Mockito)
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}