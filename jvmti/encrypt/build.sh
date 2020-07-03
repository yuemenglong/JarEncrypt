g++ -O3 -fPIC -shared \
	-I$JAVA_HOME/include \
	-I$JAVA_HOME/include/linux \
	encrypt.cpp \
	-o encrypt.so
