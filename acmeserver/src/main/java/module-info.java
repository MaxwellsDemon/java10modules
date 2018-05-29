module acmeserver {
    requires java.base;
    exports com.example.acmeserver.server;

    // Demo: comment out this export to purposefully remove access to the secret package.
    exports com.example.acmeserver.secretutil;
}