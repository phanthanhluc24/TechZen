package module_2_oop.dsa_list;

public class MyArrayList {
    private int capacity;
    private int[] arr;
    private int size;
    private int[] emptyArray;

    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public void add(int element) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }

            int[] brr = new int[this.capacity];

            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }

            arr = brr;
        }

        arr[size] = element;
        size++;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append("\t");
        }

        return stringBuilder.toString();
    }

    public void add(int index, int element) {
        if (index < 0 || index < size) {
            System.out.println("Index ngoai pham vi");
            return;
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }

            int[] brr = new int[this.capacity];

            for (int i = 0; i < index; i++) {
                brr[i] = arr[i];
            }

            brr[index] = element;

            for (int i = index; i < size; i++) {
                brr[i + 1] = arr[i];
            }

            arr = brr;
        } else {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            arr[index] = element;
        }

        size++;
    }


    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }

        arr[index] = element;
    }

    public Integer get(int index) { // Kiểm tra index có hợp lệ
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi!");
            return null;
        }

        return arr[index];
    }


    public int index0f(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }


    public int lastIndexOf(int element) {
// Tìm vị trí index của phần tử cuối cùng tìm thấy
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }

        }
        return -1;
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }


    public void removeElement(int element) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        size = newIndex;
    }


}

