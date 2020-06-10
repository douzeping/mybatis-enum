package tech.zeping.mybatisenum.pojo.request;

import lombok.Data;
import tech.zeping.mybatisenum.enums.UserState;

public class UserRequest {

    @Data
    public static class AddUser{
        private UserState userState;
    }
}
