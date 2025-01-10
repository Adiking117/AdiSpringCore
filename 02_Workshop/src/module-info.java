module Workshop {
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires java.desktop;
    requires org.aspectj.weaver;

    exports com.adi.config to spring.context; // Allow Spring Context to access your configuration classes
    exports com.adi.company to spring.context; // Allow Spring Context to access company-related classes
    exports com.adi.workshop to spring.context; // Allow Spring Context to access workshop-related classes
    exports com.adi.aop to spring.context,spring.aop; // Allow Spring Context to access AOP-related classes
    exports com.adi.trainer to spring.aop;
    
    opens com.adi.config to spring.core, spring.beans; // Open for Spring to perform reflection
    opens com.adi.company to spring.core, spring.beans;
    opens com.adi.workshop to spring.core, spring.beans;
    opens com.adi.aop to spring.core, spring.beans; // Open for reflection to Spring AOP
    opens com.adi.trainer to spring.core , spring.beans;
}
