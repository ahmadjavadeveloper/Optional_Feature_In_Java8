package org.learning;

import org.learning.optional.OptionalUseCases;

public class Main {
    public static void main(String[] args) {
        OptionalUseCases optionalUseCases = new OptionalUseCases();
        optionalUseCases.optionalIfPresentExample();
        optionalUseCases.optionalOrElseExample();
        optionalUseCases.optionalOrElseGetExample();
        optionalUseCases.optionalEmptyExample();
        optionalUseCases.optionalFilterExample();
        optionalUseCases.optionalMapExample();
        optionalUseCases.optionalFlatMapExample();
        optionalUseCases.optionalIsPresentExample();
        optionalUseCases.optionalOfExample();
        optionalUseCases.optionalOrElseThrowExample();
    }
}