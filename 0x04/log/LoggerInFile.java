package log.file;

import java.io.IOException;

import java.util.logging.FileHandler;

import java.util.logging.Logger;

import java.util.logging.SimpleFormatter;

public class LoggerInFile {

public static void main(String[] args) {

private static Logger logger = Logger.getLogger("MyLog");

FileHandler fileHandler = new FileHandler("logs.txt");

Logger.AddHandler(fileHandler);

simpleFormatter simpleFormatter = new SimpleFormatter();

fileHandler.setFormatter(simpleFormatter);

Logger.info("Log test");

Logger.info("Hi In the main class test");

}

}