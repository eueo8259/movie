package com.example.movie.dto;

import com.example.movie.entity.Movies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MoviesDto {
    private Long movieNo;

    private String movieTitle;

    private LocalDateTime movieDate;

    private String movieRate;

    private double goodPointAvg;

    public static MoviesDto fromEntity(Movies movies){
        return new MoviesDto(
                movies.getMovieNo(),
                movies.getMovieTitle(),
                movies.getMovieDate(),
                movies.getMovieRate(),
                movies.getGoodPointAvg()
        );
    }
}
