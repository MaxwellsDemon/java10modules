module acmeclient {
    requires java.base;
    requires acmeserver;
    exports com.example.acmeclient.client;
}