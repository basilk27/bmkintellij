package com.mbsystems.demogitintellij.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GitIntellij {

    private final String version;
    private final String code;
    private final String location;
}
