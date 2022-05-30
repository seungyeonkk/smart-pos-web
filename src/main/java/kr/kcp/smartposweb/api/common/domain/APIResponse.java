package kr.kcp.smartposweb.api.common.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIResponse {

    private String code;
    private String message;
    private Object data;

    public static APIResponse success() {
        return APIResponse.builder().code("200").message("success").build();
    }

    public static APIResponse success( Object data) {
        return APIResponse.builder().code("200").message("success").data(data).build();
    }

    public static APIResponse fail() {
        return APIResponse.builder().code("500").message("fail").build();
    }
}
