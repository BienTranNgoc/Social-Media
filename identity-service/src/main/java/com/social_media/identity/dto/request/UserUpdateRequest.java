package com.social_media.identity.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserUpdateRequest {
    private String password;
    private String name;
    private LocalDate dob;
}
