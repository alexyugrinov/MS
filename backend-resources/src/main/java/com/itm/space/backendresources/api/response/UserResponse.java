package com.itm.space.backendresources.api.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final List<String> roles;
    private final List<String> groups;

    @JsonCreator
    public UserResponse(
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("email") String email,
            @JsonProperty("roles") List<String> roles,
            @JsonProperty("groups") List<String> groups
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roles = roles;
        this.groups = groups;
    }
}