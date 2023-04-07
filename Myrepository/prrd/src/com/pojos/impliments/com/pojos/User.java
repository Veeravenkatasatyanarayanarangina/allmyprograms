package com.pojos.impliments.com.pojos;

public class User
{
    private String userName;
    private String emailId;
    private String password;
    private int superCoins;

    public User(String userName, String emailId, String password, int superCoins) {
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.superCoins = superCoins;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSuperCoins() {
        return superCoins;
    }

    public void setSuperCoins(int superCoins) {
        this.superCoins = superCoins;
    }
}
