package br.com.pulse.estoque.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("br.com.pulse.estoque.mapper")
public class DBConfig {
}