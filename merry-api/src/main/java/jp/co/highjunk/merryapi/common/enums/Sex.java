package jp.co.highjunk.merryapi.common.enums;

/**
 * 性別
 * 
 * @author nakamurayuuma
 *
 */
public enum Sex {

    /** 男性 */
    MAN(1),
    /** 女性 */
    WOMAN(2),
    /** その他 */
    OTHERS(9),;

    /** コード */
    int code;

    /** コンストラクタ */
    Sex(int code) {
        this.code = code;
    }

    /** コード取得 */
    public int getCode() {
        return this.code;
    }
}
