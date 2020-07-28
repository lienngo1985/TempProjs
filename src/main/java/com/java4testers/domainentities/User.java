package com.java4testers.domainentities;

public class User {
    private String username;
    private String password;

    /** Java comment
     * GET SET are ACCESSOR methods that allows other class can access to these PRIVATE variables.
     * It reduce ability to have value amended by other classes while calling
     */
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
