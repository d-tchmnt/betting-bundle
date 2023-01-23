package com.nb.gateway.persistence.entities;


import com.nb.enums.SpecifierEnum;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.Builder;
import lombok.Data;

@Table(name = "MATCH_ODD")
@Data
@Builder
public class MatchOddE {

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
