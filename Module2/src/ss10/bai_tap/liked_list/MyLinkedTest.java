package ss10.bai_tap.liked_list;

public class MyLinkedTest {
    public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println("Thêm 2 vào danh sách.");
            list.addLast(2);
             System.out.println("Kích thước danh sách: " + list.size());
        System.out.println("Thêm 4 vào danh sách.");
             list.addLast(4);
             System.out.println("Kích thước danh sách: " + list.size());
        System.out.println("Thêm 6 vào đầu danh sách.");
            list.addFirst(6);
            System.out.println("Kích thước danh sách: " + list.size());
        System.out.println("Phần tử đầu tiên: " + list.getFirst());
        System.out.println("Phần tử cuối cùng: " + list.getLast());
        System.out.println("Chỉ số của 4: " + list.indexOf(4));
        System.out.println("Chỉ số của 6: " + list.indexOf(6));
        System.out.println("Chỉ số của 2: " + list.indexOf(2));
        System.out.println("Xóa phần tử tại chỉ số 1 (phần tử 2): " + list.remove(1));
        System.out.println("Kích thước danh sách: " + list.size());
        System.out.println("Kiểm tra có phần tử 4 không: " + list.contains(4));
        System.out.println("Kiểm tra có phần tử 2 không: " + list.contains(2));
        System.out.println("Xóa phần tử 4: " + list.remove((Object)4));
        System.out.println("Kích thước danh sách: " + list.size());
        System.out.println("Phần tử cuối cùng sau khi xóa: " + list.getLast());
        System.out.println("Xóa tất cả phần tử trong danh sách.");
                list.clear();
                System.out.println("Kích thước danh sách sau khi xóa: " + list.size());
            }
        }


