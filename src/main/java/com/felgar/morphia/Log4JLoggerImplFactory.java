package com.felgar.morphia;

import org.mongodb.morphia.logging.Logger;
import org.mongodb.morphia.logging.LoggerFactory;

public class Log4JLoggerImplFactory implements LoggerFactory {

	@Override
	public Logger get(Class<?> c) {
		return new Log4JLogger(c);
	}

}
