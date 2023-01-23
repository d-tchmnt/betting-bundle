package com.nb.bettingcore.domain;

import com.nb.enums.SpecifierEnum;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class MatchOdd {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "MATCH_ID")
    private Long matchId;


    @Column(name = "SPECIFIER")
    private SpecifierEnum specifier;

    @Column(name = "ODD")
    private Long odd;
}
