package com.centiglobe.service.impl;
import com.centiglobe.entity.ConfigEntity;
import com.centiglobe.mapper.ConfigMapper;
import com.centiglobe.model.ConfigDto;
import com.centiglobe.repository.ConfigRepository;
import com.centiglobe.service.ConfigService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ConfigServiceImpl implements ConfigService {
    private final ConfigRepository repository;

    /**
     * @param config
     * @return
     */
    @Override
    public ConfigDto createConfig(ConfigDto config) {
        return ConfigMapper.toDomain(repository.save(ConfigMapper.toEntity(config)));
    }


    /**
     * @return
     */
    @Override
    public List<ConfigDto> getConfigs() {
        // Retrieve all ConfigEntity objects from the database
        List<ConfigEntity> entityList = repository.findAll();

        // Map the ConfigEntity objects to ConfigDto objects using a ConfigMapper
        List<ConfigDto> dtoList = entityList.stream().map(entity -> ConfigMapper.toDomain(entity)).collect(Collectors.toList());

        // Return the list of ConfigDto objects
        return dtoList;
    }


    public ConfigDto updateConfig(String memberName,ConfigDto config) {
        ConfigEntity existingConfig = repository.findByMemberName(config.getMemberName());
        existingConfig.setMemberName(config.getMemberName());
        existingConfig.setStatus(config.getStatus());
        existingConfig.setMaxConnections(config.getMaxConnections());
        ConfigEntity updatedConfig = repository.save(existingConfig);
        return  ConfigMapper.toDomain(updatedConfig);
    }

}
