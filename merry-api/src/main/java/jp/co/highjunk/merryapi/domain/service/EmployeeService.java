package jp.co.highjunk.merryapi.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import jp.co.highjunk.merryapi.domain.dto.EmployeeDto;
import jp.co.highjunk.merryapi.infrastructure.mapper.EmployeeMapper;
import jp.co.highjunk.merryapi.infrastructure.model.Employee;
import jp.co.highjunk.merryapi.infrastructure.model.EmployeeExample;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 社員サービス
 *
 * @author nakamurayuuma
 *
 */
@RequiredArgsConstructor
@Service
public class EmployeeService {

    /** ModelMapper */
    @NonNull
    private final ModelMapper modelMapper;

    /** ModelMapper */
    @NonNull
    private final EmployeeMapper employeeMapper;

    /**
     * 社員取得
     *
     * @param idList IDリスト
     * @return 社員リスト
     */
    public List<EmployeeDto> find(List<Integer> idList) {
        if (CollectionUtils.isEmpty(idList))
            return new ArrayList<EmployeeDto>();

        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andIdIn(idList);
        List<Employee> employeeList = this.employeeMapper.selectByExample(example);

        return employeeList.stream().map(e -> this.modelMapper.map(e, EmployeeDto.class)).toList();
    }
}
