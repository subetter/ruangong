package po;

//    用户表
public class User {
    private int id;   //用户id
    private String username; //用户名
    private String password;  // 用户密码
    private boolean isadmin;  //用户是否为管理员

    public boolean isIsAdmin() {
        return isadmin;
    }

    public void setisIsAdmin(boolean isAdmin) {
        this.isadmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
