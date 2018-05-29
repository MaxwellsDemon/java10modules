# Learning project for Java 10 and Java modules

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


