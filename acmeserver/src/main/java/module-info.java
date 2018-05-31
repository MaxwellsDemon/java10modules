module acmeserver {
    requires java.base;
    requires java.logging;
    exports com.example.acmeserver.server;

    // Demo: comment out this export to purposefully remove access to the secret package.
    exports com.example.acmeserver.secretutil;
}