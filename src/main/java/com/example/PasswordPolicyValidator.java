/**
 * 
 */
package com.example;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Policyの各値が問題ないかチェックするクラスです。
 * 
 * @author atagawa
 * @since 1.0.0 2018/05/24
 */
public class PasswordPolicyValidator {

    private List<String> errors;

    /**
     * 新規のPasswordPolicyValidatorを構築します。
     */
    public PasswordPolicyValidator() {
        errors = new ArrayList<>();
    }

    /**
     * 渡されたPolicyオブジェクトの値が正常値にあるかチェックします。
     * 
     * @param policy
     *            - 値を持つPolicyオブジェクト
     * @return 値が正常であればtrue, エラーを検出した場合はfalse
     */
    public boolean validate(Policy policy) {
        int length = policy.getPasswordLength();
        int charCase = policy.getLetterCase();

        if (length < PropertiesValue.getPropertiesValue().getMinLength()
                || PropertiesValue.getPropertiesValue().getMaxLength() < length) {
            errors.add(MessageFormat.format(
                    PropertiesValue.getPropertiesMessage().getMessage(MessageType.ERRMSG_OVER_PASSWORD_LENGTH),
                    length));
        }

        if (charCase < PropertiesValue.getPropertiesValue().getMinOfLetterCase()
                || PropertiesValue.getPropertiesValue().getMaxOfLetterCase() < charCase) {
            errors.add(MessageFormat.format(
                    PropertiesValue.getPropertiesMessage().getMessage(MessageType.ERRMSG_OVER_RANGE_VALUE), charCase));
        }

        if (errors.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * validation errorを返します。
     * 
     * @return - validation errorの詳細なメッセージを含むListオブジェクト
     */
    public List<String> getErrors() {
        return errors;
    }
}
