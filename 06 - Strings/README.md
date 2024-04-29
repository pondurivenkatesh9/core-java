# Strings:

###	What is String

    String name="Venky";

###	Mutable vs Immutable string

    Immutable Strings: cannot change the value, can only extend

        - Strings created using the String class are immutable.
        - Operations like concatenation, substring, etc., return a new string object.
        - Immutable strings are thread-safe, making them suitable for use in multi-threaded environments.
        - They are generally safer to use in concurrent applications.

    Mutable Strings: can change the value as requied

        - Strings created using StringBuilder or StringBuffer classes are mutable.
        - Operations like append, insert, delete, etc., modify the existing string buffer object.
        - Mutable strings are not thread-safe by default. StringBuilder is not synchronized, while StringBuffer is synchronized, making it thread-safe.
        - Mutable strings can be more efficient when you need to perform a lot of modifications on the string, as they avoid creating new objects for each modification.

###	StringBuffer and StringBuilder

    StringBuffer and StringBuilder are both used for string manipulation in Java, but StringBuffer provides thread safety at the cost of performance due to synchronization, while StringBuilder sacrifices thread safety for better performance. Choose the appropriate class based on your specific requirements regarding thread safety and performance.