package com.nb.gateway.persistence.entities;


import com.nb.enums.SportEnum;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Table(name = "MATCH")
@Data
@Builder
public class MatchE {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;


    @Column(name = "MATCH_DATE")

    private LocalDate matchDate;

    @Column(name = "MATCH_TIME")

    private Instant matchTime;

    @Column(name = "HOME_TEAM")

    private String homeTeam;
    @Column(name = "AWAY_TEAM")

    private String awayTeam;

    @Column(name = "SPORT")
    private SportEnum sport;

    @Column(name = "SPORT")
    @OneToMany
    private List<MatchOddE> matchOddE;
}
