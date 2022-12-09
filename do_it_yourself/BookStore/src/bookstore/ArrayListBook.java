package bookstore;

import java.util.ArrayList;

/**
 * ArrayListBook.
 *
 * @author hasu
 */
public class ArrayListBook extends ArrayList<IBook> {

    @Override
    public int indexOf(Object o) {
        if (o instanceof IBook iBook) {
            for (int i = 0; i < size(); i++) {
                if (iBook.getId().equalsIgnoreCase(get(i).getId())) {
                    return i;
                }
            }
        }
        return super.indexOf(o);
    }

    @Override
    public void add(int index, IBook element) {
        int idx = indexOf(element);
        if (idx >= 0) {
            remove(idx);
        }
        super.add(index, element);
    }

    @Override
    public boolean add(IBook e) {
        int idx = indexOf(e);
        if (idx >= 0) {
            remove(idx);
        }
        return super.add(e);
    }

}
