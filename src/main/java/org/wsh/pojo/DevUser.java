package org.wsh.pojo;

import lombok.Data;

@Data
public class DevUser {
    private int id;
    private String devCode;
    private String devName;
    private String devPassword;
    private String devEmail;
    private String devInfo;
    private int createdBy;
    private String creationDate;
    private int modifyBy;
    private String modifyDate;

    public DevUser() {
    }

    public DevUser(int id, String devCode, String devName, String devPassword, String devEmail, String devInfo, int createdBy, String creationDate, int modifyBy, String modifyDate) {
        this.id = id;
        this.devCode = devCode;
        this.devName = devName;
        this.devPassword = devPassword;
        this.devEmail = devEmail;
        this.devInfo = devInfo;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
    }
}
