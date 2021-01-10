package com.example.demo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Disabled
public class SampleTest {
    @Test
    public void getAccessKey() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .header("Authorization", "your token")
                .url("https://api.github.com/users/vogella")
                .build();

        Response response = client.newCall(request).execute();
        String accessKey = response.body().string();
    }
}
