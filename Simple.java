//TODO: add author tag

public class Simple {
  
  private String text;
  private Number number;  
  private Boolean truth;
  private Integer[] initVals;
  private int depth;
  private Integer[] lastValues;

  public Simple() {
    text = "text";
    number = 0;
    truth = true;
    initVals = new Integer[]{1, 1, 2};
    depth = 2;
    lastValues = new Integer[depth]; 
  }

  public Simple( String text, 
                 Number number,
                 Boolean truth,
                 Integer[] initVals,
                 int depth ) {
    //TODO
  }

  public Boolean truth() {
    return truth;
  }

  public Number number() {
    return number;
  }

  public String text() {
    return text;
  }

  public void flip() {
    truth = !truth;
  }

  public Integer nextInSequence() {
    //TODO
    return -1; //remove
  }

  public String toString() {
    //TODO
    return ""; //remove
  } 

}
  