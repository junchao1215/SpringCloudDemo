package com.client.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
@Data
public class SysRole implements GrantedAuthority {
    private Integer id;
    private String roleName;
    private String roleDesc;
    //标记此属性不做json处理
    @JsonIgnore
    @Override
    public String getAuthority() {
        return null;
    }
}
