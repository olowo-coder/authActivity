package com.dailycodebuffer.oauthserver.service;

import com.dailycodebuffer.oauthserver.entity.User;
import com.dailycodebuffer.oauthserver.entity.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

}
