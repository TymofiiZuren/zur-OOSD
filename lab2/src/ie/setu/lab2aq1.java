package ie.setu;

class HotelRoom {
    private int roomNumber;
    private String roomType;

    public HotelRoom() {
        setRoomNumber(0);
        setRoomType("");
    }

    public HotelRoom(int roomN, String roomT) {
        setRoomNumber(roomN);
        setRoomType(roomT);
    }

    public void setRoomNumber(int roomN) {
        roomNumber = roomN;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomType(String roomT) {
        roomType = roomT;
    }

    public String getRoomType() {
        return roomType;
    }

    public String toString() {
        return "Room number: " + getRoomType() + ", Room type: " + getRoomNumber();
    }
}
