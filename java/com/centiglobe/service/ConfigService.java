package com.centiglobe.service;

import com.centiglobe.model.ConfigDto;

import java.util.List;

public interface ConfigService {

    public ConfigDto createConfig(ConfigDto config);
    public List<ConfigDto> getConfigs();

    public ConfigDto updateConfig(String memberName,ConfigDto config);
}
