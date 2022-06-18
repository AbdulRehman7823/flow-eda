package com.flow.eda.oauth2.user;

import lombok.Data;

import java.util.Date;

/** 用户 */
@Data
public class OauthUser {
    private Long id;
    private String username;
    private String password;
    private String clientId;
    private String authorities;
    private String phone;
    private String email;
    private Boolean status;
    private Date createDate;
    private Date updateDate;
}
