package com.example.javaproject;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class MyPOJO {
    @Getter
    @Setter
    public int myInt = 0;

    @Getter
    @Setter
    public String myString = "Test";

    @Getter
    @Setter
    public boolean myBool = true;

    @Override
    public String toString() {
        return "{ myInt:" + this.myInt + ", myString:" + this.myString + ", myBool:" + this.myBool + "}";
    }
}
