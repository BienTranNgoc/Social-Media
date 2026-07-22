package com.social_media.identity.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    USER_EXISTED(1001, "Username already exists"),
    USERNAME_INVALID(1002, "Username must be between 3 and 20 characters"),
    INVALID_PASSWORD(1003, "Password must be between 6 and 20 characters"),
    INVALID_KEY(1004, "Invalid message key")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

}
