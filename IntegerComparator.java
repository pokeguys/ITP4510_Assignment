public interface Comparator {
  public boolean isEqualTo(Object item1, Object item2);
  public boolean isGreaterThan(Object item1, Object item2);
  public boolean isGreaterThanOrEqualTo(Object item1, Object item2);
  public boolean isLessThan(Object item1, Object item2);
  public boolean isLessThanOrEqualTo(Object item1, Object item2);
}

public class IntegerComparator implements Comparator {
  public boolean isEqualTo(Object item1, Object item2) {
    if (((int)item1).compareto((int)item2) == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGreaterThan(Object item1, Object item2) {
    if (((int)item1).compareto((int)item2) > 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isGreaterThanOrEqualTo(Object item1, Object item2) {
    if (((int)item1).compareto((int)item2) >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isLessThan(Object item1, Object item2) {
    if (((int)item1).compareto((int)item2) < 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isLessThanOrEqualTo(Object item1, Object item2) {
    if (((int)item1).compareto((int)item2) <= 0) {
      return true;
    } else {
      return false;
    }
  }
}
