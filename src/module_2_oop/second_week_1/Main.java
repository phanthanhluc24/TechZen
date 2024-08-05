package module_2_oop.second_week_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    static List<OldPhone> oldPhone = new ArrayList<>();
    static List<NewPhone> newPhone = new ArrayList<>();
    static List<Phone> phones = new ArrayList<>();

    static {
//        old phone
        oldPhone.add(new OldPhone("DTC001", "Iphone 13Pro", 3445.6764, 9, "Samssung", 70, "Da qua su dung"));
        oldPhone.add(new OldPhone("DTC002", "Iphone 14Pro", 3498.7567, 5, "Apple", 80, "Da qua su dung"));

//        new phone

        newPhone.add(new NewPhone("DTM001", "Samsumg Galaxy 14", 13239.938, 12, "Samssung", 12));
        newPhone.add(new NewPhone("DTM002", "Galaxy J4+", 3239.938, 5, "Samssung", 7));

        phones.addAll(oldPhone);
        phones.addAll(newPhone);
    }

    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
        System.out.println("===================================================================");
        System.out.println("-- CHUONG TRINH QUAN LY DIEN THOAI ---");
        System.out.println("1. Xem danh sach dien thoai");
        System.out.println("2. Them moi");
        System.out.println("3. Cap nhat");
        System.out.println("4. Xoa");
        System.out.println("5. Sap xep theo gia");
        System.out.println("6. Tim kiem");
        System.out.println("7. Tinh tong tien");
        System.out.println("8. Giam gia cho dien thoai cu");
        System.out.println("9. Thoat");
        System.out.println("====================================================================");


        System.out.println("Choose your number: ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                menuShowList();
                break;
            case 2:
                menuAddNewPhone();
                break;
            case 3:
                updatePhone();
                break;
            case 4:
                deleteByIdPhone();
                break;
            case 5:
                xapXepTheoGia();
                break;
            case 6:
                menuSearch();
                break;
            case 7:
                System.out.println("Tinh tong tien tat ca dien thoai "+calPricePhone());
                break;
        }
    }

    public static void menuShowList() {
        int number;

        while (true) {
            do {
                System.out.println("XEM DANH SACH DIEN THOAI");
                System.out.println("1: Xem tat ca dien thoai");
                System.out.println("2: Xem dien thoai moi");
                System.out.println("3: Xem dien thoai cu");
                System.out.println("4: Tro ve menu chinh");

                System.out.println("Please cho the number: ");
                number = input.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("== DANH SACH TAT CA CAC LOAI DIEN THOAI ==");
                        for (int i = 0; i < newPhone.size(); i++) {
                            System.out.println("Thong tin dien thoai moi " + (i + 1) + ": ");
                            newPhone.get(i).output();
                        }

                        for (int i = 0; i < oldPhone.size(); i++) {
                            System.out.println("Thong tin dien thoai cu " + (i + 1) + ": ");
                            oldPhone.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("== DANH SACH DIEN THOAI MOI ==");
                        for (int i = 0; i < newPhone.size(); i++) {
                            System.out.println("Thong tin dien thoai moi " + (i + 1) + ": ");
                            newPhone.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("== DANH SACH DIEN THOAI CU ==");
                        for (int i = 0; i < oldPhone.size(); i++) {
                            System.out.println("Thong tin dien thoai cu " + (i + 1) + ": ");
                            oldPhone.get(i).output();
                        }
                        break;
                    case 4:
                        mainMenu();
                        break;
                    default:
                        System.out.println("So khong hop le");

                }
            } while (number < 0 || number > 4);
        }
    }

    public static void menuAddNewPhone() {
        int number;
        while (true) {
            do {
                System.out.println("=== THEM MOI SAN PHAM ==");
                System.out.println("1. Them moi dien thoai moi");
                System.out.println("2. Them moi dien thoai cu");
                System.out.println("3. Quay ve menu chinh");

                System.out.println("Vui long nhap so: ");
                number = input.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("== THEM DIEN THOAI MOI ==");
                        NewPhone newPhone1 = new NewPhone();
                        newPhone1.input();
                        newPhone1.setId(getNewPhoneId());
                        newPhone.add(newPhone1);
                        System.out.println("Them san pham thanh cong !!");
                        break;
                    case 2:
                        System.out.println("== THEM DIEN THOAI CU ==");
                        OldPhone oldPhone1 = new OldPhone();
                        oldPhone1.input();
                        oldPhone1.setId(getOldPhoneId());
                        oldPhone.add(oldPhone1);
                        System.out.println("Them san pham thanh cong !!");
                        break;
                    case 3:
                        mainMenu();
                        break;

                    default:
                        System.out.println("So khong hop le");
                }

            } while (number < 0 || number > 3);
        }
    }

    private static String getNewPhoneId() {
        if (newPhone.size() == 0) {
            return "DTM001";
        }
        int max = Integer.parseInt(newPhone.get(0).getId().substring(3));

        for (int i = 0; i < newPhone.size(); i++) {
            int id = Integer.parseInt(newPhone.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("DTM%3d", max + 1).replace(" ", "0");
    }

    private static String getOldPhoneId() {
        if (oldPhone.size() == 0) {
            return "DTC001";
        }
        int max = Integer.parseInt(oldPhone.get(0).getId().substring(3));

        for (int i = 0; i < oldPhone.size(); i++) {
            int id = Integer.parseInt(oldPhone.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("DTC%3d", max + 1).replace(" ", "0");
    }

    public static void updatePhone() {
        int number;

        while (true) {
            do {
                System.out.println("=== CAP NHAT THONG TIN DIEN THOAI ===");
                System.out.println("1. Cap nhat theo id");
                System.out.println("2. Cap nhat theo dong dien thoai");
                System.out.println("3. Tro ve menu chinh");
                System.out.println("Vui long nha lua chon: ");
                number = input.nextInt();
                input.nextLine();


                switch (number) {
                    case 1:
                        updatePhoneById();
                        break;
                    case 2:
                        updatePhoneByType();
                        break;
                    case 3:
                        mainMenu();
                        ;
                        break;
                    default:
                        System.out.println("So ban chon khong hop le");
                }


            } while (number < 0 || number > 3);
        }
    }

    private static void updatePhoneById() {
        String idPhoneNumber;
        System.out.println("=== CAP NHAT DIEN THOAI THEO ID ===");
        System.out.println("Vui long nha ma dien thoai: ");
        idPhoneNumber = input.nextLine();

        if (idPhoneNumber.startsWith("DTM")) {
            updateNewPhone(idPhoneNumber);
        } else if (idPhoneNumber.startsWith("DTC")) {
            updateOldPhone(idPhoneNumber);
        } else {
            System.out.println("Ma khong hop le");
        }
    }

    private static void updatePhoneByType() {
        int number;
        String phoneId;
        System.out.println("=== CAP NHAT THEO DONG DIEN THOAI ===");
        System.out.println("1. Cap nhat dien thoai moi");
        System.out.println("2. Cap nhat dien thoai cu");
        System.out.println("3. Quay ve menu chinh");

        System.out.println("Vui long chon so: ");
        number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("=== CAP NHAT DIEN THOAI MOI ===");
                System.out.println("Vui long nhap ma dien thoai");
                phoneId = input.nextLine();
                updateNewPhone(phoneId);
                break;
            case 2:
                System.out.println("=== CAP NHAT DIEN THOAI CU ==");
                System.out.println("Vui long nhap ma dien thoai");
                phoneId = input.nextLine();
                updateOldPhone(phoneId);
                break;
            case 3:
                mainMenu();
                break;
            default:
                System.out.println("So ban chon khong hop le");
        }

    }

    private static void updateNewPhone(String phoneId) {
        boolean isExitPhone = false;

        for (NewPhone newPhone1 : newPhone) {
            if (newPhone1.getId().equals(phoneId)) {
                isExitPhone = true;
                newPhone1.input();
                System.out.println("Cap nhat thanh cong!");
                break;
            }

        }

        if (!isExitPhone) {
            System.out.println("Dien thoai khong tim thay!");
        }
    }

    private static void updateOldPhone(String phoneId) {
        boolean isExitPhone = false;

        for (OldPhone oldPhone1 : oldPhone) {
            if (oldPhone1.getId().equals(phoneId)) {
                isExitPhone = true;
                oldPhone1.input();
                System.out.println("Cap nhat thanh cong!");
                break;
            }

        }

        if (!isExitPhone) {
            System.out.println("Dien thoai khong tim thay!");
        }
    }

    public static void deleteByIdPhone() {
        String phoneId;

        System.out.println("Vui long nhap ma muon xoa");
        input.nextLine();
        phoneId = input.nextLine();

        if (phoneId.startsWith("DTM")) {
            deletePhoneNew(phoneId);
        } else if (phoneId.startsWith("DTC")) {
            deletePhoneOld(phoneId);
        } else {
            System.out.println("Ma dien thoai khong hop le");
        }

    }

    public static void deletePhoneOld(String phoneID) {
        boolean isExitPhone = false;
        for (OldPhone oldPhone1 : oldPhone) {
            if (oldPhone1.getId().equals(phoneID)) {
                isExitPhone = true;
                oldPhone.remove(oldPhone1);
                System.out.println("Xoa thanh cong");
                mainMenu();
            }
        }

        if (!isExitPhone) {
            System.out.println("Ma khong hop le");
        }
    }

    public static void deletePhoneNew(String phoneID) {
        boolean isExitPhone = false;
        for (NewPhone newPhone1 : newPhone) {
            if (newPhone1.getId().equals(phoneID)) {
                isExitPhone = true;
                newPhone.remove(newPhone1);
                System.out.println("Xoa thanh cong");
                mainMenu();
            }
        }

        if (!isExitPhone) {
            System.out.println("Ma khong hop le");
        }
    }

    public static void xapXepTheoGia() {
        int number;
        while (true) {
            do {
                System.out.println("==== XAP XEP THEO GIA ===");
                System.out.println("1. Xap xep tang dan");
                System.out.println("2. Xap xep giam dan");
                System.out.println("3. Quay ve menu chinh");

                System.out.println("Nhap so cua ban: ");
                number = input.nextInt();
                input.nextLine();

                switch (number) {
                    case 1:
                        xapXepGiaTangDan();
                        break;
                    case 2:
                        xapXepGiaGiamDan();
                        break;
                    case 3:
                        mainMenu();
                        break;
                    default:
                        System.out.println("So khong hop le");
                }

            } while (number < 0 || number > 3);
        }


    }

    private static void xapXepGiaTangDan() {
        for (int i = 0; i < phones.size(); i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                    Phone temp = phones.get(i);
                    phones.set(i, phones.get(j));
                    phones.set(j, temp);
                }
            }
        }
    }

    private static void xapXepGiaGiamDan() {
        for (int i = 0; i < phones.size(); i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
                    Phone temp = phones.get(i);
                    phones.set(i, phones.get(j));
                    phones.set(j, temp);
                }
            }
        }
    }

    public static void menuSearch() {


        int choose;


        while (true) {
            do {
                System.out.println("== TIM KIEM THONG TIN DIEN THOAI===");
                System.out.println("1. Tim tat ca dien thoai");
                System.out.println("2. Tim thong tin dien thoai cu");
                System.out.println("3. Tim thong tin dien thoai moi");
                System.out.println("4. Thoat ra man hinh chinh");
                choose = input.nextInt();
                input.nextLine();
                switch (choose) {
                    case 1:
                        searchAllPhone();
                        break;
                    case 2:
                        searchOldPhone();
                        break;
                    case 3:
                    case 4:
                        mainMenu();
                        break;
                    default:
                }
            } while (choose > 0 && choose <= 4);
        }
    }

    public static void searchAllPhone() {

        int choose;

        while (true) {
            do {
                System.out.println("===== TIM TAT CA THONG TIN DIEN THOAI===");
                System.out.println("1. Tim kiem theo gia");
                System.out.println("2. Tim kiem theo ten san pham");
                System.out.println("3. Tim kiem theo hang dien thoai");
                System.out.println("4. Tro ve menu chinh");
                choose = input.nextInt();
                input.nextLine();
                switch (choose) {
                    case 1:
                        searchRoundPrice();
                        break;
                    case 2:
                        searchByName();
                        break;
                    case 3:
                        searchByBrandName();
                        break;
                    case 4:
                        mainMenu();
                    default:
                        System.out.println("So khong hop le");
                }
            } while (choose > 0 && choose <= 4);
        }
    }

    public static void searchRoundPrice() {
        double startPrice, endPrice;

        System.out.println("Nhap vao gia tu: ");
        startPrice = input.nextDouble();
        System.out.println("Nhap vao gia den: ");
        endPrice = input.nextDouble();
        int count = 1;
        boolean isPhoneExits = false;

        for (Phone phones : phones) {
            if (phones.getPrice() >= startPrice && phones.getPrice() <= endPrice) {
                isPhoneExits = true;
                System.out.println("Thong tin dien thoai " + (count++));
                phones.output();
            }
        }

        if (!isPhoneExits) {
            System.out.println("Thong tin dien thoai khong tim thay");
        }
    }

    public static void searchByName() {
        System.out.println("Nhap ten san pham ban muon tim");
        String namePhone = input.nextLine();
        boolean isPhoneExits = false;
        for (Phone phones : phones) {
            if (phones.getPhoneName().contains(namePhone)) {
                isPhoneExits = true;
                phones.output();
            }
        }
        if (!isPhoneExits) {
            System.out.println("Thong tin dien thoai khong tim thay");
        }
    }

    public static void searchByBrandName() {
        System.out.println("Nhap dong san pham ban muon tim");
        String brandName = input.nextLine();
        boolean isPhoneExits = false;
        for (Phone phones : phones) {
            if (phones.getBrandCreated().contains(brandName)) {
                isPhoneExits = true;
                phones.output();
            }
        }
        if (!isPhoneExits) {
            System.out.println("Thong tin dien thoai khong tim thay");
        }
    }

    public static void searchOldPhone() {
        int choose;

        while (true) {
            do {
                System.out.println("===== TIM THONG TIN DIEN THOAI CU ===");
                System.out.println("1. Tim kiem theo gia");
                System.out.println("2. Tim kiem theo ten san pham");
                System.out.println("3. Tim kiem theo hang dien thoai");
                System.out.println("4. Tro ve menu chinh");
                choose = input.nextInt();

                switch (choose) {
                    case 1:
                        searchPriceOldPhone();
                        break;
                    case 2:
                        searchByOldName();
                        break;
                    case 3:
                        searchByOldBrand();
                        break;
                    case 4:
                        mainMenu();
                    default:
                        System.out.println("So khong hop le");
                }
            } while (choose > 0 && choose <= 4);
        }
    }

    public static void searchPriceOldPhone() {
        double startPrice, endPrice;

        System.out.println("Nhap vao gia tu: ");
        startPrice = input.nextDouble();
        System.out.println("Nhap vao gia den: ");
        endPrice = input.nextDouble();
        int count = 1;
        boolean isPhoneExits = false;

        for (OldPhone oldPhone : oldPhone) {
            if (oldPhone.getPrice() >= startPrice && oldPhone.getPrice() <= endPrice) {
                isPhoneExits = true;
                System.out.println("Thong tin dien thoai " + (count++));
                oldPhone.output();
            }
        }

        if (!isPhoneExits) {
            System.out.println("Thong tin dien thoai khong tim thay");
        }
    }

    public static void searchByOldName() {
        System.out.println("Nhap ten san pham ban muon tim");
        String namePhone = input.nextLine();
        boolean isPhoneExits = false;
        for (OldPhone oldPhone : oldPhone) {
            if (oldPhone.getPhoneName().contains(namePhone)) {
                isPhoneExits = true;
                oldPhone.output();
            }
        }
        if (!isPhoneExits) {
            System.out.println("Thong tin dien thoai khong tim thay");
        }
    }

    public static void searchByOldBrand() {
        System.out.println("Nhap dong san pham ban muon tim");
        String brandName = input.nextLine();
        boolean isPhoneExits = false;
        for (OldPhone oldPhone : oldPhone) {
            if (oldPhone.getBrandCreated().contains(brandName)) {
                isPhoneExits = true;
                oldPhone.output();
            }
        }
        if (!isPhoneExits) {
            System.out.println("Thong tin dien thoai khong tim thay");
        }
    }

    public static double calPricePhone(){
        double total =0.0;
        for (Phone phone:phones){
            total+=phone.calPricePhone();
        }
        return total;
    }

}
