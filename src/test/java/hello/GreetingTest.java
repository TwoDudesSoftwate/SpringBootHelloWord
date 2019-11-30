package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

  private Greeting greeting = new Greeting(42, "Hello World");

  @Test
  public void greeterSaysHello() {
    assertThat(greeting.getContent(), containsString("Hello"));
  }
  
  @Test
  public void returnsIdOk() {
    assertEquals(greeting.getId(), 42);
  }

}
