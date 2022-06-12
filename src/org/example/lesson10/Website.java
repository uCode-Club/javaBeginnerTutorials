package org.example.lesson10;

public enum Website {
    MACINTOSH_FAN,
    YOUTUBE("https://www.youtube.com"),
    VSB("https://www.vsb.bc.ca/Pages/default.aspx");

    public final String URL;

    // No public constructors available
    Website(String URL) {
        this.URL = URL;
    }

    Website() {
        this("https://macintoshfan.com");
    }

    public void printURL() {
        System.out.println(URL);
    }

    public String getURL() {
        return URL;
    }

    // Only method available to override from java.lang.Enum
    @Override
    public String toString() {
        return name() + ": " + URL;
    }
}
