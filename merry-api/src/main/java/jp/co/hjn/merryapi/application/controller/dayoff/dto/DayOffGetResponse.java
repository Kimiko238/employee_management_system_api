package jp.co.hjn.merryapi.application.controller.dayoff.dto;

import java.util.List;

import jp.co.hjn.merryapi.domain.dto.DayOffDto;
import lombok.Data;

/**
 * 休暇レスポンス
 *
 */
@Data
public class DayOffGetResponse {
    /** 休暇DTOリスト */
    private List<DayOffResponse> dayOffList;

    /**
     * コンストラクタ
     *
     * @param dayOffList 休暇DTOリスト
     */
    public DayOffGetResponse(List<DayOffDto> dayOffDtoList) {
        this.dayOffList = dayOffDtoList.stream().map(dto -> new DayOffResponse(dto)).toList();
    }
}