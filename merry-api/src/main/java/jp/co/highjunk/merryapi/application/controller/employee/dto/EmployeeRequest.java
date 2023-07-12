package jp.co.highjunk.merryapi.application.controller.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 社員リクエストクラス
 *
 */
@Data
public class EmployeeRequest {
    /** 名前 名 */
    @JsonProperty("id")
    private Integer id;
    /** 名前 名 */
    @JsonProperty("nameFirst")
    private String nameFirst;
    /** 名前 性 */
    @JsonProperty("nameLast")
    private String nameLast;
    /** 名前 名 カナ */
    @JsonProperty("nameFirstKana")
    private String nameFirstKana;
    /** 名前 性 カナ */
    @JsonProperty("nameLastKana")
    private String nameLastKana;
    /** 役職 */
    @JsonProperty("employeePosition")
    private String employeePosition;
    /** システムロール */
    @JsonProperty("systemRole")
    private String systemRole;
    /** 郵便番号 */
    @JsonProperty("postalCode")
    private String postalCode;
    /** 都道府県 */
    @JsonProperty("prefectures")
    private String prefectures;
    /** 市区町村 */
    @JsonProperty("municipalities")
    private String municipalities;
    /** 住所1 */
    @JsonProperty("address1")
    private String address1;
    /** 住所2 */
    @JsonProperty("address2")
    private String address2;
    /** 電話番号 */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /** 生年月日 */
    @JsonProperty("birthday")
    private String birthday;
    /** 性別 */
    @JsonProperty("sex")
    private String sex;
}