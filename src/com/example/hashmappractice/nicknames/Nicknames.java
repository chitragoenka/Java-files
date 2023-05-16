package com.example.hashmappractice.nicknames;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknameList = new HashMap<>();

        // Store names and nicknames
        nicknameList.put("matthew", "matt");
        nicknameList.put("michael", "mix");
        nicknameList.put("arthur", "artie");

        // Get Matthew's nickname
        String matthewNickname = nicknameList.get("matthew");

        // Print Matthew's nickname
        System.out.println(matthewNickname);
    }
}

