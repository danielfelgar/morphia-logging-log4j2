package com.felgar.morphia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JLogger implements org.mongodb.morphia.logging.Logger {

	private final Logger logger;

	public Log4JLogger(final Class<?> c) {
		logger = LogManager.getLogger(c);
	}

	@Override
	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	@Override
	public void trace(String msg) {
		logger.trace(msg);
	}

	@Override
	public void trace(String format, Object... arg) {
		logger.trace(format, arg);
	}

	@Override
	public void trace(String msg, Throwable t) {
		logger.trace(msg, t);
	}

	@Override
	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	@Override
	public void debug(String msg) {
		logger.debug(msg);
	}

	@Override
	public void debug(String format, Object... arg) {
		logger.debug(format, arg);
	}

	@Override
	public void debug(String msg, Throwable t) {
		logger.debug(msg, t);
	}

	@Override
	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	@Override
	public void info(String msg) {
		logger.info(msg);
	}

	@Override
	public void info(String format, Object... arg) {
		logger.info(format, arg);
	}

	@Override
	public void info(String msg, Throwable t) {
		logger.info(msg, t);
	}

	@Override
	public boolean isWarningEnabled() {
		return logger.isWarnEnabled();
	}

	@Override
	public void warning(String msg) {
		logger.warn(msg);
	}

	@Override
	public void warning(String format, Object... arg) {
		logger.warn(format, arg);
	}

	@Override
	public void warning(String msg, Throwable t) {
		logger.warn(msg, t);
	}

	@Override
	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	@Override
	public void error(String msg) {
		logger.error(msg);
	}

	@Override
	public void error(String format, Object... arg) {
		logger.error(format, arg);
	}

	@Override
	public void error(String msg, Throwable t) {
		logger.error(msg, t);
	}

}
