package Lab7.Iterator;

public class NameRepository implements Aggregate {
    private String names[][] = new String[][]{{"-"},
            {"-", "Jon", "-", "Lor", "Pat", "Ken"},
            {"Rob", "-", "Jul", "-", "Pat", "-"}
    };

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int rowIndex;
        int colIndex;

        @Override
        public boolean hasNext() {
            if (colIndex >= names[rowIndex].length) {
                rowIndex++;
                colIndex = 0;
            }

            boolean hasNext = false;

            if (rowIndex < names.length) {
                hasNext = true;
            }

            if (hasNext) {
                String n = (String) next();
                if (n.equals("-")) {
                    return hasNext();
                } else {
                    if (n == null) {
                        hasNext = false;
                    } else {
                        hasNext = true;
                        colIndex--;
                    }
                }

            }

            return hasNext;
        }

        @Override
        public Object next() {
            return names[rowIndex][colIndex++];
        }
    }
}