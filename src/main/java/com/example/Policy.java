package com.example;

/**
 * パスワードポリシーを保持するエンティティクラスです。
 * 
 * @author atagawa
 * @since 1.0.0 2018/05/24
 *
 */
public class Policy {

    /**
     * 新規のPolicyを構築します。<br>
     * 引数なしの場合、デフォルト値を各プロパティに格納します。
     */
    public Policy() {
        this(PropertiesValue.getPropertiesValue().getDefaultLength(),
                PropertiesValue.getPropertiesValue().getDefaultLetterCase(),
                PropertiesValue.getPropertiesValue().getDefaultAcceptSymbolChars());
    }

    /**
     * 初期値を指定して新規のPolicyを構築します。
     * 
     * @param passwordLength
     *            - パスワードの長さ
     * @param letterCase
     *            - 英字の種別。0（英字を許可しない）, 1（大文字のみ許可する）, 2（小文字のみ許可する）,
     *            3（大文字小文字混在を許可する）のみ指定可能
     * @param acceptSymbolChar
     *            - 記号を許可する(true)かしない(false)か
     */
    public Policy(int passwordLength, int letterCase, boolean acceptSymbolChar) {
        this.passwordLength = passwordLength;
        this.letterCase = letterCase;
        this.acceptSymbolChar = acceptSymbolChar;
    }

    private int passwordLength;

    private int letterCase;

    private boolean acceptSymbolChar;

    /**
     * パスワードの長さを取得します。
     * 
     * @return パスワードの長さ
     */
    public int getPasswordLength() {
        return passwordLength;
    }

    /**
     * パスワードの長さを設定します。
     * 
     * @param passwordLength
     *            - パスワードの長さ
     */
    public void setPasswordLength(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    /**
     * 英字の種別を取得します。
     * 
     * @return 英字の種別
     */
    public int getLetterCase() {
        return letterCase;
    }

    /**
     * 英字の種別を設定します。
     * 
     * @param letterCase
     *            - 英字の種別
     */
    public void setLetterCase(int letterCase) {
        this.letterCase = letterCase;
    }

    /**
     * 記号の指定を取得します。
     * 
     * @return 記号の指定
     */
    public boolean isAcceptSymbolChar() {
        return acceptSymbolChar;
    }

    /**
     * 記号の指定を設定します。
     * 
     * @param acceptSymbolChar
     *            - 記号の指定
     */
    public void setAcceptSymbolChar(boolean acceptSymbolChar) {
        this.acceptSymbolChar = acceptSymbolChar;
    }

}
