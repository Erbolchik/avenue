package kz.project.avenue.controller;

import kz.project.avenue.domain.User;
import kz.project.avenue.dto.AuthenticationRequestDto;
import kz.project.avenue.dto.AuthenticationResponseDto;
import kz.project.avenue.security.jwt.JwtTokenProvider;
import kz.project.avenue.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/api/auth/v1")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponseDto> login(@RequestBody AuthenticationRequestDto requestDto) {
        try {
            String username = requestDto.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, requestDto.getPassword()));

            User user = userService.findByUsername(username);

            if (user == null) {
                throw new UsernameNotFoundException("User with username " + username + " not found");
            }
            String token = jwtTokenProvider.createToken(username, user.getRoles().stream().collect(Collectors.toSet()));
            AuthenticationResponseDto response = new AuthenticationResponseDto();
            response.setUsername(username);
            response.setAccessToken(token);
            response.setRefreshToken("123");

            return ResponseEntity.ok(response);

        } catch (AuthenticationException exception) {
            throw new BadCredentialsException("Invalid username or password");
        }
    }

}
