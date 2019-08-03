package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
  * @param someome the name of person
  * @return string with hello
  */

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
