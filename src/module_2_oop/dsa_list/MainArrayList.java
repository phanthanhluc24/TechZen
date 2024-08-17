package module_2_oop.dsa_list;

public class MainArrayList {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(30);
        arrayList.add(30);

        System.out.println("Danh sach ban dau: "+ arrayList.toString());

        arrayList.add(2,25);
        System.out.println("Danh sach sau khi them 25 vao vi tri 2: "+ arrayList.toString());

        arrayList.set(3,35);
        System.out.println("Danh sach sau khi thay the 35 vao vi ti 3: "+ arrayList.toString());

        int elementAtIndex = arrayList.get(4);
        System.out.println("Phan tu tai vi tri 4 la: "+elementAtIndex);

        int elementToFind=30;
        int indexOfElement = arrayList.index0f(elementToFind);
        if (indexOfElement!=-1){
            System.out.println("Vij trii cuoi cung cua phan tu + "+ elementToFind + " la "+ indexOfElement);
        }else {
            System.out.println("Khong tim thay phan tu "+ elementToFind + " trong danh sach");
        }

        int lastIndexOfElement = arrayList.lastIndexOf(elementToFind);
        if (lastIndexOfElement!=-1){
            System.out.println("Vij trii cuoi cung cua phan tu + "+ elementToFind + " la "+ lastIndexOfElement);
        }else {
            System.out.println("Khong tim thay phan tu "+ elementToFind + " trong danh sach");
        }

        arrayList.remove(1);
        System.out.println("Danh sach sau khi xoa phan tu tai vi tri 1 "+ arrayList.toString());

        arrayList.removeElement(30);
        System.out.println("Danh sach sau khi xoa phan tu co gia tri 30 "+ arrayList.toString());
    }
}
