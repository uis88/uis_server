package com.uis88.server.user.common.web.response.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {
    SUCCESS("000000", "Operation succeeded."),
    ERROR("999999", "Something is wrong with our system. Please try again later.");

    private final String code;
    private final String message;
}
