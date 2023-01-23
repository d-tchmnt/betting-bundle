package com.nb.gateway.persistence.entities;


import com.nb.enums.SportEnum;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "MATCH")
@Entity

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchE {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;


    @Column(name = "MATCH_DATE")

    private LocalDate matchDate;

    @Column(name = "MATCH_TIME")

    private Instant matchTime;

    @Column(name = "HOME_TEAM", nullable = false)

    private String homeTeam;

    @Column(name = "AWAY_TEAM", nullable = false)

    private String awayTeam;

    @Column(name = "SPORT", nullable = false)
    private SportEnum sport;

    @Column(name = "SPORT")
    @OneToMany
    private List<MatchOddE> matchOddE;
}
