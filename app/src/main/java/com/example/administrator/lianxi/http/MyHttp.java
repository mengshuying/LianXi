package com.example.administrator.lianxi.http;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */

public class MyHttp {
    public String getURL(String stt){
            try {
                URL url=new URL(stt);
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection= (HttpURLConnection) urlConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setUseCaches(true);
                httpURLConnection.setReadTimeout(5000);
                int responseCode = httpURLConnection.getResponseCode();
                if(responseCode==200){
                    InputStream inputStream = httpURLConnection.getInputStream();
                    ByteArrayOutputStream out=new ByteArrayOutputStream();
                    byte[] bb=new byte[1024];
                    int len=0;
                    while((len=inputStream.read(bb))!=-1){
                        out.write(bb,0,len);
                        out.flush();
                    }
                    return out.toString();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
}
