package com.example.novel_backend.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * User information Response DTO
 *
 * @author :Contanstin
 * @create 2023/6/14 20:21
 */
@Data
@Builder
public class UserInfoRespDto {

    /**
     * Username
     * */
    @Schema(description = "Username")
    private String username;

    /**
     * User Photo
     * */
    @Schema(description = "User Photo")
    private String userPhoto;

    /**
     * User sex
     * */
    @Schema(description = "User sex")
    private Integer userSex;

    /**
     * User email
     * */
    @Schema(description = "User email")
    private String userEmail;

    /**
     * Creation time
     */
    @Schema(description = "Creation time")
    private LocalDateTime createTime;

}
