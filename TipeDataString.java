public class TipeDataString {
    public static void main(String[] args) {
        //perbedaan primitive dan nonprimitive
        String firstName = "Leon";
        String lastName = "Simanjuntak";
        String fullname = firstName + " " + lastName;
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(fullname.toLowerCase());
        System.out.println(fullname.toUpperCase());

        System.out.println(fullname.charAt(6));
        System.out.println(fullname.contains("simanjuntak"));
    }
}
