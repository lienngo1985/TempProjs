package com.java4testers.domainentities;

public class User {
    private String username;
    private String password;

    public User() {
        this("username", "password");
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    /** Java comment
     *
     * @return
     */
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
