package check.entity;

/*
*/
public class User{
    private String name;
    private String phone;
    private String role;

    public User() {

    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
	}

	/**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @param mame the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}