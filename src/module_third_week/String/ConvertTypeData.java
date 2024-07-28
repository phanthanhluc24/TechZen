package module_third_week.String;

public class ConvertTypeData {
    public static void main(String[] args) {
        String number = "100000";

        int numberInt = Integer.parseInt(number);

        System.out.println(numberInt);

        int number1 = 3000000;

        number = String.valueOf(number1);

        System.out.println(number);

        String phone = "9999383338";

        long phone1 = Long.parseLong(phone);

        System.out.println(phone1);

        long test1 = 8938498904814L;

        String test2 = String.valueOf(test1);

        System.out.println(test2);

        String float1 = "23.6F";

        float float2 = Float.parseFloat(float1);
        System.out.println(float2);

        float float3 = 37.4F;

        String float4 = String.valueOf(float3);
        System.out.println(float4);





    }
}
