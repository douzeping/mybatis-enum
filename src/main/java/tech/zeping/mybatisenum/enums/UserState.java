package tech.zeping.mybatisenum.enums;

import lombok.Getter;

@Getter
public enum UserState implements BaseCodeEnum {
    UNAUTHENTICATED(100, "未验证"), AUTHENTICATED(200, "已验证");

    private Integer code;
    private String msg;

    UserState(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}