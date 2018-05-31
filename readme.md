# Learning Project for Java 10 and Java Modules

To build:

```bash
	cd java10modules
	mvn clean install
```

To run:

Copy the built jars to a brand new "lib" directory somewhere safe:
```
	acmeclient-1.0-SNAPSHOT.jar
	acmeserver-1.0-SNAPSHOT.jar
```

 then:

 ```bash
	java -cp "lib/*" com.example.acmeclient.client.AcmeClient
```

### Creating Custom Runtime Image

```bash
mkdir -p tmp
"${JAVA_HOME}/bin/jlink" --module-path acmeclient/target/acmeclient-1.0-SNAPSHOT.jar:acmeserver/target/acmeserver-1.0-SNAPSHOT.jar --add-modules acmeclient --output tmp/jimage --compress=2
```

