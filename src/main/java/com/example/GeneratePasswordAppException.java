package com.example;

/**
 * GeneratePasswordアプリにおける例外をスローするためのクラスです。
 * 
 * @author atagawa
 * @since 1.0.0 2018/05/24
 *
 */
public class GeneratePasswordAppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 指定された詳細メッセージを持つGeneratePasswordAppExceptionを構築します。
     * 
     * @param message
     *            - 詳細メッセージ(あとでThrowable.getMessage()メソッドで取得できるように保存される)。
     */
    public GeneratePasswordAppException(String message) {
        super(message);
    }

    /**
     * 指定された原因を持つGeneratePasswordAppExceptionを構築します。
     * 
     * @param cause
     *            -
     *            原因(あとでThrowable.getCause()メソッドで取得できるように保存される)。(null値が許可されており、原因が存在しないか不明であることを示す。)
     */
    public GeneratePasswordAppException(Throwable cause) {
        super(cause);
    }

    /**
     * 指定された詳細メッセージと原因を持つGeneratePasswordAppExceptionを構築します。
     * 
     * @param message
     *            - 詳細メッセージ(あとでThrowable.getMessage()メソッドで取得できるように保存される)。
     * @param cause
     *            -
     *            原因(あとでThrowable.getCause()メソッドで取得できるように保存される)。(null値が許可されており、原因が存在しないか不明であることを示す。)
     */
    public GeneratePasswordAppException(String message, Throwable cause) {
        super(message, cause);
    }
}
