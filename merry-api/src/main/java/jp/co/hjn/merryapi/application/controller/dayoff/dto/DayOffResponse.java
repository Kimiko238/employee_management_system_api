package jp.co.hjn.merryapi.application.controller.dayoff.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jp.co.hjn.merryapi.domain.dto.DayOffDto;
import lombok.Data;

/**
 * 休暇レスポンスクラス
 *
 */
@Data
public class DayOffResponse {
    /** ID */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("id")
    private Integer id;
    /** 社員ID */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("employeeId")
    private Integer employeeId;
    /** 開始日 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("startDate")
    private String startDate;
    /** 終了日 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("endDate")
    private String endDate;

    public DayOffResponse(DayOffDto dto) {
        this.id = dto.getId();
        this.employeeId = dto.getEmployeeId();
        Optional<LocalDate> optStartDate = Optional.ofNullable(dto.getStartDate());
        this.startDate = optStartDate.isPresent() ? dto.getStartDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                : null;
        Optional<LocalDate> optEndDate = Optional.ofNullable(dto.getEndDate());
        this.endDate = optEndDate.isPresent() ? dto.getEndDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                : null;
    }
}