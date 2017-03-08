package dubbo.simple.service.model;

import java.io.Serializable;


public class User implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5296194586319030819L;
    private String userid;
    private String email;
    private String nickname;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
