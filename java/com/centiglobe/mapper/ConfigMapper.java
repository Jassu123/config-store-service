package com.centiglobe.mapper;
import com.centiglobe.entity.ConfigEntity;
import com.centiglobe.model.ConfigDto;

public class ConfigMapper {

    public static ConfigEntity toEntity(ConfigDto configDto) {
        ConfigEntity configEntity = new ConfigEntity();
        configEntity.setMemberName(configDto.getMemberName());
        configEntity.setMaxConnections(configDto.getMaxConnections());
        configEntity.setStatus(configDto.getStatus());
        return configEntity;
    }

    public static ConfigDto toDomain(ConfigEntity configEntity) {
        ConfigDto config = new ConfigDto();
        config.setMemberName(configEntity.getMemberName());
        config.setMaxConnections(configEntity.getMaxConnections());
        config.setStatus(configEntity.getStatus());
        return config;
    }

}

