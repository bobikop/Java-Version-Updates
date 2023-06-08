package com.cydeo;
import lombok.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Apple {

    private int weight;
    private Color color;


    // replacing code field for getter and to String method with above lombok annotation
    // on this way we avoid so called boilerplate or verbose code.
}
