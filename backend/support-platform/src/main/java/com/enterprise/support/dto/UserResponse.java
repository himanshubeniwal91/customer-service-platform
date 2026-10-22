
package com.enterprise.support.dto;

import com.enterprise.support.user.Role;
import java.time.LocalDateTime;

public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private Role role;
    private boolean enabled;
    private LocalDateTime createdAt;

    public UserResponse() {
    }

    public UserResponse(
            Long id,
            String name,
            String email,
            Role role,
            boolean enabled,
            LocalDateTime createdAt) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.enabled = enabled;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
