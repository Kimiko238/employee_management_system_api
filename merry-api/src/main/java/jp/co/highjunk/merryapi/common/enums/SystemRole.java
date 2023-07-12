package jp.co.highjunk.merryapi.common.enums;

/**
 * 社内システムロール
 *
 * @author nakamurayuuma
 *
 */
public enum SystemRole {

    /** 一般使用者 */
    GENERAL(1, "一般使用者"),
    /** データ編集者 */
    EDITOR(2, "データ編集者"),
    /** データ閲覧者 */
    VIEW(3, "データ閲覧者"),
    /** システム管理者 */
    MANAGER(9, "システム管理者"),;

    /** コード */
    int code;
    /** 名称 */
    String name;

    /** コンストラクタ */
    SystemRole(int code, String name) {
        this.code = code;
        this.name = name;
    }

    /** コード取得 */
    public int getCode() {
        return this.code;
    }

    /** 名称取得 */
    public String getName() {
        return this.name;
    }

    /**
     * コードと一致するオブジェクト取得
     *
     * @param code コード
     * @return オブジェクト
     */
    public static SystemRole getObject(int code) {
        for (SystemRole e : SystemRole.values()) {
            if (e.getCode() == code)
                return e;
        }
        return null;
    }
}