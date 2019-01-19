package check.entity;

/*
*/
public class User{
    private String mame;
    private String phone;

    /**
     * @return the mame
     */
    public String getMame() {
        return mame;
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
    public void setMame(String mame) {
        this.mame = mame;
    }
}