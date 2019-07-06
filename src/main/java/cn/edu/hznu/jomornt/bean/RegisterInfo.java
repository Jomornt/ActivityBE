package cn.edu.hznu.jomornt.bean;

public class RegisterInfo {
    private String nickname;
    private String phonenum;
    private String verifycode;
    private String password;

    public RegisterInfo() {

    }

    public RegisterInfo(String phonenum) {
        this.phonenum = phonenum;
    }

    public RegisterInfo(String nickname, String phonenum, String verifycode, String password) {
        this.nickname = nickname;
        this.phonenum = phonenum;
        this.verifycode = verifycode;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
