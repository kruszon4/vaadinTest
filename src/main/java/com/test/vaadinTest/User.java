package com.test.vaadinTest;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class User {

    private String username;
    private List<String> pss;



    public static class UserBuilder {
        public UserBuilder addpassword() {
            this.pss = new ArrayList<>();
            return this;
        }

        public UserBuilder addpss(String strr) {
            this.pss.add(strr);
            return this;
        }
    }

    public static void main(String[] args) {
        System.out.println(User.builder().username("This is my username").addpss("sdsdf").addpss("kldklfsd").build().toString());
    }
}