package com.backend.BIZIMANA_hotelManager.request;

public class RegisterRequest {

    private String names;
    private String email;
    private String password;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegisterRequest(String names, String email, String password) {
        this.names = names;
        this.email = email;
        this.password = password;
    }
}
