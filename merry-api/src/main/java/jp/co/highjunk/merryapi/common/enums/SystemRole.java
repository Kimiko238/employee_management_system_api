package jp.co.highjunk.merryapi.common.enums;

/**
 * 社内システムロール
 *
 * @author nakamurayuuma
 *
 */
public enum SystemRole {

    /** 一般使用者 */
    GENERAL(1),
    /** データ編集者 */
    EDITOR(2),
    /** データ閲覧者 */
    VIEW(3),
    /** システム管理者 */
    MANAGER(9),;

    /** コード */
    int code;

    /** コンストラクタ */
    SystemRole(int code) {
        this.code = code;
    }

    /** コード取得 */
    public int getCode() {
        return this.code;
    }
}
