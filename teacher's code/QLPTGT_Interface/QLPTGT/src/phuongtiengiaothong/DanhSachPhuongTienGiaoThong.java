package phuongtiengiaothong;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hasu
 */
public class DanhSachPhuongTienGiaoThong extends ArrayList<PhuongTienGiaoThong> {

    public boolean removeById(String id) {
        return remove(filterById(id));
    }

    public PhuongTienGiaoThong filterById(String id) {
        if (id != null && !id.isBlank()) {
            for (PhuongTienGiaoThong ptgt : this) {
                if (id.equalsIgnoreCase(ptgt.getId())) {
                    return ptgt;
                }
            }
        }
        return null;
    }

    public List<PhuongTienGiaoThong> filterByHangSanXuat(String hangSanXuat) {
        List<PhuongTienGiaoThong> resultList = new ArrayList();
        if (hangSanXuat != null && !hangSanXuat.isBlank()) {
            for (PhuongTienGiaoThong ptgt : this) {
                if (hangSanXuat.equalsIgnoreCase(ptgt.getHangSanXuat())) {
                    resultList.add(ptgt);
                }
            }
        }
        return resultList;
    }

    public List<PhuongTienGiaoThong> filterByMauXe(String mauXe) {
        List<PhuongTienGiaoThong> resultList = new ArrayList();
        if (mauXe != null && !mauXe.isBlank()) {
            for (PhuongTienGiaoThong ptgt : this) {
                if (mauXe.equalsIgnoreCase(ptgt.getMauXe())) {
                    resultList.add(ptgt);
                }
            }
        }
        return resultList;
    }

    @Override
    public int indexOf(Object o) {
        if (o instanceof PhuongTienGiaoThong ptgt) {
            for (int i = 0; i < this.size(); i++) {
                if (ptgt.getId().equalsIgnoreCase(this.get(i).getId())) {
                    return i;
                }
            }
        }
        return super.indexOf(o);
    }

    @Override
    public void add(int index, PhuongTienGiaoThong element) {
        int idx = indexOf(element);
        if (idx >= 0) {
            this.remove(idx);
        }
        super.add(index, element);
    }

    @Override
    public boolean add(PhuongTienGiaoThong e) {
        int idx = indexOf(e);
//        if (idx >= 0) { // da ton tai
//            this.get(idx).update(e);
//        } else {
//            return super.add(e);
//        }

        if (idx >= 0) {
            this.remove(idx);
        }
        return super.add(e);
    }

}
