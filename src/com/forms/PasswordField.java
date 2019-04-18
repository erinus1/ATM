package com.forms;

public class PasswordField {
    String value; // The field value
    boolean isRequired; // Is the password is required field?

    public PasswordField () {
        this(false);
    }

    public PasswordField (boolean isRequired) {
        this.isRequired = isRequired;
    }

    public void setValue (String newPassword) {
        // устанавливать новое значение, только если все условия выполнены:
        // 1) длина не больше 15 символов
        // 2) если поле обязательное, то оно не может быть пустым
        // 3) новый пароль не должен быть слово "password"
        // иначе: устанавливаем значение "NOT_VALID_PASSWORD"

        if (newPassword.length() <= 15 && newPassword.isEmpty() == false) {
            value = newPassword;
        }
    }

    public String getValue () {
        return value;
    }

    public boolean isValid () {
        if (value.isEmpty() && isRequired){
            return false;
        }

        if (value.length() < 8) {
            return false;
        }
        return true;
    }
}
