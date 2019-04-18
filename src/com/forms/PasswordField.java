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
        // устанавливать новое значение, только если:
        // 1) длина нового значения не более 15 символов
        // 2) новое значение не пустое
        value = newPassword;


        if (value.length <= 5 || value.length <= 15 && value.isEmpty() == false){
            value == newPassword;
        }
        else {value.leght >= 16 && value.isEmpty() == false || value.length == null}

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
