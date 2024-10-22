package ss10.bai_tap.array_list;

public class MyListTest {
        public static void main(String[] args) {
            MyList<Integer> list = new MyList<>();
            System.out.println("Thêm 3 vào danh sách.");
                list.add(0, 3);
                System.out.println("Kích thước danh sách: " + list.size());
            System.out.println("Thêm 5 vào danh sách.");
                list.add(1, 5);
                System.out.println("Kích thước danh sách: " + list.size());
            System.out.println("Thêm 7 vào danh sách tại vị trí 1.");
                list.add(1, 7);
                System.out.println("Kích thước danh sách: " + list.size());
            System.out.println("Phần tử tại vị trí 0: " + list.get(0));
            System.out.println("Phần tử tại vị trí 1: " + list.get(1));
            System.out.println("Phần tử tại vị trí 2: " + list.get(2));
            System.out.println("Xóa phần tử tại vị trí 1.");
                Integer removedElement = list.remove(1);
            System.out.println("Phần tử đã xóa: " + removedElement);
            System.out.println("Kích thước danh sách sau khi xóa: " + list.size());
            //Containt
            System.out.println("5 có tồn tại trong ArrayList không?" + list.contains(5));
            System.out.println("7 có tồn tại trong ArrayList không?" + list.contains(7));
            //indexOf
            System.out.println("Chỉ số của 5: " + list.indexOf(0));
            System.out.println("Chỉ số của 3: " + list.indexOf(1));
            System.out.println("Chỉ số của 7: " + list.indexOf(2));
            //clearMethod
            System.out.println("Xóa tất cả phần tử trong danh sách.");
                list.clear();
                System.out.println("Kích thước danh sách sau khi xóa: " + list.size());
            //clone
            System.out.println("Thêm 8 và 11 vào danh sách.");
            list.add(0, 8);
            list.add(1, 11);
            MyList<Integer> clonedList = list;
            System.out.println("Kích thước danh sách sao chép: " + clonedList.size());
            System.out.println("Phần tử tại vị trí 0 " + clonedList.get(0));
            System.out.println("Phần tử tại vị trí 1 " + clonedList.get(1));
            //ensureCapacity
            System.out.println("Check ensureCapacity: ");
            list.ensureCapacity(20);
            System.out.println("Kích thước danh sách sau phương thức ensureCapacity: " + list.size());

        }
}
