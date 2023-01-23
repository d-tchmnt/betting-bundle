package com.nb.bettingcore.domain;

import com.nb.enums.SportEnum;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Match {


    private Long id;

    private String description;

    private LocalDate matchDate;


    private Instant matchTime;


    private String homeTeam;

    private String awayTeam;


    private SportEnum sport;


    private List<MatchOdd> matchOddE;
}
