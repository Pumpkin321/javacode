package xupt.domain;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/16 17:04
 */

public class Role {
    private String roleID;
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    private String roleDescribe;

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID='" + roleID + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDescribe='" + roleDescribe + '\'' +
                '}';
    }
}
