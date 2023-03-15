package com.centiglobe.repository;
import com.centiglobe.entity.ConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ConfigRepository extends JpaRepository<ConfigEntity,String> {
    public ConfigEntity findByMemberName(String name);
}
