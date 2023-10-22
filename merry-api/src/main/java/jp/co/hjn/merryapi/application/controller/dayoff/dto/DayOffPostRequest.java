package jp.co.hjn.merryapi.application.controller.dayoff.dto;

import jp.co.hjn.merryapi.domain.dto.DayOffDto;
import lombok.Data;

/**
 * 休暇作成レスポンス
 *
 */
@Data
public class DayOffPostRequest {
    /** 休暇DTO */
    private DayOffDto dayOffDto;

    /**
     * コンストラクタ
     *
     * @param dayOffDto 休暇DTO
     */
    public DayOffPostRequest(DayOffDto dayOffDto) {
        this.dayOffDto = dayOffDto;
    }
}
