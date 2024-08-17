package module_2_oop.stack_queue;

public class MainMyStack {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Ngăn xếp: " + stack.toString());

        Integer peekValue = stack.peek();
        System.out.println("Giá trị ở đầu ngăn xếp: " + peekValue);
// c. pop(): lấy ra xem và xóa
        Integer poppedValue = stack.pop();
        System.out.println("Giá trị lấy ra: " + poppedValue);
// d. isEmpty(): kiểm tra rỗng
        boolean isEmpty = stack.isEmpty();

        System.out.println("Ngăn xếp có trống không: " + isEmpty);

        int stackSize = stack.size();
        System.out.println("Kích thước ngăn xếp: " + stackSize); // In ra: Kích thước ngăn xếp: 2

    }
}
