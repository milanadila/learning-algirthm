package com.dicoding.javafundamental.belajar.setget;

public class SetterGetterContoh {
    private String username;
    private String password;

    //method setter
    public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        //method getter
        public String getUsername() {
            return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
