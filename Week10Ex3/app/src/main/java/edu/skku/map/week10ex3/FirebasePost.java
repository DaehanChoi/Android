package edu.skku.map.week10ex3;

import java.util.HashMap;
import java.util.Map;

public class FirebasePost {

    public String token;
    public String userId;
    public String studentId;
    public String name;

    public FirebasePost() {}

    public FirebasePost(String token, String userId, String stdid, String name) {
        this.token = token;
        this.userId = userId;
        this.studentId = stdid;
        this.name = name;
    }

    public Map<String, Object> toMap () {
        HashMap<String, Object> result = new HashMap<>();

        result.put("Token", token);
        result.put("StudentID", studentId);
        result.put("Name", name);

        return result;
    }
}
