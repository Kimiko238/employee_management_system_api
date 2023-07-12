package jp.co.highjunk.merryapi.application.controller.employee.dto;

import java.util.List;

import jp.co.highjunk.merryapi.domain.dto.EmployeeDto;
import lombok.Data;

/**
 * 社員レスポンス
 *
 * @author nakamurayuuma
 *
 */
@Data
public class EmployeeGetResponse {
    /** 社員DTOリスト */
    private List<EmployeeDto> employeeList;

    /**
     * コンストラクタ
     *
     * @param employeeDtoList 社員DTOリスト
     */
    public EmployeeGetResponse(List<EmployeeDto> employeeDtoList) {
        this.employeeList = employeeDtoList;
    }
}
