package br.com.alphapires.springBootDocker.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sneaker {
    private String model;
    private String brand;
    private Integer year;
}
