package jp.co.highjunk.merryapi.application.controller.employee;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.co.highjunk.merryapi.application.controller.common.dto.ResultResponse;
import jp.co.highjunk.merryapi.application.controller.employee.dto.EmployeeRequest;
import jp.co.highjunk.merryapi.application.controller.employee.dto.EmployeeResponse;
import jp.co.highjunk.merryapi.common.enums.ResultCode;
import jp.co.highjunk.merryapi.domain.dto.EmployeeDto;
import jp.co.highjunk.merryapi.domain.service.EmployeeService;

/**
 * 社員コントローラー
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    /** 社員サービス */
    private EmployeeService employeeService;

    /**
     * コンストラクタ
     *
     * @param employeeService 社員サービス
     */
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * 社員取得
     *
     * @param request リクエスト
     * @return ResponseEntity EmployeeGetResponse 200
     */
    @GetMapping("/find")
    public ResponseEntity<List<EmployeeResponse>> find(@RequestParam List<Integer> ids) {
        return ResponseEntity.ok(
                this.employeeService.find(ids)
                        .stream()
                        .map(dto -> new EmployeeResponse(dto))
                        .toList());
    }

    /**
     * 社員登録
     *
     * @param request リクエスト
     * @return ResponseEntity EmployeeGetResponse 200
     */
    @PostMapping("/create")
    public ResponseEntity<ResultResponse> create(@RequestBody EmployeeRequest request) {
        return ResponseEntity.ok(
                this.employeeService.create(new EmployeeDto(request))
                        ? new ResultResponse(ResultCode.OK.getCode())
                        : new ResultResponse(ResultCode.NG.getCode()));
    }

    /**
     * 社員更新
     *
     * @param request リクエスト
     * @return ResponseEntity EmployeeGetResponse 200
     */
    @PutMapping("/update")
    public ResponseEntity<ResultResponse> update(@RequestBody EmployeeRequest request) {
        return ResponseEntity.ok(
                this.employeeService.update(new EmployeeDto(request))
                        ? new ResultResponse(ResultCode.OK.getCode())
                        : new ResultResponse(ResultCode.NG.getCode()));
    }
}
