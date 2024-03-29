package kr.co.gradesmanagement.infra.exception;

import kr.co.gradesmanagement.infra.exception.error.ErrorCode;

public class InvalidRequestException extends CustomException {

    public InvalidRequestException(ErrorCode errorCode) {
        super(errorCode);
    }

    public InvalidRequestException(String message) {
        super(message);
    }
}
