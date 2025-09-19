package ie.setu;

public class TestClassLab2A {
    public static void main(String[] args) {
        HotelRoom roomA = new HotelRoom();
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        HotelRoom roomB = new HotelRoom(201, "Double");

        System.out.println(roomA);
        System.out.println(roomB);

        HotelRoomQ2 roomAq2 = new HotelRoomQ2(200, "Single");
        roomAq2.setIsVacant(1);
        roomAq2.setRate(100);
        HotelRoomQ2 roomBq2 = new HotelRoomQ2(201, "Double");
        roomBq2.setIsVacant(0);
        roomBq2.setRate(80);

        HotelRoomQ3 roomCq3 = new HotelRoomQ3(202, "Single", 0, 90);

        HotelRoomQ4 roomBq4 = new HotelRoomQ4(200, "Double", false, 80);

        System.out.println(roomA);
        System.out.println(roomB);

        System.out.println(roomAq2);
        System.out.println(roomBq2);

        System.out.println(roomCq3);

        roomBq4.isOccupied();
        System.out.println(roomBq4);
    }
}
