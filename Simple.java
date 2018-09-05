//TODO: add author tag

public class Simple {
  
  private String text;
  private Number number;  
  private Boolean truth;
  private Integer[] initVals;
  private int depth;
  private Integer[] lastVals;
  private int sequenceCalls;

  public Simple() {
    text = "text";
    number = 0;
    truth = true;
    initVals = new Integer[]{1, 1, 2};
    depth = 2;
    lastVals = new Integer[depth]; 
    
    for(int i = 0; i < depth; i++) {
      lastVals[i] = initVals[initVals.length - depth + i];
    }
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
    //TODO: check if depth > # of initVals and do something?
    Integer num = 0;
    
    if(sequenceCalls + 1 <= initVals.length) {
      num = initVals[sequenceCalls];
    } else {
        for(int i = 0; i < depth; i++) {
        num += lastVals[i];
        if(i + 1 >= depth) {
          lastVals[i] = num;
        } else {
          lastVals[i] = lastVals[i + 1];
        }
      }
    }
    
    sequenceCalls++;
    return num;
  }

  public String toString() {
    //TODO
    return ""; //remove
  } 

  public static void main( String args[] ) {
    //Use this main method to test but this should NOT be in the final implementation
    Simple test = new Simple();
    
    for(int i = 0; i < 10; i++) {
      System.out.println(test.nextInSequence());
    }
  }

}
  