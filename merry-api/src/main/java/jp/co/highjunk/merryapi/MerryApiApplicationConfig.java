package jp.co.highjunk.merryapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.highjunk.merryapi.common.enums.EmployeePosition;
import jp.co.highjunk.merryapi.common.enums.Sex;
import jp.co.highjunk.merryapi.common.enums.SystemRole;

/**
 * アプリケーション設定クラス
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
        // EmployeePositionコンバーター追加
        Converter<Integer, EmployeePosition> employeePositionConverter = new AbstractConverter<Integer, EmployeePosition>() {
            @Override
            protected EmployeePosition convert(Integer source) {
                Optional<EmployeePosition> optEmployeePosition = Optional
                        .ofNullable(EmployeePosition.getObject(source));
                return optEmployeePosition.isPresent() ? optEmployeePosition.get() : null;
            }
        };
        modelMapper.addConverter(employeePositionConverter);
        // Sexコンバーター追加
        Converter<Integer, Sex> sexConverter = new AbstractConverter<Integer, Sex>() {
            @Override
            protected Sex convert(Integer source) {
                Optional<Sex> optSex = Optional.ofNullable(Sex.getObject(source));
                return optSex.isPresent() ? optSex.get() : null;
            }
        };
        modelMapper.addConverter(sexConverter);
        // SystemRoleコンバーター追加
        Converter<Integer, SystemRole> systemRoleConverter = new AbstractConverter<Integer, SystemRole>() {
            @Override
            protected SystemRole convert(Integer source) {
                Optional<SystemRole> optSystemRole = Optional.ofNullable(SystemRole.getObject(source));
                return optSystemRole.isPresent() ? optSystemRole.get() : null;
            }
        };
        modelMapper.addConverter(systemRoleConverter);
        // Date-LocaDateコンバーター追加
        Converter<Date, LocalDate> dateToLocalDateConverter = new AbstractConverter<Date, LocalDate>() {
            @Override
            protected LocalDate convert(Date source) {
                Optional<Date> optDate = Optional.ofNullable(source);
                LocalDate localDate = optDate.isPresent()
                        ? LocalDate.ofInstant(optDate.get().toInstant(), ZoneId.systemDefault())
                        : null;
                return localDate;
            }
        };
        modelMapper.addConverter(dateToLocalDateConverter);

        return modelMapper;
    }
}