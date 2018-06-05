#!/bin/bash

"${JAVA_HOME}/bin/jlink" \
	--module-path lib/acmeclient-1.0-SNAPSHOT.jar:lib/acmeserver-1.0-SNAPSHOT.jar \
	--add-modules acmeclient \
	--output output/jimage \
	--compress=2

