package edu.nextstep.lotto.common;

public class BusinessException extends RuntimeException {

    private final String code;
    private final String message;

    public BusinessException(Exception e, BusinessError error) {
        super(error.getMessage(), e);
        this.code = error.name();
        this.message = error.getMessage();
    }

    public BusinessException(BusinessError error) {
        this.code = error.name();
        this.message = error.getMessage();
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
