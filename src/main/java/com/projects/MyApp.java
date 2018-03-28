package com.projects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by clara.marti on 28/03/2018.
 */

public class MyApp {

    private String appName;
    private int telefono;

    public MyApp(String appName, int telefono) {
        this.appName = appName;
        this.telefono = telefono;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "MyApp{" +
                "appName='" + appName + '\'' +
                ", telefono=" + telefono +
                '}';
    }

}
