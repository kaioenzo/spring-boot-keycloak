package com.example.keycloackspring3.config.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

@Validated
@Configuration
@ConfigurationProperties(prefix = "jwt.auth.converter")
public class JwtAuthConverterProperties {

    private String resourceId;
    private String principalAttribute;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getPrincipalAttribute() {
        return principalAttribute;
    }

    public void setPrincipalAttribute(String principalAttribute) {
        this.principalAttribute = principalAttribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JwtAuthConverterProperties that = (JwtAuthConverterProperties) o;
        return resourceId.equals(that.resourceId) && principalAttribute.equals(that.principalAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, principalAttribute);
    }

    @Override
    public String toString() {
        return "JwtAuthConverterProperties{" +
                "resourceId='" + resourceId + '\'' +
                ", principalAttribute='" + principalAttribute + '\'' +
                '}';
    }
}
