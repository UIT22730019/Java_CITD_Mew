package phuongtiengiaothong;

import java.util.List;

/**
 *
 * @author hasu
 */
public interface IDataMangement {

    List<String> loadData();

    boolean saveData(List<String> dataList);

    boolean add(String data);

    boolean add(List<String> dataList);

    boolean update(String data);

    boolean update(List<String> dataList);

    boolean delete(String data);

    boolean delete(List<String> dataList);

//    default void testDefaultFunction() {
//        System.out.println("testDefaultFunction");
//    }
//
//    default void testDefaultFunction(String xxx) {
//        System.out.println("testDefaultFunction");
//    }
}
