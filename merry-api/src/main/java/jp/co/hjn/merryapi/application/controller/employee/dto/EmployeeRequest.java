package jp.co.hjn.merryapi.application.controller.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 社員リクエストクラス
 *
 */
@Data
public class EmployeeRequest {
    // グループ作成
    public static interface CreateEmployee {
    }

    public static interface UpdateEmployee {
    }

    /** 名前 名 */
    @JsonProperty("id")
    private Integer id;
    /** 名前 名 */
    @JsonProperty("nameFirst")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 64, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String nameFirst;
    /** 名前 性 */
    @JsonProperty("nameLast")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 64, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String nameLast;
    /** 名前 名 カナ */
    @JsonProperty("nameFirstKana")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 64, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String nameFirstKana;
    /** 名前 性 カナ */
    @JsonProperty("nameLastKana")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 64, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String nameLastKana;
    /** 役職 */
    @JsonProperty("employeePosition")
    @NotBlank(groups = { CreateEmployee.class })
    private String employeePosition;
    /** システムロール */
    @JsonProperty("systemRole")
    @NotBlank(groups = { CreateEmployee.class })
    private String systemRole;
    /** 郵便番号 */
    @JsonProperty("postalCode")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 8, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String postalCode;
    /** 都道府県 */
    @JsonProperty("prefectures")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 16, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String prefectures;
    /** 市区町村 */
    @JsonProperty("municipalities")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 64, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String municipalities;
    /** 住所1 */
    @JsonProperty("address1")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 64, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String address1;
    /** 住所2 */
    @JsonProperty("address2")
    @NotBlank(groups = { CreateEmployee.class })
    @Size(max = 64, groups = { CreateEmployee.class, UpdateEmployee.class }, message = "{max}文字以内で入力してください。")
    private String address2;
    /** 電話番号 */
    @JsonProperty("phoneNumber")
    @NotBlank(groups = { CreateEmployee.class })
    @Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", groups = { CreateEmployee.class,
            UpdateEmployee.class }, message = "入力が不正です。")
    private String phoneNumber;
    /** 生年月日 */
    @JsonProperty("birthday")
    @NotBlank(groups = { CreateEmployee.class })
    private String birthday;
    /** 性別 */
    @JsonProperty("sex")
    @NotBlank(groups = { CreateEmployee.class })
    private String sex;
}