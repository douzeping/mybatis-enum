package tech.zeping.mybatisenum.enums;

import lombok.Getter;

@Getter
public enum UserState2 {
    UNAUTHENTICATED(100, "未验证"), AUTHENTICATED(200, "已验证");

    private Integer code;
    private String msg;

    UserState2(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
