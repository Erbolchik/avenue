package kz.project.avenue.dto;

import lombok.Data;

@Data
public class AuthenticationResponseDto {

    private String username;

    private String accessToken;

    private String refreshToken;

}
