package com.uis88.server.user.common.web.response;

import com.uis88.server.core.common.web.response.PaginationDTO;
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
