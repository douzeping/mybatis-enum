package tech.zeping.mybatisenum.entity.instance;

import tech.zeping.mybatisenum.entity.User;
import tech.zeping.mybatisenum.enums.UserEnum;

public class AuthUser extends User {

    AuthUser(){
        this.setState(UserEnum.UserState.AUTHENTICATED);
    }
}
