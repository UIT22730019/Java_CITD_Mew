/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhasach;

import java.util.ArrayList;

/**
 *
 * @author 84793
 */
public class ArrayListBook extends ArrayList <IBook> {
    
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
            remove(element);
        }
        super.add(idx, element);
    }

    @Override
    public boolean add(IBook e) {
        int idx = indexOf(e);
        if (idx >= 0) {
            remove(e);
        }
        return super.add(e);

    }
    
}
