package ProgrammierungII.functionalProgramming;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.logging.Logger;

class ConsumptionLogging {
  public static <T> Consumer<T> executionTimeLogger( Consumer<T> block ) {
    return t -> {
      long start = System.nanoTime();
      block.accept( t );
      long end = System.nanoTime();
      long duration = end - start;
      Logger.getAnonymousLogger().info( "Ausführungszeit (ns): " + duration );
    };
  }
  
  public static void main( String[] args ) {
    Arrays.asList( 1, 2, 3, 4 ).forEach( executionTimeLogger( i -> System.out.println(faculty(i)) ) );
  }

  private static long faculty(long n) {
    return n == 0 ? 1 : n * faculty(n - 1);
  }
}