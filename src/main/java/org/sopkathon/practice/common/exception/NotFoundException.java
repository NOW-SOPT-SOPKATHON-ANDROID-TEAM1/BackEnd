package org.sopkathon.practice.common.exception;

import org.sopkathon.practice.common.exception.message.ErrorMessage;

public class NotFoundException extends BusinessException {
    public NotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}