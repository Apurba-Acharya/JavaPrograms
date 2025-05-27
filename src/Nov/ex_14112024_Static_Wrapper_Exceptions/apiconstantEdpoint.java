package Nov.ex_14112024_Static_Wrapper_Exceptions;

public enum apiconstantEdpoint {
    base_url ("ghjkuy");

    private String name;

    apiconstantEdpoint (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

