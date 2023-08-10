package com.tendermilk.auth.payload.response;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class JwtResponse {

    @NonNull
    private String token;

    private String type = "Bearer";

    @NonNull
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String email;
}