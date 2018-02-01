package com.xzl.bat.domain.dto.push;

import java.io.Serializable;

public class NoticeDTO implements Serializable{

    /**
     * @FieldsserialVersionUID:TODO
     */
    private static final long serialVersionUID = -6196463494802422351L;

    /**
     * 接收方手机
     */
    private String account;

    /**
     * 接收方账号
     */
    private int uid;

    /**
     * 消息
     */
    private NoticeInfo msg;

    private int type;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public NoticeInfo getMsg() {
        return msg;
    }

    public void setMsg(NoticeInfo msg) {
        this.msg = msg;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "NoticeDTO{" +
                "account='" + account + '\'' +
                ", uid=" + uid +
                ", msg=" + msg +
                ", type=" + type +
                '}';
    }
}
