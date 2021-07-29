package com.rubypaper.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
public class MyData implements Serializable {
	
    private static final long serialVersionUID = -7353484588260422449L;
    private String studentId;
    private String name;
    
}