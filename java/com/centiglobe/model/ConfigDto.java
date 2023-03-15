package com.centiglobe.model;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfigDto {
    @Pattern(regexp = "^[a-z0-9]+([-\\.][a-z0-9]+)*$")
    private String memberName;

    @Range(min = 0, max = 32)
    private int maxConnections;

    @Pattern(regexp = "^(Active|Suspended|Decommissioned)$")
    private String status;
}
