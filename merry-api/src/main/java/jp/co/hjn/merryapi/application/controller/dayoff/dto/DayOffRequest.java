package jp.co.hjn.merryapi.application.controller.dayoff.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 休暇リクエストクラス
 *
 */
@Data
public class DayOffRequest {
    // グループ作成c
    public static interface CreateDayOff {
    }

    /** ID */
    @JsonProperty("id")
    private Integer id;
    /** 社員ID */
    @JsonProperty("employeeId")
    @NotNull(groups = { CreateDayOff.class })
    private Integer employeeId;
    /** 開始日 */
    @JsonProperty("startDate")
    @NotBlank(groups = { CreateDayOff.class })
    private String startDate;
    /** 終了日 */
    @JsonProperty("endDate")
    @NotBlank(groups = { CreateDayOff.class })
    private String endDate;
}