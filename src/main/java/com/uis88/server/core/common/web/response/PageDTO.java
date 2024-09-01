package com.uis88.server.core.common.web.response;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class PageDTO<T> {
    private final T data;
    private final PaginationDTO pagination;
}
