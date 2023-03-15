package com.centiglobe.controller;
import com.centiglobe.model.ConfigDto;
import com.centiglobe.service.ConfigService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/configs")
@AllArgsConstructor
public class ConfigController {

    private final ConfigService configService;

    @GetMapping("get")
    public List<ConfigDto> getConfig() {
        return configService.getConfigs();
    }

    @PutMapping("/{memberName}")
    public void updateConfig(@PathVariable String memberName, @RequestBody ConfigDto config) {
        configService.updateConfig(memberName, config);
    }

    @PostMapping("add")
    public ConfigDto createConfig(@Valid  @RequestBody ConfigDto newConfig) {
        return configService.createConfig(newConfig);
    }
}
