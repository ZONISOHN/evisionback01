package evision.evisiondemo.domain;

import java.util.HashMap;
import java.util.Map;

public class YBMember extends Member {

    private String name;
    private Long id;
    private String pw;
    private String major;
    private String email;
    public static Map<Integer, Boolean> attend_reg = new HashMap<>();
    public static Map<Integer, Boolean> attend_weekend = new HashMap<>();
    public static Map<Integer, Boolean> hw_reg = new HashMap<>();
    public static Map<Integer, Boolean> hw_weekend = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
