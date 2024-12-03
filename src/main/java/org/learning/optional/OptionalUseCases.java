package org.learning.optional;

import java.util.Optional;

public class OptionalUseCases {

    String[] words;

    public void optionalIfPresentExample() {
        words = new String[10];
        words[5] = "Java Optional Example";

        // Without Optional
        String word = (words[6] != null) ? words[5] : "No value found";
        System.out.println(word);

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[6]);
        wordOptional.ifPresent(System.out::println);
    }

    public void optionalOrElseExample() {
        words = new String[6];
        words[4] = "Java Optional Example";

        // Without Optional
        String word = (words[5] != null) ? words[5] : "No value found";
        System.out.println(word);

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[5]);
        System.out.println(wordOptional.orElse("No value found"));
    }

    public void optionalOrElseGetExample() {
        words = new String[7];
        words[4] = "Java Optional Example";

        // Without Optional
        String word = (words[5] != null) ? words[5] : "No value found";
        System.out.println(word);

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[5]);
        System.out.println(wordOptional.orElseGet(() -> "No value found"));
    }

    public void optionalOrElseThrowExample() {
        words = new String[8];
        words[4] = "Java Optional Example";

        // Without Optional
        String word = (words[5] != null) ? words[5] : "No value found";
        System.out.println(word);

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[5]);
        System.out.println(wordOptional.orElseThrow(() -> new RuntimeException("No value found")));
    }

    public void optionalFilterExample() {
        words = new String[9];
        words[4] = "Java Optional Example";

        // Without Optional
        if (words[5] != null && words[5].contains("Java")) {
            System.out.println(words[5]);
        }

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[5]);
        wordOptional.filter(word -> word.contains("Java")).ifPresent(System.out::println);
    }

    public void optionalMapExample() {
        words = new String[10];
        words[4] = "Java Optional Example";

        // Without Optional
        if (words[5] != null) {
            System.out.println(words[5].length());
        }

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[5]);
        wordOptional.map(String::length).ifPresent(System.out::println);
    }

    public void optionalFlatMapExample() {
        words = new String[11];
        words[4] = "Java Optional Example";

        // Without Optional
        if (words[5] != null) {
            System.out.println(words[5].length());
        }

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[5]);
        wordOptional.flatMap(word -> Optional.of(word.length())).ifPresent(System.out::println);
    }

    public void optionalIsPresentExample() {
        words = new String[12];
        words[4] = "Java Optional Example";

        // Without Optional
        if (words[5] != null) {
            System.out.println("Value is present");
        } else {
            System.out.println("Value is not present");
        }

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[5]);
        if (wordOptional.isPresent()) {
            System.out.println("Value is present");
        } else {
            System.out.println("Value is not present");
        }
    }

    public void optionalEmptyExample() {
        words = new String[13];
        words[4] = "Java Optional Example";

        // Without Optional
        words[5] = null;
        if (words[7] != null) {
            System.out.println(words[7]);
        } else {
            System.out.println("No value found");
        }

        // With Optional
        Optional<String> wordOptional = Optional.ofNullable(words[7]);
        System.out.println(wordOptional.orElse("No value found"));
    }

    public void optionalOfExample() {
        words = new String[14];
        words[4] = "Java Optional Example";

        // Without Optional
        words[5] = null;
        if (words[7] != null) {
            System.out.println(words[7]);
        } else {
            System.out.println("No value found");
        }

        // With Optional
        Optional<String> wordOptional = Optional.of(words[7]);
        System.out.println(wordOptional.orElse("No value found"));
    }
}
