package check.entity;

import java.util.Date;

public class Token{

    private String newToken;
    private String name;
    private Date updateTime;
    private Date expireTime;

    public Token(String newtoken, String name, Date updateTime, Date expireTime) {
        this.newToken = newtoken;
        this.name = name;
        this.updateTime = updateTime;
        this.expireTime = expireTime;
    }

    /**
     * @return the expireTime
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * @param expireTime the expireTime to set
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * @return the updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the newToken
     */
    public String getNewToken() {
        return newToken;
    }

    /**
     * @param newToken the newToken to set
     */
    public void setNewToken(String newToken) {
        this.newToken = newToken;
    }

}