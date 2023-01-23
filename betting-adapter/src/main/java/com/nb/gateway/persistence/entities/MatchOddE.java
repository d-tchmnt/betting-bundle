package com.nb.gateway.persistence.entities;


import com.nb.enums.SpecifierEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "MATCH_ODD")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchOddE {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Column(name = "MATCH_ID", nullable = false)
    private Long matchId;


    @Column(name = "SPECIFIER", nullable = false)
    private SpecifierEnum specifier;

    @Column(name = "ODD", nullable = false)
    private Long odd;

}
