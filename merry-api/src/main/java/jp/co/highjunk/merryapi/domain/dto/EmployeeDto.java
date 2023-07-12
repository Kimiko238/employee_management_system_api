package jp.co.highjunk.merryapi.domain.dto;

import java.time.LocalDate;

import jp.co.highjunk.merryapi.common.enums.EmployeePosition;
import jp.co.highjunk.merryapi.common.enums.Sex;
import jp.co.highjunk.merryapi.common.enums.SystemRole;
import lombok.Data;

/**
 * 社員Dtoクラス
 *
 * @author nakamurayuuma
 *
 */
@Data
public class EmployeeDto {
    /** 名前 名 */
    private String nameFirst;
    /** 名前 性 */
    private String nameLast;
    /** 名前 名 カナ */
    private String nameFirstKana;
    /** 名前 性 カナ */
    private String nameLastKana;
    /** 役職 */
    private EmployeePosition employeePosition;
    /** 役職 */
    private SystemRole systemRole;
    /** 郵便番号 */
    private String postalCode;
    /** 都道府県 */
    private String prefectures;
    /** 市区町村 */
    private String municipalities;
    /** 住所1 */
    private String address1;
    /** 住所2 */
    private String address2;
    /** 電話番号 */
    private String phoneNumber;
    /** 生年月日 */
    private LocalDate birthday;
    /** 性別 */
    private Sex sex;
}
