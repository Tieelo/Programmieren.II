package ProgrammierungII.singletonPattern;

public class TestThreads {

  public static void main(String[] args) {
    RunnableDemo t_a = new RunnableDemo("T-A");
    t_a.start();

    RunnableDemo t_b = new RunnableDemo("T-B");
    t_b.start();

    RunnableDemo t_c = new RunnableDemo("T-C");
    t_c.start();

    RunnableDemo t_d = new RunnableDemo("T-D");
    t_d.start();
  }
}
