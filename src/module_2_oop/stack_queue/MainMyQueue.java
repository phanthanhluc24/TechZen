package module_2_oop.stack_queue;

public class MainMyQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Hàng đợi: " + queue.toString());
        // b. Lấy ra phần tử đầu tiên mà không xóa nó
        Integer peekValue = queue.peek();

        System.out.println("Giá trị ở đầu hàng đợi: " + peekValue);
// c. Lấy ra và xóa phần tử đầu tiên
        Integer polledValue = queue.poll();

        System.out.println("Giá trị lấy ra: " + polledValue); // In ra: Giá trị lấy ra: 10
// d. Kiểm tra xem hàng đợi có trống không
        boolean isEmpty = queue.isEmpty();
        System.out.println("Hàng đợi có trống không: " + isEmpty);

        int queueSize = queue.size();

        System.out.println("Kích thước hàng đợi: " + queueSize);
    }


}
