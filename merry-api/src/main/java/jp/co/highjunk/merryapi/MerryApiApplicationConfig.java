package jp.co.highjunk.merryapi;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * アプリケーション設定クラス
 *
 * @author nakamurayuuma
 *
 */
@Configuration
public class MerryApiApplicationConfig {

    /**
     * ModelMapper
     *
     * @return ModelMapper
     */
    @Bean
    ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }
}