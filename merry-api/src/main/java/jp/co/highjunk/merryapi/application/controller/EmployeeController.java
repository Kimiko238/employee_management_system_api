package jp.co.highjunk.merryapi.application.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jp.co.highjunk.merryapi.application.controller.employee.dto.EmployeeGetResponse;
import jp.co.highjunk.merryapi.domain.service.EmployeeService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 社員コントローラー
 *
 * @author nakamurayuuma
 *
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    /** 社員サービス */
    @NonNull
    private final EmployeeService employeeService;

    /**
     * 社員取得
     *
     * @param request リクエスト
     * @return ResponseEntity EmployeeGetResponse 200
     */
    @GetMapping("/find")
    public ResponseEntity<EmployeeGetResponse> find(@RequestParam List<Integer> ids) {
        return ResponseEntity.ok(new EmployeeGetResponse(this.employeeService.find(ids)));
    }
}
