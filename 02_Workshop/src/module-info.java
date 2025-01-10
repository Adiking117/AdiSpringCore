module Workshop {
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires java.desktop;

    exports com.adi.config to spring.context;
    exports com.adi.company to spring.context;
    exports com.adi.workshop to spring.context;  // Export to Spring Context
    opens com.adi.config to spring.core, spring.beans; // Open for reflection
    opens com.adi.company to spring.core, spring.beans;
    opens com.adi.workshop to spring.core, spring.beans;  // Open for reflection
}
