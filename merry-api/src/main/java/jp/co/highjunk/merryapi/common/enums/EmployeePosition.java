package jp.co.highjunk.merryapi.common.enums;

/**
 * 役職
 *
 * @author nakamurayuuma
 *
 */
public enum EmployeePosition {

    /** その他 */
    OTHER(0),
    /** 研修 */
    TRAINING(1),
    /** 研修卒業 */
    TRAINING_GRADUATION(2),
    /** 一般 */
    GENERAL(3),
    /** 準主任 */
    ASSOCIATE_CHIEF(4),
    /** 主任 */
    CHIEF(5),
    /** 係長 */
    SUBSECTION_MANAGER(6),
    /** 課長 */
    UNIT_MANAGER(7),
    /** 部長 */
    MANAGER(8),
    /** 社長 */
    PRESIDENT(9),;

    /** コード */
    int code;

    /** コンストラクタ */
    EmployeePosition(int code) {
        this.code = code;
    }

    /** コード取得 */
    public int getCode() {
        return this.code;
    }
}
