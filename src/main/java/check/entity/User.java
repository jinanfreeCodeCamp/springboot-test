package check.entity;

/*
*/
public class User{
    private String name;
    private String phone;

    /**
     * @return the mame
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
     * @param mame the mame to set
     */
    public void setName(String name) {
        this.name = name;
    }
}