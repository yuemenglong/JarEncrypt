g++ -O3 -fPIC -shared \
	-I$JAVA_HOME/include \
	-I$JAVA_HOME/include/linux \
	decrypt.cpp \
	-o decrypt.so
