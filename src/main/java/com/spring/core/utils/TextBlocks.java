package com.spring.core.utils;

public class TextBlocks {
    public void log() {
        String textBlock = """
                This is a text block.
                It can span multiple lines.
                """;
        System.out.println(textBlock);

        String textBlock2 = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "city": "New York"
                }
                """;
        System.out.println(textBlock2);

        String name = "Alice";
        String textBlock3 = """
                Hello, %s!
                Welcome to Java!
                """.formatted(name); // String interpolation using formatted()
        System.out.println(textBlock3);

        String first = "This is a long string %s?";
        String second = String.format(first, "right");
        String third = first.formatted("right");
        System.out.println(second);
        System.out.println(third);
        String html = """
                <html>
                   <body>
                       <p>Hello World.</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
