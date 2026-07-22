package com.social_media.identity.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserCreationRequest {

    @Size(min = 3, max = 20, message = "INVALID_USERNAME")
    private String username;

    @Size(min = 6, max = 20, message = "INVALID_PASSWORD")
    private String password;

    @NotNull(message = "Name cannot be null")
    private String name;

    private LocalDate dob;
}
