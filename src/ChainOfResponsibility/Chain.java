package ChainOfResponsibility;

public interface Chain {

      void setNext(Chain nextInChain);
      void process(Number request);
}
