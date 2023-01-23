package com.nb.bettingcore.domain;

import com.nb.enums.SpecifierEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchOdd {

    private Long id;

    private Long matchId;


    private SpecifierEnum specifier;

    private Long odd;
}
