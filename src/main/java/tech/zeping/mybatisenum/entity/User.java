package tech.zeping.mybatisenum.entity;

import lombok.Data;
import tech.zeping.mybatisenum.enums.UserEnum;

@Data
public class User {

    private String username;

    private UserEnum.UserState state;
}
